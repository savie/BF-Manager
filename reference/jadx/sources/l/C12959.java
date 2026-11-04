package l;

import java.security.NoSuchAlgorithmException;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.۫۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37ZK */
/* JADX INFO: loaded from: classes4.dex */
public final class C12959 implements InterfaceC8045 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f41533;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f41534;

    @Override // l.InterfaceC8045
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo21934() {
        return this.f41533;
    }

    @Override // l.InterfaceC8045
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo21933() {
        return this.f41534;
    }

    @Override // l.InterfaceC8045
    /* JADX INFO: renamed from: ۙ */
    public final void mo21932(String str, byte[] bArr) throws NoSuchAlgorithmException {
        if (!str.equals(EdDSAParameterSpec.Ed25519) && !str.equals(EdDSAParameterSpec.Ed448)) {
            throw new NoSuchAlgorithmException("invalid curve ".concat(str));
        }
        if (str.equals(EdDSAParameterSpec.Ed25519)) {
            Ed25519PrivateKeyParameters ed25519PrivateKeyParameters = new Ed25519PrivateKeyParameters(bArr);
            this.f41534 = ed25519PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f41533 = ed25519PrivateKeyParameters.getEncoded();
        } else {
            Ed448PrivateKeyParameters ed448PrivateKeyParameters = new Ed448PrivateKeyParameters(bArr);
            this.f41534 = ed448PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f41533 = ed448PrivateKeyParameters.getEncoded();
        }
        int length = this.f41533.length;
    }
}
