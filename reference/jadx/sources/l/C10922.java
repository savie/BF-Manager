package l;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: l.ۧۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes3.dex */
public class C10922 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f37161;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f37162;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f37163;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC1748 f37164;

    static {
        C13488.m32997(C10922.class);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int m27374(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
            if (i2 <= 0) {
                throw new IllegalArgumentException(C2271.m6966(i, "Cannot get next power of 2; ", " is too large"));
            }
        }
        return i2;
    }

    public C10922(byte[] bArr) {
        this(bArr, true);
    }

    public C10922() {
        this(new byte[m27374(256)], false);
    }

    public C10922(byte[] bArr, boolean z) {
        this.f37162 = bArr;
        this.f37164 = AbstractC1748.f6873;
        this.f37163 = 0;
        this.f37161 = z ? bArr.length : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m27387() {
        return this.f37162;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m27391() {
        return this.f37161 - this.f37163;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m27402() {
        return this.f37163;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m27376(int i) {
        this.f37163 = i;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m27400() {
        return this.f37161;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte m27388() throws C17271 {
        if (m27391() < 1) {
            throw new C17271("Underflow");
        }
        byte[] bArr = this.f37162;
        int i = this.f37163;
        this.f37163 = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m27389(int i) throws C17271 {
        if (m27391() < i) {
            throw new C17271("Underflow");
        }
        this.f37163 += i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27397(int i, byte[] bArr) throws C17271 {
        if (m27391() < i) {
            throw new C17271("Underflow");
        }
        System.arraycopy(this.f37162, this.f37163, bArr, 0, i);
        this.f37163 += i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27382(int i) {
        int length = this.f37162.length;
        int i2 = this.f37161;
        if (length - i2 < i) {
            byte[] bArr = new byte[m27374(i2 + i)];
            byte[] bArr2 = this.f37162;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.f37162 = bArr;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] m27377() {
        int iM27391 = m27391();
        if (iM27391 <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[iM27391];
        System.arraycopy(this.f37162, this.f37163, bArr, 0, iM27391);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27381(byte b) {
        m27382(1);
        byte[] bArr = this.f37162;
        int i = this.f37161;
        this.f37161 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m27393(int i) throws C17271 {
        byte[] bArr = new byte[i];
        m27397(i, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27383(int i, byte[] bArr) {
        m27382(i);
        System.arraycopy(bArr, 0, this.f37162, this.f37161, i);
        this.f37161 += i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27386(C19240 c19240) {
        int iM27391 = c19240.m27391();
        m27382(iM27391);
        System.arraycopy(c19240.f37162, c19240.f37163, this.f37162, this.f37161, iM27391);
        this.f37161 += iM27391;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m27375() throws C17271 {
        ((C14450) this.f37164).getClass();
        byte[] bArr = new byte[2];
        m27397(2, bArr);
        return (bArr[0] & 255) | ((bArr[1] << 8) & 65280);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27396(int i) {
        ((C14450) this.f37164).getClass();
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(C8479.m22141(i, "Invalid uint16 value: "));
        }
        m27383(2, new byte[]{(byte) i, (byte) (i >> 8)});
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m27378() {
        return (int) this.f37164.mo5794(this);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m27394() {
        return this.f37164.mo5794(this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27398(long j) {
        ((C14450) this.f37164).getClass();
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException(C15489.m37074(j, "Invalid uint32 value: "));
        }
        m27383(4, new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24)});
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m27390() throws C17271 {
        C14450 c14450 = (C14450) this.f37164;
        long jMo5794 = (c14450.mo5794(this) & 4294967295L) + (c14450.mo5794(this) << 32);
        if (jMo5794 >= 0) {
            return jMo5794;
        }
        throw new C17271("Cannot handle values > 9223372036854775807");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m27392(long j) {
        C14450 c14450 = (C14450) this.f37164;
        if (j >= 0) {
            c14450.mo5791(this, j);
        } else {
            c14450.getClass();
            throw new IllegalArgumentException(C15489.m37074(j, "Invalid uint64 value: "));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27384(long j) {
        this.f37164.mo5791(this, j);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m27401() {
        return this.f37164.mo5790(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m27379(int i, Charset charset) throws C17271 {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                ((C14450) this.f37164).getClass();
                return AbstractC1748.m5788(this, i, C7393.f24570);
            case "UTF-8":
                byte[] bArr = new byte[i];
                m27397(i, bArr);
                return new String(bArr, charset);
            case "UTF-16BE":
                return AbstractC1748.m5788(this, i, C7393.f24573);
            case "UTF-16LE":
                return AbstractC1748.m5788(this, i, C7393.f24570);
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m27380(Charset charset) throws C17271 {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                ((C14450) this.f37164).getClass();
                return AbstractC1748.m5789((C19240) this, C7393.f24570);
            case "UTF-8":
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte bM27388 = m27388();
                while (bM27388 != 0) {
                    byteArrayOutputStream.write(bM27388);
                    bM27388 = m27388();
                }
                return new String(byteArrayOutputStream.toByteArray(), charset);
            case "UTF-16BE":
                return AbstractC1748.m5789(this, C7393.f24573);
            case "UTF-16LE":
                return AbstractC1748.m5789(this, C7393.f24570);
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27399(String str, Charset charset) {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                this.f37164.mo5792(this, str);
                return;
            case "UTF-8":
                byte[] bytes = str.getBytes(charset);
                m27383(bytes.length, bytes);
                return;
            case "UTF-16BE":
                AbstractC1748.f6871.mo5792(this, str);
                return;
            case "UTF-16LE":
                AbstractC1748.f6873.mo5792(this, str);
                return;
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27385(String str, Charset charset) {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                this.f37164.m5793((C19240) this, str);
                return;
            case "UTF-8":
                byte[] bytes = str.getBytes(charset);
                m27383(bytes.length, bytes);
                m27381((byte) 0);
                return;
            case "UTF-16BE":
                AbstractC1748.f6871.m5793((C19240) this, str);
                return;
            case "UTF-16LE":
                AbstractC1748.f6873.m5793((C19240) this, str);
                return;
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Buffer [rpos=");
        sb.append(this.f37163);
        sb.append(", wpos=");
        sb.append(this.f37161);
        sb.append(", size=");
        return C12441.m30911(this.f37162.length, "]", sb);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InputStream m27395() {
        return new C12333(this);
    }
}
