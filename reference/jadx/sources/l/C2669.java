package l;

import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: K8BJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2669 extends AbstractC9843 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f8489;

    public C2669(String str) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f8489 = str;
        m25621();
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        return c12915.m31986(this.f8489) && c8614M31974.m23228("local") && !c8614M31974.m23197();
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970(this.f8489);
        c8614M31974.m23174("local");
        m25620(c12915, R.string.MT_Protector, AbstractC9843.m25618(c12915, R.string.MT_Protector));
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2480(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c8614M31974.m23174("local");
        AbstractC22044 abstractC22044M35193 = C14584.m35193(c8614M31974.m23166(), new String[0]);
        if (!abstractC22044M35193.mo2934() || abstractC22044M35193.mo4303()) {
            List listM31982 = c12915.m31982();
            int i = C13678.f43415;
            C8458 c8458 = new C8458(C9380.class);
            c8458.m22730(listM31982);
            c8458.m22731(c12915);
            c8458.m22724(c12915.m31987());
            c8458.m22719("targetPath", c8614M31974.m23166());
            c8458.m22714();
            return;
        }
        c12915.m31979().m40400(C21576.m49059(R.string.MT_Protector, c8614M31974.m23166()), false);
    }
}
