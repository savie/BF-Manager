package l;

import android.os.Bundle;
import android.os.Parcel;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1EG */
/* JADX INFO: loaded from: classes4.dex */
public final class C14562 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35035(ArrayList arrayList, AbstractC20745 abstractC20745, C23734 c23734, C7275 c7275) {
        boolean zMo33975 = abstractC20745.mo33975();
        try {
            m35037(arrayList, abstractC20745, c23734, c7275);
        } catch (Throwable th) {
            if (!zMo33975) {
                abstractC20745.mo24647();
            } else {
                abstractC20745.m46690("dex").mo24647();
            }
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0316  */
    /* JADX WARN: Code duplicated, block: B:157:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01e9 A[EDGE_INSN: B:162:0x01e9->B:57:0x01e9 BREAK  A[LOOP:3: B:54:0x01d1->B:56:0x01e6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x01a4 A[Catch: Exception -> 0x0253, TryCatch #7 {Exception -> 0x0253, blocks: (B:44:0x0177, B:60:0x0210, B:62:0x0215, B:63:0x021f, B:48:0x019d, B:50:0x01a4, B:51:0x01ca, B:54:0x01d1, B:56:0x01e6, B:57:0x01e9, B:58:0x01f8, B:67:0x022c), top: B:146:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e6 A[Catch: Exception -> 0x0253, LOOP:3: B:54:0x01d1->B:56:0x01e6, LOOP_END, TryCatch #7 {Exception -> 0x0253, blocks: (B:44:0x0177, B:60:0x0210, B:62:0x0215, B:63:0x021f, B:48:0x019d, B:50:0x01a4, B:51:0x01ca, B:54:0x01d1, B:56:0x01e6, B:57:0x01e9, B:58:0x01f8, B:67:0x022c), top: B:146:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02e7  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x01a4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [l.᩷۠ۚ] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r8v10, types: [l.ܿ᩻᩵] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [l.ܿ᩻᩵] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [l.᩷۠ۚ] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m35037(ArrayList arrayList, AbstractC20745 abstractC20745, C23734 c23734, C7275 c7275) throws IOException {
        AbstractC20745 abstractC20746;
        int i;
        HashMap map;
        boolean z;
        ?? M41161;
        IOException iOException;
        boolean[] zArr;
        ?? r13;
        ?? r14;
        ?? r8;
        String str;
        ?? r9;
        int i2;
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("dex");
        abstractC20745M46690.mo24647();
        abstractC20745M46690.m46739();
        AbstractC20745 abstractC20745M46691 = abstractC20745M46690.m46690("config");
        abstractC20745M46691.m46739();
        Bundle bundle = new Bundle();
        AbstractC20745 abstractC20745M46692 = abstractC20745M46690.m46690(e.m);
        abstractC20745M46692.m46739();
        final HashMap map2 = new HashMap();
        Collator collator = Collator.getInstance(Locale.ENGLISH);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC20745 abstractC20747 = (AbstractC20745) it.next();
            map2.put(abstractC20747, new C11149(collator, abstractC20747.getName(), false));
        }
        Collections.sort(arrayList, C7618.comparing(new Function() { // from class: l.ۧܰۜ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (C11149) map2.get((AbstractC20745) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }
        }));
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        Iterator it2 = arrayList.iterator();
        HashMap map5 = map4;
        boolean z2 = false;
        HashMap map6 = map3;
        HashSet hashSet3 = hashSet2;
        HashSet hashSet4 = hashSet;
        while (it2.hasNext()) {
            ?? r15 = (AbstractC20745) it2.next();
            HashSet hashSet5 = new HashSet(hashSet4);
            HashSet hashSet6 = new HashSet(hashSet3);
            HashMap map7 = new HashMap(map6);
            HashSet hashSet7 = hashSet4;
            HashMap map8 = new HashMap(map5);
            HashSet hashSet8 = hashSet3;
            try {
                byte[] bArrM46727 = r15.m46727();
                String name = r15.getName();
                String strM47957 = C21420.m47957(C21420.m47956(name));
                map = map5;
                try {
                    if (!name.endsWith(".dex")) {
                        map8.put(strM47957, name);
                    }
                    abstractC20745M46692.m46690(strM47957).m46703(bArrM46727);
                    abstractC20745M46690.m46690("smali/" + strM47957).m46739();
                    C11018 c11018 = new C11018();
                    M41161 = C17684.m41161(bArrM46727);
                    if (M41161.m41188() != 0) {
                        abstractC20745M46690 = abstractC20745M46690;
                        try {
                            bundle.putBoolean("opt_has_api_mod", true);
                        } catch (Exception e) {
                            e = e;
                            abstractC20745M46691 = abstractC20745M46691;
                            bundle = bundle;
                            r13 = r15;
                            map6 = map6;
                            r14 = r13;
                            it2 = it2;
                            z = z2;
                            M41161 = r14;
                            iOException = new IOException(C16737.m39264(R.string.MT_Protector, M41161.getName(), e.getMessage()), e);
                            if (!z) {
                            }
                            ActivityC5677 activityC5677 = (ActivityC5677) c7275.f24198;
                            int i3 = ActivityC5677.f19358;
                            zArr = new boolean[]{false};
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            C16737.m39273(new RunnableC18705(1, iOException, activityC5677, zArr, countDownLatch));
                            try {
                                countDownLatch.await();
                                if (!zArr[0]) {
                                    throw new C17671();
                                }
                                hashSet4 = hashSet7;
                                hashSet3 = hashSet8;
                                map5 = map;
                                map6 = map6;
                                z2 = z;
                                abstractC20745M46690 = abstractC20745M46690;
                                bundle = bundle;
                                abstractC20745M46691 = abstractC20745M46691;
                                it2 = it2;
                            } catch (InterruptedException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    } else {
                        abstractC20745M46690 = abstractC20745M46690;
                    }
                    M41161.m41173(strM47957);
                    int iM41201 = M41161.m41201();
                    int i4 = 0;
                    while (i4 < iM41201) {
                        int i5 = iM41201;
                        int iM41169 = M41161.m41169(i4);
                        bundle = bundle;
                        try {
                            int iM41197 = M41161.m41197(i4);
                            abstractC20745M46691 = abstractC20745M46691;
                            try {
                                String strM41195 = M41161.m41195(iM41169);
                                ?? r25 = M41161;
                                map6 = map6;
                                try {
                                    String strSubstring = strM41195.substring(1, strM41195.length() - 1);
                                    if (hashSet5.add(strSubstring)) {
                                        try {
                                            int iLastIndexOf = strSubstring.lastIndexOf(47);
                                            int i6 = iLastIndexOf + 1;
                                            String strSubstring2 = strSubstring.substring(i6);
                                            it2 = it2;
                                            z = z2;
                                            if (iLastIndexOf <= 130) {
                                                try {
                                                    if (m35036(strSubstring)) {
                                                        r9 = r15;
                                                        if (strSubstring2.length() > 100) {
                                                            strSubstring2 = strSubstring2.substring(0, 60) + "_" + Long.toHexString(((long) strSubstring2.hashCode()) & 4294967295L);
                                                        }
                                                        if (hashSet6.contains(strSubstring2)) {
                                                            i2 = 1;
                                                            while (true) {
                                                                if (hashSet6.contains(strSubstring2 + i2)) {
                                                                    break;
                                                                } else {
                                                                    i2++;
                                                                }
                                                            }
                                                            strSubstring2 = strSubstring2 + i2;
                                                        }
                                                        hashSet6.add(strSubstring2);
                                                        str = "# TOO_LONG_NAME/" + strSubstring2;
                                                        map7.put(strSubstring, str);
                                                        strSubstring = str;
                                                        r8 = r9;
                                                    } else if (strSubstring2.length() > 100) {
                                                        String strSubstring3 = strSubstring.substring(0, i6);
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append(strSubstring2.substring(0, 50));
                                                        sb.append("_too_long_");
                                                        M41161 = r15;
                                                        try {
                                                            sb.append(Long.toHexString(((long) strSubstring2.hashCode()) & 4294967295L));
                                                            str = strSubstring3 + sb.toString();
                                                            map7.put(strSubstring, str);
                                                            r9 = M41161;
                                                            strSubstring = str;
                                                            r8 = r9;
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            iOException = new IOException(C16737.m39264(R.string.MT_Protector, M41161.getName(), e.getMessage()), e);
                                                            if (!z) {
                                                            }
                                                            ActivityC5677 activityC5678 = (ActivityC5677) c7275.f24198;
                                                            int i7 = ActivityC5677.f19358;
                                                            zArr = new boolean[]{false};
                                                            CountDownLatch countDownLatch2 = new CountDownLatch(1);
                                                            C16737.m39273(new RunnableC18705(1, iOException, activityC5678, zArr, countDownLatch2));
                                                            countDownLatch2.await();
                                                            if (!zArr[0]) {
                                                                throw new C17671();
                                                            }
                                                            hashSet4 = hashSet7;
                                                            hashSet3 = hashSet8;
                                                            map5 = map;
                                                            map6 = map6;
                                                            z2 = z;
                                                            abstractC20745M46690 = abstractC20745M46690;
                                                            bundle = bundle;
                                                            abstractC20745M46691 = abstractC20745M46691;
                                                            it2 = it2;
                                                        }
                                                    } else {
                                                        r8 = r15;
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    M41161 = r15;
                                                    iOException = new IOException(C16737.m39264(R.string.MT_Protector, M41161.getName(), e.getMessage()), e);
                                                    if (!z) {
                                                    }
                                                    ActivityC5677 activityC5679 = (ActivityC5677) c7275.f24198;
                                                    int i8 = ActivityC5677.f19358;
                                                    zArr = new boolean[]{false};
                                                    CountDownLatch countDownLatch3 = new CountDownLatch(1);
                                                    C16737.m39273(new RunnableC18705(1, iOException, activityC5679, zArr, countDownLatch3));
                                                    countDownLatch3.await();
                                                    if (!zArr[0]) {
                                                        throw new C17671();
                                                    }
                                                    hashSet4 = hashSet7;
                                                    hashSet3 = hashSet8;
                                                    map5 = map;
                                                    map6 = map6;
                                                    z2 = z;
                                                    abstractC20745M46690 = abstractC20745M46690;
                                                    bundle = bundle;
                                                    abstractC20745M46691 = abstractC20745M46691;
                                                    it2 = it2;
                                                }
                                            } else {
                                                r9 = r15;
                                                if (strSubstring2.length() > 100) {
                                                    strSubstring2 = strSubstring2.substring(0, 60) + "_" + Long.toHexString(((long) strSubstring2.hashCode()) & 4294967295L);
                                                }
                                                if (hashSet6.contains(strSubstring2)) {
                                                    i2 = 1;
                                                    while (true) {
                                                        if (hashSet6.contains(strSubstring2 + i2)) {
                                                            break;
                                                            break;
                                                        }
                                                        i2++;
                                                    }
                                                    strSubstring2 = strSubstring2 + i2;
                                                }
                                                hashSet6.add(strSubstring2);
                                                str = "# TOO_LONG_NAME/" + strSubstring2;
                                                map7.put(strSubstring, str);
                                                strSubstring = str;
                                                r8 = r9;
                                            }
                                            c11018.m27782((CharSequence) strSubstring);
                                            if (iM41197 != 0) {
                                                c11018.writeInt(Integer.MIN_VALUE | iM41169);
                                                c11018.writeInt(iM41197);
                                            } else {
                                                c11018.writeInt(iM41169);
                                            }
                                            M41161 = r8;
                                        } catch (Exception e5) {
                                            e = e5;
                                            it2 = it2;
                                            z = z2;
                                        }
                                    } else {
                                        it2 = it2;
                                        z = z2;
                                        M41161 = r15;
                                        c23734.m52265(name, strSubstring.replace('/', '.'));
                                    }
                                    try {
                                        i4++;
                                        r15 = M41161;
                                        iM41201 = i5;
                                        bundle = bundle;
                                        abstractC20745M46691 = abstractC20745M46691;
                                        hashSet5 = hashSet5;
                                        M41161 = r25;
                                        map6 = map6;
                                        it2 = it2;
                                        z2 = z;
                                    } catch (Exception e6) {
                                        e = e6;
                                        iOException = new IOException(C16737.m39264(R.string.MT_Protector, M41161.getName(), e.getMessage()), e);
                                        if (!z) {
                                        }
                                        ActivityC5677 activityC56710 = (ActivityC5677) c7275.f24198;
                                        int i9 = ActivityC5677.f19358;
                                        zArr = new boolean[]{false};
                                        CountDownLatch countDownLatch4 = new CountDownLatch(1);
                                        C16737.m39273(new RunnableC18705(1, iOException, activityC56710, zArr, countDownLatch4));
                                        countDownLatch4.await();
                                        if (!zArr[0]) {
                                            throw new C17671();
                                        }
                                        hashSet4 = hashSet7;
                                        hashSet3 = hashSet8;
                                        map5 = map;
                                        map6 = map6;
                                        z2 = z;
                                        abstractC20745M46690 = abstractC20745M46690;
                                        bundle = bundle;
                                        abstractC20745M46691 = abstractC20745M46691;
                                        it2 = it2;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    r14 = r15;
                                    it2 = it2;
                                    z = z2;
                                    M41161 = r14;
                                    iOException = new IOException(C16737.m39264(R.string.MT_Protector, M41161.getName(), e.getMessage()), e);
                                    if (!z) {
                                    }
                                    ActivityC5677 activityC56711 = (ActivityC5677) c7275.f24198;
                                    int i10 = ActivityC5677.f19358;
                                    zArr = new boolean[]{false};
                                    CountDownLatch countDownLatch5 = new CountDownLatch(1);
                                    C16737.m39273(new RunnableC18705(1, iOException, activityC56711, zArr, countDownLatch5));
                                    countDownLatch5.await();
                                    if (!zArr[0]) {
                                        throw new C17671();
                                    }
                                    hashSet4 = hashSet7;
                                    hashSet3 = hashSet8;
                                    map5 = map;
                                    map6 = map6;
                                    z2 = z;
                                    abstractC20745M46690 = abstractC20745M46690;
                                    bundle = bundle;
                                    abstractC20745M46691 = abstractC20745M46691;
                                    it2 = it2;
                                }
                            } catch (Exception e8) {
                                e = e8;
                                r13 = r15;
                                map6 = map6;
                                r14 = r13;
                                it2 = it2;
                                z = z2;
                                M41161 = r14;
                                iOException = new IOException(C16737.m39264(R.string.MT_Protector, M41161.getName(), e.getMessage()), e);
                                if (!z) {
                                }
                                ActivityC5677 activityC56712 = (ActivityC5677) c7275.f24198;
                                int i11 = ActivityC5677.f19358;
                                zArr = new boolean[]{false};
                                CountDownLatch countDownLatch6 = new CountDownLatch(1);
                                C16737.m39273(new RunnableC18705(1, iOException, activityC56712, zArr, countDownLatch6));
                                countDownLatch6.await();
                                if (!zArr[0]) {
                                    throw new C17671();
                                }
                                hashSet4 = hashSet7;
                                hashSet3 = hashSet8;
                                map5 = map;
                                map6 = map6;
                                z2 = z;
                                abstractC20745M46690 = abstractC20745M46690;
                                bundle = bundle;
                                abstractC20745M46691 = abstractC20745M46691;
                                it2 = it2;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            abstractC20745M46691 = abstractC20745M46691;
                            r13 = r15;
                        }
                    }
                    HashSet hashSet9 = hashSet5;
                    abstractC20745M46691 = abstractC20745M46691;
                    bundle = bundle;
                    it2 = it2;
                    abstractC20745M46692.m46690(strM47957 + "_list").m46697(c11018);
                    hashSet3 = hashSet6;
                    map6 = map7;
                    map5 = map8;
                    hashSet4 = hashSet9;
                    z2 = true;
                } catch (Exception e10) {
                    e = e10;
                    z = z2;
                    M41161 = r15;
                    iOException = new IOException(C16737.m39264(R.string.MT_Protector, M41161.getName(), e.getMessage()), e);
                    if (!z || it2.hasNext()) {
                        ActivityC5677 activityC56713 = (ActivityC5677) c7275.f24198;
                        int i12 = ActivityC5677.f19358;
                        zArr = new boolean[]{false};
                        CountDownLatch countDownLatch7 = new CountDownLatch(1);
                        C16737.m39273(new RunnableC18705(1, iOException, activityC56713, zArr, countDownLatch7));
                        countDownLatch7.await();
                        if (!zArr[0]) {
                            throw new C17671();
                        }
                        hashSet4 = hashSet7;
                        hashSet3 = hashSet8;
                        map5 = map;
                        map6 = map6;
                        z2 = z;
                        abstractC20745M46690 = abstractC20745M46690;
                        bundle = bundle;
                        abstractC20745M46691 = abstractC20745M46691;
                        it2 = it2;
                    } else {
                        throw iOException;
                    }
                }
            } catch (Exception e11) {
                e = e11;
                map = map5;
            }
            abstractC20745M46690 = abstractC20745M46690;
            bundle = bundle;
            abstractC20745M46691 = abstractC20745M46691;
            it2 = it2;
        }
        AbstractC20745 abstractC20748 = abstractC20745M46691;
        Bundle bundle2 = bundle;
        HashMap map9 = map6;
        HashMap map10 = map5;
        if (map9.isEmpty()) {
            abstractC20746 = abstractC20748;
        } else {
            C11018 c11019 = new C11018();
            for (Map.Entry entry : map9.entrySet()) {
                c11019.m27782((CharSequence) entry.getKey());
                c11019.m27782((CharSequence) entry.getValue());
            }
            abstractC20746 = abstractC20748;
            abstractC20746.m46690("map").m46697(c11019);
        }
        if (!map10.isEmpty()) {
            C11018 c110110 = new C11018();
            for (Map.Entry entry2 : map10.entrySet()) {
                c110110.m27782((CharSequence) entry2.getKey());
                c110110.m27782((CharSequence) entry2.getValue());
            }
            abstractC20746.m46690("dex_name_map").m46697(c110110);
        }
        if (bundle2.isEmpty()) {
            i = 0;
        } else {
            Parcel parcelObtain = Parcel.obtain();
            i = 0;
            bundle2.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            abstractC20746.m46690("options").m46703(bArrMarshall);
        }
        AbstractC20745 abstractC20745M46706 = ((AbstractC20745) arrayList.get(i)).m46706("resources.arsc");
        if (abstractC20745M46706.mo33975()) {
            AbstractC20745 abstractC20745M46693 = abstractC20745.m46690("data/resources.arsc");
            abstractC20745M46693.mo46720();
            abstractC20745M46706.m46701(abstractC20745M46693, (C5222) null, (InterfaceC8978) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35036(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '/' && (i = i + 1) >= 12) {
                return true;
            }
        }
        return false;
    }
}
