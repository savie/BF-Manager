package l;

import android.net.Uri;
import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.֡۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8N9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0282 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Object f1577 = new Object();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C13689 f1578;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f1579;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f1580;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C23876 f1581;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f1582;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f1583;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Object f1584;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f1585;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f1586;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f1587;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f1588;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f1589;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public Object f1590;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f1592;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f1593;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Object f1591 = f1577;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C13689 f1594 = f1578;

    static {
        C20348 c20348 = new C20348();
        c20348.m45918("androidx.media3.common.Timeline");
        c20348.m45916(Uri.EMPTY);
        f1578 = c20348.m45915();
        C9023.m23358(1, 2, 3, 4, 5);
        C9023.m23358(6, 7, 8, 9, 10);
        C17983.m41806(11);
        C17983.m41806(12);
        C17983.m41806(13);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1797(C13689 c13689, Object obj, long j, long j2, long j3, boolean z, boolean z2, C23876 c23876, long j4, long j5, long j6) {
        C14704 c14704;
        this.f1591 = f1577;
        this.f1594 = c13689 != null ? c13689 : f1578;
        this.f1590 = (c13689 == null || (c14704 = c13689.f45157) == null) ? null : c14704.f48035;
        this.f1584 = obj;
        this.f1592 = j;
        this.f1585 = j2;
        this.f1586 = j3;
        this.f1579 = z;
        this.f1583 = z2;
        this.f1581 = c23876;
        this.f1582 = j4;
        this.f1588 = j5;
        this.f1580 = 0;
        this.f1587 = 0;
        this.f1589 = j6;
        this.f1593 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1798() {
        return this.f1581 != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0282.class.equals(obj.getClass())) {
            return false;
        }
        C0282 c0282 = (C0282) obj;
        return C13638.equals(this.f1591, c0282.f1591) && C13638.equals(this.f1594, c0282.f1594) && C13638.equals(this.f1584, c0282.f1584) && C13638.equals(this.f1581, c0282.f1581) && this.f1592 == c0282.f1592 && this.f1585 == c0282.f1585 && this.f1586 == c0282.f1586 && this.f1579 == c0282.f1579 && this.f1583 == c0282.f1583 && this.f1593 == c0282.f1593 && this.f1582 == c0282.f1582 && this.f1588 == c0282.f1588 && this.f1580 == c0282.f1580 && this.f1587 == c0282.f1587 && this.f1589 == c0282.f1589;
    }

    public final int hashCode() {
        int iHashCode = (this.f1594.hashCode() + ((this.f1591.hashCode() + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31)) * 31;
        Object obj = this.f1584;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C23876 c23876 = this.f1581;
        int iHashCode3 = (iHashCode2 + (c23876 != null ? c23876.hashCode() : 0)) * 31;
        long j = this.f1592;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f1585;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f1586;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f1579 ? 1 : 0)) * 31) + (this.f1583 ? 1 : 0)) * 31) + (this.f1593 ? 1 : 0)) * 31;
        long j4 = this.f1582;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f1588;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f1580) * 31) + this.f1587) * 31;
        long j6 = this.f1589;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
