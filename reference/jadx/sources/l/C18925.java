package l;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8J4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18925 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f61233;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f61235;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C8342 f61236 = new C8342();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2460 f61237 = new C2460(new byte[65025], 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f61234 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43597(InterfaceC7222 interfaceC7222) {
        int i;
        C2023.m6510(interfaceC7222 != null);
        boolean z = this.f61233;
        C2460 c2460 = this.f61237;
        if (z) {
            this.f61233 = false;
            c2460.m7517(0);
        }
        while (!this.f61233) {
            int i2 = this.f61234;
            C8342 c8342 = this.f61236;
            if (i2 < 0) {
                if (c8342.m21790(interfaceC7222, -1L) && c8342.m21791(interfaceC7222, true)) {
                    int iM43594 = c8342.f28884;
                    if ((c8342.f28880 & 1) == 1 && c2460.m7509() == 0) {
                        iM43594 += m43594(0);
                        i = this.f61235;
                    } else {
                        i = 0;
                    }
                    try {
                        interfaceC7222.mo19214(iM43594);
                        this.f61234 = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM43595 = m43594(this.f61234);
            int i3 = this.f61234 + this.f61235;
            if (iM43595 > 0) {
                c2460.m7506(c2460.m7509() + iM43595);
                try {
                    interfaceC7222.readFully(c2460.m7518(), c2460.m7509(), iM43595);
                    c2460.m7501(c2460.m7509() + iM43595);
                    this.f61233 = c8342.f28881[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == c8342.f28883) {
                i3 = -1;
            }
            this.f61234 = i3;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m43598() {
        C8342 c8342 = this.f61236;
        c8342.f28880 = 0;
        c8342.f28885 = 0L;
        c8342.f28883 = 0;
        c8342.f28884 = 0;
        c8342.f28882 = 0;
        this.f61237.m7517(0);
        this.f61234 = -1;
        this.f61233 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8342 m43596() {
        return this.f61236;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2460 m43599() {
        return this.f61237;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m43595() {
        C2460 c2460 = this.f61237;
        if (c2460.m7518().length == 65025) {
            return;
        }
        c2460.m7508(c2460.m7509(), Arrays.copyOf(c2460.m7518(), Math.max(65025, c2460.m7509())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m43594(int i) {
        int i2;
        int i3 = 0;
        this.f61235 = 0;
        do {
            int i4 = this.f61235;
            int i5 = i + i4;
            C8342 c8342 = this.f61236;
            if (i5 >= c8342.f28883) {
                break;
            }
            int[] iArr = c8342.f28881;
            this.f61235 = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
