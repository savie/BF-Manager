package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩺᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5C6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24586 extends AbstractC11905 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C12126 f79669;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C3177 f79670;

    public C24586(EnumC22260 enumC22260, AbstractC11071[] abstractC11071Arr, C12126 c12126, C3177 c3177) {
        super(enumC22260, abstractC11071Arr);
        this.f79669 = c12126;
        this.f79670 = c3177;
    }

    @Override // l.AbstractC11905
    /* JADX INFO: renamed from: ֫ */
    public final C12126 mo18707() {
        return this.f79669;
    }

    @Override // l.AbstractC5106, l.AbstractC11071
    public final AbstractC11071 clone() {
        return new C24586(this.f34921, m15447(), this.f79669, this.f79670);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C24586(this.f34921, m15449(c5194), this.f79669, this.f79670);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17809[0]);
        sb.append('.');
        sb.append(this.f79670.m10374());
        String[] strArrM30292 = this.f79669.m30292();
        sb.append('(');
        int i = 1;
        boolean z = true;
        int i2 = 0;
        while (i < this.f17809.length) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(C2211.m7539(strArrM30292[i2]));
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            sb.append(this.f17809[i]);
            i++;
            i2++;
        }
        sb.append(')');
        return sb.toString();
    }
}
