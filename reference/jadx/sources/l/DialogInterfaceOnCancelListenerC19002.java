package l;

import android.content.Context;
import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ᩴ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC19002 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61506;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61507;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61508;

    public /* synthetic */ DialogInterfaceOnCancelListenerC19002(int i, Object obj, Object obj2) {
        this.f61507 = i;
        this.f61508 = obj;
        this.f61506 = obj2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f61507) {
            case 0:
                AbstractC7713.m20355((AbstractC7713) this.f61508, (AtomicBoolean) this.f61506);
                break;
            default:
                C16125.m38168((Context) this.f61506, (InterfaceC21063) this.f61508);
                break;
        }
    }
}
