package l;

import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ᩴܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC18814 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60979;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f60980;

    public /* synthetic */ DialogInterfaceOnDismissListenerC18814(Context context, int i) {
        this.f60979 = i;
        this.f60980 = context;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.f60979;
        Context context = this.f60980;
        switch (i) {
            case 0:
                int i2 = ServiceC12465.f41556;
                ((AbstractActivityC12483) context).finish();
                break;
            default:
                C16125.m38161(context);
                break;
        }
    }
}
