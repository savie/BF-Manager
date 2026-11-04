package l;

import android.view.MenuItem;
import android.view.View;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ܽ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17859 implements InterfaceC5392, InterfaceC11838, InterfaceC17544, InterfaceC21436, ViewUtils.OnApplyWindowInsetsListener, InterfaceC14852 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58551;

    public /* synthetic */ C17859(Object obj) {
        this.f58551 = obj;
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public C3977 onApplyWindowInsets(View view, C3977 c3977, ViewUtils.RelativePadding relativePadding) {
        return ((SearchView) this.f58551).lambda$setUpToolbarInsetListener$4(view, c3977, relativePadding);
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        ViewOnLayoutChangeListenerC6673.m18646((ViewOnLayoutChangeListenerC6673) this.f58551, menuItem);
        return true;
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        ((C4248) this.f58551).mo16839(i);
    }

    @Override // l.InterfaceC11838
    /* JADX INFO: renamed from: ۙ */
    public void mo25302(long j, long j2) {
        C13132.m32622((C13132) this.f58551, j, j2);
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۤ */
    public /* synthetic */ boolean mo11630() {
        return false;
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۙ */
    public void mo11629(AbstractC11781 abstractC11781) {
        C4878 c4878 = (C4878) this.f58551;
        c4878.getClass();
        c4878.m14951((C19113) null, (C24550) abstractC11781);
    }

    @Override // l.InterfaceC5392
    /* JADX INFO: renamed from: ۙ */
    public void mo1772(AbstractC22044 abstractC22044) {
        C3259.m10632((C8614) this.f58551, abstractC22044);
    }
}
