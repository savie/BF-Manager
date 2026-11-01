package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.֫ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes2.dex */
public final class C1880 extends AbstractC3624 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MessageDigest f7118;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880(InterfaceC5614 interfaceC5614, MessageDigest messageDigest) {
        super(interfaceC5614);
        this.f7118 = messageDigest;
    }

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6131(byte[] bArr, int i, int i2) {
        this.f7118.update(bArr, i, i2);
    }
}
