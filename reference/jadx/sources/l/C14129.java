package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰ᩺۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V9U9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14129 extends AbstractC4955 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f46390 = C13488.m32998(C14129.class.getName());

    public C14129(C22823 c22823) {
        super(c22823);
    }

    @Override // l.AbstractC4955
    /* JADX INFO: renamed from: ܰ */
    public final String mo4999() {
        return C22697.m50267(new StringBuilder("RecordReaper("), m13745() != null ? m13745().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (m13745().m50560() || m13745().m50533()) {
            return;
        }
        f46390.mo12129(mo4999(), "{}.run() JmDNS reaping cache");
        m13745().m50564();
    }
}
