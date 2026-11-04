package l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6119 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4472 m17663(C4472 c4472, Collection collection) throws C25356 {
        if (!c4472.m14173().isEmpty()) {
            final C24654 c24654M14165 = c4472.m14165(collection);
            AbstractC14956 abstractC14956ListIterator = c4472.m14173().listIterator(0);
            C25400 c25400M56762 = C25400.m56762();
            while (abstractC14956ListIterator.hasNext()) {
                C12084 c12084M17664 = m17664(abstractC14956ListIterator);
                if (!c12084M17664.m30260() && C1170.stream(c12084M17664.m30263()).allMatch(new Predicate() { // from class: l.ۗۗܽ
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
                        return c24654M14165.mo12240(Integer.valueOf(((C6710) ((InterfaceC12455) obj).mo30930()).getIndex()));
                    }
                })) {
                    ArrayList arrayList = new ArrayList();
                    int iM30259 = c12084M17664.m30259();
                    arrayList.add(c12084M17664);
                    int iM30258 = -1;
                    while (abstractC14956ListIterator.hasNext()) {
                        C12084 c12084M17665 = m17664(abstractC14956ListIterator);
                        if (c12084M17665.m30260()) {
                            break;
                        }
                        arrayList.add(c12084M17665);
                        iM30258 = c12084M17665.m30258();
                    }
                    AbstractC18753 abstractC18753M43550 = AbstractC18753.m43550();
                    abstractC18753M43550.getClass();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        while (it.hasNext()) {
                            Object next2 = it.next();
                            if (abstractC18753M43550.compare(next, next2) > 0) {
                                ArrayList arrayListM43552 = AbstractC18753.m43550().m43552(arrayList);
                                StringBuilder sb = new StringBuilder();
                                for (int i = 0; i < arrayListM43552.size(); i++) {
                                    if (i > 0) {
                                        AbstractC14956 abstractC14956ListIterator2 = ((C12084) arrayList.get(i)).m30261().listIterator(0);
                                        while (abstractC14956ListIterator2.hasNext()) {
                                            sb.append(((InterfaceC20660) abstractC14956ListIterator2.next()).getText());
                                        }
                                    }
                                    sb.append(((C12084) arrayListM43552.get(i)).m30257());
                                    if (i < arrayListM43552.size() - 1) {
                                        AbstractC14956 abstractC14956ListIterator3 = ((C12084) arrayList.get(i)).m30262().listIterator(0);
                                        while (abstractC14956ListIterator3.hasNext()) {
                                            sb.append(((InterfaceC20660) abstractC14956ListIterator3.next()).getText());
                                        }
                                    }
                                }
                                c25400M56762.m56763(C2346.m7914(Integer.valueOf(iM30259), Integer.valueOf(iM30258)), sb.toString());
                                break;
                            }
                            next = next2;
                        }
                    }
                }
            }
            Map mapM56764 = c25400M56762.m56764();
            if (!((AbstractMap) mapM56764).isEmpty()) {
                StringBuilder sb2 = new StringBuilder(c4472.m14168());
                for (Map.Entry entry : mapM56764.entrySet()) {
                    C2346 c2346 = (C2346) entry.getKey();
                    sb2.replace(((Integer) c2346.m7922()).intValue(), ((Integer) c2346.m7920()).intValue(), (String) entry.getValue());
                }
                return new C4472(sb2.toString());
            }
        }
        return c4472;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12084 m17664(Iterator it) {
        InterfaceC12455 interfaceC12455 = (InterfaceC12455) it.next();
        int i = AbstractC1928.f6477;
        C22811 c22811 = new C22811();
        c22811.m19807(interfaceC12455);
        if (!((C6710) interfaceC12455.mo30930()).getText().equals("non")) {
            AbstractC1928 abstractC1928M51441 = c22811.m51441();
            return new C12084(abstractC1928M51441, m17665(abstractC1928M51441));
        }
        if (!it.hasNext()) {
            return new C12084(AbstractC1928.of(), null);
        }
        InterfaceC12455 interfaceC12456 = (InterfaceC12455) it.next();
        c22811.m19807(interfaceC12456);
        if (!((C6710) interfaceC12456.mo30930()).getText().equals("-") || !it.hasNext()) {
            return new C12084(AbstractC1928.of(), null);
        }
        c22811.m19807((InterfaceC12455) it.next());
        AbstractC1928 abstractC1928M51442 = c22811.m51441();
        return new C12084(abstractC1928M51442, m17665(abstractC1928M51442));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC24688 m17665(AbstractC1928 abstractC1928) {
        if (abstractC1928.size() == 1) {
            return m17666((InterfaceC12455) abstractC1928.get(0));
        }
        EnumC24688 enumC24688M17666 = m17666((InterfaceC12455) C16625.m39339(abstractC1928));
        if (enumC24688M17666 == null) {
            return null;
        }
        return EnumC24688.valueOf("NON_" + enumC24688M17666.name());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC24688 m17666(InterfaceC12455 interfaceC12455) {
        EnumC7466 enumC7466M18725 = ((C6710) interfaceC12455.mo30930()).m18725();
        if (enumC7466M18725 != null) {
            switch (C20289.f65137[enumC7466M18725.ordinal()]) {
                case 1:
                    return EnumC24688.f79880;
                case 2:
                    return EnumC24688.f79874;
                case 3:
                    return EnumC24688.f79881;
                case 4:
                    return EnumC24688.f79886;
                case 5:
                    return EnumC24688.f79879;
                case 6:
                    return EnumC24688.f79884;
                case 7:
                    return EnumC24688.f79873;
                case 8:
                    return EnumC24688.f79876;
                case 9:
                    return EnumC24688.f79887;
                case 10:
                    return EnumC24688.f79882;
                case 11:
                    return EnumC24688.f79878;
                case 12:
                    return EnumC24688.f79877;
            }
        }
        String text = ((C6710) interfaceC12455.mo30930()).getText();
        text.getClass();
        if (text.equals("sealed")) {
            return EnumC24688.valueOf("SEALED");
        }
        return null;
    }
}
