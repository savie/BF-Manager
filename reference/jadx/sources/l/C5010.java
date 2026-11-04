package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۙܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: MANZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5010 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C8980 f17389 = new C8980();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C7489 f17388 = new C7489();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C14200 f17387 = new C14200();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m15238(InterfaceC1843 interfaceC1843) {
        EnumC2619 enumC2619Mo23076 = interfaceC1843.getLifecycle().mo23076();
        if (enumC2619Mo23076 != EnumC2619.INITIALIZED && enumC2619Mo23076 != EnumC2619.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC1843.getSavedStateRegistry().m36620() == null) {
            C22164 c22164 = new C22164(interfaceC1843.getSavedStateRegistry(), (InterfaceC3518) interfaceC1843);
            interfaceC1843.getSavedStateRegistry().m36621("androidx.lifecycle.internal.SavedStateHandlesProvider", c22164);
            interfaceC1843.getLifecycle().mo23077(new C1523(c22164));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C10471 m15236(C4264 c4264) {
        C10471 c10471;
        InterfaceC1843 interfaceC1843 = (InterfaceC1843) c4264.m54576().get(f17389);
        if (interfaceC1843 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC3518 interfaceC3518 = (InterfaceC3518) c4264.m54576().get(f17388);
        if (interfaceC3518 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) c4264.m54576().get(f17387);
        String str = (String) c4264.m54576().get(C16196.f52576);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC19742 interfaceC19742M36620 = interfaceC1843.getSavedStateRegistry().m36620();
        C22164 c22164 = interfaceC19742M36620 instanceof C22164 ? (C22164) interfaceC19742M36620 : null;
        if (c22164 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        C10975 c10975M15237 = m15237(interfaceC3518);
        C10471 c10472 = (C10471) c10975M15237.m27822().get(str);
        if (c10472 != null) {
            return c10472;
        }
        Bundle bundleM50127 = c22164.m50127(str);
        if (bundleM50127 != null) {
            bundle = bundleM50127;
        }
        if (bundle == null) {
            c10471 = new C10471();
        } else {
            ClassLoader classLoader = C10471.class.getClassLoader();
            C15243.m36586(classLoader);
            bundle.setClassLoader(classLoader);
            C14782 c14782 = new C14782(bundle.size());
            for (String str2 : bundle.keySet()) {
                C15243.m36586((Object) str2);
                c14782.put(str2, bundle.get(str2));
            }
            c10471 = new C10471(c14782.m35603());
        }
        c10975M15237.m27822().put(str, c10471);
        return c10471;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C10975 m15237(InterfaceC3518 interfaceC3518) {
        C3014 c3014 = new C3014();
        AbstractC24402 defaultViewModelCreationExtras = interfaceC3518 instanceof InterfaceC21265 ? ((InterfaceC21265) interfaceC3518).getDefaultViewModelCreationExtras() : C6502.f21835;
        C15243.m36590(defaultViewModelCreationExtras, "extras");
        return (C10975) new C16196(interfaceC3518.getViewModelStore(), c3014, defaultViewModelCreationExtras).m38423(C16735.m39514(C10975.class));
    }
}
