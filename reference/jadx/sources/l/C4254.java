package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: AA2F */
/* JADX INFO: loaded from: classes3.dex */
public final class C4254 extends ConcurrentMapC17249 {
    public static final long serialVersionUID = 3024739453186759259L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f15482 = C16980.m40038(C4254.class.getName());

    @Override // l.ConcurrentMapC17249, java.util.AbstractMap
    public final synchronized String toString() {
        StringBuilder sb;
        try {
            sb = new StringBuilder(2000);
            sb.append("\n\t---- cache ----");
            for (Map.Entry entry : entrySet()) {
                sb.append("\n\n\t\tname '");
                sb.append((String) entry.getKey());
                sb.append('\'');
                List<AbstractC14694> list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    sb.append(" : no entries");
                } else {
                    synchronized (list) {
                        for (AbstractC14694 abstractC14694 : list) {
                            sb.append("\n\t\t\t");
                            sb.append(abstractC14694.toString());
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    public C4254() {
        super(1024);
    }

    @Override // java.util.AbstractMap
    public final Object clone() {
        C4254 c4254 = new C4254(size());
        c4254.putAll(this);
        return c4254;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m13576(String str) {
        ArrayList arrayList;
        Collection collectionM13575 = m13575(str);
        if (collectionM13575 != null) {
            synchronized (collectionM13575) {
                arrayList = new ArrayList(collectionM13575);
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Collection m13575(String str) {
        return (Collection) get(str != null ? str.toLowerCase() : null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC14694 m13582(AbstractC17152 abstractC17152) {
        Collection<AbstractC14694> collectionM13575;
        AbstractC14694 abstractC14694 = null;
        if (abstractC17152 == null || (collectionM13575 = m13575(abstractC17152.m35350())) == null) {
            return null;
        }
        synchronized (collectionM13575) {
            for (AbstractC14694 abstractC14695 : collectionM13575) {
                if (abstractC14695.mo7636((AbstractC14694) abstractC17152)) {
                    abstractC14694 = abstractC14695;
                    break;
                }
            }
        }
        return abstractC14694;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14694 m13577(String str, EnumC24021 enumC24021, EnumC6121 enumC6121) {
        Collection<AbstractC14694> collectionM13575 = m13575(str);
        AbstractC14694 abstractC14694 = null;
        if (collectionM13575 == null) {
            return null;
        }
        synchronized (collectionM13575) {
            for (AbstractC14694 abstractC14695 : collectionM13575) {
                if (abstractC14695.m35360().equals(enumC24021) && abstractC14695.m35352(enumC6121)) {
                    abstractC14694 = abstractC14695;
                    break;
                }
            }
        }
        return abstractC14694;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m13581(String str, EnumC24021 enumC24021, EnumC6121 enumC6121) {
        ArrayList arrayList;
        Collection collectionM13575 = m13575(str);
        if (collectionM13575 != null) {
            synchronized (collectionM13575) {
                arrayList = new ArrayList(collectionM13575);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC14694 abstractC14694 = (AbstractC14694) it.next();
                    if (!abstractC14694.m35360().equals(enumC24021) || !abstractC14694.m35352(enumC6121)) {
                        it.remove();
                    }
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13579(AbstractC17152 abstractC17152) {
        if (abstractC17152 != null) {
            List list = (List) get(abstractC17152.m35350());
            if (list == null) {
                putIfAbsent(abstractC17152.m35350(), new ArrayList());
                list = (List) get(abstractC17152.m35350());
            }
            List list2 = list;
            synchronized (list2) {
                list2.add(abstractC17152);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m13580(AbstractC17152 abstractC17152) {
        boolean zRemove;
        List list = (List) get(abstractC17152.m35350());
        if (list != null) {
            synchronized (list) {
                zRemove = list.remove(abstractC17152);
            }
        } else {
            zRemove = false;
        }
        if (zRemove && list.isEmpty()) {
            remove(abstractC17152.m35350());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13578() {
        InterfaceC25186 interfaceC25186 = f15482;
        if (interfaceC25186.mo13713()) {
            interfaceC25186.mo13708(toString(), "Cached DNSEntries: {}");
        }
    }
}
