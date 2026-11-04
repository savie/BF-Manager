package l;

import java.security.SignatureException;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.᩹۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7VS */
/* JADX INFO: loaded from: classes2.dex */
public final class C23402 extends AbstractC3264 {
    @Override // l.AbstractC3264
    /* JADX INFO: renamed from: ۙ */
    public final String mo10655() {
        return EdDSAParameterSpec.Ed448;
    }

    @Override // l.AbstractC3264
    /* JADX INFO: renamed from: ᩷ */
    public final String mo10657() {
        return "ssh-ed448";
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
