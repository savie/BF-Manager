package l;

import java.security.SignatureException;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.ۗ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7VV */
/* JADX INFO: loaded from: classes3.dex */
public final class C3550 extends AbstractC13906 {
    @Override // l.AbstractC13906
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo10469() {
        return EdDSAParameterSpec.Ed25519;
    }

    @Override // l.AbstractC13906
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String mo10470() {
        return OpenSSHPublicKeyUtil.ED_25519;
    }

    @Override // l.InterfaceC2845
    public final byte[] sign() throws SignatureException {
        try {
            return this.f45811.generateSignature();
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }

    @Override // l.InterfaceC2845
    public final void update(byte[] bArr) throws SignatureException {
        try {
            this.f45811.update(bArr, 0, bArr.length);
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }
}
