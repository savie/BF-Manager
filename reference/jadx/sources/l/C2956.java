package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۖ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 962J */
/* JADX INFO: loaded from: classes3.dex */
public final class C2956 extends AbstractC7431 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f9645;

    public C2956(EnumC22260 enumC22260, AbstractC11071 abstractC11071, String str) {
        super(enumC22260, abstractC11071);
        this.f9645 = str;
    }

    @Override // l.AbstractC7431, l.AbstractC11071
    public final AbstractC11071 clone() {
        AbstractC11071 abstractC11071 = this.f24464;
        abstractC11071.getClass();
        return new C2956(this.f34921, abstractC11071.clone(), this.f9645);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C2956(this.f34921, this.f24464.mo5237(c5194), this.f9645);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        int i = C9667.f31216[this.f34921.ordinal()];
        if (i == 1) {
            return this.f24464 + ".length";
        }
        if (i == 2) {
            return "(-" + this.f24464 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i == 3) {
            return "(!" + this.f24464 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return toString();
    }
}
