package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes.dex */
public class Grant {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Grantee f588;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Permission f589;

    public Grant(Grantee grantee, Permission permission) {
        this.f588 = grantee;
        this.f589 = permission;
    }

    public final int hashCode() {
        Grantee grantee = this.f588;
        int iHashCode = ((grantee == null ? 0 : grantee.hashCode()) + 31) * 31;
        Permission permission = this.f589;
        return iHashCode + (permission != null ? permission.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Grant grant = (Grant) obj;
        Grantee grantee = grant.f588;
        Grantee grantee2 = this.f588;
        if (grantee2 == null) {
            if (grantee != null) {
                return false;
            }
        } else if (!grantee2.equals(grantee)) {
            return false;
        }
        return this.f589 == grant.f589;
    }

    public final String toString() {
        return "Grant [grantee=" + this.f588 + ", permission=" + this.f589 + "]";
    }
}
