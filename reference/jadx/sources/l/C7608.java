package l;

import bin.mt.plus.R;
import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AK0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7608 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20143(String str, String str2, HashMap map, final HashMap map2, final InterfaceC23333 interfaceC23333) throws Exception {
        boolean z;
        Iterator it;
        C9020 c9020;
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        final ArrayList<C9020> arrayList7 = new ArrayList();
        final InterfaceC10431 interfaceC10431 = new InterfaceC10431() { // from class: l.᩹ܿۚ
            @Override // l.InterfaceC10431
            public final boolean test(Object obj, Object obj2) {
                String str3 = (String) obj;
                AbstractC19603 abstractC19603 = (AbstractC19603) obj2;
                if (!abstractC19603.f62951.endsWith("/")) {
                    return false;
                }
                if (map2.remove(str3) != null) {
                    return true;
                }
                arrayList3.add(abstractC19603.f62951);
                return true;
            }
        };
        C9030.removeIf(map.entrySet(), new Predicate() { // from class: l.ᩴܿۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC10431.test(entry.getKey(), entry.getValue());
            }
        });
        final InterfaceC10431 interfaceC10432 = new InterfaceC10431() { // from class: l.֨ܿۚ
            @Override // l.InterfaceC10431
            public final boolean test(Object obj, Object obj2) {
                AbstractC19603 abstractC19603 = (AbstractC19603) obj2;
                if (!abstractC19603.f62951.endsWith("/")) {
                    return false;
                }
                arrayList4.add(abstractC19603.f62951);
                return true;
            }
        };
        C9030.removeIf(map2.entrySet(), new Predicate() { // from class: l.ᩴܿۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC10432.test(entry.getKey(), entry.getValue());
            }
        });
        final InterfaceC10431 interfaceC10433 = new InterfaceC10431() { // from class: l.۬ܿۚ
            @Override // l.InterfaceC10431
            public final boolean test(Object obj, Object obj2) {
                AbstractC19603 abstractC19603 = (AbstractC19603) obj2;
                AbstractC19603 abstractC19604 = (AbstractC19603) map2.remove((String) obj);
                if (abstractC19604 == null) {
                    return false;
                }
                if (abstractC19603.f62948.equals(abstractC19604.f62948)) {
                    arrayList7.add(new C9020(abstractC19603, abstractC19604));
                    return true;
                }
                arrayList2.add(abstractC19603.f62951);
                return true;
            }
        };
        C9030.removeIf(map.entrySet(), new Predicate() { // from class: l.ᩴܿۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC10433.test(entry.getKey(), entry.getValue());
            }
        });
        HashMap map3 = new HashMap();
        for (AbstractC19603 abstractC19603 : map.values()) {
            ((C8314) C9735.computeIfAbsent(map3, abstractC19603.f62948, new C4079())).f28838.add(abstractC19603);
        }
        for (AbstractC19603 abstractC19604 : map2.values()) {
            ((C8314) C9735.computeIfAbsent(map3, abstractC19604.f62948, new C6902())).f28839.add(abstractC19604);
        }
        for (C8314 c8314 : map3.values()) {
            Collections.sort(c8314.f28838);
            Collections.sort(c8314.f28839);
        }
        final InterfaceC10431 interfaceC10434 = new InterfaceC10431() { // from class: l.᩺ܿۚ
            @Override // l.InterfaceC10431
            public final boolean test(Object obj, Object obj2) {
                C8314 c8315 = (C8314) obj2;
                ArrayList arrayList8 = c8315.f28838;
                ArrayList arrayList9 = c8315.f28839;
                if (arrayList8.isEmpty()) {
                    Iterator it2 = arrayList9.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((AbstractC19603) it2.next()).f62951);
                    }
                    return true;
                }
                if (!arrayList9.isEmpty()) {
                    Collections.sort(arrayList8);
                    Collections.sort(arrayList9);
                    return false;
                }
                Iterator it3 = arrayList8.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((AbstractC19603) it3.next()).f62951);
                }
                return true;
            }
        };
        C9030.removeIf(map3.entrySet(), new Predicate() { // from class: l.ᩴܿۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC10434.test(entry.getKey(), entry.getValue());
            }
        });
        ArrayList<AbstractC19603> arrayList8 = new ArrayList();
        for (C9020 c9021 : arrayList7) {
            arrayList8.add(c9021.f30820);
            arrayList8.add(c9021.f30821);
        }
        for (C8314 c8315 : map3.values()) {
            arrayList8.addAll(c8315.f28838);
            arrayList8.addAll(c8315.f28839);
        }
        Iterator it2 = arrayList8.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((AbstractC19603) it2.next()).f62949;
            arrayList3 = arrayList3;
            arrayList4 = arrayList4;
        }
        ArrayList arrayList9 = arrayList3;
        ArrayList arrayList10 = arrayList4;
        final C8516 c8516 = new C8516(j);
        c8516.m22241(interfaceC23333);
        final AtomicReference atomicReference = new AtomicReference();
        ExecutorService executorService = C4716.f16632;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C5464.f18831);
        for (final AbstractC19603 abstractC19605 : arrayList8) {
            executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ܶܿۚ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC19603 abstractC19606 = abstractC19605;
                    C8516 c8517 = c8516;
                    if (interfaceC23333.mo2357()) {
                        return;
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    if (atomicReference2.get() != null) {
                        return;
                    }
                    try {
                        MessageDigest messageDigestM49425 = C22253.m49425();
                        InputStream inputStreamMo2898 = abstractC19606.mo2898();
                        try {
                            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                            while (true) {
                                int i = inputStreamMo2898.read(bArr);
                                if (i == -1) {
                                    inputStreamMo2898.close();
                                    abstractC19606.f62950 = C22253.m49424(messageDigestM49425.digest());
                                    return;
                                } else {
                                    messageDigestM49425.update(bArr, 0, i);
                                    c8517.m22242(i);
                                }
                                abstractC19606.f62952 = e;
                            }
                        } catch (Throwable th) {
                            if (inputStreamMo2898 != null) {
                                try {
                                    inputStreamMo2898.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        abstractC19606.f62952 = e;
                    } catch (Exception e2) {
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                }
            });
        }
        C4716.m13052(executorServiceNewFixedThreadPool);
        if (interfaceC23333.mo2357()) {
            return "";
        }
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        for (C9020 c9022 : arrayList7) {
            AbstractC19603 abstractC19606 = c9022.f30820;
            AbstractC19603 abstractC19607 = c9022.f30821;
            IOException iOException = abstractC19606.f62952;
            if (iOException != null || abstractC19607.f62952 != null) {
                if (iOException != null) {
                    arrayList6.add(m20144(str, abstractC19606));
                }
                if (abstractC19607.f62952 != null) {
                    arrayList6.add(m20144(str2, abstractC19607));
                }
            } else if (abstractC19606.f62950.equals(abstractC19607.f62950)) {
                arrayList.add(abstractC19606.f62951);
            } else {
                arrayList2.add(abstractC19606.f62951);
            }
        }
        Iterator it3 = map3.values().iterator();
        while (it3.hasNext()) {
            C8314 c8316 = (C8314) it3.next();
            ArrayList<AbstractC19603> arrayList11 = c8316.f28838;
            ArrayList<AbstractC19603> arrayList12 = c8316.f28839;
            boolean zAnyMatch = C9030.stream(arrayList11).anyMatch(new C21719());
            boolean zAnyMatch2 = C9030.stream(arrayList12).anyMatch(new C18191());
            while (true) {
                int size = arrayList11.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        it = it3;
                        c9020 = null;
                        break;
                    }
                    int size2 = arrayList12.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        AbstractC19603 abstractC19608 = (AbstractC19603) arrayList11.get(i);
                        it = it3;
                        AbstractC19603 abstractC19609 = (AbstractC19603) arrayList12.get(i2);
                        int i3 = size;
                        String str3 = abstractC19608.f62950;
                        int i4 = size2;
                        if (str3 != null && str3.equals(abstractC19609.f62950)) {
                            arrayList11.remove(i);
                            arrayList12.remove(i2);
                            c9020 = new C9020(abstractC19608, abstractC19609);
                            break;
                        }
                        i2++;
                        it3 = it;
                        size = i3;
                        size2 = i4;
                    }
                    i++;
                }
                if (c9020 == null) {
                    break;
                }
                arrayList5.add(c9020.f30820.f62951 + " > " + c9020.f30821.f62951);
                it3 = it;
            }
            for (AbstractC19603 abstractC196010 : arrayList11) {
                if (abstractC196010.f62952 != null) {
                    arrayList6.add(m20144(str, abstractC196010));
                } else if (!zAnyMatch2) {
                    arrayList9.add(abstractC196010.f62951);
                }
            }
            ArrayList arrayList13 = arrayList9;
            for (AbstractC19603 abstractC196011 : arrayList12) {
                if (abstractC196011.f62952 != null) {
                    arrayList6.add(m20144(str2, abstractC196011));
                } else if (!zAnyMatch) {
                    arrayList10.add(abstractC196011.f62951);
                }
            }
            it3 = it;
            arrayList9 = arrayList13;
        }
        ArrayList arrayList14 = arrayList9;
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        Collections.sort(arrayList14);
        Collections.sort(arrayList10);
        Collections.sort(arrayList5);
        Collections.sort(arrayList6);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('\n');
        sb.append(str2);
        sb.append('\n');
        boolean z2 = true;
        if (arrayList6.isEmpty()) {
            z = false;
        } else {
            sb.append('\n');
            sb.append(C16737.m39288(R.string.MT_Protector));
            sb.append("\n==============================\n");
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                sb.append((String) it4.next());
                sb.append('\n');
            }
            z = true;
        }
        if (!arrayList5.isEmpty()) {
            sb.append('\n');
            sb.append(C16737.m39288(R.string.MT_Protector));
            sb.append("\n==============================\n");
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                sb.append((String) it5.next());
                sb.append('\n');
            }
            z = true;
        }
        if (!arrayList10.isEmpty()) {
            sb.append('\n');
            sb.append(C16737.m39288(R.string.MT_Protector));
            sb.append("\n==============================\n");
            Iterator it6 = arrayList10.iterator();
            while (it6.hasNext()) {
                sb.append((String) it6.next());
                sb.append('\n');
            }
            z = true;
        }
        if (!arrayList14.isEmpty()) {
            sb.append('\n');
            sb.append(C16737.m39288(R.string.MT_Protector));
            sb.append("\n==============================\n");
            Iterator it7 = arrayList14.iterator();
            while (it7.hasNext()) {
                sb.append((String) it7.next());
                sb.append('\n');
            }
            z = true;
        }
        if (arrayList2.isEmpty()) {
            z2 = z;
        } else {
            sb.append('\n');
            sb.append(C16737.m39288(R.string.MT_Protector));
            sb.append("\n==============================\n");
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                sb.append((String) it8.next());
                sb.append('\n');
            }
        }
        if (!z2) {
            return "";
        }
        if (!arrayList.isEmpty()) {
            sb.append('\n');
            sb.append(C16737.m39288(R.string.MT_Protector));
            sb.append("\n==============================\n");
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                sb.append((String) it9.next());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20144(String str, AbstractC19603 abstractC19603) {
        String message = abstractC19603.f62952.getMessage();
        if (message == null || message.isEmpty()) {
            message = abstractC19603.f62952.getClass().getSimpleName();
        } else {
            int iIndexOf = message.indexOf(10);
            int iIndexOf2 = message.indexOf(13);
            if (iIndexOf2 >= 0 && (iIndexOf < 0 || iIndexOf2 < iIndexOf)) {
                iIndexOf = iIndexOf2;
            }
            if (iIndexOf >= 0) {
                message = message.substring(0, iIndexOf);
            }
            if (message.isEmpty()) {
                message = abstractC19603.f62952.getClass().getSimpleName();
            }
        }
        StringBuilder sb = new StringBuilder();
        String str2 = abstractC19603.f62951;
        return C1694.m5622(sb, (str.endsWith("/") || str2.startsWith("/")) ? C15489.m37076(str, str2) : C1679.m5594(str, "/", str2), ": ", message);
    }
}
