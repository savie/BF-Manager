package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;

/* JADX INFO: renamed from: l.ۨ᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8BF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12671 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        if (c12915.m31986(b.k) && c8614M31974.m23228(b.k) && !c8614M31974.m23197()) {
            return (((AbstractC18881) c12915.m31987().mo10174()).f61289.f1127 == ((AbstractC18881) c8614M31974.m23223()).f61289.f1127 && c12915.m31978().equals(c12915.m31974().m23166())) ? false : true;
        }
        return false;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970(b.k);
        c8614M31974.m23174(b.k);
        m25620(c12915, R.string.MT_Protector, AbstractC9843.m25618(c12915, R.string.MT_Protector));
        DialogInterfaceOnClickListenerC12983.m32396(R.string.MT_Protector, c12915.m31979(), "network_transfer_warn");
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2480(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970(b.k);
        c8614M31974.m23174(b.k);
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C20876.class);
        c8458.m22730(c12915.m31982());
        c8458.m22731(c12915);
        c8458.m22724(c12915.m31987());
        c8458.m22721("ARG_STATELESS_VISITOR2", c12915.m31974().m23223().m20838());
        c8458.m22719("ARG_MSG_FROM", c12915.m31972());
        c8458.m22719("ARG_MSG_TO", c8614M31974.m23222());
        c8458.m22719("targetPath", c8614M31974.m23166());
        c8458.m22720("streamMode", true);
        c8458.m22714();
    }
}
