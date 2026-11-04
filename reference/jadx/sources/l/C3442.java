package l;

/* JADX INFO: renamed from: l.ۗ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAX2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3442 extends AbstractC18951 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f11223 = 0;

    @Override // l.AbstractC18951
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    static {
        new C3442();
    }

    @Override // l.AbstractC18951
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11210(InterfaceC11536 interfaceC11536, Runnable runnable) {
        if (((C4188) interfaceC11536.mo5005(C4188.f15315)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }
}
