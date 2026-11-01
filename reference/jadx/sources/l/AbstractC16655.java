package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܽ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 23U2 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class AbstractC16655 extends AbstractC14217 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC8894 f53402;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC11447 f53403 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ComponentCallbacksC22654 f53404 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f53405 = 1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f53406;

    /* JADX INFO: renamed from: ܰ */
    public abstract ComponentCallbacksC22654 mo33254(int i);

    public AbstractC16655(AbstractC8894 abstractC8894) {
        this.f53402 = abstractC8894;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final void mo34321(C19383 c19383) {
        if (c19383.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4242(C19383 c19383, int i) {
        AbstractC11447 abstractC11447 = this.f53403;
        AbstractC8894 abstractC8894 = this.f53402;
        if (abstractC11447 == null) {
            abstractC8894.getClass();
            this.f53403 = new C2813(abstractC8894);
        }
        long j = i;
        ComponentCallbacksC22654 componentCallbacksC22654M23119 = abstractC8894.m23119("android:switcher:" + c19383.getId() + ":" + j);
        if (componentCallbacksC22654M23119 != null) {
            this.f53403.m28565(componentCallbacksC22654M23119);
        } else {
            componentCallbacksC22654M23119 = mo33254(i);
            this.f53403.mo8555(c19383.getId(), componentCallbacksC22654M23119, "android:switcher:" + c19383.getId() + ":" + j, 1);
        }
        if (componentCallbacksC22654M23119 != this.f53404) {
            componentCallbacksC22654M23119.setMenuVisibility(false);
            if (this.f53405 == 1) {
                this.f53403.mo8553(componentCallbacksC22654M23119, EnumC9414.STARTED);
                return componentCallbacksC22654M23119;
            }
            componentCallbacksC22654M23119.setUserVisibleHint(false);
        }
        return componentCallbacksC22654M23119;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final void mo4243(C19383 c19383, int i, Object obj) {
        ComponentCallbacksC22654 componentCallbacksC22654 = (ComponentCallbacksC22654) obj;
        if (this.f53403 == null) {
            AbstractC8894 abstractC8894 = this.f53402;
            abstractC8894.getClass();
            this.f53403 = new C2813(abstractC8894);
        }
        this.f53403.mo8562(componentCallbacksC22654);
        if (componentCallbacksC22654.equals(this.f53404)) {
            this.f53404 = null;
        }
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final void mo34320(Object obj) {
        ComponentCallbacksC22654 componentCallbacksC22654 = (ComponentCallbacksC22654) obj;
        ComponentCallbacksC22654 componentCallbacksC22655 = this.f53404;
        if (componentCallbacksC22654 != componentCallbacksC22655) {
            AbstractC8894 abstractC8894 = this.f53402;
            int i = this.f53405;
            if (componentCallbacksC22655 != null) {
                componentCallbacksC22655.setMenuVisibility(false);
                if (i == 1) {
                    if (this.f53403 == null) {
                        abstractC8894.getClass();
                        this.f53403 = new C2813(abstractC8894);
                    }
                    this.f53403.mo8553(this.f53404, EnumC9414.STARTED);
                } else {
                    this.f53404.setUserVisibleHint(false);
                }
            }
            componentCallbacksC22654.setMenuVisibility(true);
            if (i == 1) {
                if (this.f53403 == null) {
                    abstractC8894.getClass();
                    this.f53403 = new C2813(abstractC8894);
                }
                this.f53403.mo8553(componentCallbacksC22654, EnumC9414.RESUMED);
            } else {
                componentCallbacksC22654.setUserVisibleHint(true);
            }
            this.f53404 = componentCallbacksC22654;
        }
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final void mo34318() {
        AbstractC11447 abstractC11447 = this.f53403;
        if (abstractC11447 != null) {
            if (!this.f53406) {
                try {
                    this.f53406 = true;
                    C2813 c2813 = (C2813) abstractC11447;
                    if (c2813.f38513) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    c2813.f38519 = false;
                    c2813.f10690.m23084(c2813, true);
                    this.f53406 = false;
                } catch (Throwable th) {
                    this.f53406 = false;
                    throw th;
                }
            }
            this.f53403 = null;
        }
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4244(View view, Object obj) {
        return ((ComponentCallbacksC22654) obj).getView() == view;
    }
}
