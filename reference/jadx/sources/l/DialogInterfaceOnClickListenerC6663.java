package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۛ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6663 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22219;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22220;

    public /* synthetic */ DialogInterfaceOnClickListenerC6663(int i, Object obj) {
        this.f22219 = i;
        this.f22220 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f22219;
        Object obj = this.f22220;
        switch (i2) {
            case 0:
                ((ViewOnClickListenerC19341) obj).m44734(true);
                break;
            case 1:
                ((ActivityC18143) obj).m42298(true);
                break;
            default:
                int i3 = ActivityC5440.f18993;
                ((int[]) obj)[0] = i;
                break;
        }
    }
}
