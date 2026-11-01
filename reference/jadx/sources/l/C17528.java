package l;

import java.io.PrintWriter;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC16741(EnumC12508.RELEASE_17)
@InterfaceC20269({"*"})
public final class C17528 extends AbstractC7568 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public PrintWriter f55724 = new PrintWriter(System.out);

    @Override // l.InterfaceC16036
    /* JADX INFO: renamed from: ۙ */
    public final void mo38028(C7651 c7651) {
        Iterator it = c7651.m20204().iterator();
        while (it.hasNext()) {
            ((C12590) ((InterfaceC14625) it.next()).mo3841(new C12590(this.f55724, ((C10474) this.f25098).m26567()), null)).f42078.flush();
        }
    }
}
