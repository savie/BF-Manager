package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.۫֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC12069 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40398;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f40399;

    public /* synthetic */ DialogInterfaceOnClickListenerC12069(int i, Object obj) {
        this.f40398 = i;
        this.f40399 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f40398;
        Object obj = this.f40399;
        switch (i2) {
            case 0:
                int i3 = ActivityC13125.f43708;
                ((ActivityC13125) obj).finish();
                break;
            case 1:
                AbstractActivityC5788.m15949((AbstractActivityC5788) obj);
                break;
            default:
                ((DialogInterfaceOnClickListenerC8128) obj).m21412(false);
                break;
        }
    }
}
