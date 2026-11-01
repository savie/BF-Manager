package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes4.dex */
public final class C13650 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f45017;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22116 f45018;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f45019;

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ֨ */
    public final int mo7177() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13650(C22116 c22116, AbstractC23903 abstractC23903, boolean z) {
        super(c22116, C10039.m25336(abstractC23903.mo50006(c22116.f71612)));
        this.f45018 = c22116;
        this.f45019 = abstractC23903;
        this.f45017 = z;
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC2982 mo5374() {
        C22116 c22116 = this.f45018;
        C10039 c10039 = c22116.f71608;
        C17177 c17177 = c10039.f34293.f20079;
        AbstractC23903 abstractC23903 = this.f45019;
        c10039.m25365(180, C17177.m40100(c17177, abstractC23903), abstractC23903);
        return c22116.f71611[this.f11189];
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ᩹ */
    public final void mo8879() {
        C10039 c10039 = this.f45018.f71608;
        C17177 c17177 = c10039.f34293.f20079;
        AbstractC23903 abstractC23903 = this.f45019;
        c10039.m25365(181, C17177.m40100(c17177, abstractC23903), abstractC23903);
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC2982 mo8878() {
        C22116 c22116 = this.f45018;
        C23800 c23800 = c22116.f71612;
        C10039 c10039 = c22116.f71608;
        AbstractC23903 abstractC23903 = this.f45019;
        C13757 c13757 = (C13757) abstractC23903.m52698(c23800);
        int iM25336 = C10039.m25336(c13757.f45368);
        long jMo20276 = abstractC23903.f77448.mo20276() & 512;
        boolean z = this.f45017;
        if (jMo20276 != 0 && !z) {
            c10039.m25374(abstractC23903, c13757);
        } else if (z) {
            c10039.m25387(abstractC23903, c13757);
        } else {
            c10039.m25354(abstractC23903, c13757);
        }
        return c22116.f71611[iM25336];
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ܰ */
    public final void mo7179() {
        this.f45018.f71611[4].mo7179();
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۙ */
    public final void mo7178() {
        this.f45018.f71611[4].mo7178();
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ܰ */
    public final void mo7180(int i) {
        this.f45018.f71611[4].mo7180(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("member(");
        sb.append(this.f45019);
        sb.append(this.f45017 ? " nonvirtual)" : MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
