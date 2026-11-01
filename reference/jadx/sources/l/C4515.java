package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ۙ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes2.dex */
public class C4515 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Uri f16065;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f16066;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f16067;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f16068;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f16069;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f16070;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f16071;

    public C4515(C3413 c3413) {
        this.f16065 = c3413.f12600;
        this.f16066 = c3413.f12601;
        this.f16069 = c3413.f12604;
        this.f16071 = c3413.f12606;
        this.f16068 = c3413.f12603;
        this.f16070 = c3413.f12605;
        this.f16067 = c3413.f12602;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4515)) {
            return false;
        }
        C4515 c4515 = (C4515) obj;
        return this.f16065.equals(c4515.f16065) && C13638.equals(this.f16066, c4515.f16066) && C13638.equals(this.f16069, c4515.f16069) && this.f16071 == c4515.f16071 && this.f16068 == c4515.f16068 && C13638.equals(this.f16070, c4515.f16070) && C13638.equals(this.f16067, c4515.f16067);
    }

    public final int hashCode() {
        int iHashCode = this.f16065.hashCode() * 31;
        String str = this.f16066;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16069;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f16071) * 31) + this.f16068) * 31;
        String str3 = this.f16070;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16067;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    static {
        C9023.m23358(0, 1, 2, 3, 4);
        C17983.m41806(5);
        C17983.m41806(6);
    }
}
