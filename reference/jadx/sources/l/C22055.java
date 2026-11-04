package l;

/* JADX INFO: renamed from: l.᩷۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes.dex */
public final class C22055 implements InterfaceC12816 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC11612 f71123;

    public C22055(ComponentCallbacksC11612 componentCallbacksC11612) {
        this.f71123 = componentCallbacksC11612;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC12816
    /* JADX INFO: renamed from: ۙ */
    public final Object mo27601(AbstractC22044 abstractC22044) {
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f71123;
        Object obj = componentCallbacksC11612.mHost;
        if (obj instanceof InterfaceC6674) {
            return ((InterfaceC6674) obj).mo16524();
        }
        return componentCallbacksC11612.requireActivity().mo16524();
    }
}
