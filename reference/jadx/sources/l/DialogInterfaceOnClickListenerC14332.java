package l;

import android.content.DialogInterface;
import android.widget.CheckBox;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.ܳۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC14332 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46953;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46954;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46955;

    public /* synthetic */ DialogInterfaceOnClickListenerC14332(int i, Object obj, Object obj2) {
        this.f46954 = i;
        this.f46955 = obj;
        this.f46953 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f46954;
        Object obj = this.f46953;
        Object obj2 = this.f46955;
        switch (i2) {
            case 0:
                int i3 = ActivityC5677.f19358;
                ((boolean[]) obj2)[0] = true;
                ((CountDownLatch) obj).countDown();
                break;
            default:
                ViewOnClickListenerC0744.m3222((C10948) obj2, (CheckBox) obj);
                break;
        }
    }
}
