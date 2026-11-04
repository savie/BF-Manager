package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۙۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H95A */
/* JADX INFO: loaded from: classes3.dex */
public final class C4821 implements InterfaceC1421 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MessageDigest f16866;

    @Override // l.InterfaceC1421
    public final int getBlockSize() {
        return 28;
    }

    @Override // l.InterfaceC1421
    public final String name() {
        return "SHA224";
    }

    @Override // l.InterfaceC1421
    public final void init() {
        this.f16866 = MessageDigest.getInstance("SHA-224");
    }

    @Override // l.InterfaceC1421
    /* JADX INFO: renamed from: ۙ */
    public final void mo5157(int i, byte[] bArr) {
        this.f16866.update(bArr, 0, i);
    }

    @Override // l.InterfaceC1421
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo5158() {
        return this.f16866.digest();
    }
}
