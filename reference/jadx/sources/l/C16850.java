package l;

import com.umeng.analytics.pro.bo;

/* JADX INFO: renamed from: l.ܽ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8K6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16850 implements InterfaceC15440 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C5188 f53904;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f53905;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f53906;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f53907;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f53908;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f53909;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f53910;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2460 f53911;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f53912;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f53913;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f53914;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f53915 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f53916;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f53917;

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2891(boolean z) {
    }

    public C16850(String str, int i, String str2) {
        C2460 c2460 = new C2460(4);
        this.f53911 = c2460;
        c2460.m7518()[0] = -1;
        this.f53904 = new C5188();
        this.f53914 = -9223372036854775807L;
        this.f53906 = str;
        this.f53913 = i;
        this.f53907 = str2;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2887() {
        this.f53915 = 0;
        this.f53910 = 0;
        this.f53909 = false;
        this.f53914 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2890(InterfaceC15690 interfaceC15690, C8074 c8074) {
        c8074.m21286();
        this.f53912 = c8074.m21288();
        this.f53917 = interfaceC15690.mo7684(c8074.m21287(), 1);
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2888(int i, long j) {
        this.f53914 = j;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2889(C2460 c2460) {
        C2023.m6508(this.f53917);
        while (c2460.m7503() > 0) {
            int i = this.f53915;
            C2460 c2461 = this.f53911;
            if (i == 0) {
                byte[] bArrM7518 = c2460.m7518();
                int iM7500 = c2460.m7500();
                int iM7509 = c2460.m7509();
                while (true) {
                    if (iM7500 < iM7509) {
                        byte b = bArrM7518[iM7500];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.f53909 && (b & bo.k) == 224;
                        this.f53909 = z;
                        if (z2) {
                            c2460.m7510(iM7500 + 1);
                            this.f53909 = false;
                            c2461.m7518()[1] = bArrM7518[iM7500];
                            this.f53910 = 2;
                            this.f53915 = 1;
                            break;
                        }
                        iM7500++;
                    } else {
                        c2460.m7510(iM7509);
                        break;
                    }
                }
            } else if (i == 1) {
                int iMin = Math.min(c2460.m7503(), 4 - this.f53910);
                c2460.m7507(this.f53910, iMin, c2461.m7518());
                int i2 = this.f53910 + iMin;
                this.f53910 = i2;
                if (i2 >= 4) {
                    c2461.m7510(0);
                    int iM7499 = c2461.m7499();
                    C5188 c5188 = this.f53904;
                    if (!c5188.m14349(iM7499)) {
                        this.f53910 = 0;
                        this.f53915 = 1;
                    } else {
                        this.f53908 = c5188.f17994;
                        if (!this.f53916) {
                            this.f53905 = (((long) c5188.f17996) * 1000000) / ((long) c5188.f17993);
                            C10471 c10471 = new C10471();
                            c10471.m26516(this.f53912);
                            c10471.m26521(this.f53907);
                            c10471.m26533(c5188.f17991);
                            c10471.m26531(4096);
                            c10471.m26494(c5188.f17995);
                            c10471.m26511(c5188.f17993);
                            c10471.m26509(this.f53906);
                            c10471.m26513(this.f53913);
                            this.f53917.mo8116(c10471.m26497());
                            this.f53916 = true;
                        }
                        c2461.m7510(0);
                        this.f53917.mo8112(4, c2461);
                        this.f53915 = 2;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(c2460.m7503(), this.f53908 - this.f53910);
                this.f53917.mo8112(iMin2, c2460);
                int i3 = this.f53910 + iMin2;
                this.f53910 = i3;
                if (i3 >= this.f53908) {
                    C2023.m6510(this.f53914 != -9223372036854775807L);
                    this.f53917.mo8114(this.f53914, 1, this.f53908, 0, null);
                    this.f53914 += this.f53905;
                    this.f53910 = 0;
                    this.f53915 = 0;
                }
            }
        }
    }
}
