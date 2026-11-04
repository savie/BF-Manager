package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H7D7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18275 implements InterfaceC3359 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C7660 f59620;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f59621;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7660 f59622;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7660 f59623;

    @Override // l.InterfaceC3359
    public final int getLength() {
        return 8;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C7660 c7660 = this.f59622;
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(this.f59623.f67820);
        C7660 c7661 = this.f59620;
        if (c7661.mo20871()) {
            c11388.m28740(c7661.f67820);
        } else {
            c11388.m28740(0);
        }
        if (c7660.mo20871()) {
            c11388.m28740(c7660.f67820);
        } else {
            c11388.m28740(0);
        }
        c11388.m28740(this.f59621);
    }
}
