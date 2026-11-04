package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۤۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87Y6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10786 implements InterfaceC1421 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MessageDigest f34231;

    @Override // l.InterfaceC1421
    public final int getBlockSize() {
        return 48;
    }

    @Override // l.InterfaceC1421
    public final String name() {
        return "SHA384";
    }

    @Override // l.InterfaceC1421
    public final void init() {
        this.f34231 = MessageDigest.getInstance("SHA-384");
    }

    @Override // l.InterfaceC1421
    /* JADX INFO: renamed from: ۙ */
    public final void mo5157(int i, byte[] bArr) {
        this.f34231.update(bArr, 0, i);
    }

    @Override // l.InterfaceC1421
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo5158() {
        return this.f34231.digest();
    }
}
