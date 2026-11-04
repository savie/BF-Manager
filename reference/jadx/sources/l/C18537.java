package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes5.dex */
public final class C18537 implements InterfaceC23013 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4981 f60242;

    public C18537(C4981 c4981) {
        this.f60242 = c4981;
    }

    @Override // l.InterfaceC23013
    /* JADX INFO: renamed from: ۙ */
    public final void mo2807(InterfaceC20029 interfaceC20029, AbstractC4534 abstractC4534) {
        String strM55016 = ((C24672) abstractC4534).m55016();
        interfaceC20029.builder().m47532(strM55016);
        C4981 c4981 = this.f60242;
        if (c4981.f17326.isEmpty()) {
            return;
        }
        interfaceC20029.length();
        strM55016.length();
        Iterator it = c4981.f17326.iterator();
        while (it.hasNext()) {
            ((InterfaceC14061) it.next()).m34227();
        }
    }
}
