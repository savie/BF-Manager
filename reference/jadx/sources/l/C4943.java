package l;

import java.io.PrintWriter;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7049({"*"})
@InterfaceC4550(EnumC21704.RELEASE_17)
public final class C4943 extends AbstractC9285 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public PrintWriter f17235 = new PrintWriter(System.out);

    @Override // l.InterfaceC8540
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15148(C9857 c9857) {
        Iterator it = c9857.m25643().iterator();
        while (it.hasNext()) {
            ((C13586) ((InterfaceC12753) it.next()).mo7871(new C13586(this.f17235, ((C18808) this.f30185).m43643()), null)).f43155.flush();
        }
    }
}
