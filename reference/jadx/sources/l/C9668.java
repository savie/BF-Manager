package l;

/* JADX INFO: renamed from: l.ۡ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: H98Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C9668 extends AbstractC21976 implements InterfaceC5656, InterfaceC11621 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4787 f31217;

    public C9668(InterfaceC4787 interfaceC4787) {
        this.f31217 = interfaceC4787;
    }

    @Override // l.AbstractC21976, l.InterfaceC5656
    /* JADX INFO: renamed from: ۙ */
    public final void mo9647(C21383 c21383) {
        if (this.f31217.test(c21383.m13516().replace('/', '.'))) {
            return;
        }
        c21383.mo13503((Object) c21383.m13516());
        c21383.m13508((InterfaceC11621) this);
        c21383.m13521(this);
    }

    @Override // l.AbstractC21976, l.InterfaceC11621
    /* JADX INFO: renamed from: ۙ */
    public final void mo6610(C21383 c21383, C18399 c18399) {
        C12564.m31274(c18399);
    }

    @Override // l.AbstractC21976, l.InterfaceC11621
    /* JADX INFO: renamed from: ۙ */
    public final void mo6609(C21383 c21383, C7958 c7958) {
        C12564.m31274(c7958);
    }
}
