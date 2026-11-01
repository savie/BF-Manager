package l;

import android.app.Application;
import android.content.Context;
import com.umeng.analytics.pro.d;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۖ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1JY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2834 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicBoolean f10725 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m8590(Context context) {
        C13465.m32966(context, d.R);
        if (f10725.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        C13465.m32963((Object) applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C12008());
    }
}
