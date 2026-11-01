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

/* JADX INFO: renamed from: l.᩷ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20845 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final HashMap f67728;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f67729;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f67730;

    /* JADX INFO: renamed from: ۖ */
    public abstract String mo19922();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo19923();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19924(InterfaceC19248 interfaceC19248, InterfaceC19248 interfaceC19249, InterfaceC19248 interfaceC192410, InterfaceC5614 interfaceC5614);

    /* JADX INFO: renamed from: ۚ */
    public abstract AlgorithmParameterSpec mo19925();

    /* JADX INFO: renamed from: ۨ */
    public abstract int mo19926();

    /* JADX INFO: renamed from: ܰ */
    public abstract String mo19927();

    static {
        HashMap map = new HashMap();
        f67728 = map;
        map.put(257, new C13084());
        map.put(258, new C3910());
        map.put(259, new C6733());
        map.put(260, new C22962());
        map.put(513, new C15201());
        map.put(514, new C21550());
        map.put(769, new C18022());
        map.put(1057, new C18728());
        map.put(1059, new C8145());
        map.put(1061, new C19434());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC20845 m46869(int i) {
        Supplier supplier = (Supplier) f67728.get(Integer.valueOf(i));
        if (supplier != null) {
            return (AbstractC20845) supplier.get();
        }
        throw new RuntimeException(C9576.m24440(new StringBuilder("Unsupported signature algorithm id: 0x"), i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20845 m46867(int i) {
        Supplier supplier = (Supplier) f67728.get(Integer.valueOf(i));
        if (supplier == null) {
            return null;
        }
        return (AbstractC20845) supplier.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46868(MessageDigest messageDigest, InterfaceC19248 interfaceC19248, OutputStream outputStream, InterfaceC5614 interfaceC5614) throws IOException {
        int size = (int) ((interfaceC19248.size() + 1048575) / 1048576);
        byte[] bArr = new byte[5];
        bArr[0] = -91;
        for (int i = 0; i < size; i++) {
            long jMo25490 = interfaceC19248.mo25490();
            int iMin = (int) (Math.min(jMo25490 + 1048576, interfaceC19248.size()) - jMo25490);
            C1856.m6056(iMin, 1, bArr);
            messageDigest.update(bArr);
            interfaceC19248.mo25493(messageDigest, iMin);
            outputStream.write(messageDigest.digest());
            if (interfaceC5614.mo2357()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46866(long j) {
        return (int) ((j + 1048575) / 1048576);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46871(PublicKey publicKey, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        String strMo19922 = mo19922();
        AlgorithmParameterSpec algorithmParameterSpecMo19925 = mo19925();
        try {
            Signature signature = Signature.getInstance(strMo19922);
            signature.initVerify(publicKey);
            if (algorithmParameterSpecMo19925 != null) {
                signature.setParameter(algorithmParameterSpecMo19925);
            }
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            throw new SignatureException(C16523.m38890("Failed to verify generated ", strMo19922, " signature using public key from certificate"), e);
        } catch (InvalidKeyException e2) {
            throw new InvalidKeyException(C16523.m38890("Failed to verify generated ", strMo19922, " signature using public key from certificate"), e2);
        } catch (SignatureException e3) {
            e = e3;
            throw new SignatureException(C16523.m38890("Failed to verify generated ", strMo19922, " signature using public key from certificate"), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46870(PrivateKey privateKey, PublicKey publicKey, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        String strMo19922 = mo19922();
        AlgorithmParameterSpec algorithmParameterSpecMo19925 = mo19925();
        try {
            Signature signature = Signature.getInstance(strMo19922);
            signature.initSign(privateKey);
            if (algorithmParameterSpecMo19925 != null) {
                signature.setParameter(algorithmParameterSpecMo19925);
            }
            signature.update(bArr);
            byte[] bArrSign = signature.sign();
            try {
                Signature signature2 = Signature.getInstance(strMo19922);
                signature2.initVerify(publicKey);
                if (algorithmParameterSpecMo19925 != null) {
                    signature2.setParameter(algorithmParameterSpecMo19925);
                }
                signature2.update(bArr);
                if (signature2.verify(bArrSign)) {
                    this.f67730 = bArrSign;
                    return;
                }
                throw new SignatureException("Failed to verify generated " + strMo19922 + " signature using public key from certificate");
            } catch (InvalidAlgorithmParameterException e) {
                e = e;
                throw new SignatureException(C16523.m38890("Failed to verify generated ", strMo19922, " signature using public key from certificate"), e);
            } catch (InvalidKeyException e2) {
                throw new InvalidKeyException(C16523.m38890("Failed to verify generated ", strMo19922, " signature using public key from certificate"), e2);
            } catch (SignatureException e3) {
                e = e3;
                throw new SignatureException(C16523.m38890("Failed to verify generated ", strMo19922, " signature using public key from certificate"), e);
            }
        } catch (InvalidAlgorithmParameterException e4) {
            e = e4;
            throw new SignatureException(C0252.m1693("Failed to sign using ", strMo19922), e);
        } catch (InvalidKeyException e5) {
            throw new InvalidKeyException(C0252.m1693("Failed to sign using ", strMo19922), e5);
        } catch (SignatureException e6) {
            e = e6;
            throw new SignatureException(C0252.m1693("Failed to sign using ", strMo19922), e);
        }
    }
}
