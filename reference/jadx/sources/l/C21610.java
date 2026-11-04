package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes.dex */
public final class C21610 implements InterfaceC3359 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f69022;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7660 f69023;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7660 f69024;

    @Override // l.InterfaceC3359
    public final int getLength() {
        return 6;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public C21610(C9346 c9346, C6694 c6694, C20864 c20864) {
        this.f69024 = (C7660) c6694.apply(c9346);
        this.f69023 = c9346.m15858() == null ? null : (C7660) c20864.apply(c9346.m15858());
        this.f69022 = c9346.m4217();
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(this.f69024.f67820);
        c11388.m28740(this.f69022);
        C7660 c7660 = this.f69023;
        c11388.m28740(c7660 == null ? 0 : c7660.f67820);
    }
}
