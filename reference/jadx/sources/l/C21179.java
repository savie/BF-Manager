package l;

import android.content.Context;
import com.umeng.analytics.pro.d;
import java.util.List;

/* JADX INFO: renamed from: l.᩷᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0W */
/* JADX INFO: loaded from: classes5.dex */
public final class C21179 implements InterfaceC3900 {
    @Override // l.InterfaceC3900
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10668(Context context) {
        C13465.m32966(context, d.R);
        C1078 c1078M4057 = C1078.m4057(context);
        C13465.m32967(c1078M4057, "getInstance(context)");
        if (!c1078M4057.m4060()) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C2834.m8590(context);
        C12713.f42396.m31565(context);
        return C12713.f42396;
    }

    @Override // l.InterfaceC3900
    /* JADX INFO: renamed from: ۙ */
    public final List mo10669() {
        return C23238.f75405;
    }
}
