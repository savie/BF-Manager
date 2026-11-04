package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩶ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 23U2 */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class AbstractC21091 extends AbstractC6274 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC3191 f67372;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f67373;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC4573 f67375 = null;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ComponentCallbacksC11612 f67374 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f67371 = 1;

    /* JADX INFO: renamed from: ᩷ */
    public abstract ComponentCallbacksC11612 mo4255(int i);

    public AbstractC21091(AbstractC3191 abstractC3191) {
        this.f67372 = abstractC3191;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final void mo17945(C15179 c15179) {
        if (c15179.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2997(C15179 c15179, int i) {
        AbstractC4573 abstractC4573 = this.f67375;
        AbstractC3191 abstractC3191 = this.f67372;
        if (abstractC4573 == null) {
            abstractC3191.getClass();
            this.f67375 = new C22120(abstractC3191);
        }
        long j = i;
        ComponentCallbacksC11612 componentCallbacksC11612M10493 = abstractC3191.m10493("android:switcher:" + c15179.getId() + ":" + j);
        if (componentCallbacksC11612M10493 != null) {
            this.f67375.m14356(componentCallbacksC11612M10493);
        } else {
            componentCallbacksC11612M10493 = mo4255(i);
            this.f67375.mo14354(c15179.getId(), componentCallbacksC11612M10493, "android:switcher:" + c15179.getId() + ":" + j, 1);
        }
        if (componentCallbacksC11612M10493 != this.f67374) {
            componentCallbacksC11612M10493.setMenuVisibility(false);
            if (this.f67371 == 1) {
                this.f67375.mo14349(componentCallbacksC11612M10493, EnumC2619.STARTED);
                return componentCallbacksC11612M10493;
            }
            componentCallbacksC11612M10493.setUserVisibleHint(false);
        }
        return componentCallbacksC11612M10493;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final void mo2998(C15179 c15179, int i, Object obj) {
        ComponentCallbacksC11612 componentCallbacksC11612 = (ComponentCallbacksC11612) obj;
        if (this.f67375 == null) {
            AbstractC3191 abstractC3191 = this.f67372;
            abstractC3191.getClass();
            this.f67375 = new C22120(abstractC3191);
        }
        this.f67375.mo14365(componentCallbacksC11612);
        if (componentCallbacksC11612.equals(this.f67374)) {
            this.f67374 = null;
        }
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final void mo17944(Object obj) {
        ComponentCallbacksC11612 componentCallbacksC11612 = (ComponentCallbacksC11612) obj;
        ComponentCallbacksC11612 componentCallbacksC11613 = this.f67374;
        if (componentCallbacksC11612 != componentCallbacksC11613) {
            AbstractC3191 abstractC3191 = this.f67372;
            int i = this.f67371;
            if (componentCallbacksC11613 != null) {
                componentCallbacksC11613.setMenuVisibility(false);
                if (i == 1) {
                    if (this.f67375 == null) {
                        abstractC3191.getClass();
                        this.f67375 = new C22120(abstractC3191);
                    }
                    this.f67375.mo14349(this.f67374, EnumC2619.STARTED);
                } else {
                    this.f67374.setUserVisibleHint(false);
                }
            }
            componentCallbacksC11612.setMenuVisibility(true);
            if (i == 1) {
                if (this.f67375 == null) {
                    abstractC3191.getClass();
                    this.f67375 = new C22120(abstractC3191);
                }
                this.f67375.mo14349(componentCallbacksC11612, EnumC2619.RESUMED);
            } else {
                componentCallbacksC11612.setUserVisibleHint(true);
            }
            this.f67374 = componentCallbacksC11612;
        }
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final void mo17942() {
        AbstractC4573 abstractC4573 = this.f67375;
        if (abstractC4573 != null) {
            if (!this.f67373) {
                try {
                    this.f67373 = true;
                    C22120 c22120 = (C22120) abstractC4573;
                    if (c22120.f16263) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    c22120.f16273 = false;
                    c22120.f71289.m10457(c22120, true);
                    this.f67373 = false;
                } catch (Throwable th) {
                    this.f67373 = false;
                    throw th;
                }
            }
            this.f67375 = null;
        }
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2999(View view, Object obj) {
        return ((ComponentCallbacksC11612) obj).getView() == view;
    }
}
