package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܽ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5DO */
/* JADX INFO: loaded from: classes5.dex */
public final class C17872 extends AbstractC7431 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f58577;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f58578;

    public C17872(AbstractC11071 abstractC11071, String str, String str2) {
        super(EnumC22260.CAST, abstractC11071);
        this.f58578 = str;
        this.f58577 = str2;
    }

    @Override // l.AbstractC7431, l.AbstractC11071
    public final AbstractC11071 clone() {
        AbstractC11071 abstractC11071 = this.f24464;
        abstractC11071.getClass();
        return new C17872(abstractC11071.clone(), this.f58578, this.f58577);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C17872(this.f24464.mo5237(c5194), this.f58578, this.f58577);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        return "((" + C2211.m7539(this.f58577) + MotionUtils.EASING_TYPE_FORMAT_END + this.f24464 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
