package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܳۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes4.dex */
public final class C14273 extends C5182 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22116 f46794;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14273(C22116 c22116, AbstractC23903 abstractC23903) {
        super(c22116, abstractC23903);
        this.f46794 = c22116;
    }

    @Override // l.C5182, l.AbstractC2982
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC2982 mo5374() {
        AbstractC23903 abstractC23903 = this.f17985;
        C6171.m17176(abstractC23903.f77452 == EnumC10477.f35878);
        C22116 c22116 = this.f46794;
        int iM25336 = C10039.m25336(abstractC23903.mo50006(c22116.f71612));
        c22116.f71608.m25371((InterfaceC7299) abstractC23903);
        return c22116.f71611[iM25336];
    }

    @Override // l.C5182, l.AbstractC2982
    /* JADX INFO: renamed from: ᩹ */
    public final void mo8879() {
        C6171.m17174("this method shouldn't be invoked");
        throw null;
    }

    @Override // l.C5182, l.AbstractC2982
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC2982 mo8878() {
        AbstractC23903 abstractC23903 = this.f17985;
        C6171.m17176(abstractC23903.f77452 == EnumC10477.f35879);
        C22116 c22116 = this.f46794;
        C13757 c13757 = (C13757) abstractC23903.mo50006(c22116.f71612);
        int iM25336 = C10039.m25336(c13757.f45368);
        c22116.f71608.m25370((C6969) abstractC23903, c13757);
        return c22116.f71611[iM25336];
    }

    @Override // l.C5182
    public final String toString() {
        return "dynamic(" + this.f17985 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
