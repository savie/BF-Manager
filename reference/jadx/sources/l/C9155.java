package l;

import com.umeng.analytics.pro.cb;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: renamed from: l.ۡ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37XE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9155 implements InterfaceC4484 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public SecretKeyFactory f31122;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31123;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f31124;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f31125;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f31117 = {42, -122, 72, -122, -9, cb.k, 2, 7};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final byte[] f31120 = {42, -122, 72, -122, -9, cb.k, 2, 8};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final byte[] f31115 = {42, -122, 72, -122, -9, cb.k, 2, 9};

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f31119 = {42, -122, 72, -122, -9, cb.k, 2, 10};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final byte[] f31116 = {42, -122, 72, -122, -9, cb.k, 2, 11};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f31118 = {42, -122, 72, -122, -9, cb.k, 2, 12};

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final byte[] f31121 = {42, -122, 72, -122, -9, cb.k, 2, cb.k};

    @Override // l.InterfaceC4484
    /* JADX INFO: renamed from: ۙ */
    public final void mo12511(byte[] bArr) throws C5813 {
        throw new C5813("initWithOpenSSHv1KDFOptions() not supported");
    }

    @Override // l.InterfaceC4484
    /* JADX INFO: renamed from: ۙ */
    public final void mo12510(HashMap map) throws C5813 {
        throw new C5813("initWithPPKv3Header() not supported");
    }

    @Override // l.InterfaceC4484
    /* JADX INFO: renamed from: ܰ */
    public final void mo12513(byte[] bArr) throws C5813 {
        C9197 c9197;
        try {
            C9197 c9198 = new C9197(bArr);
            if (!c9198.m23650()) {
                throw new C10608();
            }
            C9197[] c9197ArrM23656 = c9198.m23656();
            if (c9197ArrM23656.length < 2 || c9197ArrM23656.length > 4) {
                throw new C10608();
            }
            if (!c9197ArrM23656[0].m23655()) {
                throw new C10608();
            }
            boolean z = true;
            if (!c9197ArrM23656[1].m23657()) {
                throw new C10608();
            }
            byte[] bArrM23652 = null;
            if (c9197ArrM23656.length == 4) {
                if (!c9197ArrM23656[2].m23657()) {
                    throw new C10608();
                }
                if (!c9197ArrM23656[3].m23650()) {
                    throw new C10608();
                }
                c9197 = c9197ArrM23656[3];
            } else if (c9197ArrM23656.length != 3) {
                c9197 = null;
            } else if (c9197ArrM23656[2].m23650()) {
                c9197 = c9197ArrM23656[2];
            } else {
                if (!c9197ArrM23656[2].m23657()) {
                    throw new C10608();
                }
                c9197 = null;
            }
            this.f31124 = c9197ArrM23656[0].m23652();
            this.f31123 = C9197.m23646(c9197ArrM23656[1].m23652());
            if (c9197 != null) {
                C9197[] c9197ArrM23657 = c9197.m23656();
                if (c9197ArrM23657.length != 2) {
                    throw new C10608();
                }
                if (!c9197ArrM23657[0].m23648()) {
                    throw new C10608();
                }
                if (c9197ArrM23657[1].m23649() != 5) {
                    z = false;
                }
                if (!z) {
                    throw new C10608();
                }
                bArrM23652 = c9197ArrM23657[0].m23652();
            }
            String strM23475 = m23475(bArrM23652);
            this.f31125 = strM23475;
            this.f31122 = SecretKeyFactory.getInstance(strM23475);
        } catch (Exception e) {
            if (e instanceof C5813) {
                throw ((C5813) e);
            }
            if (e instanceof NoSuchAlgorithmException) {
                throw new C5813("unsupported pbkdf2 algorithm: ".concat(this.f31125), e);
            }
            if (!(e instanceof C10608) && !(e instanceof ArithmeticException)) {
                throw new C5813("pbkdf2 unavailable", e);
            }
            throw new C5813("invalid ASN1", e);
        }
    }

    @Override // l.InterfaceC4484
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo12512(int i, byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            cArr[i2] = (char) (bArr[i2] & 255);
        }
        try {
            return this.f31122.generateSecret(new PBEKeySpec(cArr, this.f31124, this.f31123, i * 8)).getEncoded();
        } catch (InvalidKeySpecException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m23475(byte[] bArr) throws C5813 {
        String str;
        if (bArr == null || Arrays.equals(bArr, f31117)) {
            str = "PBKDF2WithHmacSHA1";
        } else if (Arrays.equals(bArr, f31120)) {
            str = "PBKDF2WithHmacSHA224";
        } else if (Arrays.equals(bArr, f31115)) {
            str = "PBKDF2WithHmacSHA256";
        } else if (Arrays.equals(bArr, f31119)) {
            str = "PBKDF2WithHmacSHA384";
        } else if (Arrays.equals(bArr, f31116)) {
            str = "PBKDF2WithHmacSHA512";
        } else if (Arrays.equals(bArr, f31118)) {
            str = "PBKDF2WithHmacSHA512/224";
        } else {
            str = Arrays.equals(bArr, f31121) ? "PBKDF2WithHmacSHA512/256" : null;
        }
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder("unsupported pbkdf2 function oid: ");
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (i < bArr.length) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            StringBuilder sb3 = new StringBuilder("0x");
            sb3.append(hexString.length() == 1 ? "0" : "");
            sb3.append(hexString);
            sb2.append(sb3.toString());
            i++;
            if (i < bArr.length) {
                sb2.append(":");
            }
        }
        sb.append(sb2.toString());
        throw new C5813(sb.toString());
    }
}
