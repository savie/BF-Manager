package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.net.InetAddress;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۙ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59W6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5154 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f17958;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f17961;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f17962;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f17963;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f17964;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f17965;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C22308[] f17966;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f17967;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C19126 f17968;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC5878 f17969;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17970;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f17971;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f17972;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f17973;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f17974;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f17975;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f17976;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19126 f17978;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InetAddress f17979;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f17980;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f17981;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f17982;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f17983 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f17959 = true;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f17977 = 1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f17960 = 1;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo4457(int i, byte[] bArr);

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo4458(int i, byte[] bArr);

    /* JADX INFO: renamed from: ᩸ */
    public abstract int mo4459(int i, byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15569(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m15571(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m15570(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public AbstractC5154(InterfaceC5878 interfaceC5878) {
        this.f17969 = interfaceC5878;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m15574(byte[] bArr) {
        m15569(this.f17972, 0, bArr);
        bArr[2] = (byte) ((this.f17973 ? 128 : 0) + ((this.f17981 << 3) & UMErrorCode.E_UM_BE_NOT_MAINPROCESS) + (this.f17963 ? 4 : 0) + (this.f17974 ? 2 : 0) + (this.f17983 ? 1 : 0));
        bArr[3] = (byte) ((this.f17967 ? 128 : 0) + (this.f17959 ? 16 : 0) + (this.f17958 & 15));
        m15569(this.f17977, 4, bArr);
        m15569(this.f17976, 6, bArr);
        m15569(this.f17971, 8, bArr);
        m15569(this.f17962, 10, bArr);
        return mo4459(12, bArr) + 12;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15572(byte[] bArr) {
        this.f17972 = m15571(0, bArr);
        byte b = bArr[2];
        this.f17973 = (b & GCMSIVBlockCipher.MASK) != 0;
        this.f17981 = (b & 120) >> 3;
        this.f17963 = (b & 4) != 0;
        this.f17974 = (b & 2) != 0;
        this.f17983 = (b & 1) != 0;
        byte b2 = bArr[3];
        this.f17967 = (b2 & GCMSIVBlockCipher.MASK) != 0;
        this.f17959 = (b2 & 16) != 0;
        this.f17958 = b2 & 15;
        this.f17977 = m15571(4, bArr);
        this.f17976 = m15571(6, bArr);
        this.f17971 = m15571(8, bArr);
        this.f17962 = m15571(10, bArr);
        mo4457(12, bArr);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m15573(int i, byte[] bArr) {
        int iM44255;
        if ((bArr[i] & 192) == 192) {
            this.f17978 = this.f17968;
            iM44255 = i + 2;
        } else {
            iM44255 = this.f17978.m44255(i, bArr) + i;
        }
        this.f17975 = m15571(iM44255, bArr);
        this.f17970 = m15571(iM44255 + 2, bArr);
        this.f17965 = m15570(iM44255 + 4, bArr);
        int iM15571 = m15571(iM44255 + 8, bArr);
        this.f17982 = iM15571;
        int iMo4458 = iM44255 + 10;
        this.f17966 = new C22308[iM15571 / 6];
        int i2 = iM15571 + iMo4458;
        int i3 = 0;
        while (true) {
            this.f17980 = i3;
            if (iMo4458 >= i2) {
                return iMo4458 - i;
            }
            iMo4458 += mo4458(iMo4458, bArr);
            i3 = this.f17980 + 1;
        }
    }

    public String toString() {
        String string;
        String strConcat;
        String strConcat2;
        int i = this.f17981;
        if (i != 0) {
            string = i != 7 ? Integer.toString(i) : "WACK";
        } else {
            string = "QUERY";
        }
        int i2 = this.f17958;
        if (i2 == 1) {
            strConcat = "FMT_ERR";
        } else if (i2 == 2) {
            strConcat = "SRV_ERR";
        } else if (i2 == 4) {
            strConcat = "IMP_ERR";
        } else if (i2 == 5) {
            strConcat = "RFS_ERR";
        } else if (i2 != 6) {
            strConcat = i2 != 7 ? "0x".concat(C6033.m17503(i2, 1)) : "CFT_ERR";
        } else {
            strConcat = "ACT_ERR";
        }
        int i3 = this.f17964;
        String strConcat3 = "NB";
        if (i3 != 32) {
            strConcat2 = i3 != 33 ? "0x".concat(C6033.m17503(i3, 4)) : "NBSTAT";
        } else {
            strConcat2 = "NB";
        }
        int i4 = this.f17975;
        if (i4 == 1) {
            strConcat3 = "A";
        } else if (i4 == 2) {
            strConcat3 = "NS";
        } else if (i4 == 10) {
            strConcat3 = "NULL";
        } else if (i4 != 32) {
            strConcat3 = i4 != 33 ? "0x".concat(C6033.m17503(i4, 4)) : "NBSTAT";
        }
        StringBuilder sb = new StringBuilder("nameTrnId=");
        sb.append(this.f17972);
        sb.append(",isResponse=");
        sb.append(this.f17973);
        sb.append(",opCode=");
        sb.append(string);
        sb.append(",isAuthAnswer=");
        sb.append(this.f17963);
        sb.append(",isTruncated=");
        sb.append(this.f17974);
        sb.append(",isRecurAvailable=");
        sb.append(this.f17967);
        sb.append(",isRecurDesired=");
        sb.append(this.f17983);
        sb.append(",isBroadcast=");
        sb.append(this.f17959);
        sb.append(",resultCode=");
        sb.append(strConcat);
        sb.append(",questionCount=");
        sb.append(this.f17977);
        sb.append(",answerCount=");
        sb.append(this.f17976);
        sb.append(",authorityCount=");
        sb.append(this.f17971);
        sb.append(",additionalCount=");
        sb.append(this.f17962);
        sb.append(",questionName=");
        sb.append(this.f17968);
        sb.append(",questionType=");
        sb.append(strConcat2);
        sb.append(",questionClass=");
        int i5 = this.f17960;
        sb.append(i5 == 1 ? "IN" : "0x".concat(C6033.m17503(i5, 4)));
        sb.append(",recordName=");
        sb.append(this.f17978);
        sb.append(",recordType=");
        sb.append(strConcat3);
        sb.append(",recordClass=");
        int i6 = this.f17970;
        sb.append(i6 != 1 ? "0x".concat(C6033.m17503(i6, 4)) : "IN");
        sb.append(",ttl=");
        sb.append(this.f17965);
        sb.append(",rDataLength=");
        sb.append(this.f17982);
        return new String(sb.toString());
    }
}
