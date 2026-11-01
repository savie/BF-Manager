package l;

import android.text.Layout;

/* JADX INFO: renamed from: l.ܳ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8SE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14404 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public CharSequence f47223;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f47228 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f47224 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f47226 = 2;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f47229 = -3.4028235E38f;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f47222 = 1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f47227 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f47225 = -3.4028235E38f;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f47230 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f47221 = 1.0f;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f47231 = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20369 m34671() {
        Layout.Alignment alignment;
        float f = this.f47225;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.f47226;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.f47230;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.f47226;
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
        C20369 c20369 = new C20369();
        int i4 = this.f47226;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            C7309.m19506(i4, "Unknown textAlignment: ");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        c20369.m46012(alignment);
        float f3 = this.f47229;
        int i5 = this.f47222;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        c20369.m45998(f2, i5);
        c20369.m45999(this.f47227);
        c20369.m46009(f);
        c20369.m46011(i2);
        float f4 = this.f47221;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 == 1) {
            f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
        } else if (i2 != 2) {
            throw new IllegalStateException(String.valueOf(i2));
        }
        c20369.m45994(Math.min(f4, f));
        c20369.m46007(this.f47231);
        CharSequence charSequence = this.f47223;
        if (charSequence != null) {
            c20369.m46002(charSequence);
        }
        return c20369;
    }
}
