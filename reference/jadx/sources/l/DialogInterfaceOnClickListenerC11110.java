package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC11110 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35026;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35027;

    public /* synthetic */ DialogInterfaceOnClickListenerC11110(int i, Object obj) {
        this.f35026 = i;
        this.f35027 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f35026;
        Object obj = this.f35027;
        switch (i2) {
            case 0:
                boolean z = ActivityC22957.f74567;
                C21576.m49067((CharSequence) ((C4072) obj).m13151().m46860());
                break;
            default:
                ((C0168) obj).f1220 = i;
                break;
        }
    }
}
