package l;

import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.KDFCounterBytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.KDFCounterParameters;

/* JADX INFO: renamed from: l.ܳᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 5A1F */
/* JADX INFO: loaded from: classes4.dex */
public final class C14708 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f48118 = m35241("SmbSign");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f48120 = m35241("SMB2AESCMAC");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f48119 = m35241("SMBSigningKey");

    static {
        m35241("SmbRpc");
        m35241("SMB2APP");
        m35241("SMBAppKey");
        m35241("ServerIn ");
        m35241("SMB2AESCCM");
        m35241("SMB2C2SCipherKey");
        m35241("ServerOut");
        m35241("SMB2AESCCM");
        m35241("SMB2S2CCipherKey");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m35240(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = i == 785 ? f48119 : f48120;
        if (i != 785) {
            bArr2 = f48118;
        }
        KDFCounterBytesGenerator kDFCounterBytesGenerator = new KDFCounterBytesGenerator(new HMac(new SHA256Digest()));
        int length = bArr3.length + bArr2.length;
        byte[] bArr4 = new byte[length + 5];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(bArr2, 0, bArr4, bArr3.length + 1, bArr2.length);
        bArr4[length + 4] = GCMSIVBlockCipher.MASK;
        kDFCounterBytesGenerator.init(new KDFCounterParameters(bArr, null, bArr4, 32));
        byte[] bArr5 = new byte[16];
        kDFCounterBytesGenerator.generateBytes(bArr5, 0, 16);
        return bArr5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m35241(String str) {
        byte[] bArr = new byte[str.length() + 1];
        System.arraycopy(str.getBytes(StandardCharsets.US_ASCII), 0, bArr, 0, str.length());
        return bArr;
    }
}
