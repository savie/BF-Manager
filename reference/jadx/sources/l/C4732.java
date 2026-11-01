package l;

import java.security.SignatureException;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.ۙܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7VS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4732 extends AbstractC13906 {
    @Override // l.AbstractC13906
    /* JADX INFO: renamed from: ۙ */
    public final String mo10469() {
        return EdDSAParameterSpec.Ed448;
    }

    @Override // l.AbstractC13906
    /* JADX INFO: renamed from: ܰ */
    public final String mo10470() {
        return "ssh-ed448";
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
