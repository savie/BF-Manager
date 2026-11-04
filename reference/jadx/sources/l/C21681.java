package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: UIX4 */
/* JADX INFO: loaded from: classes.dex */
public final class C21681 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Set f69202;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f69203;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashMap f69204;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public HashMap f69205;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f69206 = new HashSet();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1610 f69207;

    static {
        C16980.m40037(C21681.class);
        f69202 = Collections.singleton("java.lang.Object");
    }

    public C21681(C1610 c1610) {
        this.f69207 = c1610;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49228() {
        C8780 c8780 = new C8780(this.f69207);
        c8780.m23485();
        if (this.f69204 == null) {
            HashMap map = new HashMap(c8780.m23483());
            this.f69204 = map;
            c8780.m23484(map);
            return;
        }
        throw new C8597("Classpath already loaded");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49225(ArrayList arrayList) {
        if (this.f69204 == null) {
            this.f69204 = new HashMap(arrayList.size());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C24927 c24927 = (C24927) it.next();
            AbstractC1566 type = c24927.m55571().getType();
            String strMo5570 = type.mo5570();
            int iM26537 = c24927.mo8547().m26537();
            EnumC14000 enumC14000 = EnumC14000.APP;
            C7289 c7289 = new C7289(iM26537, type);
            c7289.m19955(C8780.m23480(c24927));
            this.f69204.put(strMo5570, c7289);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m49226(String str) {
        return this.f69204.containsKey(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7289 m49222(AbstractC1566 abstractC1566) {
        return (C7289) this.f69204.get(abstractC1566.mo5570());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21197 m49223(C21965 c21965) {
        C10492 c10492;
        C7289 c7289 = (C7289) this.f69204.get(c21965.m49700().m4966());
        if (c7289 == null) {
            return null;
        }
        C10492 c10493 = (C10492) c7289.m19960().get(c21965.m49701());
        if (c10493 != null) {
            return c10493;
        }
        for (AbstractC1566 abstractC1566 : c7289.m19961()) {
            C7289 c72810 = (C7289) this.f69204.get(abstractC1566.mo5570());
            if (c72810 == null) {
                this.f69206.add(abstractC1566.mo5570());
            }
            if (c72810 != null && (c10492 = (C10492) c72810.m19960().get(c21965.m49701())) != null) {
                return c10492;
            }
        }
        return new C22427(c21965);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m49221(String str) {
        List list = (List) this.f69203.get(str);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Set m49227(String str) {
        Set set = (Set) this.f69205.get(str);
        return set == null ? Collections.EMPTY_SET : set;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49224() {
        Collection collectionSingleton;
        HashMap map = new HashMap(this.f69204.size());
        HashSet hashSet = new HashSet();
        Iterator it = this.f69204.entrySet().iterator();
        while (it.hasNext()) {
            C7289 c7289 = (C7289) ((Map.Entry) it.next()).getValue();
            hashSet.clear();
            m49220(c7289, hashSet);
            int size = hashSet.size();
            if (size == 0) {
                collectionSingleton = Collections.EMPTY_SET;
            } else if (size == 1) {
                String str = (String) hashSet.iterator().next();
                if (str.equals("java.lang.Object")) {
                    collectionSingleton = f69202;
                } else {
                    collectionSingleton = Collections.singleton(str);
                }
            } else {
                collectionSingleton = new HashSet(hashSet);
            }
            map.put(c7289.m19956(), collectionSingleton);
        }
        this.f69205 = map;
        HashMap map2 = new HashMap(this.f69204.size());
        ArrayList<String> arrayList = new ArrayList(this.f69204.keySet());
        Collections.sort(arrayList);
        for (String str2 : arrayList) {
            Iterator it2 = m49227(str2).iterator();
            while (it2.hasNext()) {
                ((List) C11392.computeIfAbsent(map2, (String) it2.next(), new C4527(0))).add(str2);
            }
        }
        this.f69203 = map2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49220(C7289 c7289, HashSet hashSet) {
        for (AbstractC1566 abstractC1566 : c7289.m19961()) {
            if (abstractC1566 != null) {
                C7289 c72810 = (C7289) this.f69204.get(abstractC1566.mo5570());
                if (c72810 == null) {
                    this.f69206.add(abstractC1566.mo5570());
                }
                if (c72810 != null) {
                    if (hashSet.add(c72810.m19956())) {
                        m49220(c72810, hashSet);
                    }
                } else {
                    hashSet.add(abstractC1566.mo5570());
                }
            }
        }
    }
}
