package l;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;

/* JADX INFO: renamed from: l.֡۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZB */
/* JADX INFO: loaded from: classes3.dex */
public final class C0281 implements InterfaceC2300 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f1588;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f1589;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f1590;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AsymmetricKeyParameter f1591;

    @Override // l.InterfaceC2300
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1840(int i, String str) throws NoSuchAlgorithmException {
        if (!str.equals(XDHParameterSpec.X25519) && !str.equals(XDHParameterSpec.X448)) {
            throw new NoSuchAlgorithmException("invalid curve ".concat(str));
        }
        this.f1590 = i;
        this.f1589 = str;
        if (str.equals(XDHParameterSpec.X25519)) {
            X25519PrivateKeyParameters x25519PrivateKeyParameters = new X25519PrivateKeyParameters(new SecureRandom());
            this.f1588 = x25519PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f1591 = x25519PrivateKeyParameters;
        } else {
            X448PrivateKeyParameters x448PrivateKeyParameters = new X448PrivateKeyParameters(new SecureRandom());
            this.f1588 = x448PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f1591 = x448PrivateKeyParameters;
        }
    }

    @Override // l.InterfaceC2300
    public final byte[] getQ() {
        return this.f1588;
    }

    @Override // l.InterfaceC2300
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo1841(byte[] bArr) throws InvalidKeyException {
        byte[] bArr2 = new byte[this.f1590];
        if (this.f1589.equals(XDHParameterSpec.X25519)) {
            try {
                try {
                    ((X25519PrivateKeyParameters) this.f1591).generateSecret(new X25519PublicKeyParameters(bArr, 0), bArr2, 0);
                    return bArr2;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            } catch (Exception e2) {
                throw new InvalidKeyException(e2);
            }
        }
        try {
            try {
                ((X448PrivateKeyParameters) this.f1591).generateSecret(new X448PublicKeyParameters(bArr, 0), bArr2, 0);
                return bArr2;
            } catch (Exception e3) {
                throw new IllegalStateException(e3);
            }
        } catch (Exception e4) {
            throw new InvalidKeyException(e4);
        }
    }

    @Override // l.InterfaceC2300
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo1842(byte[] bArr) {
        return bArr.length == this.f1590;
    }
}
