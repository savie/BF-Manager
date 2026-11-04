package l;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.alipay.sdk.app.OpenAuthTask;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: l.۟᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 79M1 */
/* JADX INFO: loaded from: classes4.dex */
public class C8138 implements InterfaceC2588 {
    @Override // l.InterfaceC2588
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8653(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            final Context applicationContext = context.getApplicationContext();
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: l.᩶᩶᩷
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    Handler handler;
                    if (Build.VERSION.SDK_INT >= 28) {
                        handler = C18579.m43159(Looper.getMainLooper());
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    handler.postDelayed(new RunnableC3291(2, applicationContext), new Random().nextInt(Math.max(1000, 1)) + OpenAuthTask.Duplex);
                }
            });
            return new C0680();
        }
        return new C0680();
    }

    @Override // l.InterfaceC2588
    /* JADX INFO: renamed from: ۙ */
    public final List mo8654() {
        return Collections.EMPTY_LIST;
    }
}
