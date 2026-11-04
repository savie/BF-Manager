package l;

/* JADX INFO: renamed from: l.֫᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2206 implements InterfaceC22058 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f7246;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14763 f7247;

    public AbstractC2206(int i, C14763 c14763) {
        this.f7246 = i;
        this.f7247 = c14763;
    }

    @Override // l.InterfaceC22058
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int mo7535() {
        return this.f7246;
    }

    @Override // l.InterfaceC22058
    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9018 mo7534() {
        return this.f7247;
    }

    @Override // l.InterfaceC1921
    /* JADX INFO: renamed from: ۙ */
    public final void mo6599(InterfaceC1921 interfaceC1921) {
        InterfaceC22058 interfaceC22058 = (InterfaceC22058) interfaceC1921;
        if (this.f7246 != interfaceC22058.mo7535()) {
            throw new RuntimeException();
        }
        InterfaceC9018 interfaceC9018Mo7534 = interfaceC22058.mo7534();
        C14763 c14763 = this.f7247;
        if (c14763.size() != interfaceC9018Mo7534.size()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < c14763.size(); i++) {
            if (c14763.getInt(i) != interfaceC9018Mo7534.getInt(i)) {
                throw new RuntimeException();
            }
        }
    }
}
