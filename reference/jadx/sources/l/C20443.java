package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩶᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87Y6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20443 implements InterfaceC21335 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MessageDigest f66276;

    @Override // l.InterfaceC21335
    public final int getBlockSize() {
        return 48;
    }

    @Override // l.InterfaceC21335
    public final String name() {
        return "SHA384";
    }

    @Override // l.InterfaceC21335
    public final void init() {
        this.f66276 = MessageDigest.getInstance("SHA-384");
    }

    @Override // l.InterfaceC21335
    /* JADX INFO: renamed from: ۙ */
    public final void mo3065(int i, byte[] bArr) {
        this.f66276.update(bArr, 0, i);
    }

    @Override // l.InterfaceC21335
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo3066() {
        return this.f66276.digest();
    }
}
