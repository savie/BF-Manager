package l;

import com.alipay.sdk.m.p.d;
import java.security.InvalidKeyException;
import java.security.PublicKey;

/* JADX INFO: renamed from: l.᩻ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1X3 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC15638(type = EnumC4430.SEQUENCE)
public class C23482 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String f76027 = "1.2.840.10040.4.1";

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String f76028 = "1.3.14.3.2.26";

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final String f76029 = "1.2.840.113549.1.1.1";

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final String f76030 = "2.16.840.1.101.3.4.2.1";

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String f76031 = "2.16.840.1.101.3.4.3.2";

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C1525 f76032 = new C1525(new byte[]{5, 0});

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String f76033 = "1.2.840.10045.2.1";

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String f76034 = "1.2.840.113549.1.1.1";

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    @InterfaceC14227(index = 0, type = EnumC4430.OBJECT_IDENTIFIER)
    public String f76035;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    @InterfaceC14227(index = 1, optional = true, type = EnumC4430.ANY)
    public C1525 f76036;

    public C23482() {
    }

    public C23482(String str, C1525 c1525) {
        this.f76035 = str;
        this.f76036 = c1525;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23482 m51741(EnumC9619 enumC9619) {
        int i = C10782.f36730[enumC9619.ordinal()];
        if (i == 1) {
            return new C23482(f76028, f76032);
        }
        if (i == 2) {
            return new C23482(f76030, f76032);
        }
        throw new RuntimeException("Unsupported digest algorithm: " + enumC9619);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9619 m51739(PublicKey publicKey, int i) throws InvalidKeyException {
        String algorithm = publicKey.getAlgorithm();
        if (d.a.equalsIgnoreCase(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
            return i < 18 ? EnumC9619.SHA1 : EnumC9619.SHA256;
        }
        if ("DSA".equalsIgnoreCase(algorithm)) {
            return i < 21 ? EnumC9619.SHA1 : EnumC9619.SHA256;
        }
        if (!"EC".equalsIgnoreCase(algorithm)) {
            throw new InvalidKeyException(C0252.m1693("Unsupported key algorithm: ", algorithm));
        }
        if (i == -1 || i >= 18) {
            return EnumC9619.SHA256;
        }
        throw new InvalidKeyException("ECDSA signatures only supported for minSdkVersion 18 and higher");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14924 m51740(PublicKey publicKey, EnumC9619 enumC9619, boolean z) throws InvalidKeyException {
        String str;
        C23482 c23482;
        String algorithm = publicKey.getAlgorithm();
        int[] iArr = C10782.f36730;
        int i = iArr[enumC9619.ordinal()];
        if (i == 1) {
            str = "SHA1";
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unexpected digest algorithm: " + enumC9619);
            }
            str = "SHA256";
        }
        if (d.a.equalsIgnoreCase(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
            return new C5254(str.concat("withRSA"), new C23482("1.2.840.113549.1.1.1", f76032));
        }
        if (!"DSA".equalsIgnoreCase(algorithm)) {
            if ("EC".equalsIgnoreCase(algorithm)) {
                return new C5254(str.concat("withECDSA"), new C23482(f76033, f76032));
            }
            throw new InvalidKeyException(C0252.m1693("Unsupported key algorithm: ", algorithm));
        }
        int i2 = iArr[enumC9619.ordinal()];
        if (i2 == 1) {
            c23482 = new C23482(f76027, f76032);
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Unexpected digest algorithm: " + enumC9619);
            }
            c23482 = new C23482(f76031, f76032);
        }
        return new C5254(str.concat(z ? "withDetDSA" : "withDSA"), c23482);
    }
}
