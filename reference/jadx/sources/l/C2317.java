package l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ۖۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2317 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0906 f8239;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C2317(C0906 c0906) {
        this.f8239 = c0906;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        C17492 c17492 = (C17492) this.f8239.f3638.findViewWithTag(C17492.TAG + tab.getPosition());
        if (c17492 != null) {
            c17492.scrollToPosition(0);
        }
    }
}
