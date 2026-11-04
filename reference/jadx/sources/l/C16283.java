package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37LB */
/* JADX INFO: loaded from: classes5.dex */
public final class C16283 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7312 f52878;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C17775 f52877 = new C17775(C14769.m35543(), C14769.m35543(), false);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C13477 f52876 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17775 m38636(C10162 c10162, C17775 c17775, C17775 c17776, C17775 c17777) {
        C17775 c17778 = f52877;
        if (c17775 == c17778 && c17776 == c17778 && c17777 == c17778) {
            return c17778;
        }
        C14769 c14769 = c17775.f58362;
        C14769 c147610 = c17775.f58360;
        C14769 c147611 = c17777.f58362;
        C14769 c147612 = c17777.f58360;
        C14769 c14769M38633 = m38633(c10162, c14769, c147611);
        C14769 c147613 = c17776.f58362;
        C14769 c147614 = c17776.f58360;
        C14769 c14769M38634 = m38633(c10162, c147610, c147613);
        C14769 c14769M38635 = m38633(c10162, c17776.f58362, c17777.f58362);
        C14769 c14769M38636 = m38633(c10162, c17775.f58362, c147612);
        C14769 c14769M38637 = m38633(c10162, c147610, c147614);
        return new C17775(m38634(c10162, c14769M38635, c14769M38633, c14769M38634), m38634(c10162, m38633(c10162, c147614, c147612), c14769M38636, c14769M38637), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17775 m38635(C6435 c6435, C17775 c17775, C17775 c17776) {
        int i = C17029.f55652[c6435.mo2285().ordinal()];
        if (i == 1) {
            return m38637((AbstractC18367) c6435, c17775, c17776);
        }
        if (i != 2) {
            return f52877;
        }
        return new C17775(m38633(c6435, c17775.f58362, c17776.f58362), m38634(c6435, c17775.f58360, c17776.f58360), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17775 m38637(AbstractC18367 abstractC18367, C17775 c17775, C17775 c17776) {
        return new C17775(m38634(abstractC18367, c17775.f58362, c17776.f58362), m38633(abstractC18367, c17775.f58360, c17776.f58360), false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17775 m38638(AbstractC18367 abstractC18367, C17775 c17775, C17775 c17776) {
        if (c17775 == null || c17775.f58361) {
            return c17776;
        }
        return c17776.f58361 ? c17775 : new C17775(m38633(abstractC18367, c17775.f58362, c17776.f58362), m38633(abstractC18367, c17775.f58360, c17776.f58360), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14769 m38633(AbstractC18367 abstractC18367, C14769 c14769, C14769 c147610) {
        C14769 c14769M35543 = C14769.m35543();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C6650 c6650 = (C6650) it.next();
            Iterator it2 = c147610.iterator();
            while (it2.hasNext()) {
                C6650 c6651 = (C6650) it2.next();
                if (c6650.f38072 == c6651.f38072 && (c6650.f38071 & 4398046511104L) == 0 && (c6651.f38071 & 4398046511104L) == 0) {
                    this.f52878.m34520(abstractC18367, C22843.f74078);
                    c6651.f38071 |= 4398046511104L;
                    c14769M35543 = c14769M35543.m35546(c6651);
                }
            }
        }
        return c14769M35543;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final C14769 m38634(AbstractC18367 abstractC18367, C14769 c14769, C14769... c14769Arr) {
        for (C14769<C6650> c147610 : c14769Arr) {
            for (C6650 c6650 : c147610) {
                for (C6650 c6651 : c14769) {
                    if (c6651.f38072 == c6650.f38072 && (c6651.f38071 & 4398046511104L) == 0 && (c6650.f38071 & 4398046511104L) == 0) {
                        this.f52878.m34520(abstractC18367, C22843.f74078);
                        c6650.f38071 |= 4398046511104L;
                    }
                }
                c14769 = c14769.m35546(c6650);
            }
        }
        return c14769;
    }

    public C16283(C4747 c4747) {
        this.f52878 = C7312.m20023(c4747);
    }
}
