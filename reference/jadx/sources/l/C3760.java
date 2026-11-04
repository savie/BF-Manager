package l;

import android.content.Context;
import com.umeng.analytics.pro.d;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0W */
/* JADX INFO: loaded from: classes3.dex */
public final class C3760 implements InterfaceC2588 {
    @Override // l.InterfaceC2588
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8653(Context context) {
        C15243.m36590(context, d.R);
        C1097 c1097M4096 = C1097.m4096(context);
        C15243.m36591(c1097M4096, "getInstance(...)");
        if (!c1097M4096.m4099()) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C13805.m33715(context);
        C4506.f16079.m14227(context);
        return C4506.f16079;
    }

    @Override // l.InterfaceC2588
    /* JADX INFO: renamed from: ۙ */
    public final List mo8654() {
        return C22242.f71645;
    }
}
