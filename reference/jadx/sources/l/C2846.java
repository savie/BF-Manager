package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۖᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53K */
/* JADX INFO: loaded from: classes3.dex */
public final class C2846 implements InterfaceC1421 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MessageDigest f9356;

    @Override // l.InterfaceC1421
    public final int getBlockSize() {
        return 16;
    }

    @Override // l.InterfaceC1421
    public final String name() {
        return "MD5";
    }

    @Override // l.InterfaceC1421
    public final void init() {
        this.f9356 = MessageDigest.getInstance("MD5");
    }

    @Override // l.InterfaceC1421
    /* JADX INFO: renamed from: ۙ */
    public final void mo5157(int i, byte[] bArr) {
        this.f9356.update(bArr, 0, i);
    }

    @Override // l.InterfaceC1421
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo5158() {
        return this.f9356.digest();
    }
}
