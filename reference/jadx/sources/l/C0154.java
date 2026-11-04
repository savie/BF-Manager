package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֡ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V9U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0154 extends AbstractC18053 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f1156 = C16980.m40038(C0154.class.getName());

    public C0154(C14168 c14168) {
        super(c14168);
    }

    @Override // l.AbstractC18053
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo1348() {
        return C8947.m23910(new StringBuilder("RecordReaper("), m42076() != null ? m42076().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (m42076().m34457() || m42076().m34438()) {
            return;
        }
        f1156.mo13708(mo1348(), "{}.run() JmDNS reaping cache");
        m42076().m34447();
    }
}
