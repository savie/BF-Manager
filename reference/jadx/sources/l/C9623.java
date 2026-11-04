package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۡ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27XL */
/* JADX INFO: loaded from: classes3.dex */
public class C9623 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final byte[][] f31131;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f31132;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f31133;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f31134;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f31135;

    static {
        byte[] bArr = C9011.f29358;
        Charset charset = StandardCharsets.UTF_8;
        f31131 = new byte[][]{C9011.m24055(OpenSSHPublicKeyUtil.DSS, charset), C9011.m24055(OpenSSHPublicKeyUtil.RSA, charset), C9011.m24055("ecdsa-sha2-nistp256", charset), C9011.m24055("ecdsa-sha2-nistp384", charset), C9011.m24055("ecdsa-sha2-nistp521", charset), C9011.m24055(OpenSSHPublicKeyUtil.ED_25519, charset), C9011.m24055("ssh-ed448", charset)};
    }

    public C9623(String str, int i, byte[] bArr) {
        this(i, "", str, null, bArr);
    }

    public C9623(int i, String str, String str2, String str3, byte[] bArr) throws C2079 {
        this.f31133 = str;
        this.f31132 = str2;
        if (i == 0) {
            byte b = bArr[8];
            if (b == 100) {
                this.f31135 = 1;
            } else if (b == 114) {
                this.f31135 = 2;
            } else if (b == 101 && bArr[10] == 50) {
                this.f31135 = 6;
            } else if (b == 101 && bArr[10] == 52) {
                this.f31135 = 7;
            } else if (b == 97 && bArr[20] == 50) {
                this.f31135 = 3;
            } else if (b == 97 && bArr[20] == 51) {
                this.f31135 = 4;
            } else if (b == 97 && bArr[20] == 53) {
                this.f31135 = 5;
            } else {
                throw new C2079("invalid key type");
            }
        } else {
            this.f31135 = i;
        }
        this.f31134 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m25127() {
        int i = this.f31135;
        return (i == 1 || i == 2 || i == 6 || i == 7 || i == 3 || i == 4 || i == 5) ? C9011.m24051(f31131[i - 1]) : "UNKNOWN";
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo4901(String str) {
        String str2 = this.f31132;
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
