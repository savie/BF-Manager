package l;

import android.content.Context;
import bin.mt.plus.R;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۗ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3291 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10716;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10717;

    public /* synthetic */ RunnableC3291(int i, Object obj) {
        this.f10716 = i;
        this.f10717 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10716;
        Object obj = this.f10717;
        switch (i) {
            case 0:
                ((C24132) obj).m53745();
                break;
            case 1:
                int i2 = C21815.f69554;
                ((C21815) obj).setVisibility(8);
                break;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC24725(2, (Context) obj));
                break;
            case 3:
                ((C16468) obj).f53406.m20013(true);
                break;
            case 4:
                DialogInterfaceOnClickListenerC12983.m32396(R.string.MT_Protector, (AbstractActivityC17204) obj, "def_sign_key_warn");
                break;
            default:
                C10367.m26667(((C23706) obj).f76835);
                break;
        }
    }
}
