package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.net.InetAddress;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.᩺᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 59W6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23196 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f75273;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC10601 f75274;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f75275;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75277;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f75278;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f75279;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f75280;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C11907 f75282;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f75283;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15435[] f75284;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f75285;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f75286;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InetAddress f75287;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f75288;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f75289;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f75290;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f75291;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f75292;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11907 f75294;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f75295;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f75296;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f75297;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f75298 = true;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f75276 = true;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f75293 = 1;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f75281 = 1;

    /* JADX INFO: renamed from: ۖ */
    public abstract int mo8341(int i, byte[] bArr);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo8342(int i, byte[] bArr);

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo8343(int i, byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51222(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m51223(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int m51224(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public AbstractC23196(InterfaceC10601 interfaceC10601) {
        this.f75274 = interfaceC10601;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m51227(byte[] bArr) {
        m51222(this.f75291, 0, bArr);
        bArr[2] = (byte) ((this.f75288 ? 128 : 0) + ((this.f75292 << 3) & UMErrorCode.E_UM_BE_NOT_MAINPROCESS) + (this.f75286 ? 4 : 0) + (this.f75296 ? 2 : 0) + (this.f75298 ? 1 : 0));
        bArr[3] = (byte) ((this.f75279 ? 128 : 0) + (this.f75276 ? 16 : 0) + (this.f75290 & 15));
        m51222(this.f75293, 4, bArr);
        m51222(this.f75278, 6, bArr);
        m51222(this.f75297, 8, bArr);
        m51222(this.f75277, 10, bArr);
        return mo8341(12, bArr) + 12;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51225(byte[] bArr) {
        this.f75291 = m51223(0, bArr);
        byte b = bArr[2];
        this.f75288 = (b & GCMSIVBlockCipher.MASK) != 0;
        this.f75292 = (b & 120) >> 3;
        this.f75286 = (b & 4) != 0;
        this.f75296 = (b & 2) != 0;
        this.f75298 = (b & 1) != 0;
        byte b2 = bArr[3];
        this.f75279 = (b2 & GCMSIVBlockCipher.MASK) != 0;
        this.f75276 = (b2 & 16) != 0;
        this.f75290 = b2 & 15;
        this.f75293 = m51223(4, bArr);
        this.f75278 = m51223(6, bArr);
        this.f75297 = m51223(8, bArr);
        this.f75277 = m51223(10, bArr);
        mo8342(12, bArr);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m51226(int i, byte[] bArr) {
        int iM29700;
        if ((bArr[i] & 192) == 192) {
            this.f75294 = this.f75282;
            iM29700 = i + 2;
        } else {
            iM29700 = this.f75294.m29700(i, bArr) + i;
        }
        this.f75273 = m51223(iM29700, bArr);
        this.f75289 = m51223(iM29700 + 2, bArr);
        this.f75285 = m51224(iM29700 + 4, bArr);
        int iM51223 = m51223(iM29700 + 8, bArr);
        this.f75280 = iM51223;
        int iMo8343 = iM29700 + 10;
        this.f75284 = new C15435[iM51223 / 6];
        int i2 = iM51223 + iMo8343;
        int i3 = 0;
        while (true) {
            this.f75275 = i3;
            if (iMo8343 >= i2) {
                return iMo8343 - i;
            }
            iMo8343 += mo8343(iMo8343, bArr);
            i3 = this.f75275 + 1;
        }
    }

    public String toString() {
        String string;
        String strConcat;
        String strConcat2;
        int i = this.f75292;
        if (i != 0) {
            string = i != 7 ? Integer.toString(i) : "WACK";
        } else {
            string = "QUERY";
        }
        int i2 = this.f75290;
        if (i2 == 1) {
            strConcat = "FMT_ERR";
        } else if (i2 == 2) {
            strConcat = "SRV_ERR";
        } else if (i2 == 4) {
            strConcat = "IMP_ERR";
        } else if (i2 == 5) {
            strConcat = "RFS_ERR";
        } else if (i2 != 6) {
            strConcat = i2 != 7 ? "0x".concat(C5993.m16280(i2, 1)) : "CFT_ERR";
        } else {
            strConcat = "ACT_ERR";
        }
        int i3 = this.f75283;
        String strConcat3 = "NB";
        if (i3 != 32) {
            strConcat2 = i3 != 33 ? "0x".concat(C5993.m16280(i3, 4)) : "NBSTAT";
        } else {
            strConcat2 = "NB";
        }
        int i4 = this.f75273;
        if (i4 == 1) {
            strConcat3 = "A";
        } else if (i4 == 2) {
            strConcat3 = "NS";
        } else if (i4 == 10) {
            strConcat3 = "NULL";
        } else if (i4 != 32) {
            strConcat3 = i4 != 33 ? "0x".concat(C5993.m16280(i4, 4)) : "NBSTAT";
        }
        StringBuilder sb = new StringBuilder("nameTrnId=");
        sb.append(this.f75291);
        sb.append(",isResponse=");
        sb.append(this.f75288);
        sb.append(",opCode=");
        sb.append(string);
        sb.append(",isAuthAnswer=");
        sb.append(this.f75286);
        sb.append(",isTruncated=");
        sb.append(this.f75296);
        sb.append(",isRecurAvailable=");
        sb.append(this.f75279);
        sb.append(",isRecurDesired=");
        sb.append(this.f75298);
        sb.append(",isBroadcast=");
        sb.append(this.f75276);
        sb.append(",resultCode=");
        sb.append(strConcat);
        sb.append(",questionCount=");
        sb.append(this.f75293);
        sb.append(",answerCount=");
        sb.append(this.f75278);
        sb.append(",authorityCount=");
        sb.append(this.f75297);
        sb.append(",additionalCount=");
        sb.append(this.f75277);
        sb.append(",questionName=");
        sb.append(this.f75282);
        sb.append(",questionType=");
        sb.append(strConcat2);
        sb.append(",questionClass=");
        int i5 = this.f75281;
        sb.append(i5 == 1 ? "IN" : "0x".concat(C5993.m16280(i5, 4)));
        sb.append(",recordName=");
        sb.append(this.f75294);
        sb.append(",recordType=");
        sb.append(strConcat3);
        sb.append(",recordClass=");
        int i6 = this.f75289;
        sb.append(i6 != 1 ? "0x".concat(C5993.m16280(i6, 4)) : "IN");
        sb.append(",ttl=");
        sb.append(this.f75285);
        sb.append(",rDataLength=");
        sb.append(this.f75280);
        return new String(sb.toString());
    }
}
