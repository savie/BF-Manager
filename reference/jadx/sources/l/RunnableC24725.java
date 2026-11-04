package l;

import android.content.Context;
import android.widget.Button;
import com.google.android.material.motion.MaterialBackOrchestrator;

/* JADX INFO: renamed from: l.᩻֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24725 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f80039;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f80040;

    public /* synthetic */ RunnableC24725(int i, Object obj) {
        this.f80039 = i;
        this.f80040 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f80039;
        Object obj = this.f80040;
        switch (i) {
            case 0:
                ((ActivityC2350) obj).m7961();
                break;
            case 1:
                C21815 c21815 = (C21815) obj;
                int i2 = C21815.f69554;
                c21815.getClass();
                System.currentTimeMillis();
                c21815.setVisibility(0);
                break;
            case 2:
                C14849.m35777((Context) obj);
                break;
            case 3:
                ((InterfaceC23689) obj).mo42975();
                break;
            case 4:
                C21403.m48684((C21403) obj);
                break;
            case 5:
                ((Button) obj).setClickable(true);
                break;
            case 6:
                C8351.m22461((C8351) obj);
                break;
            case 7:
                ((ViewOnClickListenerC5914) obj).m17165();
                break;
            default:
                ((MaterialBackOrchestrator) obj).startListeningForBackCallbacksWithPriorityOverlay();
                break;
        }
    }
}
