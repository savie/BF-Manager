package l;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.bouncycastle.crypto.signers.Ed448Signer;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.ۗ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7VX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3264 implements InterfaceC3791 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Signer f10605;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract String mo10655();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract String mo10657();

    @Override // l.InterfaceC11994
    public void init() throws NoSuchAlgorithmException {
        if (!mo10655().equals(EdDSAParameterSpec.Ed25519) && !mo10655().equals(EdDSAParameterSpec.Ed448)) {
            throw new NoSuchAlgorithmException("invalid curve ".concat(mo10655()));
        }
        if (mo10655().equals(EdDSAParameterSpec.Ed25519)) {
            this.f10605 = new Ed25519Signer();
        } else {
            this.f10605 = new Ed448Signer(new byte[0]);
        }
    }

    @Override // l.InterfaceC3791
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo10658(byte[] bArr) throws InvalidKeyException {
        try {
            if (mo10655().equals(EdDSAParameterSpec.Ed25519)) {
                this.f10605.init(false, new Ed25519PublicKeyParameters(bArr, 0));
            } else {
                this.f10605.init(false, new Ed448PublicKeyParameters(bArr, 0));
            }
        } catch (Exception e) {
            throw new InvalidKeyException(e);
        }
    }

    @Override // l.InterfaceC3791
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo10656(byte[] bArr) throws InvalidKeyException {
        try {
            if (mo10655().equals(EdDSAParameterSpec.Ed25519)) {
                this.f10605.init(true, new Ed25519PrivateKeyParameters(bArr, 0));
            } else {
                this.f10605.init(true, new Ed448PrivateKeyParameters(bArr, 0));
            }
        } catch (Exception e) {
            throw new InvalidKeyException(e);
        }
    }

    @Override // l.InterfaceC11994
    public boolean verify(byte[] bArr) throws SignatureException {
        C9866 c9866 = new C9866(bArr);
        if (new String(c9866.m25649(), StandardCharsets.UTF_8).equals(mo10657())) {
            int iM25658 = c9866.m25658();
            byte[] bArr2 = new byte[iM25658];
            System.arraycopy(bArr, c9866.m25663(), bArr2, 0, iM25658);
            bArr = bArr2;
        }
        try {
            return this.f10605.verifySignature(bArr);
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }
}
