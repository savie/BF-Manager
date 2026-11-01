package l;

import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: renamed from: l.ܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class ActionProviderVisibilityListenerC14535 extends AbstractC5674 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ActionProvider f47597;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MenuItemC4386 f47598;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC2851 f47599;

    public ActionProviderVisibilityListenerC14535(MenuItemC4386 menuItemC4386, ActionProvider actionProvider) {
        this.f47598 = menuItemC4386;
        this.f47597 = actionProvider;
    }

    @Override // l.AbstractC5674
    /* JADX INFO: renamed from: ۙ */
    public final View mo15565(C23707 c23707) {
        return this.f47597.onCreateActionView(c23707);
    }

    @Override // l.AbstractC5674
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo15569() {
        return this.f47597.overridesItemVisibility();
    }

    @Override // l.AbstractC5674
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo15571() {
        return this.f47597.isVisible();
    }

    @Override // l.AbstractC5674
    /* JADX INFO: renamed from: ۙ */
    public final void mo15566(InterfaceC2851 interfaceC2851) {
        this.f47599 = interfaceC2851;
        this.f47597.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        InterfaceC2851 interfaceC2851 = this.f47599;
        if (interfaceC2851 != null) {
            C23707 c23707 = ((C11007) interfaceC2851).f37432;
            c23707.f76714.onItemVisibleChanged(c23707);
        }
    }

    @Override // l.AbstractC5674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo15564() {
        return this.f47597.onPerformDefaultAction();
    }

    @Override // l.AbstractC5674
    /* JADX INFO: renamed from: ۨ */
    public final View mo15570() {
        return this.f47597.onCreateActionView();
    }

    @Override // l.AbstractC5674
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15568() {
        return this.f47597.hasSubMenu();
    }

    @Override // l.AbstractC5674
    /* JADX INFO: renamed from: ۙ */
    public final void mo15567(SubMenuC7915 subMenuC7915) {
        this.f47597.onPrepareSubMenu(this.f47598.m36509(subMenuC7915));
    }
}
