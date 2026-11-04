package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۡ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AMS */
/* JADX INFO: loaded from: classes3.dex */
public final class C9047 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0844 f29437 = C0844.f3165;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m24149(ComponentCallbacksC11612 componentCallbacksC11612, String str) {
        C15243.m36590(componentCallbacksC11612, "fragment");
        C15243.m36590(str, "previousFragmentId");
        m24152(new C18743(componentCallbacksC11612, "Attempting to reuse fragment " + componentCallbacksC11612 + " with previous ID " + str));
        m24147(componentCallbacksC11612).getClass();
        EnumC9792 enumC9792 = EnumC9792.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m24156(ComponentCallbacksC11612 componentCallbacksC11612, ViewGroup viewGroup) {
        C15243.m36590(componentCallbacksC11612, "fragment");
        m24152(new C13060(componentCallbacksC11612, "Attempting to add fragment " + componentCallbacksC11612 + " to container " + viewGroup + " which is not a FragmentContainerView"));
        m24147(componentCallbacksC11612).getClass();
        EnumC9792 enumC9792 = EnumC9792.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0844 m24147(ComponentCallbacksC11612 componentCallbacksC11612) {
        while (componentCallbacksC11612 != null) {
            if (componentCallbacksC11612.isAdded()) {
                C15243.m36591(componentCallbacksC11612.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            componentCallbacksC11612 = componentCallbacksC11612.getParentFragment();
        }
        return f29437;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m24148(ComponentCallbacksC11612 componentCallbacksC11612, ViewGroup viewGroup) {
        m24152(new C2336(componentCallbacksC11612, "Attempting to use <fragment> tag to add fragment " + componentCallbacksC11612 + " to container " + viewGroup));
        m24147(componentCallbacksC11612).getClass();
        EnumC9792 enumC9792 = EnumC9792.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final void m24154(ComponentCallbacksC11612 componentCallbacksC11612) {
        m24152(new C22011(componentCallbacksC11612, "Attempting to set retain instance for fragment " + componentCallbacksC11612));
        m24147(componentCallbacksC11612).getClass();
        EnumC9792 enumC9792 = EnumC9792.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m24155(ComponentCallbacksC11612 componentCallbacksC11612) {
        m24152(new C8302(componentCallbacksC11612, "Attempting to get retain instance for fragment " + componentCallbacksC11612));
        m24147(componentCallbacksC11612).getClass();
        EnumC9792 enumC9792 = EnumC9792.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m24151(ComponentCallbacksC11612 componentCallbacksC11612, boolean z) {
        m24152(new C22757(componentCallbacksC11612, "Attempting to set user visible hint to " + z + " for fragment " + componentCallbacksC11612));
        m24147(componentCallbacksC11612).getClass();
        EnumC9792 enumC9792 = EnumC9792.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m24150(ComponentCallbacksC11612 componentCallbacksC11612, ComponentCallbacksC11612 componentCallbacksC11613, int i) {
        m24152(new C10822(componentCallbacksC11612, "Attempting to set target fragment " + componentCallbacksC11613 + " with request code " + i + " for fragment " + componentCallbacksC11612));
        m24147(componentCallbacksC11612).getClass();
        EnumC9792 enumC9792 = EnumC9792.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final void m24157(ComponentCallbacksC11612 componentCallbacksC11612) {
        m24152(new C13522(componentCallbacksC11612, "Attempting to get target fragment from fragment " + componentCallbacksC11612));
        m24147(componentCallbacksC11612).getClass();
        EnumC9792 enumC9792 = EnumC9792.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final void m24153(ComponentCallbacksC11612 componentCallbacksC11612) {
        m24152(new C6811(componentCallbacksC11612, "Attempting to get target request code from fragment " + componentCallbacksC11612));
        m24147(componentCallbacksC11612).getClass();
        EnumC9792 enumC9792 = EnumC9792.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24152(AbstractC15297 abstractC15297) {
        if (AbstractC3191.m10427(3)) {
            abstractC15297.m36727().getClass();
        }
    }
}
