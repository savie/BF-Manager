package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6G6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18281 implements InterfaceC22726 {
    @Override // l.InterfaceC22726
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo42436(InterfaceC1843 interfaceC1843) {
        if (!(interfaceC1843 instanceof InterfaceC3518)) {
            throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + interfaceC1843).toString());
        }
        C23656 viewModelStore = ((InterfaceC3518) interfaceC1843).getViewModelStore();
        C15266 savedStateRegistry = interfaceC1843.getSavedStateRegistry();
        Iterator it = viewModelStore.m52892().iterator();
        while (it.hasNext()) {
            AbstractC13213 abstractC13213M52889 = viewModelStore.m52889((String) it.next());
            if (abstractC13213M52889 != null) {
                C7840.m21365(abstractC13213M52889, savedStateRegistry, interfaceC1843.getLifecycle());
            }
        }
        if (viewModelStore.m52892().isEmpty()) {
            return;
        }
        savedStateRegistry.m36622();
    }
}
