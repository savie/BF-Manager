package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B3J */
/* JADX INFO: loaded from: classes4.dex */
public class C12770 extends AbstractC11026 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC0544 f42583;

    public C12770(InterfaceC0544 interfaceC0544) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f42583 = interfaceC0544;
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۙ */
    public final void mo2267(C11545 c11545) {
        InterfaceC0544 interfaceC0544 = this.f42583;
        C22418.m49706(c11545, interfaceC0544, interfaceC0544.mo2551());
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ᩹ */
    public boolean mo6292() {
        C11835 c11835Mo2551 = this.f42583.mo2551();
        return !(c11835Mo2551.f39732 == null || c11835Mo2551.f39735.isEmpty());
    }
}
