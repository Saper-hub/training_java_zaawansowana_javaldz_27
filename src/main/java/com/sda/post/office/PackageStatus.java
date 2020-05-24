package com.sda.post.office;

import java.util.List;

public enum PackageStatus {
    SENT("Package has been sent", 1) {
    @Override
    public PackageStatus nextStatus() {
        return TRAVELLING;
    }
    },

    TRAVELLING("Package is travelling", 2) {
        @Override
        public PackageStatus nextStatus () {
            return COURIER;
        }
    },
    COURIER("Package is being delivered", 3) {
        @Override
        public PackageStatus nextStatus() {
            return DELIVERED;
        }
    },
    DELIVERED("Package deliveed", 4) {
        @Override
        public PackageStatus nextStatus() {
            return null;
        }
    },
    LOST("Package is lost", 5) {
        @Override
        public PackageStatus nextStatus() {
            return null;
        }
    },
    RETURNED("Package is returned", 6) {
        @Override
        public PackageStatus nextStatus() {
            return null;
        }
    };

    private String description;
    private int statusCode;

    PackageStatus(String description, int statusCode){
        this.description = description;
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public abstract PackageStatus nextStatus();

}
