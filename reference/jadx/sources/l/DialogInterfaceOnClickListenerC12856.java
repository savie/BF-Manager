package l;

import android.content.DialogInterface;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.۬ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC12856 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42764;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42765;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42766;

    public /* synthetic */ DialogInterfaceOnClickListenerC12856(int i, Object obj, Object obj2) {
        this.f42765 = i;
        this.f42766 = obj;
        this.f42764 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f42765) {
            case 0:
                ActivityC4471.m12455((ActivityC4471) this.f42766, (MenuItem) this.f42764);
                break;
            default:
                C14063.m34010((C14063) this.f42766, (String) this.f42764);
                break;
        }
    }
}
