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

/* JADX INFO: renamed from: l.۟֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AK0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7545 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20622(String str, String str2, HashMap map, final HashMap map2, final InterfaceC25004 interfaceC25004) throws Exception {
        boolean z;
        Iterator it;
        C17986 c17986;
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        final ArrayList<C17986> arrayList7 = new ArrayList();
        final InterfaceC0087 interfaceC0087 = new InterfaceC0087() { // from class: l.ܺ֨ᩴ
            @Override // l.InterfaceC0087
            public final boolean test(Object obj, Object obj2) {
                String str3 = (String) obj;
                AbstractC20970 abstractC20970 = (AbstractC20970) obj2;
                if (!abstractC20970.f67060.endsWith("/")) {
                    return false;
                }
                if (map2.remove(str3) != null) {
                    return true;
                }
                arrayList3.add(abstractC20970.f67060);
                return true;
            }
        };
        C1170.removeIf(map.entrySet(), new Predicate() { // from class: l.ۘ֨ᩴ
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
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC0087.test(entry.getKey(), entry.getValue());
            }
        });
        final InterfaceC0087 interfaceC0088 = new InterfaceC0087() { // from class: l.ܽ֨ᩴ
            @Override // l.InterfaceC0087
            public final boolean test(Object obj, Object obj2) {
                AbstractC20970 abstractC20970 = (AbstractC20970) obj2;
                if (!abstractC20970.f67060.endsWith("/")) {
                    return false;
                }
                arrayList4.add(abstractC20970.f67060);
                return true;
            }
        };
        C1170.removeIf(map2.entrySet(), new Predicate() { // from class: l.ۘ֨ᩴ
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
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC0088.test(entry.getKey(), entry.getValue());
            }
        });
        final InterfaceC0087 interfaceC0089 = new InterfaceC0087() { // from class: l.ܶ֨ᩴ
            @Override // l.InterfaceC0087
            public final boolean test(Object obj, Object obj2) {
                AbstractC20970 abstractC20970 = (AbstractC20970) obj2;
                AbstractC20970 abstractC20971 = (AbstractC20970) map2.remove((String) obj);
                if (abstractC20971 == null) {
                    return false;
                }
                if (abstractC20970.f67063.equals(abstractC20971.f67063)) {
                    arrayList7.add(new C17986(abstractC20970, abstractC20971));
                    return true;
                }
                arrayList2.add(abstractC20970.f67060);
                return true;
            }
        };
        C1170.removeIf(map.entrySet(), new Predicate() { // from class: l.ۘ֨ᩴ
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
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC0089.test(entry.getKey(), entry.getValue());
            }
        });
        HashMap map3 = new HashMap();
        for (AbstractC20970 abstractC20970 : map.values()) {
            ((C14256) C11392.computeIfAbsent(map3, abstractC20970.f67063, new C23208())).f45066.add(abstractC20970);
        }
        for (AbstractC20970 abstractC20971 : map2.values()) {
            ((C14256) C11392.computeIfAbsent(map3, abstractC20971.f67063, new C3070())).f45067.add(abstractC20971);
        }
        for (C14256 c14256 : map3.values()) {
            Collections.sort(c14256.f45066);
            Collections.sort(c14256.f45067);
        }
        final InterfaceC0087 interfaceC00810 = new InterfaceC0087() { // from class: l.᩵֨ᩴ
            @Override // l.InterfaceC0087
            public final boolean test(Object obj, Object obj2) {
                C14256 c14257 = (C14256) obj2;
                ArrayList arrayList8 = c14257.f45066;
                ArrayList arrayList9 = c14257.f45067;
                if (arrayList8.isEmpty()) {
                    Iterator it2 = arrayList9.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((AbstractC20970) it2.next()).f67060);
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
                    arrayList3.add(((AbstractC20970) it3.next()).f67060);
                }
                return true;
            }
        };
        C1170.removeIf(map3.entrySet(), new Predicate() { // from class: l.ۘ֨ᩴ
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
                Map.Entry entry = (Map.Entry) obj;
                return interfaceC00810.test(entry.getKey(), entry.getValue());
            }
        });
        ArrayList<AbstractC20970> arrayList8 = new ArrayList();
        for (C17986 c17987 : arrayList7) {
            arrayList8.add(c17987.f58924);
            arrayList8.add(c17987.f58925);
        }
        for (C14256 c14257 : map3.values()) {
            arrayList8.addAll(c14257.f45066);
            arrayList8.addAll(c14257.f45067);
        }
        Iterator it2 = arrayList8.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((AbstractC20970) it2.next()).f67061;
            arrayList3 = arrayList3;
            arrayList4 = arrayList4;
        }
        ArrayList arrayList9 = arrayList3;
        ArrayList arrayList10 = arrayList4;
        final C3374 c3374 = new C3374(j);
        c3374.m11078(interfaceC25004);
        final AtomicReference atomicReference = new AtomicReference();
        ExecutorService executorService = C5261.f18541;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C11138.f35105);
        for (final AbstractC20970 abstractC20972 : arrayList8) {
            executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ۨ֨ᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC20970 abstractC20973 = abstractC20972;
                    C3374 c3375 = c3374;
                    if (interfaceC25004.mo924()) {
                        return;
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    if (atomicReference2.get() != null) {
                        return;
                    }
                    try {
                        MessageDigest messageDigestM36183 = C15022.m36183();
                        InputStream inputStreamMo10654 = abstractC20973.mo10654();
                        try {
                            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                            while (true) {
                                int i = inputStreamMo10654.read(bArr);
                                if (i == -1) {
                                    inputStreamMo10654.close();
                                    abstractC20973.f67062 = C15022.m36182(messageDigestM36183.digest());
                                    return;
                                } else {
                                    messageDigestM36183.update(bArr, 0, i);
                                    c3375.m11079(i);
                                }
                                abstractC20973.f67064 = e;
                            }
                        } catch (Throwable th) {
                            if (inputStreamMo10654 != null) {
                                try {
                                    inputStreamMo10654.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        abstractC20973.f67064 = e;
                    } catch (Exception e2) {
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                }
            });
        }
        C5261.m15837(executorServiceNewFixedThreadPool);
        if (interfaceC25004.mo924()) {
            return "";
        }
        if (atomicReference.get() != null) {
            Exception exc = (Exception) atomicReference.get();
            C22327.m50389(exc);
            throw exc;
        }
        for (C17986 c17988 : arrayList7) {
            AbstractC20970 abstractC20973 = c17988.f58924;
            AbstractC20970 abstractC20974 = c17988.f58925;
            IOException iOException = abstractC20973.f67064;
            if (iOException != null || abstractC20974.f67064 != null) {
                if (iOException != null) {
                    arrayList6.add(m20623(str, abstractC20973));
                }
                if (abstractC20974.f67064 != null) {
                    arrayList6.add(m20623(str2, abstractC20974));
                }
            } else if (abstractC20973.f67062.equals(abstractC20974.f67062)) {
                arrayList.add(abstractC20973.f67060);
            } else {
                arrayList2.add(abstractC20973.f67060);
            }
        }
        Iterator it3 = map3.values().iterator();
        while (it3.hasNext()) {
            C14256 c14258 = (C14256) it3.next();
            ArrayList<AbstractC20970> arrayList11 = c14258.f45066;
            ArrayList<AbstractC20970> arrayList12 = c14258.f45067;
            boolean zAnyMatch = C1170.stream(arrayList11).anyMatch(new C6054());
            boolean zAnyMatch2 = C1170.stream(arrayList12).anyMatch(new C23954());
            while (true) {
                int size = arrayList11.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        it = it3;
                        c17986 = null;
                        break;
                    }
                    int size2 = arrayList12.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        AbstractC20970 abstractC20975 = (AbstractC20970) arrayList11.get(i);
                        it = it3;
                        AbstractC20970 abstractC20976 = (AbstractC20970) arrayList12.get(i2);
                        int i3 = size;
                        String str3 = abstractC20975.f67062;
                        int i4 = size2;
                        if (str3 != null && str3.equals(abstractC20976.f67062)) {
                            arrayList11.remove(i);
                            arrayList12.remove(i2);
                            c17986 = new C17986(abstractC20975, abstractC20976);
                            break;
                        }
                        i2++;
                        it3 = it;
                        size = i3;
                        size2 = i4;
                    }
                    i++;
                }
                if (c17986 == null) {
                    break;
                }
                arrayList5.add(c17986.f58924.f67060 + " > " + c17986.f58925.f67060);
                it3 = it;
            }
            for (AbstractC20970 abstractC20977 : arrayList11) {
                if (abstractC20977.f67064 != null) {
                    arrayList6.add(m20623(str, abstractC20977));
                } else if (!zAnyMatch2) {
                    arrayList9.add(abstractC20977.f67060);
                }
            }
            ArrayList arrayList13 = arrayList9;
            for (AbstractC20970 abstractC20978 : arrayList12) {
                if (abstractC20978.f67064 != null) {
                    arrayList6.add(m20623(str2, abstractC20978));
                } else if (!zAnyMatch) {
                    arrayList10.add(abstractC20978.f67060);
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
            sb.append(C21576.m49088(R.string.MT_Protector));
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
            sb.append(C21576.m49088(R.string.MT_Protector));
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
            sb.append(C21576.m49088(R.string.MT_Protector));
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
            sb.append(C21576.m49088(R.string.MT_Protector));
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
            sb.append(C21576.m49088(R.string.MT_Protector));
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
            sb.append(C21576.m49088(R.string.MT_Protector));
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
    public static String m20623(String str, AbstractC20970 abstractC20970) {
        String message = abstractC20970.f67064.getMessage();
        if (message == null || message.isEmpty()) {
            message = abstractC20970.f67064.getClass().getSimpleName();
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
                message = abstractC20970.f67064.getClass().getSimpleName();
            }
        }
        StringBuilder sb = new StringBuilder();
        String str2 = abstractC20970.f67060;
        return C12669.m31438(sb, (str.endsWith("/") || str2.startsWith("/")) ? C14483.m34972(str, str2) : C20196.m46451(str, "/", str2), ": ", message);
    }
}
