package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7DD */
/* JADX INFO: loaded from: classes4.dex */
public final class C11327 implements InterfaceC4705 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f38224;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15187 f38225;

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 2;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C15187 c15187 = this.f38225;
        if (this.f38224 == -1) {
            this.f38224 = c15187.f43854;
        }
        int i = this.f38224;
        if (i == -1) {
            throw new IOException(C16523.m38890("a file due to implementation issue:\n\t\t \"Can't retrieve CP Index for ", c15187 == null ? "null" : c15187.toString(), "\""));
        }
        ((C23509) interfaceC19275).m51770(i);
    }
}
