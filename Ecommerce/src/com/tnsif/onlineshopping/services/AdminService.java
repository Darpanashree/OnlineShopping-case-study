package com.tnsif.onlineshopping.services;

import java.util.ArrayList;
import java.util.List;

import com.tnsif.onlineshopping.entities.Admin;

public class AdminService {

    private List<Admin> adminList = new ArrayList<>();

    // Method to add an admin
    public void addAdmin(Admin admin) {
        adminList.add(admin);
    }

    // Method to get the list of admins
    public List<Admin> getAdmins() {
        return adminList;
    }

    // Method to find an admin by ID
    public Admin getAdminById(int userId) {
        return adminList.stream()
                .filter(admin -> admin.getUserId() == userId)
                .findFirst()
                .orElse(null);
    }

    // Method to remove an admin by ID
    public boolean removeAdmin(int userId) {
        return adminList.removeIf(admin -> admin.getUserId() == userId);
    }
}