package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩶۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 690O */
/* JADX INFO: loaded from: classes5.dex */
public final class C20173 implements InterfaceC16294 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6061 f65487;

    public C20173(C6061 c6061) {
        this.f65487 = c6061;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    @Override // l.InterfaceC16294
    /* JADX INFO: renamed from: ۙ */
    public final void mo2175(InterfaceC12061 interfaceC12061, AbstractC19367 abstractC19367) {
        C16128 c16128 = (C16128) abstractC19367;
        int length = interfaceC12061.length();
        interfaceC12061.mo29972(c16128);
        C6061 c6061 = this.f65487;
        int i = 2;
        if (c6061.f20564 == null) {
            c6061.f20564 = new ArrayList(2);
        }
        List list = c6061.f20564;
        EnumC21066 enumC21066M38178 = c16128.m38178();
        if (enumC21066M38178 == null) {
            i = 0;
        } else {
            int i2 = C15940.f51632[enumC21066M38178.ordinal()];
            if (i2 == 1) {
                i = 1;
            } else if (i2 != 2) {
                i = 0;
            }
        }
        ((ArrayList) list).add(new C9590(i, interfaceC12061.builder().m8185(length)));
        c6061.f20566 = c16128.m38180();
    }
}
