package l;

import java.security.SignatureException;

/* JADX INFO: renamed from: l.ܿ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7V0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17620 extends AbstractC11271 {
    @Override // l.AbstractC11271
    /* JADX INFO: renamed from: ۙ */
    public final String mo17434() {
        return "ecdsa-sha2-nistp384";
    }

    @Override // l.InterfaceC2845
    public final void update(byte[] bArr) throws SignatureException {
        this.f38092.update(bArr);
    }
}
