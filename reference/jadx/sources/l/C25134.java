package l;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: l.᩻ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes.dex */
public class C25134 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f81261;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f81262;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC16182 f81263;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f81264;

    static {
        C16980.m40037(C25134.class);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m56001(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
            if (i2 <= 0) {
                throw new IllegalArgumentException(C14442.m34864(i, "Cannot get next power of 2; ", " is too large"));
            }
        }
        return i2;
    }

    public C25134(byte[] bArr) {
        this(bArr, true);
    }

    public C25134() {
        this(new byte[m56001(256)], false);
    }

    public C25134(byte[] bArr, boolean z) {
        this.f81261 = bArr;
        this.f81263 = AbstractC16182.f52522;
        this.f81262 = 0;
        this.f81264 = z ? bArr.length : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m56011() {
        return this.f81261;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m56013() {
        return this.f81264 - this.f81262;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m56029() {
        return this.f81262;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m56027(int i) {
        this.f81262 = i;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m56019() {
        return this.f81264;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte m56020() throws C2013 {
        if (m56013() < 1) {
            throw new C2013("Underflow");
        }
        byte[] bArr = this.f81261;
        int i = this.f81262;
        this.f81262 = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m56021(int i) throws C2013 {
        if (m56013() < i) {
            throw new C2013("Underflow");
        }
        this.f81262 += i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56024(int i, byte[] bArr) throws C2013 {
        if (m56013() < i) {
            throw new C2013("Underflow");
        }
        System.arraycopy(this.f81261, this.f81262, bArr, 0, i);
        this.f81262 += i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56006(int i) {
        int length = this.f81261.length;
        int i2 = this.f81264;
        if (length - i2 < i) {
            byte[] bArr = new byte[m56001(i2 + i)];
            byte[] bArr2 = this.f81261;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.f81261 = bArr;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] m56028() {
        int iM56013 = m56013();
        if (iM56013 <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[iM56013];
        System.arraycopy(this.f81261, this.f81262, bArr, 0, iM56013);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56005(byte b) {
        m56006(1);
        byte[] bArr = this.f81261;
        int i = this.f81264;
        this.f81264 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] m56015(int i) throws C2013 {
        byte[] bArr = new byte[i];
        m56024(i, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56007(int i, byte[] bArr) {
        m56006(i);
        System.arraycopy(bArr, 0, this.f81261, this.f81264, i);
        this.f81264 += i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56010(C7453 c7453) {
        int iM56013 = c7453.m56013();
        m56006(iM56013);
        System.arraycopy(c7453.f81261, c7453.f81262, this.f81261, this.f81264, iM56013);
        this.f81264 += iM56013;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m56017() throws C2013 {
        ((C17674) this.f81263).getClass();
        byte[] bArr = new byte[2];
        m56024(2, bArr);
        return (bArr[0] & 255) | ((bArr[1] << 8) & 65280);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56023(int i) {
        ((C17674) this.f81263).getClass();
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(C13645.m33382(i, "Invalid uint16 value: "));
        }
        m56007(2, new byte[]{(byte) i, (byte) (i >> 8)});
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m56002() {
        return (int) this.f81263.mo38410(this);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m56012() {
        return this.f81263.mo38410(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56025(long j) {
        ((C17674) this.f81263).getClass();
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException(C24770.m55292(j, "Invalid uint32 value: "));
        }
        m56007(4, new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24)});
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m56016() throws C2013 {
        C17674 c17674 = (C17674) this.f81263;
        long jMo38410 = (c17674.mo38410(this) & 4294967295L) + (c17674.mo38410(this) << 32);
        if (jMo38410 >= 0) {
            return jMo38410;
        }
        throw new C2013("Cannot handle values > 9223372036854775807");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m56014(long j) {
        C17674 c17674 = (C17674) this.f81263;
        if (j >= 0) {
            c17674.mo38408(this, j);
        } else {
            c17674.getClass();
            throw new IllegalArgumentException(C24770.m55292(j, "Invalid uint64 value: "));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56008(long j) {
        this.f81263.mo38408(this, j);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m56018() {
        return this.f81263.mo38406(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m56003(int i, Charset charset) throws C2013 {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                ((C17674) this.f81263).getClass();
                return AbstractC16182.m38404(this, i, C22150.f71350);
            case "UTF-8":
                byte[] bArr = new byte[i];
                m56024(i, bArr);
                return new String(bArr, charset);
            case "UTF-16BE":
                return AbstractC16182.m38404(this, i, C22150.f71347);
            case "UTF-16LE":
                return AbstractC16182.m38404(this, i, C22150.f71350);
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m56004(Charset charset) throws C2013 {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                ((C17674) this.f81263).getClass();
                return AbstractC16182.m38405((C7453) this, C22150.f71350);
            case "UTF-8":
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte bM56020 = m56020();
                while (bM56020 != 0) {
                    byteArrayOutputStream.write(bM56020);
                    bM56020 = m56020();
                }
                return new String(byteArrayOutputStream.toByteArray(), charset);
            case "UTF-16BE":
                return AbstractC16182.m38405(this, C22150.f71347);
            case "UTF-16LE":
                return AbstractC16182.m38405(this, C22150.f71350);
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56026(String str, Charset charset) {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                this.f81263.mo38409(this, str);
                return;
            case "UTF-8":
                byte[] bytes = str.getBytes(charset);
                m56007(bytes.length, bytes);
                return;
            case "UTF-16BE":
                AbstractC16182.f52520.mo38409(this, str);
                return;
            case "UTF-16LE":
                AbstractC16182.f52522.mo38409(this, str);
                return;
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56009(String str, Charset charset) {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                this.f81263.m38407((C7453) this, str);
                return;
            case "UTF-8":
                byte[] bytes = str.getBytes(charset);
                m56007(bytes.length, bytes);
                m56005((byte) 0);
                return;
            case "UTF-16BE":
                AbstractC16182.f52520.m38407((C7453) this, str);
                return;
            case "UTF-16LE":
                AbstractC16182.f52522.m38407((C7453) this, str);
                return;
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Buffer [rpos=");
        sb.append(this.f81262);
        sb.append(", wpos=");
        sb.append(this.f81264);
        sb.append(", size=");
        return C12669.m31437(this.f81261.length, "]", sb);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InputStream m56022() {
        return new C5742(this);
    }
}
