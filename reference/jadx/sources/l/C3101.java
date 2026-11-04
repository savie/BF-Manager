package l;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95VI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3101 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1610 f10026;

    public C3101(C1610 c1610) {
        this.f10026 = c1610;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m10103(AbstractC1566 abstractC1566) {
        C1610 c1610 = this.f10026;
        C24927 c24927M5672 = c1610.m5672(abstractC1566);
        if (c24927M5672 != null) {
            return c24927M5672.m55566();
        }
        C7289 c7289M49222 = c1610.m5691().m49222(abstractC1566);
        if (c7289M49222 == null || c7289M49222.m19959().isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List listM19959 = c7289M49222.m19959();
        return listM19959 == null ? Collections.EMPTY_LIST : listM19959;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10102(C24927 c24927, AbstractC1566 abstractC1566) {
        Collection collectionM55566;
        if (abstractC1566.m5567()) {
            if (c24927.m55552()) {
                collectionM55566 = new HashSet(c24927.m55566());
                c24927.m55541(new C17271(0, collectionM55566));
            } else {
                collectionM55566 = c24927.m55566();
            }
            m10101(c24927, abstractC1566, collectionM55566);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10100(C2551 c2551, AbstractC1566 abstractC1566) {
        if (abstractC1566.m5567()) {
            m10101(c2551, abstractC1566, m10099(c2551));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10101(final AbstractC12531 abstractC12531, final AbstractC1566 abstractC1566, final Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (C4123.m13232((Collection) ((AbstractC1566) it.next()).mo5549())) {
                abstractC1566.m5544(new Function() { // from class: l.ܺۖۗ
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public /* synthetic */ Function mo10608andThen(Function function) {
                        return C24247.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C24247.$default$compose(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        AbstractC1566 abstractC1567 = (AbstractC1566) obj;
                        if (!abstractC1567.m5569()) {
                            return null;
                        }
                        String strMo5570 = abstractC1567.mo5570();
                        for (AbstractC1566 abstractC1568 : collection) {
                            if (abstractC1568.mo5570().equals(strMo5570)) {
                                abstractC1567.mo5545(abstractC1568.mo5549());
                                return null;
                            }
                        }
                        abstractC12531.m31138("Unknown type variable: " + strMo5570 + " in type: " + abstractC1566);
                        return null;
                    }
                });
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set m10099(C2551 c2551) {
        Collection collectionM55566;
        C20736 c20736 = (C20736) c2551.mo17862(C11457.f36011);
        if (c20736 != null) {
            return c20736.m47431();
        }
        HashSet hashSet = new HashSet();
        C24927 c24927M8536 = c2551.m8536();
        if (c24927M8536.m55552()) {
            collectionM55566 = new HashSet(c24927M8536.m55566());
            c24927M8536.m55541(new C17271(0, collectionM55566));
        } else {
            collectionM55566 = c24927M8536.m55566();
        }
        hashSet.addAll(collectionM55566);
        hashSet.addAll(c2551.mo8554());
        boolean zIsEmpty = hashSet.isEmpty();
        Set set = hashSet;
        if (zIsEmpty) {
            set = Collections.EMPTY_SET;
        }
        C20736 c20736M47430 = C20736.m47430(set);
        c2551.mo17864(c20736M47430);
        return c20736M47430.m47431();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m10106(AbstractC1566 abstractC1566, AbstractC1566 abstractC1567, AbstractC1566 abstractC1568) {
        C14440 c14440 = null;
        if (abstractC1568 == null || abstractC1567 == null) {
            return null;
        }
        Map mapM10098 = Collections.EMPTY_MAP;
        C24927 c24927M5672 = this.f10026.m5672(abstractC1566);
        if (c24927M5672 != null && (c14440 = (C14440) c24927M5672.mo17862((InterfaceC2157) C11457.f36013)) == null) {
            HashMap map = new HashMap();
            AbstractC1566 type = c24927M5672.m55571().getType();
            map.put(type.mo5570(), m10108(type));
            c24927M5672.m55543(new C15779(this, map));
            C14440 c14441 = new C14440(c24927M5672.m55566(), map);
            c24927M5672.mo17864(c14441);
            c14440 = c14441;
        }
        if (c14440 != null) {
            mapM10098 = m10098(mapM10098, c14440.m34862(abstractC1567));
        }
        Map mapM10099 = m10098(mapM10098, m10108(abstractC1566));
        for (AbstractC1566 abstractC1566Mo5559 = abstractC1566.mo5559(); abstractC1566Mo5559 != null; abstractC1566Mo5559 = abstractC1566Mo5559.mo5559()) {
            mapM10099 = m10098(mapM10099, m10108(abstractC1566Mo5559));
        }
        return m10105(abstractC1568, mapM10099);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map m10098(Map map, Map map2) {
        if (map.isEmpty()) {
            return map2;
        }
        if (map2.isEmpty()) {
            return map;
        }
        HashMap map3 = new HashMap(map2.size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            AbstractC1566 abstractC1566 = (AbstractC1566) map2.remove((AbstractC1566) entry.getValue());
            if (abstractC1566 != null) {
                map3.put((AbstractC1566) entry.getKey(), abstractC1566);
            } else {
                map3.put((AbstractC1566) entry.getKey(), (AbstractC1566) entry.getValue());
            }
        }
        map3.putAll(map2);
        return map3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map m10108(AbstractC1566 abstractC1566) {
        if (!abstractC1566.mo5550()) {
            return Collections.EMPTY_MAP;
        }
        List listM10103 = this.f10026.m5692().m10103(abstractC1566);
        if (listM10103.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        List listMo5541 = abstractC1566.mo5541();
        if (C4123.m13229((Collection) listMo5541)) {
            return Collections.EMPTY_MAP;
        }
        int size = listMo5541.size();
        if (size != listM10103.size()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(size);
        for (int i = 0; i < size; i++) {
            AbstractC1566 abstractC1567 = (AbstractC1566) listMo5541.get(i);
            AbstractC1566 abstractC1566M5526 = (AbstractC1566) listM10103.get(i);
            if (abstractC1566M5526.mo5549() != null) {
                abstractC1566M5526 = AbstractC1566.m5526(abstractC1566M5526.mo5570());
            }
            map.put(abstractC1566M5526, abstractC1567);
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m10104(AbstractC15251 abstractC15251) {
        InterfaceC21197 interfaceC21197M19301 = this.f10026.m5683().m19301(abstractC15251);
        if (interfaceC21197M19301 == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(abstractC15251.m44039() + 1);
        AbstractC1566 abstractC1566Mo8519 = interfaceC21197M19301.mo8519();
        C6041 c6041M44027 = abstractC15251.m44027();
        if (c6041M44027 != null && abstractC1566Mo8519 != null && abstractC1566Mo8519.mo5564() && abstractC1566Mo8519.m5569()) {
            map.put(abstractC1566Mo8519, c6041M44027.getType());
        }
        int iMin = Math.min(interfaceC21197M19301.mo8537().size(), abstractC15251.m44039() - abstractC15251.mo13126());
        for (int i = 0; i < iMin; i++) {
            AbstractC1566 abstractC1566 = (AbstractC1566) interfaceC21197M19301.mo8537().get(i);
            AbstractC16481 abstractC16481Mo44035 = abstractC15251.mo44035(abstractC15251.mo13126() + i);
            if (abstractC16481Mo44035 != null && abstractC1566 != null && abstractC1566.mo5564() && abstractC1566.m5569()) {
                map.put(abstractC1566, abstractC16481Mo44035.getType());
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m10105(AbstractC1566 abstractC1566, final Map map) {
        if (map.isEmpty()) {
            return null;
        }
        if (abstractC1566.m5569()) {
            return (AbstractC1566) map.get(abstractC1566);
        }
        if (abstractC1566.m5554()) {
            AbstractC1566 abstractC1566M10105 = m10105(abstractC1566.mo5557(), map);
            if (abstractC1566M10105 == null) {
                return null;
            }
            return AbstractC1566.m5528(abstractC1566M10105);
        }
        AbstractC1566 abstractC1566Mo5563 = abstractC1566.mo5563();
        if (abstractC1566Mo5563 != null && abstractC1566Mo5563.m5567()) {
            AbstractC1566 abstractC1566M10106 = m10105(abstractC1566Mo5563, map);
            if (abstractC1566M10106 == null) {
                return null;
            }
            return AbstractC1566.m5531(abstractC1566M10106, abstractC1566.mo5542());
        }
        if (!abstractC1566.mo5550()) {
            return null;
        }
        AbstractC1566 abstractC1566Mo5559 = abstractC1566.mo5559();
        if (abstractC1566Mo5559 != null) {
            AbstractC1566 abstractC1566M10107 = m10105(abstractC1566Mo5559, map);
            if (abstractC1566M10107 == null) {
                return null;
            }
            AbstractC1566 abstractC1566Mo5553 = abstractC1566.mo5553();
            AbstractC1566 abstractC1566M10108 = m10105(abstractC1566Mo5553, map);
            if (abstractC1566M10108 != null) {
                abstractC1566Mo5553 = abstractC1566M10108;
            }
            return AbstractC1566.m5530(abstractC1566M10107, abstractC1566Mo5553);
        }
        List listMo5541 = abstractC1566.mo5541();
        if (C4123.m13232((Collection) listMo5541)) {
            return AbstractC1566.m5529(abstractC1566, C4123.m13226(listMo5541, new Function() { // from class: l.᩹ۖۗ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo10608andThen(Function function) {
                    return C24247.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C24247.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    AbstractC1566 abstractC1567 = (AbstractC1566) obj;
                    AbstractC1566 abstractC1566M10109 = this.f75272.m10105(abstractC1567, map);
                    return abstractC1566M10109 == null ? abstractC1567 : abstractC1566M10109;
                }
            }));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10107(AbstractC1566 abstractC1566, C15779 c15779) {
        C1610 c1610 = this.f10026;
        C24927 c24927M5672 = c1610.m5672(abstractC1566);
        if (c24927M5672 != null) {
            c24927M5672.m55543(c15779);
            return;
        }
        C7289 c7289M49222 = c1610.m5691().m49222(abstractC1566);
        if (c7289M49222 != null) {
            for (AbstractC1566 abstractC1567 : c7289M49222.m19961()) {
                if (!abstractC1567.equals(AbstractC1566.f5426)) {
                    c15779.accept(abstractC1566, abstractC1567);
                    m10107(abstractC1567, c15779);
                }
            }
        }
    }
}
