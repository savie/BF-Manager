package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Tag implements Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f659;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f660;

    public Tag(String str, String str2) {
        this.f659 = str;
        this.f660 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m666() {
        return this.f659;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m667() {
        return this.f660;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Tag tag = (Tag) obj;
            String str = tag.f660;
            String str2 = tag.f659;
            String str3 = this.f659;
            if (str3 == null ? str2 != null : !str3.equals(str2)) {
                return false;
            }
            String str4 = this.f660;
            if (str4 != null) {
                return str4.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f659;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f660;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
