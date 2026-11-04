package l;

import android.app.Application;
import android.content.Context;
import com.umeng.analytics.pro.d;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۬ۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1JY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13805 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicBoolean f43779 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m33715(Context context) {
        C15243.m36590(context, d.R);
        if (f43779.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        C15243.m36587((Object) applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C7094());
    }
}
