package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O6FE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1930 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2551 f6481;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8706 f6482;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11624 f6483;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10132 f6484;

    static {
        C16980.m40037(C1930.class);
    }

    public C1930(C2551 c2551) {
        this.f6481 = c2551;
        this.f6483 = new C11624(c2551);
        C10132 c10132M5685 = c2551.mo8527().m5685();
        this.f6484 = c10132M5685;
        this.f6482 = c10132M5685.m26142();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6631() {
        C2551 c2551 = this.f6481;
        if (c2551.m8490().size() > 5000) {
            c2551.m31138("Multi-variable search skipped. Vars limit reached: " + c2551.m8490().size() + " (expected less than 5000)");
            return false;
        }
        int i = 1;
        C4937.forEach(c2551.m8490(), new C5922(i, this));
        C4937.forEach(c2551.m8490(), new C10711(i, this));
        C11624 c11624 = this.f6483;
        boolean z = true;
        C4937.forEach(c11624.m29194(), new C0882(1 == true ? 1 : 0, this));
        List listM29194 = c11624.m29194();
        if (!listM29194.isEmpty()) {
            int size = listM29194.size();
            Iterator it = listM29194.iterator();
            while (it.hasNext()) {
                ((C25051) it.next()).m55870();
            }
            int i2 = 0;
            loop1: do {
                Iterator it2 = listM29194.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        Iterator it3 = listM29194.iterator();
                        while (it3.hasNext()) {
                            ((C25051) it3.next()).m55868(true);
                        }
                        Iterator it4 = listM29194.iterator();
                        while (it4.hasNext()) {
                            if (!m6628((C25051) it4.next())) {
                                return false;
                            }
                        }
                    } else if (!m6628((C25051) it2.next())) {
                        if (!((C25051) listM29194.get(0)).m55871()) {
                            i2++;
                        } else {
                            if (1 >= size) {
                                break;
                            }
                            C25051 c25051 = (C25051) listM29194.get(1);
                            int i3 = 1;
                            while (c25051.m55871()) {
                                i3++;
                                if (i3 >= size) {
                                    break loop1;
                                }
                                c25051 = (C25051) listM29194.get(i3);
                            }
                            i2++;
                        }
                    }
                }
            } while (i2 <= 1000000);
            return false;
        }
        List<C25051> listM29191 = c11624.m29191();
        ArrayList<C25051> arrayList = new ArrayList();
        for (C25051 c25052 : listM29191) {
            C17973 c17973M55869 = c25052.m55869();
            AbstractC1566 abstractC1566M55872 = c25052.m55872();
            if (abstractC1566M55872.mo5564() && !abstractC1566M55872.equals(c17973M55869.m41943().m51445())) {
                c17973M55869.m41948(abstractC1566M55872);
                arrayList.add(c25052);
            }
        }
        for (C25051 c25053 : arrayList) {
            if (this.f6484.m26146(c2551, c25053.m55869(), c25053.m55872()) == EnumC4695.REJECT) {
                c2551.m31133("Multi-variable search result rejected for " + c25053);
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6627(final C1930 c1930, C25051 c25051) {
        if (C1170.stream(c25051.m55865()).flatMap(new C22773(4)).allMatch(new Predicate() { // from class: l.ᩴ۫᩵
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f63751.f6483.m29193((C17973) obj).m55875();
            }
        })) {
            c25051.m55870();
            while (!c1930.m6628(c25051)) {
                if (c25051.m55871()) {
                    return;
                }
            }
            c25051.m55868(true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m6628(C25051 c25051) {
        if (c25051.m55875()) {
            return true;
        }
        Iterator it = c25051.m55865().iterator();
        while (it.hasNext()) {
            if (!((InterfaceC6470) it.next()).mo18295(this.f6483)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6626(C1930 c1930, C17973 c17973) {
        Collection collectionSingletonList;
        Collection collection;
        C2551 c2551 = c1930.f6481;
        C25051 c25051M29193 = c1930.f6483.m29193(c17973);
        AbstractC1566 abstractC1566M41941 = c17973.m41941();
        if (abstractC1566M41941 != null) {
            c25051M29193.m55867(abstractC1566M41941);
            return;
        }
        AbstractC1566 abstractC1566M51445 = c17973.m41943().m51445();
        if (abstractC1566M51445.mo5564()) {
            c25051M29193.m55867(abstractC1566M51445);
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet<AbstractC1566> linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet<InterfaceC20640> linkedHashSetM51443 = c17973.m41943().m51443();
        for (InterfaceC20640 interfaceC20640 : linkedHashSetM51443) {
            if (interfaceC20640.mo2468() == EnumC15418.ASSIGN) {
                linkedHashSet.add(interfaceC20640.getType());
            } else {
                linkedHashSet2.add(interfaceC20640.getType());
            }
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        c1930.m6625(linkedHashSetM51443, linkedHashSet3, linkedHashSet);
        c1930.m6625(linkedHashSetM51443, linkedHashSet3, linkedHashSet2);
        Iterator it = linkedHashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC1566 abstractC1566 = (AbstractC1566) it.next();
            if (abstractC1566.mo5564()) {
                if (abstractC1566.mo5543()) {
                    collection = (List) C1170.stream(c2551.mo8527().m5691().m49227(abstractC1566.mo5570())).map(new C19705(0)).collect(C2025.toList());
                } else {
                    collection = Collections.EMPTY_LIST;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                for (EnumC12006 enumC12006 : abstractC1566.mo5560()) {
                    arrayList.add(AbstractC1566.m5536(enumC12006));
                }
                collection = arrayList;
            }
            c1930.m6625(linkedHashSetM51443, linkedHashSet3, collection);
        }
        for (AbstractC1566 abstractC1567 : linkedHashSet2) {
            if (abstractC1567.mo5564()) {
                if (abstractC1567.mo5543()) {
                    AbstractC1566 abstractC1568 = AbstractC1566.f5426;
                    if (abstractC1567.equals(abstractC1568)) {
                        collectionSingletonList = Collections.singletonList(abstractC1568);
                    } else {
                        collectionSingletonList = (List) C1170.stream(c2551.mo8527().m5691().m49221(abstractC1567.mo5570())).map(new C19705(0)).collect(C2025.toList());
                    }
                } else {
                    collectionSingletonList = Collections.EMPTY_LIST;
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (EnumC12006 enumC12007 : abstractC1567.mo5560()) {
                    arrayList2.add(AbstractC1566.m5536(enumC12007));
                }
                collectionSingletonList = arrayList2;
            }
            c1930.m6625(linkedHashSetM51443, linkedHashSet3, collectionSingletonList);
        }
        Iterator it2 = c17973.m41946().iterator();
        while (it2.hasNext()) {
            C18959 c18959M39118 = ((C6041) it2.next()).m39118();
            if (c18959M39118 != null && c18959M39118.getType() == EnumC24203.APUT) {
                AbstractC1566 type = c18959M39118.mo44035(2).getType();
                if (type.mo5564()) {
                    AbstractC1566 abstractC1566M5528 = AbstractC1566.m5528(type);
                    if (abstractC1566M5528.mo5564() && c1930.f6484.m26143(linkedHashSetM51443, abstractC1566M5528)) {
                        linkedHashSet3.add(abstractC1566M5528);
                        linkedHashSet3.size();
                    }
                }
            }
        }
        int size = linkedHashSet3.size();
        if (size == 0) {
            c25051M29193.m55868(true);
            c25051M29193.m55874(AbstractC1566.f5420);
            c25051M29193.m55866(Collections.EMPTY_LIST);
        } else if (size == 1) {
            c25051M29193.m55868(true);
            c25051M29193.m55874((AbstractC1566) linkedHashSet3.iterator().next());
            c25051M29193.m55866(Collections.EMPTY_LIST);
        } else {
            c25051M29193.m55868(false);
            c25051M29193.m55874(AbstractC1566.f5420);
            ArrayList arrayList3 = new ArrayList(linkedHashSet3);
            C12884.sort(arrayList3, c1930.f6482.m23405());
            c25051M29193.m55866(C4681.unmodifiableList(arrayList3));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6625(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC1566 abstractC1566 = (AbstractC1566) it.next();
            if (abstractC1566.mo5564() && this.f6484.m26143(linkedHashSet, abstractC1566)) {
                linkedHashSet2.add(abstractC1566);
                if (linkedHashSet2.size() > 10) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m6630(C1930 c1930, C17973 c17973) {
        C25051 c25051M29193 = c1930.f6483.m29193(c17973);
        if (c25051M29193.m55875()) {
            c25051M29193.m55873(Collections.EMPTY_LIST);
            return;
        }
        c25051M29193.m55873(new ArrayList());
        AbstractC22878 abstractC22878M6624 = c1930.m6624(c17973.m41930());
        if (abstractC22878M6624 != null) {
            c25051M29193.m55865().add(abstractC22878M6624);
        }
        Iterator it = c17973.m41946().iterator();
        while (it.hasNext()) {
            AbstractC22878 abstractC22878M6625 = c1930.m6624((C6041) it.next());
            if (abstractC22878M6625 != null) {
                c25051M29193.m55865().add(abstractC22878M6625);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC22878 m6624(C6041 c6041) {
        C18959 c18959M39118 = c6041.m39118();
        if (c18959M39118 == null || c6041.mo1129()) {
            return null;
        }
        int i = C5659.f19543[c18959M39118.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return new C13116(c18959M39118, c6041);
        }
        AbstractC16481 abstractC16481Mo44035 = c18959M39118.mo44035(0);
        abstractC16481Mo44035.getClass();
        if (abstractC16481Mo44035 instanceof C6041) {
            return new C15353(this, c18959M39118, c6041);
        }
        return null;
    }
}
