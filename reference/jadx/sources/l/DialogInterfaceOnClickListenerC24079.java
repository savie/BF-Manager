package l;

import android.content.DialogInterface;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.᩺ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC24079 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77859;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77860;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77861;

    public /* synthetic */ DialogInterfaceOnClickListenerC24079(int i, Object obj, Object obj2) {
        this.f77859 = i;
        this.f77861 = obj;
        this.f77860 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f77859;
        Object obj = this.f77860;
        Object obj2 = this.f77861;
        switch (i2) {
            case 0:
                int i3 = ActivityC0848.f3169;
                ((boolean[]) obj2)[0] = false;
                ((CountDownLatch) obj).countDown();
                break;
            default:
                ((C23255) obj2).mo52335((CharSequence) (i == 0 ? "" : ((String[]) obj)[i]));
                dialogInterface.dismiss();
                break;
        }
    }
}
