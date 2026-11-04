package l;

import android.net.Uri;
import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.ۧۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8N9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11328 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Object f35682 = new Object();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C14902 f35683;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3716 f35684;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f35685;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f35686;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f35687;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f35688;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f35689;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f35690;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f35691;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public Object f35692;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f35693;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f35694;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f35695;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f35696;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f35697;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f35698 = f35682;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14902 f35699 = f35683;

    static {
        C2225 c2225 = new C2225();
        c2225.m7573("androidx.media3.common.Timeline");
        c2225.m7571(Uri.EMPTY);
        f35683 = c2225.m7570();
        C4794.m14773(1, 2, 3, 4, 5);
        C4794.m14773(6, 7, 8, 9, 10);
        C7116.m19499(11);
        C7116.m19499(12);
        C7116.m19499(13);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28619(C14902 c14902, Object obj, long j, long j2, long j3, boolean z, boolean z2, C3716 c3716, long j4, long j5, long j6) {
        C20870 c20870;
        this.f35698 = f35682;
        this.f35699 = c14902 != null ? c14902 : f35683;
        this.f35692 = (c14902 == null || (c20870 = c14902.f48681) == null) ? null : c20870.f66803;
        this.f35689 = obj;
        this.f35694 = j;
        this.f35685 = j2;
        this.f35688 = j3;
        this.f35690 = z;
        this.f35695 = z2;
        this.f35684 = c3716;
        this.f35686 = j4;
        this.f35696 = j5;
        this.f35697 = 0;
        this.f35687 = 0;
        this.f35693 = j6;
        this.f35691 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28620() {
        return this.f35684 != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C11328.class.equals(obj.getClass())) {
            return false;
        }
        C11328 c11328 = (C11328) obj;
        return C17359.equals(this.f35698, c11328.f35698) && C17359.equals(this.f35699, c11328.f35699) && C17359.equals(this.f35689, c11328.f35689) && C17359.equals(this.f35684, c11328.f35684) && this.f35694 == c11328.f35694 && this.f35685 == c11328.f35685 && this.f35688 == c11328.f35688 && this.f35690 == c11328.f35690 && this.f35695 == c11328.f35695 && this.f35691 == c11328.f35691 && this.f35686 == c11328.f35686 && this.f35696 == c11328.f35696 && this.f35697 == c11328.f35697 && this.f35687 == c11328.f35687 && this.f35693 == c11328.f35693;
    }

    public final int hashCode() {
        int iHashCode = (this.f35699.hashCode() + ((this.f35698.hashCode() + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31)) * 31;
        Object obj = this.f35689;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C3716 c3716 = this.f35684;
        int iHashCode3 = (iHashCode2 + (c3716 != null ? c3716.hashCode() : 0)) * 31;
        long j = this.f35694;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f35685;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f35688;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f35690 ? 1 : 0)) * 31) + (this.f35695 ? 1 : 0)) * 31) + (this.f35691 ? 1 : 0)) * 31;
        long j4 = this.f35686;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f35696;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f35697) * 31) + this.f35687) * 31;
        long j6 = this.f35693;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
