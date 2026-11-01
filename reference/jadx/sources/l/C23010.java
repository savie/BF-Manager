package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N67V */
/* JADX INFO: loaded from: classes.dex */
public final class C23010 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13569 f74780;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74781;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15249 f74782;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3253 f74783;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f74784;

    public C23010(InterfaceC3253 interfaceC3253, C22596 c22596, C15249 c15249) {
        this.f74783 = interfaceC3253;
        this.f74780 = c22596;
        this.f74782 = c15249;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50895(int i) {
        this.f74781 = 0;
        this.f74784 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50897(int i, int i2, C3067 c3067, C1428 c1428, C3067 c3068) {
        InterfaceC3253 interfaceC3253 = this.f74783;
        int iMo24177 = interfaceC3253.mo24177(c3067);
        int iMo24178 = ((C22596) this.f74780).mo24177(c1428);
        int iMo24179 = interfaceC3253.mo24177(c3068);
        m50894(i);
        C15249 c15249 = this.f74782;
        if (iMo24179 == -1) {
            c15249.write(3);
            C15249.m36519(c15249, i2);
            C15249.m36519(c15249, iMo24177 + 1);
            C15249.m36519(c15249, iMo24178 + 1);
            return;
        }
        c15249.write(4);
        C15249.m36519(c15249, i2);
        C15249.m36519(c15249, iMo24177 + 1);
        C15249.m36519(c15249, iMo24178 + 1);
        C15249.m36519(c15249, iMo24179 + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50896(int i, int i2) {
        m50894(i);
        C15249 c15249 = this.f74782;
        c15249.write(5);
        C15249.m36519(c15249, i2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m50900(int i, int i2) {
        m50894(i);
        C15249 c15249 = this.f74782;
        c15249.write(6);
        C15249.m36519(c15249, i2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m50899(int i) {
        m50894(i);
        this.f74782.write(7);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50901(int i) {
        m50894(i);
        this.f74782.write(8);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50902(int i, int i2) {
        int i3 = i2 - this.f74784;
        int i4 = i - this.f74781;
        if (i4 < 0) {
            throw new C20749(null, "debug info items must have non-decreasing code addresses", new Object[0]);
        }
        C15249 c15249 = this.f74782;
        if (i3 < -4 || i3 > 10) {
            if (i3 != 0) {
                c15249.write(2);
                C15249.m36520(c15249, i3);
                this.f74784 = i2;
            }
            i3 = 0;
        }
        if ((i3 < 2 && i4 > 16) || (i3 > 1 && i4 > 15)) {
            m50894(i);
            i4 = 0;
        }
        c15249.write((byte) (i3 + 4 + (i4 * 15) + 10));
        this.f74784 += i3;
        this.f74781 += i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50898(int i, C3067 c3067) {
        m50894(i);
        C15249 c15249 = this.f74782;
        c15249.write(9);
        C15249.m36519(c15249, this.f74783.mo24177(c3067) + 1);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m50894(int i) throws IOException {
        int i2 = i - this.f74781;
        if (i2 > 0) {
            C15249 c15249 = this.f74782;
            c15249.write(1);
            c15249.getClass();
            C15249.m36519(c15249, i2);
            this.f74781 = i;
        }
    }
}
