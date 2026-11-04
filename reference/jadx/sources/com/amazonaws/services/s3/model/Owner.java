package com.amazonaws.services.s3.model;

import java.io.Serializable;
import l.C8947;

/* JADX INFO: loaded from: classes.dex */
public class Owner implements Serializable {
    public static final long serialVersionUID = -8916731456944569115L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f627;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f628;

    public final String toString() {
        StringBuilder sb = new StringBuilder("S3Owner [name=");
        sb.append(this.f627);
        sb.append(",id=");
        return C8947.m23910(sb, this.f628, "]");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m636(String str) {
        this.f628 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m635(String str) {
        this.f627 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) obj;
        String str = owner.f628;
        String str2 = owner.f627;
        String str3 = this.f628;
        String str4 = this.f627;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        return str.equals(str3) && str2.equals(str4);
    }

    public final int hashCode() {
        String str = this.f628;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
