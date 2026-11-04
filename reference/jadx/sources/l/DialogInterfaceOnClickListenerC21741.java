package l;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩷֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC21741 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69350;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69351;

    public /* synthetic */ DialogInterfaceOnClickListenerC21741(int i, Object obj) {
        this.f69350 = i;
        this.f69351 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f69350) {
            case 0:
                ActivityC2350.m7960((ActivityC2350) this.f69351);
                break;
            case 1:
                C25093.m55930((C25093) this.f69351);
                break;
            case 2:
                ((AtomicInteger) this.f69351).set(i);
                break;
            default:
                ActivityC7135.m19613((ActivityC7135) this.f69351);
                break;
        }
    }
}
