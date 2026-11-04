package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۘۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3994 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13658;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13659;

    public /* synthetic */ DialogInterfaceOnClickListenerC3994(int i, Object obj) {
        this.f13658 = i;
        this.f13659 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f13658;
        Object obj = this.f13659;
        switch (i2) {
            case 0:
                ((Runnable) obj).run();
                break;
            default:
                int i3 = ViewOnClickListenerC13408.f42716;
                C24509.m54772((String) obj);
                break;
        }
    }
}
