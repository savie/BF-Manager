package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 451O */
/* JADX INFO: loaded from: classes5.dex */
public final class C17126 extends AbstractC14142 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f55874;

    public C17126(EnumC22260 enumC22260, AbstractC11071 abstractC11071, AbstractC11071 abstractC11072, String str) {
        super(enumC22260, abstractC11071, abstractC11072);
        this.f55874 = str;
    }

    @Override // l.AbstractC14142, l.AbstractC11071
    public final AbstractC11071 clone() {
        AbstractC11071 abstractC11071 = this.f44724;
        abstractC11071.getClass();
        AbstractC11071 abstractC11071Clone = abstractC11071.clone();
        AbstractC11071 abstractC11072 = this.f44725;
        abstractC11072.getClass();
        return new C17126(this.f34921, abstractC11071Clone, abstractC11072.clone(), this.f55874);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C17126(this.f34921, this.f44724.mo5237(c5194), this.f44725.mo5237(c5194), this.f55874);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f44724 + " " + this.f34921 + " " + this.f44725 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
