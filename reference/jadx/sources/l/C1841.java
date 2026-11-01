package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֫۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: AA2F */
/* JADX INFO: loaded from: classes3.dex */
public final class C1841 extends ConcurrentMapC13783 {
    public static final long serialVersionUID = 3024739453186759259L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f7040 = C13488.m32998(C1841.class.getName());

    @Override // l.ConcurrentMapC13783, java.util.AbstractMap
    public final synchronized String toString() {
        StringBuilder sb;
        try {
            sb = new StringBuilder(2000);
            sb.append("\n\t---- cache ----");
            for (Map.Entry entry : entrySet()) {
                sb.append("\n\n\t\tname '");
                sb.append((String) entry.getKey());
                sb.append('\'');
                List<AbstractC9604> list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    sb.append(" : no entries");
                } else {
                    synchronized (list) {
                        for (AbstractC9604 abstractC9604 : list) {
                            sb.append("\n\t\t\t");
                            sb.append(abstractC9604.toString());
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    public C1841() {
        super(1024);
    }

    @Override // java.util.AbstractMap
    public final Object clone() {
        C1841 c1841 = new C1841(size());
        c1841.putAll(this);
        return c1841;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m5989(String str) {
        ArrayList arrayList;
        Collection collectionM5988 = m5988(str);
        if (collectionM5988 != null) {
            synchronized (collectionM5988) {
                arrayList = new ArrayList(collectionM5988);
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Collection m5988(String str) {
        return (Collection) get(str != null ? str.toLowerCase() : null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC9604 m5995(AbstractC19918 abstractC19918) {
        Collection<AbstractC9604> collectionM5988;
        AbstractC9604 abstractC9604 = null;
        if (abstractC19918 == null || (collectionM5988 = m5988(abstractC19918.m24470())) == null) {
            return null;
        }
        synchronized (collectionM5988) {
            for (AbstractC9604 abstractC9605 : collectionM5988) {
                if (abstractC9605.mo19180((AbstractC9604) abstractC19918)) {
                    abstractC9604 = abstractC9605;
                    break;
                }
            }
        }
        return abstractC9604;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9604 m5990(String str, EnumC14357 enumC14357, EnumC23529 enumC23529) {
        Collection<AbstractC9604> collectionM5988 = m5988(str);
        AbstractC9604 abstractC9604 = null;
        if (collectionM5988 == null) {
            return null;
        }
        synchronized (collectionM5988) {
            for (AbstractC9604 abstractC9605 : collectionM5988) {
                if (abstractC9605.m24467().equals(enumC14357) && abstractC9605.m24472(enumC23529)) {
                    abstractC9604 = abstractC9605;
                    break;
                }
            }
        }
        return abstractC9604;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m5994(String str, EnumC14357 enumC14357, EnumC23529 enumC23529) {
        ArrayList arrayList;
        Collection collectionM5988 = m5988(str);
        if (collectionM5988 != null) {
            synchronized (collectionM5988) {
                arrayList = new ArrayList(collectionM5988);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC9604 abstractC9604 = (AbstractC9604) it.next();
                    if (!abstractC9604.m24467().equals(enumC14357) || !abstractC9604.m24472(enumC23529)) {
                        it.remove();
                    }
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5992(AbstractC19918 abstractC19918) {
        if (abstractC19918 != null) {
            List list = (List) get(abstractC19918.m24470());
            if (list == null) {
                putIfAbsent(abstractC19918.m24470(), new ArrayList());
                list = (List) get(abstractC19918.m24470());
            }
            List list2 = list;
            synchronized (list2) {
                list2.add(abstractC19918);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m5993(AbstractC19918 abstractC19918) {
        boolean zRemove;
        List list = (List) get(abstractC19918.m24470());
        if (list != null) {
            synchronized (list) {
                zRemove = list.remove(abstractC19918);
            }
        } else {
            zRemove = false;
        }
        if (zRemove && list.isEmpty()) {
            remove(abstractC19918.m24470());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5991() {
        InterfaceC4314 interfaceC4314 = f7040;
        if (interfaceC4314.mo12133()) {
            interfaceC4314.mo12129(toString(), "Cached DNSEntries: {}");
        }
    }
}
