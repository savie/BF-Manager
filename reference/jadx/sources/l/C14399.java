package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܳ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: BA24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14399 extends AbstractC17529 {

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public String f47208;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) {
        return 0;
    }

    public C14399(String str, InterfaceC10601 interfaceC10601) {
        super(interfaceC10601, 3);
        this.f47208 = str;
    }

    @Override // l.AbstractC17529
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC6240 mo3799(InterfaceC19067 interfaceC19067) {
        return new C1697(interfaceC19067.mo29449());
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo27236(AbstractC12591 abstractC12591) {
        abstractC12591.m31350(-1);
        return super.mo27236(abstractC12591);
    }

    @Override // l.InterfaceC3314
    public final int size() {
        return AbstractC12591.m31337((this.f47208.length() * 2) + 72);
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        C4850.m13546(9L, i, bArr);
        C4850.m13546(0, i + 2, bArr);
        byte[] bytes = this.f47208.getBytes(StandardCharsets.UTF_16LE);
        C4850.m13546(bytes.length, i + 6, bArr);
        int i2 = i + 8;
        C4850.m13546(i2 - m31366(), i + 4, bArr);
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        return (i2 + bytes.length) - i;
    }
}
