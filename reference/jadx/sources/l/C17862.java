package l;

/* JADX INFO: renamed from: l.ᩳۛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: HAX2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17862 extends AbstractC12405 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f56558 = 0;

    @Override // l.AbstractC12405
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    static {
        new C17862();
    }

    @Override // l.AbstractC12405
    /* JADX INFO: renamed from: ۙ */
    public final void mo8623(InterfaceC22386 interfaceC22386, Runnable runnable) {
        if (((C8691) interfaceC22386.mo4416(C8691.f29901)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }
}
