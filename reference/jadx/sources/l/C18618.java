package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܿ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4VC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18618 extends AbstractC5106 {
    public C18618(AbstractC11071[] abstractC11071Arr) {
        super(EnumC22260.PHI, abstractC11071Arr);
    }

    @Override // l.AbstractC5106, l.AbstractC11071
    public final AbstractC11071 clone() {
        return new C18618(m15447());
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C18618(m15449(c5194));
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        StringBuilder sb = new StringBuilder("φ(");
        boolean z = true;
        for (AbstractC11071 abstractC11071 : this.f17809) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(abstractC11071);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
