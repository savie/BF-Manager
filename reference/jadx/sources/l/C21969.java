package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩹֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27NH */
/* JADX INFO: loaded from: classes4.dex */
public final class C21969 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f71274;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f71275;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f71276;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f71277;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f71278;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f71279;

    public C21969(int i, int i2, String str, String str2, String str3, String str4) {
        this.f71278 = i;
        this.f71274 = i2;
        this.f71279 = str;
        this.f71275 = str2;
        this.f71276 = str3;
        this.f71277 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21969.class == obj.getClass()) {
            C21969 c21969 = (C21969) obj;
            if (this.f71278 == c21969.f71278 && this.f71274 == c21969.f71274 && TextUtils.equals(this.f71279, c21969.f71279) && TextUtils.equals(this.f71275, c21969.f71275) && TextUtils.equals(this.f71276, c21969.f71276) && TextUtils.equals(this.f71277, c21969.f71277)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f71278 * 31) + this.f71274) * 31;
        String str = this.f71279;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f71275;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f71276;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f71277;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
