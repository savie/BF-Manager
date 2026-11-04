package l;

/* JADX INFO: renamed from: l.۬ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R68J */
/* JADX INFO: loaded from: classes4.dex */
public final class C14037 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9086 f44482 = new C9086();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18783 f44483 = new C18783();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23407 m34204(AbstractC11800 abstractC11800) {
        return m34200(abstractC11800, 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23407 m34201(AbstractC11800 abstractC11800) {
        return m34200(abstractC11800, 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23407 m34200(AbstractC11800 abstractC11800, int i) {
        C8817 c8817;
        C23407 c23407;
        C9086 c9086 = this.f44482;
        int iM24223 = c9086.m24223(abstractC11800);
        if (iM24223 >= 0 && (c8817 = (C8817) c9086.m24221(iM24223)) != null) {
            int i2 = c8817.f28820;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c8817.f28820 = i3;
                if (i == 4) {
                    c23407 = c8817.f28821;
                } else if (i == 8) {
                    c23407 = c8817.f28822;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    c9086.m24222(iM24223);
                    c8817.f28820 = 0;
                    c8817.f28821 = null;
                    c8817.f28822 = null;
                    C8817.f28819.mo18920(c8817);
                }
                return c23407;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34202(AbstractC11800 abstractC11800, C23407 c23407) {
        C9086 c9086 = this.f44482;
        C8817 c8817M23658 = (C8817) c9086.get(abstractC11800);
        if (c8817M23658 == null) {
            c8817M23658 = C8817.m23658();
            c9086.put(abstractC11800, c8817M23658);
        }
        c8817M23658.f28822 = c23407;
        c8817M23658.f28820 |= 8;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m34203(AbstractC11800 abstractC11800) {
        C8817 c8817 = (C8817) this.f44482.get(abstractC11800);
        if (c8817 == null) {
            return;
        }
        c8817.f28820 &= -2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m34205(AbstractC11800 abstractC11800) {
        C18783 c18783 = this.f44483;
        for (int iM43578 = c18783.m43578() - 1; iM43578 >= 0; iM43578--) {
            if (abstractC11800 == c18783.m43577(iM43578)) {
                if (c18783.f60999[iM43578] == C9832.f31648) {
                    break;
                }
                c18783.f60999[iM43578] = C9832.f31648;
                c18783.f61000 = true;
                break;
            }
        }
        C8817 c8817 = (C8817) this.f44482.remove(abstractC11800);
        if (c8817 != null) {
            c8817.f28820 = 0;
            c8817.f28821 = null;
            c8817.f28822 = null;
            C8817.f28819.mo18920(c8817);
        }
    }
}
