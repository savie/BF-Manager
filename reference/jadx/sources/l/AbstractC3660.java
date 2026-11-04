package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3660 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f12526;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C20814 f12529;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f12528 = 100;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f12527 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m11870(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m11873(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo11874();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public abstract long mo11875();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public abstract int mo11876();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC18775 mo11877(InterfaceC11490 interfaceC11490, C24215 c24215);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo11879(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo11880(int i, InterfaceC7588 interfaceC7588, C24215 c24215);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo11881(InterfaceC7588 interfaceC7588, C24215 c24215);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract int mo11882();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public abstract String mo11883();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract int mo11884();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract int mo11885(int i);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract long mo11886();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract long mo11887();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public abstract double mo11888();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract int mo11889();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC17084 mo11890();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public abstract int mo11891();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public abstract int mo11892();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract long mo11893();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo11894();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public abstract int mo11895();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public abstract long mo11896();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract int mo11897();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo11898(int i);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract boolean mo11899();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract boolean mo11900(int i);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public abstract int mo11901();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public abstract String mo11902();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public abstract float mo11903();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC3660 m11871(InputStream inputStream) {
        if (inputStream == null) {
            byte[] bArr = C23447.f75887;
            return m11872(false, 0, bArr.length, bArr);
        }
        return new C16338(inputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC3660 m11872(boolean z, int i, int i2, byte[] bArr) {
        C17830 c17830 = new C17830(z, i, i2, bArr);
        try {
            c17830.mo11885(i2);
            return c17830;
        } catch (C20463 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11878() throws C20463 {
        if (this.f12526 >= this.f12528) {
            throw new C20463("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public AbstractC3660(int i) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m11869(InputStream inputStream, int i) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw C20463.m46963();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw C20463.m46963();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw C20463.m46967();
    }
}
