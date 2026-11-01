package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֡ۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0221 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1401;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1402;

    public /* synthetic */ DialogInterfaceOnClickListenerC0221(int i, Object obj) {
        this.f1401 = i;
        this.f1402 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f1401;
        Object obj = this.f1402;
        switch (i2) {
            case 0:
                DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128 = (DialogInterfaceOnClickListenerC8128) obj;
                C3872.m11210(dialogInterfaceOnClickListenerC8128.f28458.m28824(), dialogInterfaceOnClickListenerC8128.f28457, dialogInterfaceOnClickListenerC8128.f28459.m42535());
                break;
            case 1:
                int i3 = AbstractActivityC5788.f19654;
                ((AbstractActivityC5788) obj).finish();
                break;
            default:
                ViewOnLayoutChangeListenerC3333.m9901((ViewOnLayoutChangeListenerC3333) obj);
                break;
        }
    }
}
