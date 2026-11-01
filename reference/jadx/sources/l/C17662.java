package l;

import java.security.NoSuchAlgorithmException;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.ܿ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37ZK */
/* JADX INFO: loaded from: classes5.dex */
public final class C17662 implements InterfaceC15069 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f56122;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f56123;

    @Override // l.InterfaceC15069
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo36100() {
        return this.f56122;
    }

    @Override // l.InterfaceC15069
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo36099() {
        return this.f56123;
    }

    @Override // l.InterfaceC15069
    /* JADX INFO: renamed from: ۙ */
    public final void mo36098(String str, byte[] bArr) throws NoSuchAlgorithmException {
        if (!str.equals(EdDSAParameterSpec.Ed25519) && !str.equals(EdDSAParameterSpec.Ed448)) {
            throw new NoSuchAlgorithmException("invalid curve ".concat(str));
        }
        if (str.equals(EdDSAParameterSpec.Ed25519)) {
            Ed25519PrivateKeyParameters ed25519PrivateKeyParameters = new Ed25519PrivateKeyParameters(bArr);
            this.f56123 = ed25519PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f56122 = ed25519PrivateKeyParameters.getEncoded();
        } else {
            Ed448PrivateKeyParameters ed448PrivateKeyParameters = new Ed448PrivateKeyParameters(bArr);
            this.f56123 = ed448PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f56122 = ed448PrivateKeyParameters.getEncoded();
        }
        int length = this.f56122.length;
    }
}
