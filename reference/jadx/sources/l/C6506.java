package l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ۛܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes3.dex */
public final class C6506 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24406 f21846;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C6506(C24406 c24406) {
        this.f21846 = c24406;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        C25227 c25227 = (C25227) this.f21846.f79202.findViewWithTag(C25227.TAG + tab.getPosition());
        if (c25227 != null) {
            c25227.scrollToPosition(0);
        }
    }
}
