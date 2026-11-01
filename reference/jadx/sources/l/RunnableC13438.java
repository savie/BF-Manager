package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.۬᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC13438 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44478;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44479;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44480;

    public /* synthetic */ RunnableC13438(int i, Object obj, Object obj2) {
        this.f44479 = i;
        this.f44480 = obj;
        this.f44478 = obj2;
    }

    public /* synthetic */ RunnableC13438(MenuItem menuItem, C6111 c6111) {
        this.f44479 = 2;
        this.f44478 = menuItem;
        this.f44480 = c6111;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44479) {
            case 0:
                C6111.m16664((C6111) this.f44480, (InterfaceC2916) this.f44478);
                break;
            case 1:
                C19271.m44221((C19271) this.f44480, (C10099) this.f44478);
                break;
            case 2:
                ((MenuItem) this.f44478).setChecked(((C6111) this.f44480).m17070() != 0);
                break;
            default:
                DialogInterfaceC19356 dialogInterfaceC19356 = (DialogInterfaceC19356) this.f44480;
                Runnable runnable = (Runnable) this.f44478;
                if (dialogInterfaceC19356.m44375()) {
                    dialogInterfaceC19356.dismiss();
                    runnable.run();
                }
                break;
        }
    }
}
