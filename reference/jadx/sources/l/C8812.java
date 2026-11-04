package l;

import com.umeng.analytics.pro.cb;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: renamed from: l.۠ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37XE */
/* JADX INFO: loaded from: classes4.dex */
public final class C8812 implements InterfaceC3570 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f28784;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f28785;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f28786;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public SecretKeyFactory f28787;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28782 = {42, -122, 72, -122, -9, cb.k, 2, 7};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28781 = {42, -122, 72, -122, -9, cb.k, 2, 8};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f28780 = {42, -122, 72, -122, -9, cb.k, 2, 9};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28778 = {42, -122, 72, -122, -9, cb.k, 2, 10};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f28777 = {42, -122, 72, -122, -9, cb.k, 2, 11};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28779 = {42, -122, 72, -122, -9, cb.k, 2, 12};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final byte[] f28783 = {42, -122, 72, -122, -9, cb.k, 2, cb.k};

    @Override // l.InterfaceC3570
    /* JADX INFO: renamed from: ۙ */
    public final void mo11616(byte[] bArr) throws C2079 {
        throw new C2079("initWithOpenSSHv1KDFOptions() not supported");
    }

    @Override // l.InterfaceC3570
    /* JADX INFO: renamed from: ۙ */
    public final void mo11615(HashMap map) throws C2079 {
        throw new C2079("initWithPPKv3Header() not supported");
    }

    @Override // l.InterfaceC3570
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11618(byte[] bArr) throws C2079 {
        C8266 c8266;
        try {
            C8266 c8267 = new C8266(bArr);
            if (!c8267.m22305()) {
                throw new C6775();
            }
            C8266[] c8266ArrM22313 = c8267.m22313();
            if (c8266ArrM22313.length < 2 || c8266ArrM22313.length > 4) {
                throw new C6775();
            }
            if (!c8266ArrM22313[0].m22308()) {
                throw new C6775();
            }
            boolean z = true;
            if (!c8266ArrM22313[1].m22311()) {
                throw new C6775();
            }
            byte[] bArrM22307 = null;
            if (c8266ArrM22313.length == 4) {
                if (!c8266ArrM22313[2].m22311()) {
                    throw new C6775();
                }
                if (!c8266ArrM22313[3].m22305()) {
                    throw new C6775();
                }
                c8266 = c8266ArrM22313[3];
            } else if (c8266ArrM22313.length != 3) {
                c8266 = null;
            } else if (c8266ArrM22313[2].m22305()) {
                c8266 = c8266ArrM22313[2];
            } else {
                if (!c8266ArrM22313[2].m22311()) {
                    throw new C6775();
                }
                c8266 = null;
            }
            this.f28785 = c8266ArrM22313[0].m22307();
            this.f28784 = C8266.m22303(c8266ArrM22313[1].m22307());
            if (c8266 != null) {
                C8266[] c8266ArrM22314 = c8266.m22313();
                if (c8266ArrM22314.length != 2) {
                    throw new C6775();
                }
                if (!c8266ArrM22314[0].m22310()) {
                    throw new C6775();
                }
                if (c8266ArrM22314[1].m22314() != 5) {
                    z = false;
                }
                if (!z) {
                    throw new C6775();
                }
                bArrM22307 = c8266ArrM22314[0].m22307();
            }
            String strM23652 = m23652(bArrM22307);
            this.f28786 = strM23652;
            this.f28787 = SecretKeyFactory.getInstance(strM23652);
        } catch (Exception e) {
            if (e instanceof C2079) {
                throw ((C2079) e);
            }
            if (e instanceof NoSuchAlgorithmException) {
                throw new C2079("unsupported pbkdf2 algorithm: ".concat(this.f28786), e);
            }
            if (!(e instanceof C6775) && !(e instanceof ArithmeticException)) {
                throw new C2079("pbkdf2 unavailable", e);
            }
            throw new C2079("invalid ASN1", e);
        }
    }

    @Override // l.InterfaceC3570
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo11617(int i, byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            cArr[i2] = (char) (bArr[i2] & 255);
        }
        try {
            return this.f28787.generateSecret(new PBEKeySpec(cArr, this.f28785, this.f28784, i * 8)).getEncoded();
        } catch (InvalidKeySpecException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m23652(byte[] bArr) throws C2079 {
        String str;
        if (bArr == null || Arrays.equals(bArr, f28782)) {
            str = "PBKDF2WithHmacSHA1";
        } else if (Arrays.equals(bArr, f28781)) {
            str = "PBKDF2WithHmacSHA224";
        } else if (Arrays.equals(bArr, f28780)) {
            str = "PBKDF2WithHmacSHA256";
        } else if (Arrays.equals(bArr, f28778)) {
            str = "PBKDF2WithHmacSHA384";
        } else if (Arrays.equals(bArr, f28777)) {
            str = "PBKDF2WithHmacSHA512";
        } else if (Arrays.equals(bArr, f28779)) {
            str = "PBKDF2WithHmacSHA512/224";
        } else {
            str = Arrays.equals(bArr, f28783) ? "PBKDF2WithHmacSHA512/256" : null;
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
        throw new C2079(sb.toString());
    }
}
