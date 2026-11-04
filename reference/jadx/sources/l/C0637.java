package l;

import com.alipay.sdk.m.p.d;
import java.security.InvalidKeyException;
import java.security.PublicKey;

/* JADX INFO: renamed from: l.֡ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: W1X3 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC20862(type = EnumC9673.SEQUENCE)
public class C0637 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String f2485 = "1.2.840.113549.1.1.1";

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final String f2486 = "1.2.840.10045.2.1";

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C19370 f2487 = new C19370(new byte[]{5, 0});

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String f2488 = "2.16.840.1.101.3.4.3.2";

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final String f2489 = "1.2.840.10040.4.1";

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String f2490 = "1.2.840.113549.1.1.1";

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String f2491 = "2.16.840.1.101.3.4.2.1";

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String f2492 = "1.3.14.3.2.26";

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    @InterfaceC8183(index = 0, type = EnumC9673.OBJECT_IDENTIFIER)
    public String f2493;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    @InterfaceC8183(index = 1, optional = true, type = EnumC9673.ANY)
    public C19370 f2494;

    public C0637() {
    }

    public C0637(String str, C19370 c19370) {
        this.f2493 = str;
        this.f2494 = c19370;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0637 m2805(EnumC8906 enumC8906) {
        int i = C18536.f60241[enumC8906.ordinal()];
        if (i == 1) {
            return new C0637(f2492, f2487);
        }
        if (i == 2) {
            return new C0637(f2491, f2487);
        }
        throw new RuntimeException("Unsupported digest algorithm: " + enumC8906);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC8906 m2806(PublicKey publicKey, int i) throws InvalidKeyException {
        String algorithm = publicKey.getAlgorithm();
        if (d.a.equalsIgnoreCase(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
            return i < 18 ? EnumC8906.SHA1 : EnumC8906.SHA256;
        }
        if ("DSA".equalsIgnoreCase(algorithm)) {
            return i < 21 ? EnumC8906.SHA1 : EnumC8906.SHA256;
        }
        if (!"EC".equalsIgnoreCase(algorithm)) {
            throw new InvalidKeyException(C25272.m56409("Unsupported key algorithm: ", algorithm));
        }
        if (i == -1 || i >= 18) {
            return EnumC8906.SHA256;
        }
        throw new InvalidKeyException("ECDSA signatures only supported for minSdkVersion 18 and higher");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0550 m2804(PublicKey publicKey, EnumC8906 enumC8906, boolean z) throws InvalidKeyException {
        String str;
        C0637 c0637;
        String algorithm = publicKey.getAlgorithm();
        int[] iArr = C18536.f60241;
        int i = iArr[enumC8906.ordinal()];
        if (i == 1) {
            str = "SHA1";
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unexpected digest algorithm: " + enumC8906);
            }
            str = "SHA256";
        }
        if (d.a.equalsIgnoreCase(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
            return new C20446(str.concat("withRSA"), new C0637("1.2.840.113549.1.1.1", f2487));
        }
        if (!"DSA".equalsIgnoreCase(algorithm)) {
            if ("EC".equalsIgnoreCase(algorithm)) {
                return new C20446(str.concat("withECDSA"), new C0637(f2486, f2487));
            }
            throw new InvalidKeyException(C25272.m56409("Unsupported key algorithm: ", algorithm));
        }
        int i2 = iArr[enumC8906.ordinal()];
        if (i2 == 1) {
            c0637 = new C0637(f2489, f2487);
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Unexpected digest algorithm: " + enumC8906);
            }
            c0637 = new C0637(f2488, f2487);
        }
        return new C20446(str.concat(z ? "withDetDSA" : "withDSA"), c0637);
    }
}
