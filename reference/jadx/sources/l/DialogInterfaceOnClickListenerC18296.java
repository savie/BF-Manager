package l;

import android.content.Context;
import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ᩳ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC18296 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58381;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58382;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58383;

    public /* synthetic */ DialogInterfaceOnClickListenerC18296(int i, Object obj, Object obj2) {
        this.f58382 = i;
        this.f58383 = obj;
        this.f58381 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f58382) {
            case 0:
                AbstractC7713.m20348((AbstractC7713) this.f58383, (AtomicBoolean) this.f58381);
                break;
            default:
                C16125.m38163((Context) this.f58381, (InterfaceC21063) this.f58383);
                break;
        }
    }
}
