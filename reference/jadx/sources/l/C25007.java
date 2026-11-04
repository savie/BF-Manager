package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 76EN */
/* JADX INFO: loaded from: classes.dex */
public final class C25007 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Set f80946;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f80947;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public IdentityHashMap f80948;

    public C25007(List list) {
        this.f80947 = list;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x019a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55841(List list, final Function function) {
        int i;
        if (C4123.m13229((Collection) list)) {
            return;
        }
        List<C11580> listM19000 = C6823.m19000((Collection) list, new Function() { // from class: l.᩷ۧ᩵
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function2) {
                return C24247.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function2) {
                return C24247.$default$compose(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InterfaceC17730 interfaceC17730 = (InterfaceC17730) obj;
                InterfaceC13673 interfaceC13673 = (InterfaceC13673) function.apply(interfaceC17730);
                interfaceC17730.m41522();
                new C11580(interfaceC17730, interfaceC13673);
                throw null;
            }
        });
        Iterator it = listM19000.iterator();
        if (!it.hasNext()) {
            List list2 = this.f80947;
            C12884.sort(listM19000, C8627.thenComparing(new C5615(list2), C1886.f6321));
            this.f80948 = new IdentityHashMap();
            C4937.forEach(list2, new Consumer() { // from class: l.ۤۧ᩵
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    InterfaceC13673 interfaceC13673 = (InterfaceC13673) obj;
                    this.f34318.f80948.put(interfaceC13673, interfaceC13673.getName());
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            });
            C4937.forEach(listM19000, new Consumer() { // from class: l.᩸ۧ᩵
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    this.f73876.getClass();
                    ((C11580) obj).m29114();
                    throw null;
                }
            });
            this.f80946 = (Set) C1170.stream(listM19000).map(new C19785()).collect(C2025.toSet());
            for (C11580 c11580 : listM19000) {
                ArrayList<String> arrayListM29113 = c11580.m29113();
                ArrayList<String> arrayListM29115 = c11580.m29115();
                if (arrayListM29113.isEmpty() && arrayListM29115.isEmpty()) {
                    i = -1;
                } else {
                    i = 0;
                    if (!C6823.m19004(arrayListM29113, "start")) {
                        if (C6823.m19004(arrayListM29115, "end")) {
                            i = -1;
                        } else {
                            int size = list2.size();
                            HashMap map = new HashMap(size);
                            while (i < size) {
                                map.put((String) this.f80948.get(list2.get(i)), Integer.valueOf(i));
                                i++;
                            }
                            int iMax = -1;
                            for (String str : arrayListM29113) {
                                Integer num = (Integer) map.get(str);
                                if (num != null) {
                                    iMax = Math.max(iMax, num.intValue());
                                } else if (!this.f80946.contains(str)) {
                                    StringBuilder sb = new StringBuilder("Ordering pass not found: ");
                                    sb.append(str);
                                    sb.append(", listed in 'runAfter' of pass: ");
                                    sb.append(c11580);
                                    sb.append("\n all passes: ");
                                    IdentityHashMap identityHashMap = this.f80948;
                                    C17359.requireNonNull(identityHashMap);
                                    sb.append(C6823.m19000((Collection) list2, (Function) new C15309(0, identityHashMap)));
                                    throw new C8597(sb.toString());
                                }
                            }
                            int iMin = Integer.MAX_VALUE;
                            for (String str2 : arrayListM29115) {
                                Integer num2 = (Integer) map.get(str2);
                                if (num2 != null) {
                                    iMin = Math.min(iMin, num2.intValue());
                                } else if (!this.f80946.contains(str2)) {
                                    StringBuilder sb2 = new StringBuilder("Ordering pass not found: ");
                                    sb2.append(str2);
                                    sb2.append(", listed in 'runBefore' of pass: ");
                                    sb2.append(c11580);
                                    sb2.append("\n all passes: ");
                                    IdentityHashMap identityHashMap2 = this.f80948;
                                    C17359.requireNonNull(identityHashMap2);
                                    sb2.append(C6823.m19000((Collection) list2, (Function) new C15309(0, identityHashMap2)));
                                    throw new C8597(sb2.toString());
                                }
                            }
                            if (iMin <= iMax) {
                                StringBuilder sb3 = new StringBuilder("Conflict order requirements for pass: ");
                                sb3.append(c11580);
                                sb3.append("\n run after: ");
                                sb3.append(arrayListM29113);
                                sb3.append("\n run before: ");
                                sb3.append(arrayListM29115);
                                sb3.append("\n passes: ");
                                IdentityHashMap identityHashMap3 = this.f80948;
                                C17359.requireNonNull(identityHashMap3);
                                sb3.append(C6823.m19000((Collection) list2, (Function) new C15309(0, identityHashMap3)));
                                throw new C8597(sb3.toString());
                            }
                            if (iMax != -1) {
                                i = iMax + 1;
                                if (i >= size) {
                                    i = -1;
                                }
                            } else if (iMin == Integer.MAX_VALUE) {
                                i = -1;
                            } else {
                                i = iMin;
                            }
                        }
                    }
                }
                if (i == -1) {
                    list2.add(c11580.m29114());
                } else {
                    list2.add(i, c11580.m29114());
                }
            }
            return;
        }
        ((C11580) it.next()).getClass();
        throw null;
    }
}
