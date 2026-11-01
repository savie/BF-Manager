package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes.dex */
public final class C23120 implements InterfaceC16294 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16064 f75090;

    public C23120(C16064 c16064) {
        this.f75090 = c16064;
    }

    @Override // l.InterfaceC16294
    /* JADX INFO: renamed from: ۙ */
    public final void mo2175(InterfaceC12061 interfaceC12061, AbstractC19367 abstractC19367) {
        String strM40214 = ((C17250) abstractC19367).m40214();
        interfaceC12061.builder().m8186(strM40214);
        C16064 c16064 = this.f75090;
        if (c16064.f51967.isEmpty()) {
            return;
        }
        interfaceC12061.length();
        strM40214.length();
        Iterator it = c16064.f51967.iterator();
        while (it.hasNext()) {
            ((InterfaceC21002) it.next()).m47161();
        }
    }
}
