package l;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ۜۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final class C6887 extends TabLayout.ViewPagerOnTabSelectedListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25093 f22847;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6887(C25093 c25093, C15179 c15179) {
        super(c15179);
        this.f22847 = c25093;
    }

    @Override // com.google.android.material.tabs.TabLayout.ViewPagerOnTabSelectedListener, com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        C25093 c25093 = this.f22847;
        if (c25093.f81142.m36517() != tab.getPosition()) {
            c25093.f81142.m36512(tab.getPosition(), true);
        }
    }
}
