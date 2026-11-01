package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺᩺۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O9VJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23301 extends AbstractC4249 {
    @Override // l.AbstractC4249
    /* JADX INFO: renamed from: ֨ */
    public final String mo4992() {
        return "renewing";
    }

    public C23301(C22823 c22823) {
        super(c22823, AbstractC4249.m12011());
        EnumC3066 enumC3066 = EnumC3066.f11553;
        m12016(enumC3066);
        m12013(enumC3066);
    }

    @Override // l.AbstractC4955
    /* JADX INFO: renamed from: ܰ */
    public final String mo4999() {
        return C22697.m50267(new StringBuilder("Renewer("), m13745() != null ? m13745().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.AbstractC4955
    public final String toString() {
        return mo4999() + " state: " + m12015();
    }

    @Override // java.util.TimerTask
    public final boolean cancel() {
        m12014();
        return super.cancel();
    }

    @Override // l.AbstractC4249
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo4993() {
        return (m13745().m50560() || m13745().m50533()) ? false : true;
    }

    @Override // l.AbstractC4249
    /* JADX INFO: renamed from: ۚ */
    public final C22034 mo4997() {
        return new C22034(33792);
    }

    @Override // l.AbstractC4249
    /* JADX INFO: renamed from: ۙ */
    public final C22034 mo4996(C22034 c22034) throws IOException {
        Iterator it = m13745().m50562().m8884(EnumC23529.CLASS_ANY, true, m12017()).iterator();
        while (it.hasNext()) {
            c22034 = m13741(c22034, (C13568) null, (AbstractC19918) it.next());
        }
        return c22034;
    }

    @Override // l.AbstractC4249
    /* JADX INFO: renamed from: ۙ */
    public final C22034 mo4995(C0244 c0244, C22034 c22034) throws IOException {
        Iterator it = c0244.m1641(EnumC23529.CLASS_ANY, m12017(), m13745().m50562()).iterator();
        while (it.hasNext()) {
            c22034 = m13741(c22034, (C13568) null, (AbstractC19918) it.next());
        }
        return c22034;
    }

    @Override // l.AbstractC4249
    /* JADX INFO: renamed from: ۘ */
    public final void mo4994() {
        m13745().m50567();
    }

    @Override // l.AbstractC4249
    /* JADX INFO: renamed from: ۨ */
    public final void mo4998() {
        m12016(m12015().m9199());
        if (m12015().m9202()) {
            return;
        }
        cancel();
    }
}
