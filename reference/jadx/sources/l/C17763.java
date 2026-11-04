package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBDM */
/* JADX INFO: loaded from: classes5.dex */
public final class C17763 implements InterfaceC22722 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f58328 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16271 f58329;

    public C17763(C16271 c16271) {
        this.f58329 = c16271;
    }

    @Override // l.InterfaceC22722
    /* JADX INFO: renamed from: ۙ */
    public final void mo4093(C19738 c19738, C19738 c19739) {
        C17017 c17017 = new C17017();
        c17017.f55591 = new ArrayList();
        int i = this.f58328 + 1;
        this.f58328 = i;
        c17017.f55590 = i;
        c17017.f55592 = c19738;
        c17017.f55589 = c19739;
        C16271 c16271 = this.f58329;
        c16271.f52864.add(c19738);
        c16271.f52865[c19738.m45472()] = c17017;
    }
}
