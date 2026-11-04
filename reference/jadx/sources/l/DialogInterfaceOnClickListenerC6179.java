package l;

import android.content.DialogInterface;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.ۛۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6179 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21047;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21048;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21049;

    public /* synthetic */ DialogInterfaceOnClickListenerC6179(int i, Object obj, Object obj2) {
        this.f21047 = i;
        this.f21049 = obj;
        this.f21048 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f21047;
        Object obj = this.f21048;
        Object obj2 = this.f21049;
        switch (i2) {
            case 0:
                int i3 = ActivityC0848.f3169;
                ((boolean[]) obj2)[0] = true;
                ((CountDownLatch) obj).countDown();
                break;
            default:
                ((C23994) obj2).f27860.notifyItemChanged(((C6094) obj).getBindingAdapterPosition());
                break;
        }
    }
}
