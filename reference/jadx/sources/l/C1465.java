package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֨᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U655 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1465 extends AbstractC7431 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f5117;

    public C1465(EnumC22260 enumC22260, AbstractC11071 abstractC11071, String str) {
        super(enumC22260, abstractC11071);
        this.f5117 = str;
    }

    @Override // l.AbstractC7431, l.AbstractC11071
    public final AbstractC11071 clone() {
        AbstractC11071 abstractC11071 = this.f24464;
        abstractC11071.getClass();
        return new C1465(this.f34921, abstractC11071.clone(), this.f5117);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C1465(this.f34921, this.f24464.mo5237(c5194), this.f5117);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo5238() {
        int i = C10413.f33103[this.f34921.ordinal()];
        String str = this.f5117;
        int i2 = 1;
        if (i == 1) {
            return "((" + C2211.m7539(str) + MotionUtils.EASING_TYPE_FORMAT_END + this.f24464 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i == 2) {
            return MotionUtils.EASING_TYPE_FORMAT_START + this.f24464 + " instanceof " + C2211.m7539(str) + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i != 3) {
            return "UNKNOW";
        }
        if (str.charAt(0) == '[') {
            while (str.charAt(i2) == '[') {
                i2++;
            }
            StringBuilder sb = new StringBuilder("new ");
            sb.append(C2211.m7539(str.substring(i2)));
            sb.append("[");
            sb.append(this.f24464);
            sb.append("]");
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append("[]");
            }
            return sb.toString();
        }
        return "new " + C2211.m7539(str) + "[" + this.f24464 + "]";
    }
}
