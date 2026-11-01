package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۚۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes3.dex */
public class C5182 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22116 f17984;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f17985;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182(C22116 c22116, AbstractC23903 abstractC23903) {
        super(c22116, C10039.m25336(abstractC23903.mo50006(c22116.f71612)));
        this.f17984 = c22116;
        this.f17985 = abstractC23903;
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۖ */
    public AbstractC2982 mo5374() {
        C22116 c22116 = this.f17984;
        C10039 c10039 = c22116.f71608;
        C17177 c17177 = c10039.f34293.f20079;
        AbstractC23903 abstractC23903 = this.f17985;
        c10039.m25365(178, C17177.m40100(c17177, abstractC23903), abstractC23903);
        return c22116.f71611[this.f11189];
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ᩹ */
    public void mo8879() {
        C10039 c10039 = this.f17984.f71608;
        C17177 c17177 = c10039.f34293.f20079;
        AbstractC23903 abstractC23903 = this.f17985;
        c10039.m25365(179, C17177.m40100(c17177, abstractC23903), abstractC23903);
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۨ */
    public AbstractC2982 mo8878() {
        C22116 c22116 = this.f17984;
        C23800 c23800 = c22116.f71612;
        AbstractC23903 abstractC23903 = this.f17985;
        C13757 c13757 = (C13757) abstractC23903.mo50006(c23800);
        int iM25336 = C10039.m25336(c13757.f45368);
        c22116.f71608.m25380(abstractC23903, c13757);
        return c22116.f71611[iM25336];
    }

    public String toString() {
        return "static(" + this.f17985 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
