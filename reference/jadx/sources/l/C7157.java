package l;

import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ۜ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes4.dex */
public final class C7157 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16597 f23657;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f23658;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f23659;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f23660;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C7157(ActivityC16597 activityC16597, TabLayout.Tab tab, TabLayout.Tab tab2, TabLayout.Tab tab3) {
        this.f23657 = activityC16597;
        this.f23659 = tab;
        this.f23658 = tab2;
        this.f23660 = tab3;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        TabLayout.Tab tab2 = this.f23659;
        ActivityC16597 activityC16597 = this.f23657;
        if (tab == tab2) {
            activityC16597.f53686.m4737(0);
            if (activityC16597.f53686.m4748()) {
                return;
            }
            C22673.m51157();
            return;
        }
        if (tab == this.f23658) {
            activityC16597.f53686.m4737(1);
            if (activityC16597.f53686.m4748()) {
                return;
            }
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        if (tab == this.f23660) {
            activityC16597.f53686.m4737(2);
            if (activityC16597.f53686.m4748()) {
                return;
            }
            C22673.m51157();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        ActivityC16597 activityC16597 = this.f23657;
        activityC16597.f53686.m4745(!activityC16597.f53686.m4735());
    }
}
