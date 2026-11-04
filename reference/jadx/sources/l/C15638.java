package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D6FW */
/* JADX INFO: loaded from: classes5.dex */
public final class C15638 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11909 f50779;

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        this.f50779 = new C11909(c1610);
        c1610.m5681().getClass();
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.mo17865(EnumC1763.DONT_GENERATE)) {
            return;
        }
        C10293 c10293Mo8547 = c2551.mo8547();
        C16260 c16260 = (C16260) c2551.mo17862((InterfaceC2157) C11457.f36025);
        if (c16260 != null && !c16260.m38596().isEmpty()) {
            C10293 c10293 = new C10293(((InterfaceC21197) c16260.m38596().get(0)).mo8545(), EnumC19244.METHOD);
            if (c10293Mo8547.m26532(c10293)) {
                m37389(c2551, c10293.m26545().m26537());
            }
        }
        Iterator it = c2551.m8514().iterator();
        while (it.hasNext()) {
            this.f50779.m29849(c2551, (C2551) it.next(), new C20114());
        }
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        C10293 c10293Mo8547 = c24927.mo8547();
        if (!c24927.m55579() || !c10293Mo8547.m26542()) {
            if (c24927.m55579() && (c10293Mo8547.m26549() || c10293Mo8547.m26541())) {
                m37389(c24927, 1);
                return true;
            }
            Iterator it = c24927.m55533().iterator();
            while (it.hasNext()) {
                this.f50779.m29849(c24927, (C24927) it.next(), new C11163());
            }
            for (C2551 c2551 : c24927.m55555()) {
                C17752 c17752 = (C17752) c2551.mo17862((InterfaceC2157) C11457.f36009);
                boolean z = (c17752 == null || c17752.m41568()) ? false : true;
                boolean zMo17865 = c2551.mo17865(EnumC1763.METHOD_CANDIDATE_FOR_INLINE);
                if (z || zMo17865) {
                    Iterator it2 = ((Set) C1170.stream(c2551.m8514()).map(new C24125(4)).collect(C2025.toSet())).iterator();
                    while (it2.hasNext()) {
                        this.f50779.m29849(c24927, (C24927) it2.next(), new C23098());
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37389(AbstractC12531 abstractC12531, int i) {
        String str;
        C10293 c10293Mo8547 = abstractC12531.mo8547();
        C10293 c10293M26531 = c10293Mo8547.m26531(i);
        if (c10293M26531 != c10293Mo8547) {
            abstractC12531.mo8501(c10293M26531);
            if (c10293Mo8547.m26536()) {
                str = "package-private";
            } else if (c10293Mo8547.m26542()) {
                str = "public";
            } else if (c10293Mo8547.m26549()) {
                str = "private";
            } else {
                if (!c10293Mo8547.m26541()) {
                    throw new C8597("Unknown visibility flags: " + c10293Mo8547.m26545());
                }
                str = "protected";
            }
            abstractC12531.m31137("Access modifiers changed from: ".concat(str));
        }
    }
}
