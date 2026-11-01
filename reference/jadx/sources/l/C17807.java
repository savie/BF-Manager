package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ᩳۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27XL */
/* JADX INFO: loaded from: classes4.dex */
public class C17807 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[][] f56429;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f56430;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f56431;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f56432;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f56433;

    static {
        byte[] bArr = C8491.f29422;
        Charset charset = StandardCharsets.UTF_8;
        f56429 = new byte[][]{C8491.m22175(OpenSSHPublicKeyUtil.DSS, charset), C8491.m22175(OpenSSHPublicKeyUtil.RSA, charset), C8491.m22175("ecdsa-sha2-nistp256", charset), C8491.m22175("ecdsa-sha2-nistp384", charset), C8491.m22175("ecdsa-sha2-nistp521", charset), C8491.m22175(OpenSSHPublicKeyUtil.ED_25519, charset), C8491.m22175("ssh-ed448", charset)};
    }

    public C17807(String str, int i, byte[] bArr) {
        this(i, "", str, null, bArr);
    }

    public C17807(int i, String str, String str2, String str3, byte[] bArr) throws C5813 {
        this.f56432 = str;
        this.f56431 = str2;
        if (i == 0) {
            byte b = bArr[8];
            if (b == 100) {
                this.f56430 = 1;
            } else if (b == 114) {
                this.f56430 = 2;
            } else if (b == 101 && bArr[10] == 50) {
                this.f56430 = 6;
            } else if (b == 101 && bArr[10] == 52) {
                this.f56430 = 7;
            } else if (b == 97 && bArr[20] == 50) {
                this.f56430 = 3;
            } else if (b == 97 && bArr[20] == 51) {
                this.f56430 = 4;
            } else if (b == 97 && bArr[20] == 53) {
                this.f56430 = 5;
            } else {
                throw new C5813("invalid key type");
            }
        } else {
            this.f56430 = i;
        }
        this.f56433 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m41394() {
        int i = this.f56430;
        return (i == 1 || i == 2 || i == 6 || i == 7 || i == 3 || i == 4 || i == 5) ? C8491.m22171(f56429[i - 1]) : "UNKNOWN";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo41395(String str) {
        String str2 = this.f56431;
        int length = str2.length();
        int length2 = str.length();
        int i = 0;
        while (i < length) {
            int iIndexOf = str2.indexOf(44, i);
            if (iIndexOf == -1) {
                if (length2 != length - i) {
                    break;
                }
                return str2.regionMatches(true, i, str, 0, length2);
            }
            if (length2 == iIndexOf - i && str2.regionMatches(true, i, str, 0, length2)) {
                return true;
            }
            i = iIndexOf + 1;
        }
        return false;
    }
}
