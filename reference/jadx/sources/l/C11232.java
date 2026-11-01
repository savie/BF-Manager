package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۧ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 451O */
/* JADX INFO: loaded from: classes4.dex */
public final class C11232 extends AbstractC19119 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f38006;

    public C11232(EnumC9947 enumC9947, AbstractC7124 abstractC7124, AbstractC7124 abstractC7125, String str) {
        super(enumC9947, abstractC7124, abstractC7125);
        this.f38006 = str;
    }

    @Override // l.AbstractC19119, l.AbstractC7124
    public final AbstractC7124 clone() {
        AbstractC7124 abstractC7124 = this.f61770;
        abstractC7124.getClass();
        AbstractC7124 abstractC7124Clone = abstractC7124.clone();
        AbstractC7124 abstractC7125 = this.f61771;
        abstractC7125.getClass();
        return new C11232(this.f23823, abstractC7124Clone, abstractC7125.clone(), this.f38006);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C11232(this.f23823, this.f61770.mo3325(c10527), this.f61771.mo3325(c10527), this.f38006);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f61770 + " " + this.f23823 + " " + this.f61771 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
