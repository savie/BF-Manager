package l;

import android.transition.Transition;

/* JADX INFO: renamed from: l.ܺ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16220 extends C21158 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f52341;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f52342;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f52343;

    public C16220(C16386 c16386, C0921 c0921, boolean z, boolean z2) {
        Object exitTransition;
        Object enterTransition;
        boolean allowEnterTransitionOverlap;
        super(c16386, c0921);
        if (c16386.m38577() == EnumC0157.VISIBLE) {
            if (z) {
                enterTransition = c16386.m38571().getReenterTransition();
            } else {
                enterTransition = c16386.m38571().getEnterTransition();
            }
            this.f52342 = enterTransition;
            if (z) {
                allowEnterTransitionOverlap = c16386.m38571().getAllowReturnTransitionOverlap();
            } else {
                allowEnterTransitionOverlap = c16386.m38571().getAllowEnterTransitionOverlap();
            }
            this.f52343 = allowEnterTransitionOverlap;
        } else {
            if (z) {
                exitTransition = c16386.m38571().getReturnTransition();
            } else {
                exitTransition = c16386.m38571().getExitTransition();
            }
            this.f52342 = exitTransition;
            this.f52343 = true;
        }
        if (!z2) {
            this.f52341 = null;
        } else if (z) {
            this.f52341 = c16386.m38571().getSharedElementReturnTransition();
        } else {
            this.f52341 = c16386.m38571().getSharedElementEnterTransition();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Object m38331() {
        return this.f52342;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m38332() {
        return this.f52343;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m38334() {
        return this.f52341 != null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object m38335() {
        return this.f52341;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC14975 m38333() {
        Object obj = this.f52342;
        AbstractC14975 abstractC14975M38330 = m38330(obj);
        Object obj2 = this.f52341;
        AbstractC14975 abstractC14975M38331 = m38330(obj2);
        if (abstractC14975M38330 == null || abstractC14975M38331 == null || abstractC14975M38330 == abstractC14975M38331) {
            return abstractC14975M38330 != null ? abstractC14975M38330 : abstractC14975M38331;
        }
        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m47612().m38571() + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC14975 m38330(Object obj) {
        if (obj == null) {
            return null;
        }
        AbstractC14975 abstractC14975 = C2273.f8120;
        if (abstractC14975 != null && (obj instanceof Transition)) {
            return abstractC14975;
        }
        AbstractC14975 abstractC14976 = C2273.f8121;
        if (abstractC14976 != null && abstractC14976.mo34(obj)) {
            return abstractC14976;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + m47612().m38571() + " is not a valid framework Transition or AndroidX Transition");
    }
}
