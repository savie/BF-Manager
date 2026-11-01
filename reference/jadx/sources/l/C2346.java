package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۖۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes2.dex */
public final class C2346 implements Map.Entry, Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f8285;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f8286;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22103 f8287;

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        C22103 c22103 = this.f8287;
        String str3 = this.f8286;
        int iM49044 = c22103.m49044(str3);
        String str4 = "";
        if (iM49044 != -1 && (str = c22103.f71579[iM49044]) != null) {
            str4 = str;
        }
        int iM49045 = c22103.m49044(str3);
        if (iM49045 != -1) {
            c22103.f71579[iM49045] = str2;
        }
        this.f8285 = str2;
        return str4;
    }

    public C2346(String str, String str2, C22103 c22103) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        this.f8286 = str.trim();
        if (str.length() != 0) {
            this.f8285 = str2;
            this.f8287 = c22103;
            return;
        }
        throw new IllegalArgumentException("String must not be empty");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8286;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f8286;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8285;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        return this.f8285;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2346.class == obj.getClass()) {
            C2346 c2346 = (C2346) obj;
            String str = c2346.f8286;
            String str2 = this.f8286;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f8285;
            String str4 = c2346.f8285;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f8286;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8285;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final Object clone() {
        try {
            return (C2346) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
