package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽ᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes5.dex */
public final class C17914 extends AbstractC18551 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6728 f58693;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17914(C6728 c6728) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f58693 = c6728;
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(C8614 c8614) {
        C6728 c6728 = this.f58693;
        AbstractC0148 abstractC0148M20792 = C7606.m20792(c6728.f22424);
        if (abstractC0148M20792 != null) {
            abstractC0148M20792.f1128 = c6728.m20218();
            C7606.m20783();
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        C22673.m51159(R.string.MT_Protector);
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo3179() {
        this.f58693.getClass();
        return true;
    }
}
