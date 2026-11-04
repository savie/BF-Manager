package l;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7SQ */
/* JADX INFO: loaded from: classes.dex */
public class C25378 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C25378 f81932 = new C25378();

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo3722(C4208 c4208) {
        return m56738(c4208);
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ void mo3723(C21362 c21362, Object obj) throws IOException {
        m56740((AbstractC0655) obj, c21362);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC0655 m56741(C4208 c4208, EnumC14648 enumC14648) throws IOException {
        int i = C11951.f38491[enumC14648.ordinal()];
        if (i == 1) {
            c4208.m13441();
            return new C21538();
        }
        if (i != 2) {
            return null;
        }
        c4208.m13456();
        return new C10349();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0655 m56739(C4208 c4208, EnumC14648 enumC14648) throws IOException {
        int i = C11951.f38491[enumC14648.ordinal()];
        if (i == 3) {
            return new C2892(c4208.m13453());
        }
        if (i == 4) {
            return new C2892(new C1160(c4208.m13453()));
        }
        if (i == 5) {
            return new C2892(Boolean.valueOf(c4208.m13440()));
        }
        if (i == 6) {
            c4208.m13444();
            return C19300.f62377;
        }
        throw new IllegalStateException("Unexpected token: " + enumC14648);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0655 m56738(C4208 c4208) throws IOException {
        if (c4208 instanceof C17918) {
            ((C17918) c4208).getClass();
            throw null;
        }
        EnumC14648 enumC14648M13438 = c4208.m13438();
        AbstractC0655 abstractC0655M56741 = m56741(c4208, enumC14648M13438);
        if (abstractC0655M56741 == null) {
            return m56739(c4208, enumC14648M13438);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c4208.m13457()) {
                String strM13437 = abstractC0655M56741 instanceof C10349 ? c4208.m13437() : null;
                EnumC14648 enumC14648M13439 = c4208.m13438();
                AbstractC0655 abstractC0655M56742 = m56741(c4208, enumC14648M13439);
                boolean z = abstractC0655M56742 != null;
                AbstractC0655 abstractC0655M56739 = abstractC0655M56742 == null ? m56739(c4208, enumC14648M13439) : abstractC0655M56742;
                if (abstractC0655M56741 instanceof C21538) {
                    ((C21538) abstractC0655M56741).m48983(abstractC0655M56739);
                } else {
                    ((C10349) abstractC0655M56741).m26625(strM13437, abstractC0655M56739);
                }
                if (z) {
                    arrayDeque.addLast(abstractC0655M56741);
                    abstractC0655M56741 = abstractC0655M56739;
                }
            } else {
                if (abstractC0655M56741 instanceof C21538) {
                    c4208.m13449();
                } else {
                    c4208.m13447();
                }
                if (arrayDeque.isEmpty()) {
                    return abstractC0655M56741;
                }
                abstractC0655M56741 = (AbstractC0655) arrayDeque.removeLast();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56740(AbstractC0655 abstractC0655, C21362 c21362) throws IOException {
        if (abstractC0655 != null && !(abstractC0655 instanceof C19300)) {
            if (!(abstractC0655 instanceof C2892)) {
                boolean z = abstractC0655 instanceof C21538;
                if (!z) {
                    boolean z2 = abstractC0655 instanceof C10349;
                    if (z2) {
                        c21362.m48600();
                        if (z2) {
                            for (Map.Entry entry : ((C10349) abstractC0655).m26626()) {
                                c21362.m48589((String) entry.getKey());
                                m56740((AbstractC0655) entry.getValue(), c21362);
                            }
                            c21362.m48597();
                            return;
                        }
                        throw new IllegalStateException("Not a JSON Object: " + abstractC0655);
                    }
                    throw new IllegalArgumentException("Couldn't write " + abstractC0655.getClass());
                }
                c21362.m48585();
                if (z) {
                    Iterator it = ((C21538) abstractC0655).iterator();
                    while (it.hasNext()) {
                        m56740((AbstractC0655) it.next(), c21362);
                    }
                    c21362.m48594();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + abstractC0655);
            }
            C2892 c2892M2867 = abstractC0655.m2867();
            if (c2892M2867.m9518()) {
                c21362.m48588(c2892M2867.m9521());
                return;
            } else if (c2892M2867.m9519()) {
                c21362.m48595(c2892M2867.m9523());
                return;
            } else {
                c21362.m48602(c2892M2867.mo2866());
                return;
            }
        }
        c21362.m48598();
    }
}
