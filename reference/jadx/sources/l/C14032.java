package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.۬ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: OADV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14032 implements InterfaceC1421 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MessageDigest f44463;

    @Override // l.InterfaceC1421
    public final int getBlockSize() {
        return 20;
    }

    @Override // l.InterfaceC1421
    public final String name() {
        return "SHA1";
    }

    @Override // l.InterfaceC1421
    public final void init() {
        this.f44463 = MessageDigest.getInstance("SHA-1");
    }

    @Override // l.InterfaceC1421
    /* JADX INFO: renamed from: ۙ */
    public final void mo5157(int i, byte[] bArr) {
        this.f44463.update(bArr, 0, i);
    }

    @Override // l.InterfaceC1421
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo5158() {
        return this.f44463.digest();
    }
}
