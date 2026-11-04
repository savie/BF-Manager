package l;

/* JADX INFO: renamed from: l.֡ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 36ID */
/* JADX INFO: loaded from: classes3.dex */
public final class C0263 implements InterfaceC7721 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3071 f1552;

    public C0263(InterfaceC3071 interfaceC3071) {
        this.f1552 = interfaceC3071;
    }

    @Override // l.InterfaceC7721
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo1765(Throwable th) {
        ((C4934) this.f1552).invoke(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f1552.getClass().getSimpleName() + '@' + C21892.m49586(this) + ']';
    }
}
