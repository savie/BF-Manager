package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۤܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 41SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10969 implements InterfaceC15444, InterfaceC19920 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f34652;

    @Override // l.InterfaceC15444
    /* JADX INFO: renamed from: ۙ */
    public final int mo21905() {
        return 1;
    }

    @Override // l.InterfaceC19920
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo6947() {
        return false;
    }

    @Override // l.InterfaceC19920
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo6948() {
        return true;
    }

    @Override // l.InterfaceC19920
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo6949() {
        return false;
    }

    public C10969(byte[] bArr) throws C4258 {
        if (bArr.length != 1) {
            throw new C4258("Unsupported Delta filter properties");
        }
        this.f34652 = (bArr[0] & 255) + 1;
    }

    @Override // l.InterfaceC15444
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo21906(InputStream inputStream, C0573 c0573) {
        return new C22904(inputStream, this.f34652);
    }
}
