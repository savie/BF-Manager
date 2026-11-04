package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۢۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9866 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f31750;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f31751;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31752;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f31753;

    public C9866(int i) {
        this.f31753 = new byte[4];
        this.f31750 = new byte[i];
        this.f31752 = 0;
        this.f31751 = 0;
    }

    public C9866(byte[] bArr) {
        this.f31753 = new byte[4];
        this.f31750 = bArr;
        this.f31752 = 0;
        this.f31751 = 0;
    }

    public C9866() {
        this(UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25651(byte b) {
        byte[] bArr = this.f31750;
        int i = this.f31752;
        this.f31752 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25671(byte[] bArr) {
        m25670(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25670(int i, int i2, byte[] bArr) {
        System.arraycopy(bArr, i, this.f31750, this.f31752, i2);
        this.f31752 += i2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m25673(byte[] bArr) {
        m25660(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25660(int i, int i2, byte[] bArr) {
        m25669(i2);
        m25670(i, i2, bArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25669(int i) {
        byte[] bArr = this.f31753;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        System.arraycopy(bArr, 0, this.f31750, this.f31752, 4);
        this.f31752 += 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25654(long j) {
        byte[] bArr = this.f31753;
        bArr[0] = (byte) (j >>> 56);
        bArr[1] = (byte) (j >>> 48);
        bArr[2] = (byte) (j >>> 40);
        bArr[3] = (byte) (j >>> 32);
        System.arraycopy(bArr, 0, this.f31750, this.f31752, 4);
        bArr[0] = (byte) (j >>> 24);
        bArr[1] = (byte) (j >>> 16);
        bArr[2] = (byte) (j >>> 8);
        bArr[3] = (byte) j;
        System.arraycopy(bArr, 0, this.f31750, this.f31752 + 4, 4);
        this.f31752 += 8;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25659(int i) {
        this.f31752 += i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25661(byte[] bArr) {
        int length = bArr.length;
        if ((bArr[0] & GCMSIVBlockCipher.MASK) != 0) {
            m25669(length + 1);
            m25651((byte) 0);
        } else {
            m25669(length);
        }
        m25670(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m25672() {
        return this.f31752 - this.f31751;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m25663() {
        return this.f31751;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m25666() {
        this.f31751 = 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m25658() {
        return ((m25657() << 16) & (-65536)) | (m25657() & 65535);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m25662() {
        return (((((((long) m25650()) << 8) & 65280) | ((long) (m25650() & 255))) << 16) & (-65536)) | ((((((long) m25650()) << 8) & 65280) | ((long) (m25650() & 255))) & 65535);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m25657() {
        return ((m25650() << 8) & 65280) | (m25650() & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25650() {
        byte[] bArr = this.f31750;
        int i = this.f31751;
        this.f31751 = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25655(byte[] bArr) {
        m25653(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25653(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f31750, this.f31751, bArr, i, i2);
        this.f31751 += i2;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] m25667() {
        int iM25658 = m25658();
        if (iM25658 < 0 || iM25658 > 8192) {
            iM25658 = 8192;
        }
        byte[] bArr = new byte[iM25658];
        m25653(0, iM25658, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m25664() {
        int iM25658 = (m25658() + 7) / 8;
        byte[] bArr = new byte[iM25658];
        m25653(0, iM25658, bArr);
        if ((bArr[0] & GCMSIVBlockCipher.MASK) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[iM25658 + 1];
        bArr2[0] = 0;
        System.arraycopy(bArr, 0, bArr2, 1, iM25658);
        return bArr2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m25649() {
        int iM25658 = m25658();
        if (iM25658 < 0 || iM25658 > 262144) {
            iM25658 = 262144;
        }
        byte[] bArr = new byte[iM25658];
        m25653(0, iM25658, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m25674() {
        this.f31752 = 0;
        this.f31751 = 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m25665() {
        this.f31751 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte m25668() {
        return this.f31750[5];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25652(int i) {
        int i2 = this.f31752;
        int i3 = i + i2 + 128;
        byte[] bArr = this.f31750;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (length >= i3) {
                i3 = length;
            }
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.f31750 = bArr2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[][] m25656(int i, String str) throws C2079 {
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            int iM25658 = m25658();
            if (m25672() < iM25658) {
                throw new C2079(str);
            }
            byte[] bArr2 = new byte[iM25658];
            bArr[i2] = bArr2;
            m25653(0, iM25658, bArr2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9866 m25648(byte[][] bArr) {
        int length = bArr.length * 4;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        C9866 c9866 = new C9866(length);
        for (byte[] bArr3 : bArr) {
            c9866.m25673(bArr3);
        }
        return c9866;
    }
}
