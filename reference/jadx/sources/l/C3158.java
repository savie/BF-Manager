package l;

import android.content.ComponentName;
import android.content.Intent;
import bin.mt.plus.Main;
import com.alipay.sdk.m.m.b;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۗۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59SA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3158 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10299(C8614 c8614, InterfaceC2386 interfaceC2386) {
        if (!c8614.m23228(b.k)) {
            return false;
        }
        String strMo8114 = interfaceC2386.mo8114();
        return strMo8114.startsWith("video/") || strMo8114.startsWith("audio/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10298(C8614 c8614, InterfaceC2386 interfaceC2386, ComponentName componentName) {
        int i = ServiceC2099.f6952;
        Main mainM23233 = c8614.m23233();
        AbstractC18881 abstractC18881 = (AbstractC18881) c8614.m23213().mo10174();
        Intent intent = new Intent(mainM23233, (Class<?>) ServiceC2099.class);
        intent.setAction("bin.mt.plus.NetworkStreamingService.ACTION_PLAY");
        intent.putExtra("componentName", componentName);
        intent.putExtra("statelessVisitor", abstractC18881.m20838());
        intent.putExtra(MotionUtils.EASING_TYPE_PATH, interfaceC2386.getPath());
        intent.putExtra("mime", interfaceC2386.mo8114());
        intent.putExtra("time", interfaceC2386.getTime());
        intent.putExtra(Name.LENGTH, interfaceC2386.getSize());
        C7508.m20562(mainM23233, intent);
    }
}
