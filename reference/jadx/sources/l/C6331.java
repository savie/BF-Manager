package l;

import java.security.SignatureException;

/* JADX INFO: renamed from: l.ۛ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7UY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6331 extends AbstractC11271 {
    @Override // l.AbstractC11271
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo17434() {
        return "ecdsa-sha2-nistp521";
    }

    @Override // l.InterfaceC2845
    public final void update(byte[] bArr) throws SignatureException {
        this.f38092.update(bArr);
    }
}
