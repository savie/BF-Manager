package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.֨ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69WC */
/* JADX INFO: loaded from: classes3.dex */
public final class C0900 extends AbstractC18799 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f3340;

    @Override // l.AbstractC18799
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo3637() {
        return "querying service";
    }

    public C0900(C14168 c14168, String str) {
        super(c14168);
        this.f3340 = str;
    }

    @Override // l.AbstractC18053
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1348() {
        return C8947.m23910(new StringBuilder("ServiceResolver("), m42076() != null ? m42076().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.AbstractC18799
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1271 mo3636(C1271 c1271) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (AbstractC12457 abstractC12457 : ((ConcurrentMapC17249) m42076().m34445()).values()) {
            c1271 = m42074(c1271, new C2237(abstractC12457.mo30939(), EnumC6121.CLASS_IN, false, C3137.f10167, abstractC12457.mo30944()), jCurrentTimeMillis);
        }
        return c1271;
    }

    @Override // l.AbstractC18799
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1271 mo3638(C1271 c1271) {
        return m42075(c1271, C23120.m52051(this.f3340, EnumC24021.TYPE_PTR, EnumC6121.CLASS_IN, false));
    }
}
