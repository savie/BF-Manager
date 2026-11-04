package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩵ۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes5.dex */
public final class C20360 implements Map.Entry, Cloneable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f65306;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f65307;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C6190 f65308;

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        C6190 c6190 = this.f65308;
        String str3 = this.f65306;
        int iM17838 = c6190.m17838(str3);
        String str4 = "";
        if (iM17838 != -1 && (str = c6190.f21085[iM17838]) != null) {
            str4 = str;
        }
        int iM17839 = c6190.m17838(str3);
        if (iM17839 != -1) {
            c6190.f21085[iM17839] = str2;
        }
        this.f65307 = str2;
        return str4;
    }

    public C20360(String str, String str2, C6190 c6190) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        this.f65306 = str.trim();
        if (str.length() != 0) {
            this.f65307 = str2;
            this.f65308 = c6190;
            return;
        }
        throw new IllegalArgumentException("String must not be empty");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f65306;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f65306;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f65307;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        return this.f65307;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20360.class == obj.getClass()) {
            C20360 c20360 = (C20360) obj;
            String str = c20360.f65306;
            String str2 = this.f65306;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f65307;
            String str4 = c20360.f65307;
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
        String str = this.f65306;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f65307;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final Object clone() {
        try {
            return (C20360) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
