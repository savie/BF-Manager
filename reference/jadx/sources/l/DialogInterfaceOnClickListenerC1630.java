package l;

import android.content.DialogInterface;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.֫ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC1630 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6541;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6542;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6543;

    public /* synthetic */ DialogInterfaceOnClickListenerC1630(int i, Object obj, Object obj2) {
        this.f6542 = i;
        this.f6543 = obj;
        this.f6541 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f6542;
        Object obj = this.f6541;
        Object obj2 = this.f6543;
        switch (i2) {
            case 0:
                int i3 = ActivityC5677.f19358;
                ((boolean[]) obj2)[0] = false;
                ((CountDownLatch) obj).countDown();
                break;
            default:
                ViewOnClickListenerC3520.m10366((ViewOnClickListenerC3520) obj2, (C11381) obj);
                break;
        }
    }
}
