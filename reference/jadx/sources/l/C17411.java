package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B3J */
/* JADX INFO: loaded from: classes5.dex */
public class C17411 extends AbstractC18551 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC0454 f56609;

    public C17411(InterfaceC0454 interfaceC0454) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f56609 = interfaceC0454;
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(C8614 c8614) {
        InterfaceC0454 interfaceC0454 = this.f56609;
        C13132.m32616(c8614, interfaceC0454, interfaceC0454.mo2270());
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ܳ */
    public boolean mo3179() {
        C22829 c22829Mo2270 = this.f56609.mo2270();
        return !(c22829Mo2270.f73993 == null || c22829Mo2270.f73990.isEmpty());
    }
}
