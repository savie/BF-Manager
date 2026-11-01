package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֫ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AMS */
/* JADX INFO: loaded from: classes2.dex */
public final class C1568 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14270 f6310 = C14270.f46716;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m5363(ComponentCallbacksC22654 componentCallbacksC22654, String str) {
        C13465.m32966(componentCallbacksC22654, "fragment");
        C13465.m32966(str, "previousFragmentId");
        m5361(new C10742(componentCallbacksC22654, "Attempting to reuse fragment " + componentCallbacksC22654 + " with previous ID " + str));
        m5360(componentCallbacksC22654).getClass();
        EnumC23442 enumC23442 = EnumC23442.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m5369(ComponentCallbacksC22654 componentCallbacksC22654, ViewGroup viewGroup) {
        C13465.m32966(componentCallbacksC22654, "fragment");
        m5361(new C3767(componentCallbacksC22654, "Attempting to add fragment " + componentCallbacksC22654 + " to container " + viewGroup + " which is not a FragmentContainerView"));
        m5360(componentCallbacksC22654).getClass();
        EnumC23442 enumC23442 = EnumC23442.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14270 m5360(ComponentCallbacksC22654 componentCallbacksC22654) {
        while (componentCallbacksC22654 != null) {
            if (componentCallbacksC22654.isAdded()) {
                C13465.m32967(componentCallbacksC22654.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            componentCallbacksC22654 = componentCallbacksC22654.getParentFragment();
        }
        return f6310;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m5362(ComponentCallbacksC22654 componentCallbacksC22654, ViewGroup viewGroup) {
        m5361(new C9331(componentCallbacksC22654, "Attempting to use <fragment> tag to add fragment " + componentCallbacksC22654 + " to container " + viewGroup));
        m5360(componentCallbacksC22654).getClass();
        EnumC23442 enumC23442 = EnumC23442.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final void m5366(ComponentCallbacksC22654 componentCallbacksC22654) {
        m5361(new C2356(componentCallbacksC22654, "Attempting to set retain instance for fragment " + componentCallbacksC22654));
        m5360(componentCallbacksC22654).getClass();
        EnumC23442 enumC23442 = EnumC23442.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m5368(ComponentCallbacksC22654 componentCallbacksC22654) {
        m5361(new C2979(componentCallbacksC22654, "Attempting to get retain instance for fragment " + componentCallbacksC22654));
        m5360(componentCallbacksC22654).getClass();
        EnumC23442 enumC23442 = EnumC23442.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m5365(ComponentCallbacksC22654 componentCallbacksC22654, boolean z) {
        m5361(new C22113(componentCallbacksC22654, "Attempting to set user visible hint to " + z + " for fragment " + componentCallbacksC22654));
        m5360(componentCallbacksC22654).getClass();
        EnumC23442 enumC23442 = EnumC23442.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m5364(ComponentCallbacksC22654 componentCallbacksC22654, ComponentCallbacksC22654 componentCallbacksC22655, int i) {
        m5361(new C5179(componentCallbacksC22654, "Attempting to set target fragment " + componentCallbacksC22655 + " with request code " + i + " for fragment " + componentCallbacksC22654));
        m5360(componentCallbacksC22654).getClass();
        EnumC23442 enumC23442 = EnumC23442.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final void m5359(ComponentCallbacksC22654 componentCallbacksC22654) {
        m5361(new C13647(componentCallbacksC22654, "Attempting to get target fragment from fragment " + componentCallbacksC22654));
        m5360(componentCallbacksC22654).getClass();
        EnumC23442 enumC23442 = EnumC23442.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final void m5367(ComponentCallbacksC22654 componentCallbacksC22654) {
        m5361(new C4473(componentCallbacksC22654, "Attempting to get target request code from fragment " + componentCallbacksC22654));
        m5360(componentCallbacksC22654).getClass();
        EnumC23442 enumC23442 = EnumC23442.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5361(AbstractC12941 abstractC12941) {
        if (AbstractC8894.m23060(3)) {
            abstractC12941.m32058().getClass();
        }
    }
}
