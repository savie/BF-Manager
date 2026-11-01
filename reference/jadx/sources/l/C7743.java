package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.۟᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OADV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7743 implements InterfaceC21335 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MessageDigest f25587;

    @Override // l.InterfaceC21335
    public final int getBlockSize() {
        return 20;
    }

    @Override // l.InterfaceC21335
    public final String name() {
        return "SHA1";
    }

    @Override // l.InterfaceC21335
    public final void init() {
        this.f25587 = MessageDigest.getInstance("SHA-1");
    }

    @Override // l.InterfaceC21335
    /* JADX INFO: renamed from: ۙ */
    public final void mo3065(int i, byte[] bArr) {
        this.f25587.update(bArr, 0, i);
    }

    @Override // l.InterfaceC21335
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo3066() {
        return this.f25587.digest();
    }
}
