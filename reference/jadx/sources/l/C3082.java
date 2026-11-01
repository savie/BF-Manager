package l;

import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ۗ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes3.dex */
public final class C3082 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f11658;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15472 f11659;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f11660;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TabLayout.Tab f11661;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C3082(ActivityC15472 activityC15472, TabLayout.Tab tab, TabLayout.Tab tab2, TabLayout.Tab tab3) {
        this.f11659 = activityC15472;
        this.f11661 = tab;
        this.f11660 = tab2;
        this.f11658 = tab3;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        TabLayout.Tab tab2 = this.f11661;
        ActivityC15472 activityC15472 = this.f11659;
        if (tab == tab2) {
            activityC15472.f50419.m23924(0);
            if (activityC15472.f50419.m23920()) {
                return;
            }
            C15829.m37616();
            return;
        }
        if (tab == this.f11660) {
            activityC15472.f50419.m23924(1);
            if (activityC15472.f50419.m23920()) {
                return;
            }
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        if (tab == this.f11658) {
            activityC15472.f50419.m23924(2);
            if (activityC15472.f50419.m23920()) {
                return;
            }
            C15829.m37616();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        ActivityC15472 activityC15472 = this.f11659;
        activityC15472.f50419.m23933(!activityC15472.f50419.m23922());
    }
}
