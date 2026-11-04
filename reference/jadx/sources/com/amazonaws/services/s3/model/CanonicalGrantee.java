package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class CanonicalGrantee implements Grantee, Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f557 = null;

    @Override // com.amazonaws.services.s3.model.Grantee
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo533(String str) {
        this.f557 = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CanonicalGrantee) {
            return this.f557.equals(((CanonicalGrantee) obj).f557);
        }
        return false;
    }

    public final int hashCode() {
        return this.f557.hashCode();
    }
}
