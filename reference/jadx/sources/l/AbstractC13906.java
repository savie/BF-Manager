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

/* JADX INFO: renamed from: l.ܰܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7VX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13906 implements InterfaceC1434 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Signer f45811;

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo10469();

    /* JADX INFO: renamed from: ܰ */
    public abstract String mo10470();

    @Override // l.InterfaceC2845
    public void init() throws NoSuchAlgorithmException {
        if (!mo10469().equals(EdDSAParameterSpec.Ed25519) && !mo10469().equals(EdDSAParameterSpec.Ed448)) {
            throw new NoSuchAlgorithmException("invalid curve ".concat(mo10469()));
        }
        if (mo10469().equals(EdDSAParameterSpec.Ed25519)) {
            this.f45811 = new Ed25519Signer();
        } else {
            this.f45811 = new Ed448Signer(new byte[0]);
        }
    }

    @Override // l.InterfaceC1434
    /* JADX INFO: renamed from: ܰ */
    public void mo5010(byte[] bArr) throws InvalidKeyException {
        try {
            if (mo10469().equals(EdDSAParameterSpec.Ed25519)) {
                this.f45811.init(false, new Ed25519PublicKeyParameters(bArr, 0));
            } else {
                this.f45811.init(false, new Ed448PublicKeyParameters(bArr, 0));
            }
        } catch (Exception e) {
            throw new InvalidKeyException(e);
        }
    }

    @Override // l.InterfaceC1434
    /* JADX INFO: renamed from: ۙ */
    public void mo5009(byte[] bArr) throws InvalidKeyException {
        try {
            if (mo10469().equals(EdDSAParameterSpec.Ed25519)) {
                this.f45811.init(true, new Ed25519PrivateKeyParameters(bArr, 0));
            } else {
                this.f45811.init(true, new Ed448PrivateKeyParameters(bArr, 0));
            }
        } catch (Exception e) {
            throw new InvalidKeyException(e);
        }
    }

    @Override // l.InterfaceC2845
    public boolean verify(byte[] bArr) throws SignatureException {
        C14904 c14904 = new C14904(bArr);
        if (new String(c14904.m35628(), StandardCharsets.UTF_8).equals(mo10470())) {
            int iM35638 = c14904.m35638();
            byte[] bArr2 = new byte[iM35638];
            System.arraycopy(bArr, c14904.m35625(), bArr2, 0, iM35638);
            bArr = bArr2;
        }
        try {
            return this.f45811.verifySignature(bArr);
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }
}
