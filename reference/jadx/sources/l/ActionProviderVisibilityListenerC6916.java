package l;

import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: renamed from: l.ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes3.dex */
public final class ActionProviderVisibilityListenerC6916 extends AbstractC15227 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ActionProvider f22915;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MenuItemC10534 f22916;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC19703 f22917;

    public ActionProviderVisibilityListenerC6916(MenuItemC10534 menuItemC10534, ActionProvider actionProvider) {
        this.f22916 = menuItemC10534;
        this.f22915 = actionProvider;
    }

    @Override // l.AbstractC15227
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View mo19193(C8407 c8407) {
        return this.f22915.onCreateActionView(c8407);
    }

    @Override // l.AbstractC15227
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo19198() {
        return this.f22915.overridesItemVisibility();
    }

    @Override // l.AbstractC15227
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo19199() {
        return this.f22915.isVisible();
    }

    @Override // l.AbstractC15227
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19195(InterfaceC19703 interfaceC19703) {
        this.f22917 = interfaceC19703;
        this.f22915.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        InterfaceC19703 interfaceC19703 = this.f22917;
        if (interfaceC19703 != null) {
            C8407 c8407 = ((C2441) interfaceC19703).f7822;
            c8407.f27552.onItemVisibleChanged(c8407);
        }
    }

    @Override // l.AbstractC15227
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo19200() {
        return this.f22915.onPerformDefaultAction();
    }

    @Override // l.AbstractC15227
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View mo19197() {
        return this.f22915.onCreateActionView();
    }

    @Override // l.AbstractC15227
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19196() {
        return this.f22915.hasSubMenu();
    }

    @Override // l.AbstractC15227
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19194(SubMenuC12026 subMenuC12026) {
        this.f22915.onPrepareSubMenu(this.f22916.m37832(subMenuC12026));
    }
}
