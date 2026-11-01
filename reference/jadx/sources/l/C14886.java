package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܶ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U655 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14886 extends AbstractC7830 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f48643;

    public C14886(EnumC9947 enumC9947, AbstractC7124 abstractC7124, String str) {
        super(enumC9947, abstractC7124);
        this.f48643 = str;
    }

    @Override // l.AbstractC7830, l.AbstractC7124
    public final AbstractC7124 clone() {
        AbstractC7124 abstractC7124 = this.f25764;
        abstractC7124.getClass();
        return new C14886(this.f23823, abstractC7124.clone(), this.f48643);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C14886(this.f23823, this.f25764.mo3325(c10527), this.f48643);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        int i = C22647.f73784[this.f23823.ordinal()];
        String str = this.f48643;
        int i2 = 1;
        if (i == 1) {
            return "((" + C19378.m44398(str) + MotionUtils.EASING_TYPE_FORMAT_END + this.f25764 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i == 2) {
            return MotionUtils.EASING_TYPE_FORMAT_START + this.f25764 + " instanceof " + C19378.m44398(str) + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i != 3) {
            return "UNKNOW";
        }
        if (str.charAt(0) == '[') {
            while (str.charAt(i2) == '[') {
                i2++;
            }
            StringBuilder sb = new StringBuilder("new ");
            sb.append(C19378.m44398(str.substring(i2)));
            sb.append("[");
            sb.append(this.f25764);
            sb.append("]");
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append("[]");
            }
            return sb.toString();
        }
        return "new " + C19378.m44398(str) + "[" + this.f25764 + "]";
    }
}
