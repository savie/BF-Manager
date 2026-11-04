package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۚ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC5891 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20177;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20178;

    public /* synthetic */ DialogInterfaceOnClickListenerC5891(int i, Object obj) {
        this.f20177 = i;
        this.f20178 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f20177;
        Object obj = this.f20178;
        switch (i2) {
            case 0:
                boolean z = ActivityC22957.f74567;
                ((ActivityC22957) obj).finish();
                break;
            case 1:
                int i3 = ActivityC22597.f73044;
                ((ActivityC22597) obj).finish();
                break;
            case 2:
                AbstractActivityC22047.m49885((AbstractActivityC22047) obj);
                break;
            case 3:
                ((DialogInterfaceOnClickListenerC14300) obj).m34722(false);
                break;
            default:
                C19272.m44612((C19272) obj);
                break;
        }
    }
}
