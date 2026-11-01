package l;

import android.content.ComponentName;
import android.content.Intent;
import bin.mt.plus.Main;
import com.alipay.sdk.m.m.b;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۧۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59SA */
/* JADX INFO: loaded from: classes3.dex */
public final class C10930 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27411(C11545 c11545, InterfaceC2557 interfaceC2557) {
        if (!c11545.m28814(b.k)) {
            return false;
        }
        String strMo7967 = interfaceC2557.mo7967();
        return strMo7967.startsWith("video/") || strMo7967.startsWith("audio/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27410(C11545 c11545, InterfaceC2557 interfaceC2557, ComponentName componentName) {
        int i = ServiceC6650.f22461;
        Main mainM28824 = c11545.m28824();
        AbstractC12233 abstractC12233 = (AbstractC12233) c11545.m28817().mo13029();
        Intent intent = new Intent(mainM28824, (Class<?>) ServiceC6650.class);
        intent.setAction("bin.mt.plus.NetworkStreamingService.ACTION_PLAY");
        intent.putExtra("componentName", componentName);
        intent.putExtra("statelessVisitor", abstractC12233.m24619());
        intent.putExtra(MotionUtils.EASING_TYPE_PATH, interfaceC2557.getPath());
        intent.putExtra("mime", interfaceC2557.mo7967());
        intent.putExtra("time", interfaceC2557.getTime());
        intent.putExtra(Name.LENGTH, interfaceC2557.getSize());
        C10405.m26303(mainM28824, intent);
    }
}
