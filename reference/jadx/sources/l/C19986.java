package l;

/* JADX INFO: renamed from: l.ᩴܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes5.dex */
public final class C19986 extends AbstractC22970 implements InterfaceC14244 {
    public C19986(long j, AbstractC19728 abstractC19728, C17969 c17969, AbstractC11781 abstractC11781) {
        super(EnumC13603.f43213, j, abstractC19728, c17969, abstractC11781);
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ۙ */
    public final EnumC5296 mo9558() {
        return EnumC5296.TYPE_PARAMETER;
    }

    @Override // l.AbstractC22970, l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ֨ */
    public final C14769 mo16957() {
        C14769<C24638> c14769Mo29597 = this.f38069.mo29597();
        int iIndexOf = this.f38069.mo5575().indexOf(this);
        C14769 c14769M35543 = C14769.m35543();
        for (C24638 c24638 : c14769Mo29597) {
            C5510 c5510 = c24638.f77371;
            EnumC21478 enumC21478 = c5510.f19183;
            if (enumC21478 == EnumC21478.CLASS_TYPE_PARAMETER || enumC21478 == EnumC21478.METHOD_TYPE_PARAMETER) {
                if (c5510.f19187 == iIndexOf) {
                    c14769M35543 = c14769M35543.m35552(c24638);
                }
            }
        }
        return c14769M35543.m35554();
    }

    @Override // l.InterfaceC12753
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7871(AbstractC9024 abstractC9024, Object obj) {
        return abstractC9024.mo18929(this, obj);
    }
}
