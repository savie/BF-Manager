package l;

import android.text.Layout;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۨۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8SE */
/* JADX INFO: loaded from: classes3.dex */
public final class C12087 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f38920;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f38922 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f38921 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f38924 = 2;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f38928 = -3.4028235E38f;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f38929 = 1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f38923 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f38927 = -3.4028235E38f;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f38926 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f38925 = 1.0f;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f38930 = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5866 m30269() {
        Layout.Alignment alignment;
        float f = this.f38927;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.f38924;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.f38926;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.f38924;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        C5866 c5866 = new C5866();
        int i4 = this.f38924;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            j$$ExternalSyntheticOutline0.m(i4, "Unknown textAlignment: ");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        c5866.m17089(alignment);
        float f3 = this.f38928;
        int i5 = this.f38929;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        c5866.m17075(f2, i5);
        c5866.m17076(this.f38923);
        c5866.m17086(f);
        c5866.m17088(i2);
        float f4 = this.f38925;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 == 1) {
            f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
        } else if (i2 != 2) {
            throw new IllegalStateException(String.valueOf(i2));
        }
        c5866.m17091(Math.min(f4, f));
        c5866.m17082(this.f38930);
        CharSequence charSequence = this.f38920;
        if (charSequence != null) {
            c5866.m17079(charSequence);
        }
        return c5866;
    }
}
