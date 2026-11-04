package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩷ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22237 implements InterfaceC9600, InterfaceC21436 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f71629;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71630;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71631;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71632;

    public /* synthetic */ C22237(C5829 c5829, C14406 c14406, C12915 c12915, C8614 c8614) {
        this.f71630 = c5829;
        this.f71632 = c14406;
        this.f71631 = c12915;
        this.f71629 = c8614;
    }

    public /* synthetic */ C22237(C15102 c15102, InterfaceC19845 interfaceC19845, C8614 c8614, C22829 c22829) {
        this.f71630 = c15102;
        this.f71632 = interfaceC19845;
        this.f71629 = c8614;
        this.f71631 = c22829;
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        C15102.m36364((C15102) this.f71630, (InterfaceC19845) this.f71632, this.f71629, (C22829) this.f71631, menuItem);
        return true;
    }

    @Override // l.InterfaceC9600
    /* JADX INFO: renamed from: ۙ */
    public void mo1839(C14406 c14406) {
        C5829.m17012((C5829) this.f71630, (C14406) this.f71632, (C12915) this.f71631, this.f71629, c14406);
    }
}
