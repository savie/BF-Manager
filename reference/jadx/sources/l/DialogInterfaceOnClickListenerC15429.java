package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܶ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC15429 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50283;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50284;

    public /* synthetic */ DialogInterfaceOnClickListenerC15429(int i, Object obj) {
        this.f50283 = i;
        this.f50284 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f50283;
        Object obj = this.f50284;
        switch (i2) {
            case 0:
                int i3 = AbstractActivityC10490.f35934;
                ((AbstractActivityC10490) obj).finish();
                break;
            case 1:
                ((C2084) obj).f7699 = i;
                break;
            default:
                ((ActivityC11632) obj).m29017(false);
                break;
        }
    }
}
