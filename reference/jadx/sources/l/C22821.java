package l;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: AIYD */
/* JADX INFO: loaded from: classes.dex */
public final class C22821 extends AbstractC16700 {
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        m51451(c2551);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m51450(C2551 c2551) {
        Iterator it = c2551.m8490().iterator();
        while (it.hasNext()) {
            ((C17973) it.next()).m41944();
        }
        m51451(c2551);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51451(C2551 c2551) {
        C6041 c6041M8517 = c2551.m8517();
        if (c6041M8517 != null) {
            C17973 c17973M17530 = c6041M8517.m17530();
            if (c17973M17530 == null) {
                c17973M17530 = c2551.m8497(c6041M8517);
            }
            m51449(c17973M17530);
        }
        for (C6041 c6041 : c2551.m8526()) {
            C17973 c17973M17531 = c6041.m17530();
            if (c17973M17531 == null) {
                c17973M17531 = c2551.m8497(c6041);
            }
            m51449(c17973M17531);
        }
        Iterator it = c2551.m8490().iterator();
        while (it.hasNext()) {
            m51449((C17973) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51449(C17973 c17973) {
        if (c17973.m41928()) {
            return;
        }
        C11260 c11260 = new C11260();
        C6041 c6041M41930 = c17973.m41930();
        if (c6041M41930.mo17865(EnumC1763.THIS)) {
            c11260.m28506("this");
            c11260.m28520();
        }
        if (c6041M41930.mo17865(EnumC1763.METHOD_ARGUMENT) || c6041M41930.mo17865(EnumC1763.CUSTOM_DECLARE)) {
            c11260.m28504();
        }
        List listM41939 = c17973.m41939();
        if (!listM41939.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(c17973);
            m51448(listM41939, linkedHashSet);
            if (linkedHashSet.size() > 1) {
                List list = (List) C1170.stream(linkedHashSet).map(new C4921(0)).filter(new C22075(0)).filter(new C18297(2)).distinct().collect(C2025.toList());
                int size = list.size();
                if (size == 1) {
                    c11260.m28508((AbstractC1566) list.get(0));
                } else if (size > 1) {
                    throw new C8597("Several immutable types in one variable: " + list + ", vars: " + linkedHashSet);
                }
            }
            C4937.forEach(linkedHashSet, new C16517(2, c11260));
            return;
        }
        c17973.m41934(c11260);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51448(List list, LinkedHashSet linkedHashSet) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18981 c18981 = (C18981) it.next();
            C17973 c17973M17530 = c18981.m44027().m17530();
            if (linkedHashSet.add(c17973M17530)) {
                m51448(c17973M17530.m41939(), linkedHashSet);
            }
            C4937.forEach(c18981.m44026(), new C10886(0, linkedHashSet));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51447(LinkedHashSet linkedHashSet, AbstractC16481 abstractC16481) {
        C17973 c17973M17530 = ((C6041) abstractC16481).m17530();
        if (linkedHashSet.add(c17973M17530)) {
            m51448(c17973M17530.m41939(), linkedHashSet);
        }
    }
}
