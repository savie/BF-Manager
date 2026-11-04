package l;

/* JADX INFO: renamed from: l.ۡ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: KARP */
/* JADX INFO: loaded from: classes4.dex */
public class C9686 implements InterfaceC1484 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2777 f31272;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC8743 f31273;

    @Override // l.InterfaceC19383
    public final int getChildCount() {
        return 0;
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC19383 mo9151(int i) {
        return null;
    }

    public C9686(InterfaceC8743 interfaceC8743) {
        this.f31273 = interfaceC8743;
    }

    @Override // l.InterfaceC1484
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC8743 mo5285() {
        return this.f31273;
    }

    @Override // l.InterfaceC19383
    public final String getText() {
        return this.f31273.getText();
    }

    public final String toString() {
        InterfaceC8743 interfaceC8743 = this.f31273;
        return interfaceC8743.getType() == -1 ? "<EOF>" : interfaceC8743.getText();
    }
}
