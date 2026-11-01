package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAOD */
/* JADX INFO: loaded from: classes4.dex */
public final class C12236 implements InterfaceC10107 {
    @Override // l.InterfaceC10107
    /* JADX INFO: renamed from: ۙ */
    public final void mo25718(InterfaceC19985 interfaceC19985) {
        if (!(interfaceC19985 instanceof InterfaceC17422)) {
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
        C12484 viewModelStore = ((InterfaceC17422) interfaceC19985).getViewModelStore();
        C20690 savedStateRegistry = interfaceC19985.getSavedStateRegistry();
        Iterator it = viewModelStore.m31029().iterator();
        while (it.hasNext()) {
            AbstractC8956 abstractC8956M31026 = viewModelStore.m31026((String) it.next());
            C13465.m32962(abstractC8956M31026);
            C5885.m16104(abstractC8956M31026, savedStateRegistry, interfaceC19985.getLifecycle());
        }
        if (viewModelStore.m31029().isEmpty()) {
            return;
        }
        savedStateRegistry.m46527();
    }
}
