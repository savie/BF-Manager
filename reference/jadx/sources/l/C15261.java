package l;

import java.security.SignatureException;

/* JADX INFO: renamed from: l.ܳۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7W3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15261 extends AbstractC1838 {
    @Override // l.AbstractC1838
    /* JADX INFO: renamed from: ۙ */
    public final String mo6338() {
        return "ecdsa-sha2-nistp256";
    }

    @Override // l.InterfaceC11994
    public final void update(byte[] bArr) throws SignatureException {
        this.f6217.update(bArr);
    }
}
