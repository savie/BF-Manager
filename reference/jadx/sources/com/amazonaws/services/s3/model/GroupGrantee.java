package com.amazonaws.services.s3.model;

import l.C8947;

/* JADX INFO: loaded from: classes.dex */
public enum GroupGrantee implements Grantee {
    AllUsers("http://acs.amazonaws.com/groups/global/AllUsers"),
    AuthenticatedUsers("http://acs.amazonaws.com/groups/global/AuthenticatedUsers"),
    LogDelivery("http://acs.amazonaws.com/groups/s3/LogDelivery");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f594;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String m571() {
        return "uri";
    }

    GroupGrantee(String str) {
        this.f594 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m570() {
        return this.f594;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    /* JADX INFO: renamed from: ۙ */
    public void mo533(String str) {
        throw new UnsupportedOperationException("Group grantees have preset identifiers that cannot be modified.");
    }

    @Override // java.lang.Enum
    public String toString() {
        return C8947.m23910(new StringBuilder("GroupGrantee ["), this.f594, "]");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static GroupGrantee m569(String str) {
        for (GroupGrantee groupGrantee : values()) {
            if (groupGrantee.f594.equals(str)) {
                return groupGrantee;
            }
        }
        return null;
    }
}
