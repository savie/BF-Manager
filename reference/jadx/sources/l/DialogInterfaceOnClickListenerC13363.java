package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.۬᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC13363 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44287;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44288;

    public /* synthetic */ DialogInterfaceOnClickListenerC13363(int i, Object obj) {
        this.f44287 = i;
        this.f44288 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f44287;
        Object obj = this.f44288;
        switch (i2) {
            case 0:
                int i3 = ActivityC7718.f25530;
                ((ActivityC7718) obj).finish();
                break;
            default:
                C8909.m23175((C8909) obj, i);
                break;
        }
    }
}
