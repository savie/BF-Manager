package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.֫᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBGV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2168 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10918 f7146;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15000 f7147;

    public C2168(C10918 c10918, C15000 c15000) {
        if (c10918 == null) {
            throw new NullPointerException("file == null");
        }
        this.f7146 = c10918;
        this.f7147 = c15000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7463(AbstractC13487 abstractC13487) {
        int iM7459 = m7459(abstractC13487);
        C15000 c15000 = this.f7147;
        if (iM7459 != 0 && iM7459 != 6 && iM7459 != 2) {
            if (iM7459 == 3) {
                C6118.m17655(c15000, iM7459, ((AbstractC24149) abstractC13487).mo17876());
                return;
            }
            if (iM7459 != 4) {
                if (iM7459 == 16) {
                    C6118.m17654(c15000, iM7459, ((C17435) abstractC13487).mo17876() << 32);
                    return;
                }
                if (iM7459 == 17) {
                    C6118.m17654(c15000, iM7459, ((C11468) abstractC13487).mo17876());
                    return;
                }
                C10918 c10918 = this.f7146;
                switch (iM7459) {
                    case 21:
                        C6118.m17655(c15000, iM7459, c10918.m27708().m9034(((C7740) abstractC13487).m21068()));
                        return;
                    case 22:
                        C6118.m17655(c15000, iM7459, c10918.m27715().m35277((C21165) abstractC13487));
                        return;
                    case 23:
                        C6118.m17655(c15000, iM7459, c10918.m27714().m28065((C9976) abstractC13487));
                        return;
                    case 24:
                        C6118.m17655(c15000, iM7459, c10918.m27694().m46183((C1028) abstractC13487));
                        return;
                    case 25:
                        C6118.m17655(c15000, iM7459, c10918.m27705().m29336((C16689) abstractC13487));
                        return;
                    case 26:
                        C6118.m17655(c15000, iM7459, c10918.m27707().m42872((AbstractC22657) abstractC13487));
                        return;
                    case 27:
                        C6118.m17655(c15000, iM7459, c10918.m27705().m29336(((C24895) abstractC13487).m55427()));
                        return;
                    case 28:
                        c15000.m36129(iM7459);
                        m7462((C10722) abstractC13487, false);
                        return;
                    case 29:
                        c15000.m36129(iM7459);
                        m7461(((C4757) abstractC13487).m14670(), false);
                        return;
                    case 30:
                        c15000.m36129(iM7459);
                        return;
                    case 31:
                        c15000.m36129((((C19673) abstractC13487).mo17877() << 5) | iM7459);
                        return;
                    default:
                        throw new RuntimeException("Shouldn't happen");
                }
            }
        }
        long jMo17876 = ((AbstractC24149) abstractC13487).mo17876();
        int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((jMo17876 >> 63) ^ jMo17876)) >> 3;
        c15000.m36129(iM7459 | ((iNumberOfLeadingZeros - 1) << 5));
        while (iNumberOfLeadingZeros > 0) {
            c15000.m36129((byte) jMo17876);
            jMo17876 >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m7459(AbstractC13487 abstractC13487) {
        if (abstractC13487 instanceof C15197) {
            return 0;
        }
        if (abstractC13487 instanceof C18927) {
            return 2;
        }
        if (abstractC13487 instanceof C1774) {
            return 3;
        }
        if (abstractC13487 instanceof C15943) {
            return 4;
        }
        if (abstractC13487 instanceof C4011) {
            return 6;
        }
        if (abstractC13487 instanceof C17435) {
            return 16;
        }
        if (abstractC13487 instanceof C11468) {
            return 17;
        }
        if (abstractC13487 instanceof C7740) {
            return 21;
        }
        if (abstractC13487 instanceof C21165) {
            return 22;
        }
        if (abstractC13487 instanceof C9976) {
            return 23;
        }
        if (abstractC13487 instanceof C1028) {
            return 24;
        }
        if (abstractC13487 instanceof C16689) {
            return 25;
        }
        if (abstractC13487 instanceof C18181) {
            return 26;
        }
        if (abstractC13487 instanceof C24895) {
            return 27;
        }
        if (abstractC13487 instanceof C10722) {
            return 28;
        }
        if (abstractC13487 instanceof C4757) {
            return 29;
        }
        if (abstractC13487 instanceof C20419) {
            return 30;
        }
        if (abstractC13487 instanceof C19673) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7462(C10722 c10722, boolean z) {
        C15000 c15000 = this.f7147;
        boolean z2 = z && c15000.m36116();
        C21911 c21911M27305 = c10722.m27305();
        int size = c21911M27305.size();
        if (z2) {
            c15000.m36113("  size: ".concat(C5306.m15938(size)));
        }
        c15000.m36117(size);
        for (int i = 0; i < size; i++) {
            AbstractC13487 abstractC13487M31615get = c21911M27305.m31615get(i);
            if (z2) {
                c15000.m36113("  [" + Integer.toHexString(i) + "] " + m7460(abstractC13487M31615get));
            }
            m7463(abstractC13487M31615get);
        }
        if (z2) {
            c15000.m36126();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7461(C8791 c8791, boolean z) {
        C15000 c15000 = this.f7147;
        boolean z2 = z && c15000.m36116();
        C10918 c10918 = this.f7146;
        C11116 c11116M27714 = c10918.m27714();
        C20067 c20067M27694 = c10918.m27694();
        C1028 type = c8791.getType();
        int iM46183 = c20067M27694.m46183(type);
        if (z2) {
            c15000.m36113("  type_idx: " + C5306.m15938(iM46183) + " // " + type.mo1843());
        }
        c15000.m36117(c20067M27694.m46183(c8791.getType()));
        Collection<C21692> collectionM23588 = c8791.m23588();
        int size = collectionM23588.size();
        if (z2) {
            c15000.m36113("  size: ".concat(C5306.m15938(size)));
        }
        c15000.m36117(size);
        int i = 0;
        for (C21692 c21692 : collectionM23588) {
            C9976 name = c21692.getName();
            int iM28065 = c11116M27714.m28065(name);
            AbstractC13487 value = c21692.getValue();
            if (z2) {
                c15000.m36111(0, "  elements[" + i + "]:");
                i++;
                c15000.m36113("    name_idx: " + C5306.m15938(iM28065) + " // " + name.mo1843());
            }
            c15000.m36117(iM28065);
            if (z2) {
                c15000.m36113("    value: " + m7460(value));
            }
            m7463(value);
        }
        if (z2) {
            c15000.m36126();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m7460(AbstractC13487 abstractC13487) {
        if (m7459(abstractC13487) == 30) {
            return "null";
        }
        return abstractC13487.mo1845() + ' ' + abstractC13487.mo1843();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7457(C10918 c10918, C8791 c8791) {
        C20067 c20067M27694 = c10918.m27694();
        C11116 c11116M27714 = c10918.m27714();
        c20067M27694.m46187(c8791.getType());
        for (C21692 c21692 : c8791.m23588()) {
            c11116M27714.m28068(c21692.getName());
            m7458(c10918, c21692.getValue());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7458(C10918 c10918, AbstractC13487 abstractC13487) {
        if (abstractC13487 instanceof C4757) {
            m7457(c10918, ((C4757) abstractC13487).m14670());
            return;
        }
        if (abstractC13487 instanceof C10722) {
            C21911 c21911M27305 = ((C10722) abstractC13487).m27305();
            int size = c21911M27305.size();
            for (int i = 0; i < size; i++) {
                m7458(c10918, c21911M27305.m31615get(i));
            }
            return;
        }
        c10918.m27712(abstractC13487);
    }
}
