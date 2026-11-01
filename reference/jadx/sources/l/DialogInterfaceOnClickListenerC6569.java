package l;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۜۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6569 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22120;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22121;

    public /* synthetic */ DialogInterfaceOnClickListenerC6569(int i, Object obj) {
        this.f22120 = i;
        this.f22121 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f22120;
        Object obj = this.f22121;
        switch (i2) {
            case 0:
                int i3 = ActivityC5677.f19358;
                ((ActivityC5677) obj).finish();
                break;
            case 1:
                ((AtomicInteger) obj).set(i);
                break;
            case 2:
                C23814.m52487((C23814) obj);
                break;
            default:
                ViewOnClickListenerC15847.m37716((ViewOnClickListenerC15847) obj);
                break;
        }
    }
}
