package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩳ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 962J */
/* JADX INFO: loaded from: classes5.dex */
public final class C17707 extends AbstractC7830 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f56229;

    public C17707(EnumC9947 enumC9947, AbstractC7124 abstractC7124, String str) {
        super(enumC9947, abstractC7124);
        this.f56229 = str;
    }

    @Override // l.AbstractC7830, l.AbstractC7124
    public final AbstractC7124 clone() {
        AbstractC7124 abstractC7124 = this.f25764;
        abstractC7124.getClass();
        return new C17707(this.f23823, abstractC7124.clone(), this.f56229);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C17707(this.f23823, this.f25764.mo3325(c10527), this.f56229);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        int i = C21235.f69165[this.f23823.ordinal()];
        if (i == 1) {
            return this.f25764 + ".length";
        }
        if (i == 2) {
            return "(-" + this.f25764 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i == 3) {
            return "(!" + this.f25764 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return toString();
    }
}
