package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۘܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: MANZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4015 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C22361 f14871 = new C22361();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C1193 f14870 = new C1193();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C5427 f14869 = new C5427();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C15306 m11525(InterfaceC17422 interfaceC17422) {
        AbstractC3310 defaultViewModelCreationExtras;
        C14083 c14083 = new C14083();
        c14083.m34074(C12759.m31709(C15306.class), C13189.f43900);
        C4909 c4909M34073 = c14083.m34073();
        C12484 viewModelStore = interfaceC17422.getViewModelStore();
        if (interfaceC17422 instanceof InterfaceC16469) {
            defaultViewModelCreationExtras = ((InterfaceC16469) interfaceC17422).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = C1899.f7169;
        }
        return (C15306) new C16717(viewModelStore, c4909M34073, defaultViewModelCreationExtras).m39206(C15306.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m11526(InterfaceC19985 interfaceC19985) {
        EnumC9414 enumC9414Mo9170 = interfaceC19985.getLifecycle().mo9170();
        if (enumC9414Mo9170 != EnumC9414.INITIALIZED && enumC9414Mo9170 != EnumC9414.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC19985.getSavedStateRegistry().m46523() == null) {
            C23067 c23067 = new C23067(interfaceC19985.getSavedStateRegistry(), (InterfaceC17422) interfaceC19985);
            interfaceC19985.getSavedStateRegistry().m46525("androidx.lifecycle.internal.SavedStateHandlesProvider", c23067);
            interfaceC19985.getLifecycle().mo9171(new C11778(c23067));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C13895 m11524(C11966 c11966) {
        InterfaceC19985 interfaceC19985 = (InterfaceC19985) c11966.m9814().get(f14871);
        if (interfaceC19985 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC17422 interfaceC17422 = (InterfaceC17422) c11966.m9814().get(f14870);
        if (interfaceC17422 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) c11966.m9814().get(f14869);
        int i = C20245.f65683;
        String str = (String) c11966.m9814().get(C16012.f51830);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC7284 interfaceC7284M46523 = interfaceC19985.getSavedStateRegistry().m46523();
        C23067 c23067 = interfaceC7284M46523 instanceof C23067 ? (C23067) interfaceC7284M46523 : null;
        if (c23067 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        C15306 c15306M11525 = m11525(interfaceC17422);
        C13895 c13895 = (C13895) c15306M11525.m36648().get(str);
        if (c13895 != null) {
            return c13895;
        }
        int i2 = C13895.f45775;
        C13895 c13895M13081 = C4721.m13081(c23067.m51039(str), bundle);
        c15306M11525.m36648().put(str, c13895M13081);
        return c13895M13081;
    }
}
