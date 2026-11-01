package l;

import android.view.MenuItem;
import com.google.android.material.search.SearchBar;

/* JADX INFO: renamed from: l.ۢ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9285 implements InterfaceC17152, InterfaceC9229, InterfaceC8203, InterfaceC20439, InterfaceC23605 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31543;

    public /* synthetic */ C9285(Object obj) {
        this.f31543 = obj;
    }

    @Override // l.InterfaceC9229
    public void onMenuItemClick(MenuItem menuItem) {
        C13026.m32207((C13026) this.f31543, menuItem);
    }

    @Override // l.InterfaceC23605
    public void onTouchExplorationStateChanged(boolean z) {
        ((SearchBar) this.f31543).lambda$new$0(z);
    }

    @Override // l.InterfaceC8203
    /* JADX INFO: renamed from: ۙ */
    public void mo21492(long j, long j2) {
        C8909.m23176((C8909) this.f31543, j, j2);
    }

    @Override // l.InterfaceC20439
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC21850 mo23828(int i) {
        return ((AbstractC20745[]) this.f31543)[i].mo33966("r");
    }
}
