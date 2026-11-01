package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.۠ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8063 implements InterfaceC20892, InterfaceC22091, InterfaceC1293 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f28276;

    public /* synthetic */ C8063(Object obj) {
        this.f28276 = obj;
    }

    @Override // l.InterfaceC1293
    public boolean onMenuItemClick(MenuItem menuItem) {
        ((ActivityC11632) this.f28276).m29015(menuItem);
        return true;
    }

    @Override // l.InterfaceC20892
    /* JADX INFO: renamed from: ۙ */
    public Object mo1795(Object obj, Throwable th) {
        return C14393.m34625((Throwable) this.f28276, th);
    }

    @Override // l.InterfaceC22091
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo21236(boolean z) {
        ((C6919) this.f28276).m18555(z);
    }
}
