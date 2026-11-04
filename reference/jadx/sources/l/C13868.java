package l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.۬۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13868 implements InterfaceC0554 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16597 f43987;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f43988;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout f43989;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f43990;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f43991;

    public C13868(ActivityC16597 activityC16597, TabLayout tabLayout, TabLayout.Tab tab, TabLayout.Tab tab2, TabLayout.Tab tab3) {
        this.f43987 = activityC16597;
        this.f43989 = tabLayout;
        this.f43990 = tab;
        this.f43988 = tab2;
        this.f43991 = tab3;
    }

    @Override // l.InterfaceC0554
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2563(C24421 c24421) {
        mo2560(c24421);
    }

    @Override // l.InterfaceC0554
    /* JADX INFO: renamed from: ۙ */
    public final void mo2560(C24421 c24421) {
        ActivityC16597 activityC16597 = this.f43987;
        activityC16597.f53692 = c24421;
        activityC16597.m39272();
    }

    @Override // l.InterfaceC0554
    /* JADX INFO: renamed from: ۙ */
    public final void mo2562(boolean z, boolean z2) {
        ActivityC16597 activityC16597 = this.f43987;
        if (activityC16597.f53691 != null) {
            activityC16597.f53691.setEnabled(z);
        }
        if (activityC16597.f53689 != null) {
            activityC16597.f53689.setEnabled(z2);
        }
    }

    @Override // l.InterfaceC0554
    /* JADX INFO: renamed from: ۙ */
    public final void mo2559(int i) {
        TabLayout tabLayout = this.f43989;
        if (i == 0) {
            tabLayout.selectTab(this.f43990);
        } else if (i == 1) {
            tabLayout.selectTab(this.f43988);
        } else {
            if (i != 2) {
                return;
            }
            tabLayout.selectTab(this.f43991);
        }
    }

    @Override // l.InterfaceC0554
    /* JADX INFO: renamed from: ۙ */
    public final void mo2561(boolean z) {
        ActivityC16597 activityC16597 = this.f43987;
        activityC16597.f56046.setSubtitle(z ? activityC16597.f53690 : activityC16597.f53694);
        if (activityC16597.f53687 != null) {
            activityC16597.f53687.setEnabled(z);
        }
    }
}
