package l;

import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.ۚۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5251 implements InterfaceC19363 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f18207;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f18208;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f18209;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2460 f18210 = new C2460(32);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2428 f18211;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f18212;

    public C5251(InterfaceC2428 interfaceC2428) {
        this.f18211 = interfaceC2428;
    }

    @Override // l.InterfaceC19363
    /* JADX INFO: renamed from: ۙ */
    public final void mo6528(C6694 c6694, InterfaceC15690 interfaceC15690, C8074 c8074) {
        this.f18211.mo7415(c6694, interfaceC15690, c8074);
        this.f18212 = true;
    }

    @Override // l.InterfaceC19363
    /* JADX INFO: renamed from: ۙ */
    public final void mo6526() {
        this.f18212 = true;
    }

    @Override // l.InterfaceC19363
    /* JADX INFO: renamed from: ۙ */
    public final void mo6527(int i, C2460 c2460) {
        int iM7500;
        boolean z = (i & 1) != 0;
        if (z) {
            iM7500 = c2460.m7500() + c2460.m7516();
        } else {
            iM7500 = -1;
        }
        if (this.f18212) {
            if (!z) {
                return;
            }
            this.f18212 = false;
            c2460.m7510(iM7500);
            this.f18208 = 0;
        }
        while (c2460.m7503() > 0) {
            int i2 = this.f18208;
            C2460 c2461 = this.f18210;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM7516 = c2460.m7516();
                    c2460.m7510(c2460.m7500() - 1);
                    if (iM7516 == 255) {
                        this.f18212 = true;
                        return;
                    }
                }
                int iMin = Math.min(c2460.m7503(), 3 - this.f18208);
                c2460.m7507(this.f18208, iMin, c2461.m7518());
                int i3 = this.f18208 + iMin;
                this.f18208 = i3;
                if (i3 == 3) {
                    c2461.m7510(0);
                    c2461.m7501(3);
                    c2461.m7535(1);
                    int iM7517 = c2461.m7516();
                    int iM7518 = c2461.m7516();
                    this.f18207 = (iM7517 & 128) != 0;
                    this.f18209 = (((iM7517 & 15) << 8) | iM7518) + 3;
                    int iM7521 = c2461.m7521();
                    int i4 = this.f18209;
                    if (iM7521 < i4) {
                        c2461.m7506(Math.min(o.a.b, Math.max(i4, c2461.m7521() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c2460.m7503(), this.f18209 - this.f18208);
                c2460.m7507(this.f18208, iMin2, c2461.m7518());
                int i5 = this.f18208 + iMin2;
                this.f18208 = i5;
                int i6 = this.f18209;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f18207) {
                        if (C17983.m41818(0, c2461.m7518(), this.f18209, -1) != 0) {
                            this.f18212 = true;
                            return;
                        }
                        c2461.m7501(this.f18209 - 4);
                    } else {
                        c2461.m7501(i6);
                    }
                    c2461.m7510(0);
                    this.f18211.mo7414(c2461);
                    this.f18208 = 0;
                }
            }
        }
    }
}
