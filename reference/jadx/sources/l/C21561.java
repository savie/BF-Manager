package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes.dex */
public final class C21561 extends AbstractC18555 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0678 f68863;

    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ۙ */
    public final long mo23590() {
        return -1L;
    }

    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ۙ */
    public final void mo23592(long j) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21561(C0678 c0678, C0678 c0679, InterfaceC21539 interfaceC21539) {
        super(c0679, interfaceC21539);
        this.f68863 = c0678;
    }

    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ᩷ */
    public final int mo23593() throws IOException {
        C0678 c0678 = this.f68863;
        if (!c0678.m2950()) {
            throw new IOException("load mt extras failed");
        }
        return c0678.f2576.f60356;
    }

    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ۙ */
    public final void mo23591(int i) {
        this.f68863.m2941(i);
    }
}
