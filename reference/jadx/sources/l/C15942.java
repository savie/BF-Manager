package l;

import java.security.SignatureException;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.ܶ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7VV */
/* JADX INFO: loaded from: classes5.dex */
public final class C15942 extends AbstractC3264 {
    @Override // l.AbstractC3264
    /* JADX INFO: renamed from: ۙ */
    public final String mo10655() {
        return EdDSAParameterSpec.Ed25519;
    }

    @Override // l.AbstractC3264
    /* JADX INFO: renamed from: ᩷ */
    public final String mo10657() {
        return OpenSSHPublicKeyUtil.ED_25519;
    }

    @Override // l.InterfaceC11994
    public final byte[] sign() throws SignatureException {
        try {
            return this.f10605.generateSignature();
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }

    @Override // l.InterfaceC11994
    public final void update(byte[] bArr) throws SignatureException {
        try {
            this.f10605.update(bArr, 0, bArr.length);
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }
}
