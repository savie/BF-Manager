package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes5.dex */
public final class C18163 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19575 f58053;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f58054;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18163(C19575 c19575, AbstractActivityC12483 abstractActivityC12483, AbstractC20745 abstractC20745) {
        super(abstractActivityC12483, -1);
        this.f58053 = c19575;
        this.f58054 = abstractC20745;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        AbstractC20745 abstractC20745 = this.f58054;
        String name = abstractC20745.getName();
        String strM40352 = m40352();
        if (name.equals(strM40352)) {
            m40364();
            return;
        }
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46711().m46690(strM40352);
        boolean zEqualsIgnoreCase = name.equalsIgnoreCase(strM40352);
        C19575 c19575 = this.f58053;
        if (!zEqualsIgnoreCase) {
            if (abstractC20745M46690.mo33975()) {
                m40365(R.string.MT_Protector);
                return;
            }
            abstractC20745.mo24646(abstractC20745M46690);
            c19575.m44681();
            m40364();
            return;
        }
        AbstractC20745 abstractC20745M46733 = abstractC20745.m46733(".tmp");
        abstractC20745.mo24646(abstractC20745M46733);
        abstractC20745M46733.mo24646(abstractC20745M46690);
        c19575.m44681();
        m40364();
    }
}
