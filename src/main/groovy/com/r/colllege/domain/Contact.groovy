package com.r.colllege.domain

class Contact {
    String email
    String mobile
    String faxNo

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", faxNo='" + faxNo + '\'' +
                '}';
    }
}
