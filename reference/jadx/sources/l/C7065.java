package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes3.dex */
public final class C7065 extends AbstractC11026 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9183 f23719;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7065(C9183 c9183) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f23719 = c9183;
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۙ */
    public final void mo2267(C11545 c11545) {
        AbstractC12068 abstractC12068M23630 = this.f23719.m23630();
        if (abstractC12068M23630 == null) {
            C15829.m37618(R.string.MT_Protector);
            return;
        }
        C23186.m51184(c11545.m28798(), new C5546(abstractC12068M23630, true), c11545.m28807().m18653());
        C10361.m26259(c11545.m28824());
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo6292() {
        this.f23719.getClass();
        return true;
    }
}
