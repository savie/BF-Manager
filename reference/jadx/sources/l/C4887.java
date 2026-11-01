package l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ۙ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes3.dex */
public final class C4887 implements InterfaceC10729 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f17167;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15472 f17168;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout f17169;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f17170;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f17171;

    public C4887(ActivityC15472 activityC15472, TabLayout tabLayout, TabLayout.Tab tab, TabLayout.Tab tab2, TabLayout.Tab tab3) {
        this.f17168 = activityC15472;
        this.f17169 = tabLayout;
        this.f17171 = tab;
        this.f17170 = tab2;
        this.f17167 = tab3;
    }

    @Override // l.InterfaceC10729
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo13611(C16373 c16373) {
        mo13608(c16373);
    }

    @Override // l.InterfaceC10729
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13608(C16373 c16373) {
        ActivityC15472 activityC15472 = this.f17168;
        activityC15472.f50408 = c16373;
        activityC15472.m37003();
    }

    @Override // l.InterfaceC10729
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13610(boolean z, boolean z2) {
        ActivityC15472 activityC15472 = this.f17168;
        if (activityC15472.f50417 != null) {
            activityC15472.f50417.setEnabled(z);
        }
        if (activityC15472.f50418 != null) {
            activityC15472.f50418.setEnabled(z2);
        }
    }

    @Override // l.InterfaceC10729
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13607(int i) {
        TabLayout tabLayout = this.f17169;
        if (i == 0) {
            tabLayout.selectTab(this.f17171);
        } else if (i == 1) {
            tabLayout.selectTab(this.f17170);
        } else {
            if (i != 2) {
                return;
            }
            tabLayout.selectTab(this.f17167);
        }
    }

    @Override // l.InterfaceC10729
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13609(boolean z) {
        ActivityC15472 activityC15472 = this.f17168;
        activityC15472.f41645.setSubtitle(z ? activityC15472.f50410 : activityC15472.f50420);
        if (activityC15472.f50415 != null) {
            activityC15472.f50415.setEnabled(z);
        }
    }
}
