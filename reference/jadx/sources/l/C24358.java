package l;

import android.transition.Transition;

/* JADX INFO: renamed from: l.᩺ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes.dex */
public final class C24358 extends C6458 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f79027;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f79028;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f79029;

    public C24358(C20981 c20981, C24947 c24947, boolean z, boolean z2) {
        Object exitTransition;
        Object enterTransition;
        boolean allowEnterTransitionOverlap;
        super(c20981, c24947);
        if (c20981.m47959() == EnumC14267.VISIBLE) {
            if (z) {
                enterTransition = c20981.m47964().getReenterTransition();
            } else {
                enterTransition = c20981.m47964().getEnterTransition();
            }
            this.f79028 = enterTransition;
            if (z) {
                allowEnterTransitionOverlap = c20981.m47964().getAllowReturnTransitionOverlap();
            } else {
                allowEnterTransitionOverlap = c20981.m47964().getAllowEnterTransitionOverlap();
            }
            this.f79027 = allowEnterTransitionOverlap;
        } else {
            if (z) {
                exitTransition = c20981.m47964().getReturnTransition();
            } else {
                exitTransition = c20981.m47964().getExitTransition();
            }
            this.f79028 = exitTransition;
            this.f79027 = true;
        }
        if (!z2) {
            this.f79029 = null;
        } else if (z) {
            this.f79029 = c20981.m47964().getSharedElementReturnTransition();
        } else {
            this.f79029 = c20981.m47964().getSharedElementEnterTransition();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Object m54430() {
        return this.f79028;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m54428() {
        return this.f79027;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m54429() {
        return this.f79029 != null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object m54431() {
        return this.f79029;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC11284 m54432() {
        Object obj = this.f79028;
        AbstractC11284 abstractC11284M54427 = m54427(obj);
        Object obj2 = this.f79029;
        AbstractC11284 abstractC11284M54428 = m54427(obj2);
        if (abstractC11284M54427 == null || abstractC11284M54428 == null || abstractC11284M54427 == abstractC11284M54428) {
            return abstractC11284M54427 != null ? abstractC11284M54427 : abstractC11284M54428;
        }
        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m18240().m47964() + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC11284 m54427(Object obj) {
        if (obj == null) {
            return null;
        }
        AbstractC11284 abstractC11284 = C21727.f69327;
        if (abstractC11284 != null && (obj instanceof Transition)) {
            return abstractC11284;
        }
        AbstractC11284 abstractC11285 = C21727.f69328;
        if (abstractC11285 != null && abstractC11285.mo35(obj)) {
            return abstractC11285;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + m18240().m47964() + " is not a valid framework Transition or AndroidX Transition");
    }
}
