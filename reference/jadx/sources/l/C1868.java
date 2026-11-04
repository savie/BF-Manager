package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫ۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C7DD */
/* JADX INFO: loaded from: classes3.dex */
public final class C1868 implements InterfaceC3359 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f6292;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7660 f6293;

    @Override // l.InterfaceC3359
    public final int getLength() {
        return 2;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C7660 c7660 = this.f6293;
        if (this.f6292 == -1) {
            this.f6292 = c7660.f67820;
        }
        int i = this.f6292;
        if (i == -1) {
            throw new IOException(C14442.m34865("a file due to implementation issue:\n\t\t \"Can't retrieve CP Index for ", c7660 == null ? "null" : c7660.toString(), "\""));
        }
        ((C11388) interfaceC9397).m28740(i);
    }
}
