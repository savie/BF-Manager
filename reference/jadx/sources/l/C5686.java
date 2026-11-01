package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۚ᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes3.dex */
public final class C5686 extends C2592 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f19403 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f19404;

    public C5686(ViewGroup viewGroup) {
        this.f19404 = viewGroup;
    }

    @Override // l.C2592, l.InterfaceC24031
    public final void onTransitionCancel(AbstractC11766 abstractC11766) {
        C10355.m26251(this.f19404, false);
        this.f19403 = true;
    }

    @Override // l.C2592, l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766) {
        if (!this.f19403) {
            C10355.m26251(this.f19404, false);
        }
        abstractC11766.removeListener(this);
    }

    @Override // l.C2592, l.InterfaceC24031
    public final void onTransitionPause(AbstractC11766 abstractC11766) {
        C10355.m26251(this.f19404, false);
    }

    @Override // l.C2592, l.InterfaceC24031
    public final void onTransitionResume(AbstractC11766 abstractC11766) {
        C10355.m26251(this.f19404, true);
    }
}
