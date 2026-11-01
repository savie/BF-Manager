package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩵᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53K */
/* JADX INFO: loaded from: classes5.dex */
public final class C19738 implements InterfaceC21335 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MessageDigest f63429;

    @Override // l.InterfaceC21335
    public final int getBlockSize() {
        return 16;
    }

    @Override // l.InterfaceC21335
    public final String name() {
        return "MD5";
    }

    @Override // l.InterfaceC21335
    public final void init() {
        this.f63429 = MessageDigest.getInstance("MD5");
    }

    @Override // l.InterfaceC21335
    /* JADX INFO: renamed from: ۙ */
    public final void mo3065(int i, byte[] bArr) {
        this.f63429.update(bArr, 0, i);
    }

    @Override // l.InterfaceC21335
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo3066() {
        return this.f63429.digest();
    }
}
