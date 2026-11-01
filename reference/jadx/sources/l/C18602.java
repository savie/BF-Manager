package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: D1JM */
/* JADX INFO: loaded from: classes4.dex */
public final class C18602 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f59191;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20719 f59192;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f59193;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f59194;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f59195;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C20719 f59196;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f59197;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20719 f59198;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C20719 f59199;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20719 f59200;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C20719 f59201;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f59202 = 0.0f;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f59203;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f59204;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f59205;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f59206;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C20719 f59207;

    public C18602(C20719 c20719, int i, boolean z) {
        this.f59200 = c20719;
        this.f59205 = i;
        this.f59193 = z;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43012() {
        C20719 c20719;
        int i;
        if (!this.f59194) {
            int i2 = this.f59205;
            int i3 = i2 * 2;
            C20719 c207110 = this.f59200;
            boolean z = false;
            C20719 c207111 = c207110;
            C20719 c207112 = c207111;
            while (!z) {
                this.f59197++;
                C20719[] c20719Arr = c207111.f67388;
                int[] iArr = c207111.f67419;
                C8725[] c8725Arr = c207111.f67398;
                c20719Arr[i2] = null;
                c207111.f67408[i2] = null;
                if (c207111.m46606() != 8) {
                    c207111.m46621(i2);
                    EnumC7313 enumC7313 = EnumC7313.MATCH_CONSTRAINT;
                    c8725Arr[i3].m22577();
                    int i4 = i3 + 1;
                    c8725Arr[i4].m22577();
                    c8725Arr[i3].m22577();
                    c8725Arr[i4].m22577();
                    if (this.f59192 == null) {
                        this.f59192 = c207111;
                    }
                    this.f59201 = c207111;
                    if (c207111.f67434[i2] == enumC7313) {
                        int i5 = iArr[i2];
                        if (i5 == 0 || i5 == 3 || i5 == 2) {
                            this.f59204++;
                            float f = c207111.f67413[i2];
                            if (f > 0.0f) {
                                this.f59202 += f;
                            }
                            if (c207111.m46606() != 8 && c207111.f67434[i2] == enumC7313 && ((i = iArr[i2]) == 0 || i == 3)) {
                                if (f < 0.0f) {
                                    this.f59191 = true;
                                } else {
                                    this.f59206 = true;
                                }
                                if (this.f59203 == null) {
                                    this.f59203 = new ArrayList();
                                }
                                this.f59203.add(c207111);
                            }
                            if (this.f59198 == null) {
                                this.f59198 = c207111;
                            }
                            C20719 c207113 = this.f59207;
                            if (c207113 != null) {
                                c207113.f67408[i2] = c207111;
                            }
                            this.f59207 = c207111;
                        }
                        if (i2 == 0) {
                            if (c207111.f67395 == 0 && c207111.f67401 == 0) {
                                int i6 = c207111.f67382;
                            }
                        } else if (c207111.f67375 == 0 && c207111.f67407 == 0) {
                            int i7 = c207111.f67378;
                        }
                    }
                }
                if (c207112 != c207111) {
                    c207112.f67388[i2] = c207111;
                }
                C8725 c8725 = c8725Arr[i3 + 1].f29981;
                if (c8725 != null) {
                    c20719 = c8725.f29983;
                    C8725 c8726 = c20719.f67398[i3].f29981;
                    if (c8726 == null || c8726.f29983 != c207111) {
                        c20719 = null;
                    }
                } else {
                    c20719 = null;
                }
                if (c20719 == null) {
                    z = true;
                    c20719 = c207111;
                }
                C20719 c207114 = c20719;
                c207112 = c207111;
                c207111 = c207114;
            }
            C20719 c207115 = this.f59192;
            if (c207115 != null) {
                c207115.f67398[i3].m22577();
            }
            C20719 c207116 = this.f59201;
            if (c207116 != null) {
                c207116.f67398[i3 + 1].m22577();
            }
            this.f59196 = c207111;
            if (i2 == 0 && this.f59193) {
                this.f59199 = c207111;
            } else {
                this.f59199 = c207110;
            }
            this.f59195 = this.f59206 && this.f59191;
        }
        this.f59194 = true;
    }
}
