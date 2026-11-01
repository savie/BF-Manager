package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ᩺۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 19WG */
/* JADX INFO: loaded from: classes3.dex */
public final class C5661 extends AbstractC2838 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0244 f19341;

    public C5661(C22823 c22823, C0244 c0244) {
        super(c22823);
        this.f19341 = c0244;
        c0244.m1649(m13745());
        m13745().m50540(c0244, C18506.m42898(c0244.mo1670(), EnumC14357.TYPE_ANY, EnumC23529.CLASS_IN, false));
    }

    @Override // l.AbstractC4955
    /* JADX INFO: renamed from: ܰ */
    public final String mo4999() {
        return C22697.m50267(new StringBuilder("ServiceInfoResolver("), m13745() != null ? m13745().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // java.util.TimerTask
    public final boolean cancel() {
        boolean zCancel = super.cancel();
        C0244 c0244 = this.f19341;
        if (!c0244.mo1672()) {
            m13745().m50543((InterfaceC11451) c0244);
        }
        return zCancel;
    }

    @Override // l.AbstractC2838
    /* JADX INFO: renamed from: ۙ */
    public final C22034 mo8593(C22034 c22034) throws IOException {
        C0244 c0244 = this.f19341;
        if (!c0244.mo1673()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1841 c1841M50566 = m13745().m50566();
            String strMo1670 = c0244.mo1670();
            EnumC14357 enumC14357 = EnumC14357.TYPE_SRV;
            EnumC23529 enumC23529 = EnumC23529.CLASS_IN;
            c22034 = m13744(m13744(c22034, (AbstractC19918) c1841M50566.m5990(strMo1670, enumC14357, enumC23529), jCurrentTimeMillis), (AbstractC19918) m13745().m50566().m5990(c0244.mo1670(), EnumC14357.TYPE_TXT, enumC23529), jCurrentTimeMillis);
            if (c0244.mo1657().length() > 0) {
                Iterator it = m13745().m50566().m5994(c0244.mo1657(), EnumC14357.TYPE_A, enumC23529).iterator();
                while (it.hasNext()) {
                    c22034 = m13744(c22034, (AbstractC19918) ((AbstractC9604) it.next()), jCurrentTimeMillis);
                }
                Iterator it2 = m13745().m50566().m5994(c0244.mo1657(), EnumC14357.TYPE_AAAA, EnumC23529.CLASS_IN).iterator();
                while (it2.hasNext()) {
                    c22034 = m13744(c22034, (AbstractC19918) ((AbstractC9604) it2.next()), jCurrentTimeMillis);
                }
            }
        }
        return c22034;
    }

    @Override // l.AbstractC2838
    /* JADX INFO: renamed from: ܰ */
    public final C22034 mo8595(C22034 c22034) throws IOException {
        C0244 c0244 = this.f19341;
        if (c0244.mo1673()) {
            return c22034;
        }
        String strMo1670 = c0244.mo1670();
        EnumC14357 enumC14357 = EnumC14357.TYPE_SRV;
        EnumC23529 enumC23529 = EnumC23529.CLASS_IN;
        C22034 c22034M13742 = m13742(m13742(c22034, C18506.m42898(strMo1670, enumC14357, enumC23529, false)), C18506.m42898(c0244.mo1670(), EnumC14357.TYPE_TXT, enumC23529, false));
        return c0244.mo1657().length() > 0 ? m13742(m13742(c22034M13742, C18506.m42898(c0244.mo1657(), EnumC14357.TYPE_A, enumC23529, false)), C18506.m42898(c0244.mo1657(), EnumC14357.TYPE_AAAA, enumC23529, false)) : c22034M13742;
    }

    @Override // l.AbstractC2838
    /* JADX INFO: renamed from: ۨ */
    public final String mo8594() {
        StringBuilder sb = new StringBuilder("querying service info: ");
        C0244 c0244 = this.f19341;
        sb.append(c0244 != null ? c0244.mo1670() : "null");
        return sb.toString();
    }
}
