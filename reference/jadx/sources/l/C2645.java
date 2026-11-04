package l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ۖۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2645 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13831 f8453;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C2645(C13831 c13831) {
        this.f8453 = c13831;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        C25227 c25227 = (C25227) this.f8453.f43905.findViewWithTag(C25227.TAG + tab.getPosition());
        if (c25227 != null) {
            c25227.scrollToPosition(0);
        }
    }
}
