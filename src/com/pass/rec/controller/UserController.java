package com.pass.rec.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pass.rec.dao.User;
import com.pass.rec.dao.UserAccountInfo;
import com.pass.rec.dao.UserService;

@Controller
public class UserController {
	
	@Autowired
    private UserService userService;
	
	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public ModelAndView  userInfo() {
 
        /*// After user login successfully.
        String userName = principal.getName();
 
        System.out.println("User Name: "+ userName);
 */
    	List<User> listUsers = userService.findAllUsers();
        ModelAndView model = new ModelAndView("userInfoPage");
        model.addObject("users", listUsers);
        return model;
    }
    
 
    /**
     * This method will provide the medium to add a new user.
     */
    @RequestMapping(value = { "/newuser" }, method = RequestMethod.GET)
    public String newUser(ModelMap model) {
        User user = new User();
        model.addAttribute("user", user);
        model.addAttribute("edit", false);
        return "registration";
    }
 
    /**
     * This method will be called on form submission, handling POST request for
     * saving user in database. It also validates the user input
     */
    @RequestMapping(value = { "/newuser" }, method = RequestMethod.POST)
    public String saveUser(@Valid User user, BindingResult result,
            ModelMap model) {
 
        if (result.hasErrors()) {
            return "registration";
        }
 
                
        userService.saveUser(user);
 
        model.addAttribute("success", "User " + user.getFirstName() + " "+ user.getLastName() + " registered successfully");
        //return "success";
        return "registrationsuccess";
    }

    @RequestMapping(value = "/useraccountinfo", method = RequestMethod.GET)  
    public ModelAndView addUserAccount(@ModelAttribute("command")  UserAccountInfo userAccInfo,    BindingResult result) {  
    	Map<String, Object> model = new HashMap<String, Object>();   
    	model.put("users",  userService.findAllUsers());   
    	model.put("accountType", userService.retrieveAccountType());
    	return new ModelAndView("useraccountinfo", model); 
    } 
    
    @RequestMapping(value = { "/useraccountinfo" }, method = RequestMethod.POST)
    public String saveUserAccount(@ModelAttribute("command")  UserAccountInfo userAccInfo, BindingResult result,
            ModelMap model) {
 
        if (result.hasErrors()) {
            return "useraccountinfo";
        }
 
                
        userService.saveUserAccInfo(userAccInfo);
 
        model.addAttribute("success", "User Account info " +  " registered successfully");
        //return "success";
        return "registrationsuccess";
    }
    
    @RequestMapping(value = "/useraccountinfolist", method = RequestMethod.GET)
    public ModelAndView  userAccInfo() {
 
        /*// After user login successfully.
        String userName = principal.getName();
 
        System.out.println("User Name: "+ userName);
 */
    	List<UserAccountInfo> listUserAccount = userService.findAllUserAccInfo();
        ModelAndView model = new ModelAndView("useraccountinfolist");
        model.addObject("userAccList", listUserAccount);
        return model;
    }
    
    @RequestMapping(value = "/accountinfobyuser", method = RequestMethod.GET)  
    public ModelAndView getAccInfobyUser(@ModelAttribute("command")  UserAccountInfo userAccInfo,    BindingResult result) {  
    	Map<String, Object> model = new HashMap<String, Object>();   
    	model.put("users",  userService.findAllUsers());   
    	return new ModelAndView("accountinfobyuser", model); 
    } 
    
    @RequestMapping(value = { "/accountinfobyuser" }, method = RequestMethod.POST)
    public String displayUserAccountByUser(@ModelAttribute("command")  UserAccountInfo userAccInfo, BindingResult result,
            ModelMap model) {
    	
    	System.out.println("userid "+ userAccInfo.getUser().getId());
 
    	List<UserAccountInfo> listUserAccount = userService.retrieveUserAccountInfo(userAccInfo.getUser().getId());
    	 model.addAttribute("userAccList", listUserAccount);
        return "accountinfobyuserdisplay";
    }
}
