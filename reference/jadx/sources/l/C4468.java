package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;

/* JADX INFO: renamed from: l.ۘ᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: MAIE */
/* JADX INFO: loaded from: classes3.dex */
public final class C4468 extends AbstractC9843 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f15986;

    public C4468(String str) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f15986 = str;
        m25621();
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return c12915.m31986(this.f15986) && c12915.m31974().m23228(b.k);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970(this.f15986);
        c8614M31974.m23174(b.k);
        m25620(c12915, R.string.MT_Protector, AbstractC9843.m25618(c12915, R.string.MT_Protector));
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2480(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970(this.f15986);
        c8614M31974.m23174(b.k);
        AbstractC7629 abstractC7629Mo10174 = c12915.m31987().mo10174();
        AbstractC18881 abstractC18881 = (AbstractC18881) c12915.m31974().m23213().mo10174();
        String strTrim = abstractC18881.f61289.mo1332().trim();
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C24606.class);
        c8458.m22730(c12915.m31982());
        c8458.m22731(c12915);
        c8458.m22721("ARG_STATELESS_VISITOR", abstractC7629Mo10174.m20838());
        c8458.m22721("ARG_STATELESS_VISITOR2", abstractC18881.m20838());
        c8458.m22719("ARG_MSG_FROM", c12915.m31972());
        c8458.m22719("ARG_MSG_TO", c8614M31974.m23222());
        c8458.m22719("targetPath", c8614M31974.m23166());
        c8458.m22719("descPath", strTrim);
        c8458.m22714();
    }
}
