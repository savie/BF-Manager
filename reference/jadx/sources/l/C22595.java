package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩹᩺۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 69WC */
/* JADX INFO: loaded from: classes.dex */
public final class C22595 extends AbstractC2838 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f73637;

    @Override // l.AbstractC2838
    /* JADX INFO: renamed from: ۨ */
    public final String mo8594() {
        return "querying service";
    }

    public C22595(C22823 c22823, String str) {
        super(c22823);
        this.f73637 = str;
    }

    @Override // l.AbstractC4955
    /* JADX INFO: renamed from: ܰ */
    public final String mo4999() {
        return C22697.m50267(new StringBuilder("ServiceResolver("), m13745() != null ? m13745().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.AbstractC2838
    /* JADX INFO: renamed from: ۙ */
    public final C22034 mo8593(C22034 c22034) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (AbstractC11015 abstractC11015 : ((ConcurrentMapC13783) m13745().m50563()).values()) {
            c22034 = m13744(c22034, new C7217(abstractC11015.mo1660(), EnumC23529.CLASS_IN, false, C17178.f54761, abstractC11015.mo1670()), jCurrentTimeMillis);
        }
        return c22034;
    }

    @Override // l.AbstractC2838
    /* JADX INFO: renamed from: ܰ */
    public final C22034 mo8595(C22034 c22034) {
        return m13742(c22034, C18506.m42898(this.f73637, EnumC14357.TYPE_PTR, EnumC23529.CLASS_IN, false));
    }
}
