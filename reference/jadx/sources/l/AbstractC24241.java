package l;

import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩺ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24241 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final HashMap f78515;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f78516;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f78517;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo18063();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo18064(InterfaceC17044 interfaceC17044, InterfaceC17044 interfaceC17045, InterfaceC17044 interfaceC17046, InterfaceC7509 interfaceC7509);

    /* JADX INFO: renamed from: ۤ */
    public abstract int mo18065();

    /* JADX INFO: renamed from: ᩴ */
    public abstract AlgorithmParameterSpec mo18066();

    /* JADX INFO: renamed from: ᩷ */
    public abstract String mo18067();

    /* JADX INFO: renamed from: ᩸ */
    public abstract String mo18068();

    static {
        HashMap map = new HashMap();
        f78515 = map;
        map.put(257, new C13052());
        map.put(258, new C5595());
        map.put(259, new C1866());
        map.put(260, new C11560());
        map.put(513, new C24987());
        map.put(514, new C16781());
        map.put(769, new C17527());
        map.put(1057, new C16035());
        map.put(1059, new C23495());
        map.put(1061, new C3357());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC24241 m54239(int i) {
        Supplier supplier = (Supplier) f78515.get(Integer.valueOf(i));
        if (supplier != null) {
            return (AbstractC24241) supplier.get();
        }
        throw new RuntimeException(C4791.m14766(new StringBuilder("Unsupported signature algorithm id: 0x"), i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC24241 m54237(int i) {
        Supplier supplier = (Supplier) f78515.get(Integer.valueOf(i));
        if (supplier == null) {
            return null;
        }
        return (AbstractC24241) supplier.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54238(MessageDigest messageDigest, InterfaceC17044 interfaceC17044, OutputStream outputStream, InterfaceC7509 interfaceC7509) throws IOException {
        int size = (int) ((interfaceC17044.size() + 1048575) / 1048576);
        byte[] bArr = new byte[5];
        bArr[0] = -91;
        for (int i = 0; i < size; i++) {
            long jMo32877 = interfaceC17044.mo32877();
            int iMin = (int) (Math.min(jMo32877 + 1048576, interfaceC17044.size()) - jMo32877);
            C2940.m9617(iMin, 1, bArr);
            messageDigest.update(bArr);
            interfaceC17044.mo32880(messageDigest, iMin);
            outputStream.write(messageDigest.digest());
            if (interfaceC7509.mo924()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m54236(long j) {
        return (int) ((j + 1048575) / 1048576);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54241(PublicKey publicKey, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        String strMo18068 = mo18068();
        AlgorithmParameterSpec algorithmParameterSpecMo18066 = mo18066();
        try {
            Signature signature = Signature.getInstance(strMo18068);
            signature.initVerify(publicKey);
            if (algorithmParameterSpecMo18066 != null) {
                signature.setParameter(algorithmParameterSpecMo18066);
            }
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            throw new SignatureException(C14442.m34865("Failed to verify generated ", strMo18068, " signature using public key from certificate"), e);
        } catch (InvalidKeyException e2) {
            throw new InvalidKeyException(C14442.m34865("Failed to verify generated ", strMo18068, " signature using public key from certificate"), e2);
        } catch (SignatureException e3) {
            e = e3;
            throw new SignatureException(C14442.m34865("Failed to verify generated ", strMo18068, " signature using public key from certificate"), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54240(PrivateKey privateKey, PublicKey publicKey, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        String strMo18068 = mo18068();
        AlgorithmParameterSpec algorithmParameterSpecMo18066 = mo18066();
        try {
            Signature signature = Signature.getInstance(strMo18068);
            signature.initSign(privateKey);
            if (algorithmParameterSpecMo18066 != null) {
                signature.setParameter(algorithmParameterSpecMo18066);
            }
            signature.update(bArr);
            byte[] bArrSign = signature.sign();
            try {
                Signature signature2 = Signature.getInstance(strMo18068);
                signature2.initVerify(publicKey);
                if (algorithmParameterSpecMo18066 != null) {
                    signature2.setParameter(algorithmParameterSpecMo18066);
                }
                signature2.update(bArr);
                if (signature2.verify(bArrSign)) {
                    this.f78517 = bArrSign;
                    return;
                }
                throw new SignatureException("Failed to verify generated " + strMo18068 + " signature using public key from certificate");
            } catch (InvalidAlgorithmParameterException e) {
                e = e;
                throw new SignatureException(C14442.m34865("Failed to verify generated ", strMo18068, " signature using public key from certificate"), e);
            } catch (InvalidKeyException e2) {
                throw new InvalidKeyException(C14442.m34865("Failed to verify generated ", strMo18068, " signature using public key from certificate"), e2);
            } catch (SignatureException e3) {
                e = e3;
                throw new SignatureException(C14442.m34865("Failed to verify generated ", strMo18068, " signature using public key from certificate"), e);
            }
        } catch (InvalidAlgorithmParameterException e4) {
            e = e4;
            throw new SignatureException(C25272.m56409("Failed to sign using ", strMo18068), e);
        } catch (InvalidKeyException e5) {
            throw new InvalidKeyException(C25272.m56409("Failed to sign using ", strMo18068), e5);
        } catch (SignatureException e6) {
            e = e6;
            throw new SignatureException(C25272.m56409("Failed to sign using ", strMo18068), e);
        }
    }
}
