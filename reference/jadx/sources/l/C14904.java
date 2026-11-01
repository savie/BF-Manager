package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܶ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14904 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f48678;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f48679;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f48680;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f48681;

    public C14904(int i) {
        this.f48678 = new byte[4];
        this.f48679 = new byte[i];
        this.f48681 = 0;
        this.f48680 = 0;
    }

    public C14904(byte[] bArr) {
        this.f48678 = new byte[4];
        this.f48679 = bArr;
        this.f48681 = 0;
        this.f48680 = 0;
    }

    public C14904() {
        this(UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35630(byte b) {
        byte[] bArr = this.f48679;
        int i = this.f48681;
        this.f48681 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35646(byte[] bArr) {
        m35645(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35645(int i, int i2, byte[] bArr) {
        System.arraycopy(bArr, i, this.f48679, this.f48681, i2);
        this.f48681 += i2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m35627(byte[] bArr) {
        m35640(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35640(int i, int i2, byte[] bArr) {
        m35644(i2);
        m35645(i, i2, bArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35644(int i) {
        byte[] bArr = this.f48678;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        System.arraycopy(bArr, 0, this.f48679, this.f48681, 4);
        this.f48681 += 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35633(long j) {
        byte[] bArr = this.f48678;
        bArr[0] = (byte) (j >>> 56);
        bArr[1] = (byte) (j >>> 48);
        bArr[2] = (byte) (j >>> 40);
        bArr[3] = (byte) (j >>> 32);
        System.arraycopy(bArr, 0, this.f48679, this.f48681, 4);
        bArr[0] = (byte) (j >>> 24);
        bArr[1] = (byte) (j >>> 16);
        bArr[2] = (byte) (j >>> 8);
        bArr[3] = (byte) j;
        System.arraycopy(bArr, 0, this.f48679, this.f48681 + 4, 4);
        this.f48681 += 8;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35639(int i) {
        this.f48681 += i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35641(byte[] bArr) {
        int length = bArr.length;
        if ((bArr[0] & GCMSIVBlockCipher.MASK) != 0) {
            m35644(length + 1);
            m35630((byte) 0);
        } else {
            m35644(length);
        }
        m35645(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m35626() {
        return this.f48681 - this.f48680;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m35625() {
        return this.f48680;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m35648() {
        this.f48680 = 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m35638() {
        return ((m35642() << 16) & (-65536)) | (m35642() & 65535);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m35637() {
        return (((((((long) m35629()) << 8) & 65280) | ((long) (m35629() & 255))) << 16) & (-65536)) | ((((((long) m35629()) << 8) & 65280) | ((long) (m35629() & 255))) & 65535);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m35642() {
        return ((m35629() << 8) & 65280) | (m35629() & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35629() {
        byte[] bArr = this.f48679;
        int i = this.f48680;
        this.f48680 = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35634(byte[] bArr) {
        m35632(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35632(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f48679, this.f48680, bArr, i, i2);
        this.f48680 += i2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m35636() {
        int iM35638 = m35638();
        if (iM35638 < 0 || iM35638 > 8192) {
            iM35638 = 8192;
        }
        byte[] bArr = new byte[iM35638];
        m35632(0, iM35638, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] m35649() {
        int iM35638 = (m35638() + 7) / 8;
        byte[] bArr = new byte[iM35638];
        m35632(0, iM35638, bArr);
        if ((bArr[0] & GCMSIVBlockCipher.MASK) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[iM35638 + 1];
        bArr2[0] = 0;
        System.arraycopy(bArr, 0, bArr2, 1, iM35638);
        return bArr2;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final byte[] m35628() {
        int iM35638 = m35638();
        if (iM35638 < 0 || iM35638 > 262144) {
            iM35638 = 262144;
        }
        byte[] bArr = new byte[iM35638];
        m35632(0, iM35638, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m35650() {
        this.f48681 = 0;
        this.f48680 = 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m35647() {
        this.f48680 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte m35643() {
        return this.f48679[5];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35631(int i) {
        int i2 = this.f48681;
        int i3 = i + i2 + 128;
        byte[] bArr = this.f48679;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (length >= i3) {
                i3 = length;
            }
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.f48679 = bArr2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[][] m35635(int i, String str) throws C5813 {
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            int iM35638 = m35638();
            if (m35626() < iM35638) {
                throw new C5813(str);
            }
            byte[] bArr2 = new byte[iM35638];
            bArr[i2] = bArr2;
            m35632(0, iM35638, bArr2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14904 m35624(byte[][] bArr) {
        int length = bArr.length * 4;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        C14904 c14904 = new C14904(length);
        for (byte[] bArr3 : bArr) {
            c14904.m35627(bArr3);
        }
        return c14904;
    }
}
