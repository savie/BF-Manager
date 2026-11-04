package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 19WG */
/* JADX INFO: loaded from: classes4.dex */
public final class C9848 extends AbstractC18799 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17307 f31699;

    public C9848(C14168 c14168, C17307 c17307) {
        super(c14168);
        this.f31699 = c17307;
        c17307.m40642(m42076());
        m42076().m34429(c17307, C23120.m52051(c17307.mo30944(), EnumC24021.TYPE_ANY, EnumC6121.CLASS_IN, false));
    }

    @Override // l.AbstractC18053
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1348() {
        return C8947.m23910(new StringBuilder("ServiceInfoResolver("), m42076() != null ? m42076().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // java.util.TimerTask
    public final boolean cancel() {
        boolean zCancel = super.cancel();
        C17307 c17307 = this.f31699;
        if (!c17307.mo30949()) {
            m42076().m34423((InterfaceC7983) c17307);
        }
        return zCancel;
    }

    @Override // l.AbstractC18799
    /* JADX INFO: renamed from: ۙ */
    public final C1271 mo3636(C1271 c1271) throws IOException {
        C17307 c17307 = this.f31699;
        if (!c17307.mo30935()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C4254 c4254M34412 = m42076().m34412();
            String strMo30944 = c17307.mo30944();
            EnumC24021 enumC24021 = EnumC24021.TYPE_SRV;
            EnumC6121 enumC6121 = EnumC6121.CLASS_IN;
            c1271 = m42074(m42074(c1271, (AbstractC17152) c4254M34412.m13577(strMo30944, enumC24021, enumC6121), jCurrentTimeMillis), (AbstractC17152) m42076().m34412().m13577(c17307.mo30944(), EnumC24021.TYPE_TXT, enumC6121), jCurrentTimeMillis);
            if (c17307.mo30934().length() > 0) {
                Iterator it = m42076().m34412().m13581(c17307.mo30934(), EnumC24021.TYPE_A, enumC6121).iterator();
                while (it.hasNext()) {
                    c1271 = m42074(c1271, (AbstractC17152) ((AbstractC14694) it.next()), jCurrentTimeMillis);
                }
                Iterator it2 = m42076().m34412().m13581(c17307.mo30934(), EnumC24021.TYPE_AAAA, EnumC6121.CLASS_IN).iterator();
                while (it2.hasNext()) {
                    c1271 = m42074(c1271, (AbstractC17152) ((AbstractC14694) it2.next()), jCurrentTimeMillis);
                }
            }
        }
        return c1271;
    }

    @Override // l.AbstractC18799
    /* JADX INFO: renamed from: ᩷ */
    public final C1271 mo3638(C1271 c1271) throws IOException {
        C17307 c17307 = this.f31699;
        if (c17307.mo30935()) {
            return c1271;
        }
        String strMo30944 = c17307.mo30944();
        EnumC24021 enumC24021 = EnumC24021.TYPE_SRV;
        EnumC6121 enumC6121 = EnumC6121.CLASS_IN;
        C1271 c1271M42075 = m42075(m42075(c1271, C23120.m52051(strMo30944, enumC24021, enumC6121, false)), C23120.m52051(c17307.mo30944(), EnumC24021.TYPE_TXT, enumC6121, false));
        return c17307.mo30934().length() > 0 ? m42075(m42075(c1271M42075, C23120.m52051(c17307.mo30934(), EnumC24021.TYPE_A, enumC6121, false)), C23120.m52051(c17307.mo30934(), EnumC24021.TYPE_AAAA, enumC6121, false)) : c1271M42075;
    }

    @Override // l.AbstractC18799
    /* JADX INFO: renamed from: ۤ */
    public final String mo3637() {
        StringBuilder sb = new StringBuilder("querying service info: ");
        C17307 c17307 = this.f31699;
        sb.append(c17307 != null ? c17307.mo30944() : "null");
        return sb.toString();
    }
}
