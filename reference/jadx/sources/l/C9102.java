package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U9V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9102 extends AbstractC8357 {
    @Override // l.AbstractC8357
    /* JADX INFO: renamed from: ۫ */
    public final String mo8131() {
        return "announcing";
    }

    public C9102(C14168 c14168) {
        super(c14168, AbstractC8357.m22491());
        EnumC21037 enumC21037 = EnumC21037.f67237;
        m22497(enumC21037);
        m22493(enumC21037);
    }

    @Override // l.AbstractC18053
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1348() {
        return C8947.m23910(new StringBuilder("Announcer("), m42076() != null ? m42076().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.AbstractC18053
    public final String toString() {
        return mo1348() + " state: " + m22494();
    }

    @Override // java.util.TimerTask
    public final boolean cancel() {
        m22495();
        return super.cancel();
    }

    @Override // l.AbstractC8357
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo8133() {
        return (m42076().m34457() || m42076().m34438()) ? false : true;
    }

    @Override // l.AbstractC8357
    /* JADX INFO: renamed from: ᩴ */
    public final C1271 mo8132() {
        return new C1271(33792);
    }

    @Override // l.AbstractC8357
    /* JADX INFO: renamed from: ۙ */
    public final C1271 mo8128(C1271 c1271) throws IOException {
        Iterator it = m42076().m34408().m49145(EnumC6121.CLASS_ANY, true, m22496()).iterator();
        while (it.hasNext()) {
            c1271 = m42072(c1271, (C0525) null, (AbstractC17152) it.next());
        }
        return c1271;
    }

    @Override // l.AbstractC8357
    /* JADX INFO: renamed from: ۙ */
    public final C1271 mo8129(C17307 c17307, C1271 c1271) throws IOException {
        Iterator it = c17307.m40636(EnumC6121.CLASS_ANY, m22496(), m42076().m34408()).iterator();
        while (it.hasNext()) {
            c1271 = m42072(c1271, (C0525) null, (AbstractC17152) it.next());
        }
        return c1271;
    }

    @Override // l.AbstractC8357
    /* JADX INFO: renamed from: ֫ */
    public final void mo8127() {
        m42076().m34441();
    }

    @Override // l.AbstractC8357
    /* JADX INFO: renamed from: ۤ */
    public final void mo8130() {
        m22497(m22494().m48083());
        if (m22494().m48087()) {
            return;
        }
        cancel();
        m42076().mo34440();
    }
}
