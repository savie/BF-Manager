package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺ᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes5.dex */
public final class C17168 extends AbstractC18551 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6728 f55969;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17168(C6728 c6728) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f55969 = c6728;
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(C8614 c8614) {
        AbstractC0148 abstractC0148M18806 = this.f55969.m18806();
        if (abstractC0148M18806 == null) {
            C22673.m51159(R.string.MT_Protector);
            return;
        }
        C22961.m51795(c8614.m23166(), new C8877(abstractC0148M18806, true), c8614.m23194().m46167());
        C20634.m47244(c8614.m23233());
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo3179() {
        this.f55969.getClass();
        return true;
    }
}
