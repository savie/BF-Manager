package l;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M7SQ */
/* JADX INFO: loaded from: classes3.dex */
public class C4944 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C4944 f17279 = new C4944();

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ void mo1572(C1145 c1145, Object obj) throws IOException {
        m13732((AbstractC1810) obj, c1145);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC1810 m13733(C5379 c5379, EnumC22313 enumC22313) throws IOException {
        int i = C3035.f11347[enumC22313.ordinal()];
        if (i == 1) {
            c5379.m14913();
            return new C23684();
        }
        if (i != 2) {
            return null;
        }
        c5379.m14917();
        return new C4363();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1810 m13731(C5379 c5379, EnumC22313 enumC22313) throws IOException {
        int i = C3035.f11347[enumC22313.ordinal()];
        if (i == 3) {
            return new C2246(c5379.m14922());
        }
        if (i == 4) {
            return new C2246(new C9304(c5379.m14922()));
        }
        if (i == 5) {
            return new C2246(Boolean.valueOf(c5379.m14927()));
        }
        if (i == 6) {
            c5379.m14918();
            return C3221.f12023;
        }
        throw new IllegalStateException("Unexpected token: " + enumC22313);
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379 instanceof C14118) {
            ((C14118) c5379).getClass();
            throw null;
        }
        EnumC22313 enumC22313M14916 = c5379.m14916();
        AbstractC1810 abstractC1810M13733 = m13733(c5379, enumC22313M14916);
        if (abstractC1810M13733 == null) {
            return m13731(c5379, enumC22313M14916);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c5379.m14924()) {
                String strM14921 = abstractC1810M13733 instanceof C4363 ? c5379.m14921() : null;
                EnumC22313 enumC22313M14917 = c5379.m14916();
                AbstractC1810 abstractC1810M13734 = m13733(c5379, enumC22313M14917);
                boolean z = abstractC1810M13734 != null;
                AbstractC1810 abstractC1810M13731 = abstractC1810M13734 == null ? m13731(c5379, enumC22313M14917) : abstractC1810M13734;
                if (abstractC1810M13733 instanceof C23684) {
                    ((C23684) abstractC1810M13733).m52142(abstractC1810M13731);
                } else {
                    ((C4363) abstractC1810M13733).m12210(strM14921, abstractC1810M13731);
                }
                if (z) {
                    arrayDeque.addLast(abstractC1810M13733);
                    abstractC1810M13733 = abstractC1810M13731;
                }
            } else {
                if (abstractC1810M13733 instanceof C23684) {
                    c5379.m14929();
                } else {
                    c5379.m14910();
                }
                if (arrayDeque.isEmpty()) {
                    return abstractC1810M13733;
                }
                abstractC1810M13733 = (AbstractC1810) arrayDeque.removeLast();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13732(AbstractC1810 abstractC1810, C1145 c1145) throws IOException {
        if (abstractC1810 != null && !(abstractC1810 instanceof C3221)) {
            if (!(abstractC1810 instanceof C2246)) {
                boolean z = abstractC1810 instanceof C23684;
                if (!z) {
                    boolean z2 = abstractC1810 instanceof C4363;
                    if (z2) {
                        c1145.m4208();
                        if (z2) {
                            for (Map.Entry entry : ((C4363) abstractC1810).m12208()) {
                                c1145.m4204((String) entry.getKey());
                                m13732((AbstractC1810) entry.getValue(), c1145);
                            }
                            c1145.m4216();
                            return;
                        }
                        throw new IllegalStateException("Not a JSON Object: " + abstractC1810);
                    }
                    throw new IllegalArgumentException("Couldn't write " + abstractC1810.getClass());
                }
                c1145.m4200();
                if (z) {
                    Iterator it = ((C23684) abstractC1810).iterator();
                    while (it.hasNext()) {
                        m13732((AbstractC1810) it.next(), c1145);
                    }
                    c1145.m4199();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + abstractC1810);
            }
            C2246 c2246M5904 = abstractC1810.m5904();
            if (c2246M5904.m6895()) {
                c1145.m4203(c2246M5904.m6893());
                return;
            } else if (c2246M5904.m6898()) {
                c1145.m4209(c2246M5904.m6896());
                return;
            } else {
                c1145.m4212(c2246M5904.mo5903());
                return;
            }
        }
        c1145.m4214();
    }
}
