package l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.֡֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes3.dex */
public final class C0095 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16324 f1022;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }

    public C0095(C16324 c16324) {
        this.f1022 = c16324;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        C17492 c17492 = (C17492) this.f1022.f52568.findViewWithTag(C17492.TAG + tab.getPosition());
        if (c17492 != null) {
            c17492.scrollToPosition(0);
        }
    }
}
