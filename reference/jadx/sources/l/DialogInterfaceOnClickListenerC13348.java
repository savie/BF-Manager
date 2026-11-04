package l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.۫᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC13348 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42561;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42562;

    public /* synthetic */ DialogInterfaceOnClickListenerC13348(int i, Object obj) {
        this.f42561 = i;
        this.f42562 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f42561;
        Object obj = this.f42562;
        switch (i2) {
            case 0:
                boolean z = ActivityC22957.f74567;
                ((ActivityC22957) obj).finish();
                break;
            case 1:
                DialogInterfaceOnClickListenerC14300.m34711((DialogInterfaceOnClickListenerC14300) obj, dialogInterface, i);
                break;
            case 2:
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) obj;
                abstractActivityC17204.startActivity(new Intent(abstractActivityC17204, (Class<?>) ActivityC6138.class));
                break;
            default:
                C19272.m44608((C19272) obj, i);
                break;
        }
    }
}
