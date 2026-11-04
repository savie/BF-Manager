package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩷۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 690O */
/* JADX INFO: loaded from: classes.dex */
public final class C22070 implements InterfaceC23013 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13119 f71157;

    public C22070(C13119 c13119) {
        this.f71157 = c13119;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    @Override // l.InterfaceC23013
    /* JADX INFO: renamed from: ۙ */
    public final void mo2807(InterfaceC20029 interfaceC20029, AbstractC4534 abstractC4534) {
        C5695 c5695 = (C5695) abstractC4534;
        int length = interfaceC20029.length();
        interfaceC20029.mo7364(c5695);
        C13119 c13119 = this.f71157;
        int i = 2;
        if (c13119.f41924 == null) {
            c13119.f41924 = new ArrayList(2);
        }
        List list = c13119.f41924;
        EnumC13152 enumC13152M16719 = c5695.m16719();
        if (enumC13152M16719 == null) {
            i = 0;
        } else {
            int i2 = C4916.f17172[enumC13152M16719.ordinal()];
            if (i2 == 1) {
                i = 1;
            } else if (i2 != 2) {
                i = 0;
            }
        }
        ((ArrayList) list).add(new C16848(i, interfaceC20029.builder().m47531(length)));
        c13119.f41926 = c5695.m16721();
    }
}
