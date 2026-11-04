package l;

/* JADX INFO: renamed from: l.ۚۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AXS */
/* JADX INFO: loaded from: classes2.dex */
public final class C5484 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m16312(C24919 c24919, InterfaceC4825 interfaceC4825, boolean z) {
        Object objMo32329 = c24919.mo32329();
        Throwable thMo32331 = c24919.mo32331(objMo32329);
        Object objM45347 = thMo32331 != null ? C19676.m45347(thMo32331) : c24919.mo32330(objMo32329);
        if (z) {
            C15243.m36587((Object) interfaceC4825, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C25307 c25307 = (C25307) interfaceC4825;
            AbstractC6317 abstractC6317 = c25307.f81753;
            Object obj = c25307.f81755;
            InterfaceC11536 context = abstractC6317.getContext();
            Object objM45511 = C19756.m45511(context, obj);
            C20596 c20596M42354 = objM45511 != C19756.f63579 ? C18205.m42354(abstractC6317, context) : null;
            try {
                abstractC6317.mo8188(objM45347);
                C11471 c11471 = C11471.f36082;
                if (c20596M42354 != null) {
                    c20596M42354.m47185();
                    throw null;
                }
                C19756.m45510(context, objM45511);
                return;
            } catch (Throwable th) {
                if (c20596M42354 != null) {
                    c20596M42354.m47185();
                    throw null;
                }
                C19756.m45510(context, objM45511);
                throw th;
            }
        }
        interfaceC4825.mo8188(objM45347);
    }
}
