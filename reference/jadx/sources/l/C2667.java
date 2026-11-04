package l;

import android.content.DialogInterface;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۖ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2667 implements InterfaceC16438 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8487;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8488;

    public /* synthetic */ C2667(int i, Object obj) {
        this.f8487 = i;
        this.f8488 = obj;
    }

    @Override // l.InterfaceC16438
    /* JADX INFO: renamed from: ۙ */
    public final void mo1486(Object obj) {
        switch (this.f8487) {
            case 0:
                ((ActivityC0848) this.f8488).m40401((Throwable) obj, (DialogInterface.OnDismissListener) null);
                break;
            default:
                ((MenuItem) this.f8488).setEnabled(((Boolean) obj).booleanValue());
                break;
        }
    }
}
