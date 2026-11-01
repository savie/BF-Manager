package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3262 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C4404 f12120;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f12121;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f12123 = 100;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f12122 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m9741(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m9744(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: ֨ */
    public abstract double mo6020();

    /* JADX INFO: renamed from: ۖ */
    public abstract boolean mo6021();

    /* JADX INFO: renamed from: ۖ */
    public abstract boolean mo6022(int i);

    /* JADX INFO: renamed from: ۘ */
    public abstract int mo6023();

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC23206 mo6024(InterfaceC6271 interfaceC6271, C2701 c2701);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6025(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6026(int i, InterfaceC6977 interfaceC6977, C2701 c2701);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6027(InterfaceC6977 interfaceC6977, C2701 c2701);

    /* JADX INFO: renamed from: ۚ */
    public abstract boolean mo6028();

    /* JADX INFO: renamed from: ۜ */
    public abstract long mo6029();

    /* JADX INFO: renamed from: ۟ */
    public abstract String mo6030();

    /* JADX INFO: renamed from: ۠ */
    public abstract long mo6031();

    /* JADX INFO: renamed from: ۡ */
    public abstract long mo6032();

    /* JADX INFO: renamed from: ۤ */
    public abstract String mo6033();

    /* JADX INFO: renamed from: ۨ */
    public abstract int mo6034();

    /* JADX INFO: renamed from: ۨ */
    public abstract int mo6035(int i);

    /* JADX INFO: renamed from: ۬ */
    public abstract int mo6037();

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo6038();

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo6039(int i);

    /* JADX INFO: renamed from: ܶ */
    public abstract int mo6040();

    /* JADX INFO: renamed from: ܺ */
    public abstract int mo6041();

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo6044();

    /* JADX INFO: renamed from: ᩴ */
    public abstract int mo6045();

    /* JADX INFO: renamed from: ᩵ */
    public abstract int mo6046();

    /* JADX INFO: renamed from: ᩶ */
    public abstract long mo6047();

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo6048();

    /* JADX INFO: renamed from: ᩸ */
    public abstract long mo6049();

    /* JADX INFO: renamed from: ᩹ */
    public abstract AbstractC23725 mo6050();

    /* JADX INFO: renamed from: ᩺ */
    public abstract float mo6052();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC3262 m9742(InputStream inputStream) {
        if (inputStream == null) {
            byte[] bArr = C9779.f33478;
            return m9743(false, 0, bArr.length, bArr);
        }
        return new C1851(inputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC3262 m9743(boolean z, int i, int i2, byte[] bArr) {
        C14553 c14553 = new C14553(z, i, i2, bArr);
        try {
            c14553.mo6035(i2);
            return c14553;
        } catch (C4529 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9745() throws C4529 {
        if (this.f12121 >= this.f12123) {
            throw new C4529("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public AbstractC3262(int i) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9740(InputStream inputStream, int i) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw C4529.m12644();
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
                throw C4529.m12644();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw C4529.m12649();
    }
}
