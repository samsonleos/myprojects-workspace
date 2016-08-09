package com.pass.rec.dao;

import java.util.List;

public interface UserService {
    public User findById(int var1);

    public void saveUser(User var1);

    public List<User> findAllUsers();

    public void saveUserAccInfo(UserAccountInfo var1);

    public List<UserAccountInfo> findAllUserAccInfo();

    public List<AccountType> retrieveAccountType();

    public List<UserAccountInfo> retrieveUserAccountInfo(Long userId);
}