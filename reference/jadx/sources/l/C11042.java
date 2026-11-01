package l;

/* JADX INFO: renamed from: l.ۧܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBDL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11042 extends AbstractC1100 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23680 f37507;

    public C11042(C23680 c23680) {
        super("LineNumberTable");
        try {
            if (c23680.m43640()) {
                throw new C8364("lineNumbers.isMutable()", null);
            }
            this.f37507 = c23680;
        } catch (NullPointerException unused) {
            throw new NullPointerException("lineNumbers == null");
        }
    }

    @Override // l.InterfaceC5771
    /* JADX INFO: renamed from: ۙ */
    public final int mo2281() {
        return (this.f37507.size() * 4) + 8;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23680 m27845() {
        return this.f37507;
    }
}
