package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ᩳ֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes5.dex */
public final class C18734 extends C7787 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f60890 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ViewGroup f60891;

    public C18734(ViewGroup viewGroup) {
        this.f60891 = viewGroup;
    }

    @Override // l.C7787, l.InterfaceC12261
    public final void onTransitionCancel(AbstractC0329 abstractC0329) {
        C12811.m31773(this.f60891, false);
        this.f60890 = true;
    }

    @Override // l.C7787, l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329) {
        if (!this.f60890) {
            C12811.m31773(this.f60891, false);
        }
        abstractC0329.removeListener(this);
    }

    @Override // l.C7787, l.InterfaceC12261
    public final void onTransitionPause(AbstractC0329 abstractC0329) {
        C12811.m31773(this.f60891, false);
    }

    @Override // l.C7787, l.InterfaceC12261
    public final void onTransitionResume(AbstractC0329 abstractC0329) {
        C12811.m31773(this.f60891, true);
    }
}
