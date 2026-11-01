package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final class C15458 extends C22220 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18279 f50376;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4603 f50377;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C19003 f50378 = new C19003();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC8774 f50379;

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3955(C21452 c21452) {
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
    }

    @Override // l.C22220
    /* JADX INFO: renamed from: ܰ */
    public final void mo7248(AbstractC8774 abstractC8774) {
        if (abstractC8774 != null) {
            for (AbstractC23219 abstractC23219 : this.f50376.f58322) {
                if (abstractC23219.f75335.f58324.contains(abstractC23219.f75334) && abstractC8774.m22847(abstractC23219.f75336) && abstractC23219.mo8404(abstractC8774)) {
                    Iterator it = abstractC23219.mo8405(abstractC8774).iterator();
                    while (it.hasNext()) {
                        this.f50378.m43723(new C6990(this.f50376, this.f50379, abstractC8774, (AbstractC8774) it.next(), abstractC23219, this.f50377));
                    }
                    break;
                }
            }
        }
        super.mo7248(abstractC8774);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3914(C0285 c0285) {
        mo7248(c0285.f1596);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3960(C22885 c22885) {
        mo7248(c22885.f74426);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3944(C14398 c14398) {
        mo7248(c14398.f47207);
        m49334(c14398.f47205);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3950(C16514 c16514) {
        mo7248(c16514.f53044);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3918(C2026 c2026) {
        mo7248(c2026.f7570);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3942(C13713 c13713) {
        mo7248(c13713.f45220);
        m49334(c13713.f45221);
        mo7248(c13713.f45218);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3924(C4849 c4849) {
        mo7248(c4849.f17076);
    }

    public C15458(C18279 c18279, AbstractC8774 abstractC8774, C4603 c4603) {
        this.f50376 = c18279;
        this.f50379 = abstractC8774;
        c18279.f58320.getClass();
        this.f50377 = C6761.m18290(c4603);
    }
}
