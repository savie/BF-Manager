package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳܶۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: N67V */
/* JADX INFO: loaded from: classes5.dex */
public final class C19160 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f61992;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3718 f61993;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C10209 f61994;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f61995;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC12667 f61996;

    public C19160(InterfaceC3718 interfaceC3718, C14816 c14816, C10209 c10209) {
        this.f61993 = interfaceC3718;
        this.f61996 = c14816;
        this.f61994 = c10209;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44400(int i) {
        this.f61992 = 0;
        this.f61995 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44402(int i, int i2, C3630 c3630, C21530 c21530, C3630 c3631) {
        InterfaceC3718 interfaceC3718 = this.f61993;
        int iMo35672 = interfaceC3718.mo35672(c3630);
        int iMo35673 = ((C14816) this.f61996).mo35672(c21530);
        int iMo35674 = interfaceC3718.mo35672(c3631);
        m44399(i);
        C10209 c10209 = this.f61994;
        if (iMo35674 == -1) {
            c10209.write(3);
            C10209.m26339(c10209, i2);
            C10209.m26339(c10209, iMo35672 + 1);
            C10209.m26339(c10209, iMo35673 + 1);
            return;
        }
        c10209.write(4);
        C10209.m26339(c10209, i2);
        C10209.m26339(c10209, iMo35672 + 1);
        C10209.m26339(c10209, iMo35673 + 1);
        C10209.m26339(c10209, iMo35674 + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44401(int i, int i2) {
        m44399(i);
        C10209 c10209 = this.f61994;
        c10209.write(5);
        C10209.m26339(c10209, i2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m44405(int i, int i2) {
        m44399(i);
        C10209 c10209 = this.f61994;
        c10209.write(6);
        C10209.m26339(c10209, i2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m44404(int i) {
        m44399(i);
        this.f61994.write(7);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44406(int i) {
        m44399(i);
        this.f61994.write(8);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44407(int i, int i2) {
        int i3 = i2 - this.f61995;
        int i4 = i - this.f61992;
        if (i4 < 0) {
            throw new C23044(null, "debug info items must have non-decreasing code addresses", new Object[0]);
        }
        C10209 c10209 = this.f61994;
        if (i3 < -4 || i3 > 10) {
            if (i3 != 0) {
                c10209.write(2);
                C10209.m26340(c10209, i3);
                this.f61995 = i2;
            }
            i3 = 0;
        }
        if ((i3 < 2 && i4 > 16) || (i3 > 1 && i4 > 15)) {
            m44399(i);
            i4 = 0;
        }
        c10209.write((byte) (i3 + 4 + (i4 * 15) + 10));
        this.f61995 += i3;
        this.f61992 += i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44403(int i, C3630 c3630) {
        m44399(i);
        C10209 c10209 = this.f61994;
        c10209.write(9);
        C10209.m26339(c10209, this.f61993.mo35672(c3630) + 1);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m44399(int i) throws IOException {
        int i2 = i - this.f61992;
        if (i2 > 0) {
            C10209 c10209 = this.f61994;
            c10209.write(1);
            c10209.getClass();
            C10209.m26339(c10209, i2);
            this.f61992 = i;
        }
    }
}
