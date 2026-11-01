package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩻᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J5DO */
/* JADX INFO: loaded from: classes.dex */
public final class C23932 extends AbstractC7830 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f77509;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f77510;

    public C23932(AbstractC7124 abstractC7124, String str, String str2) {
        super(EnumC9947.CAST, abstractC7124);
        this.f77510 = str;
        this.f77509 = str2;
    }

    @Override // l.AbstractC7830, l.AbstractC7124
    public final AbstractC7124 clone() {
        AbstractC7124 abstractC7124 = this.f25764;
        abstractC7124.getClass();
        return new C23932(abstractC7124.clone(), this.f77510, this.f77509);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C23932(this.f25764.mo3325(c10527), this.f77510, this.f77509);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        return "((" + C19378.m44398(this.f77509) + MotionUtils.EASING_TYPE_FORMAT_END + this.f25764 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
