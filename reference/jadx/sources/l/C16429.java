package l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ܽۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes5.dex */
public final class C16429 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19749 f52850;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C16429(ActivityC19749 activityC19749) {
        this.f52850 = activityC19749;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        this.f52850.f63467.mo23642(Integer.valueOf(tab.getPosition()));
    }
}
