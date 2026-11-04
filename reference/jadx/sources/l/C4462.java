package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ۘ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes2.dex */
public class C4462 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f15961;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f15962;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Uri f15963;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f15964;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f15965;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f15966;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f15967;

    public C4462(C24600 c24600) {
        this.f15963 = c24600.f79689;
        this.f15967 = c24600.f79693;
        this.f15962 = c24600.f79688;
        this.f15964 = c24600.f79690;
        this.f15965 = c24600.f79691;
        this.f15966 = c24600.f79692;
        this.f15961 = c24600.f79687;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4462)) {
            return false;
        }
        C4462 c4462 = (C4462) obj;
        return this.f15963.equals(c4462.f15963) && C17359.equals(this.f15967, c4462.f15967) && C17359.equals(this.f15962, c4462.f15962) && this.f15964 == c4462.f15964 && this.f15965 == c4462.f15965 && C17359.equals(this.f15966, c4462.f15966) && C17359.equals(this.f15961, c4462.f15961);
    }

    public final int hashCode() {
        int iHashCode = this.f15963.hashCode() * 31;
        String str = this.f15967;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15962;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f15964) * 31) + this.f15965) * 31;
        String str3 = this.f15966;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15961;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    static {
        C4794.m14773(0, 1, 2, 3, 4);
        C7116.m19499(5);
        C7116.m19499(6);
    }
}
