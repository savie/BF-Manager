package l;

import android.content.DialogInterface;
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

/* JADX INFO: renamed from: l.᩺ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1EG */
/* JADX INFO: loaded from: classes.dex */
public final class C24013 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53565(ArrayList arrayList, AbstractC22044 abstractC22044, C6113 c6113, C11398 c11398) {
        boolean zMo2934 = abstractC22044.mo2934();
        try {
            m53567(arrayList, abstractC22044, c6113, c11398);
        } catch (Throwable th) {
            if (!zMo2934) {
                abstractC22044.mo4296();
            } else {
                abstractC22044.m49876("dex").mo4296();
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

    /* JADX WARN: Code duplicated, block: B:102:0x0311  */
    /* JADX WARN: Code duplicated, block: B:157:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01e9 A[EDGE_INSN: B:162:0x01e9->B:57:0x01e9 BREAK  A[LOOP:3: B:54:0x01d1->B:56:0x01e6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x01a4 A[Catch: Exception -> 0x0253, TryCatch #7 {Exception -> 0x0253, blocks: (B:44:0x0177, B:60:0x0210, B:62:0x0215, B:63:0x021f, B:48:0x019d, B:50:0x01a4, B:51:0x01ca, B:54:0x01d1, B:56:0x01e6, B:57:0x01e9, B:58:0x01f8, B:67:0x022c), top: B:146:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e6 A[Catch: Exception -> 0x0253, LOOP:3: B:54:0x01d1->B:56:0x01e6, LOOP_END, TryCatch #7 {Exception -> 0x0253, blocks: (B:44:0x0177, B:60:0x0210, B:62:0x0215, B:63:0x021f, B:48:0x019d, B:50:0x01a4, B:51:0x01ca, B:54:0x01d1, B:56:0x01e6, B:57:0x01e9, B:58:0x01f8, B:67:0x022c), top: B:146:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02e7  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x01a4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [l.᩷ۨᩴ] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r8v11, types: [l.᩻ۤۛ] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [l.᩻ۤۛ] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v21 */
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
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [l.᩷ۨᩴ] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m53567(ArrayList arrayList, AbstractC22044 abstractC22044, C6113 c6113, C11398 c11398) throws IOException {
        AbstractC22044 abstractC22045;
        int i;
        HashMap map;
        boolean z;
        ?? M55779;
        final IOException iOException;
        final boolean[] zArr;
        ?? r13;
        ?? r14;
        ?? r8;
        String str;
        ?? r9;
        int i2;
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("dex");
        abstractC22044M49876.mo4296();
        abstractC22044M49876.m49853();
        AbstractC22044 abstractC22044M49877 = abstractC22044M49876.m49876("config");
        abstractC22044M49877.m49853();
        Bundle bundle = new Bundle();
        AbstractC22044 abstractC22044M49878 = abstractC22044M49876.m49876(e.m);
        abstractC22044M49878.m49853();
        HashMap map2 = new HashMap();
        Collator collator = Collator.getInstance(Locale.ENGLISH);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC22044 abstractC22046 = (AbstractC22044) it.next();
            map2.put(abstractC22046, new C1441(collator, abstractC22046.getName(), false));
        }
        Collections.sort(arrayList, C2661.comparing(new C12078(0, map2)));
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
            ?? r15 = (AbstractC22044) it2.next();
            HashSet hashSet5 = new HashSet(hashSet4);
            HashSet hashSet6 = new HashSet(hashSet3);
            HashMap map7 = new HashMap(map6);
            HashSet hashSet7 = hashSet4;
            HashMap map8 = new HashMap(map5);
            HashSet hashSet8 = hashSet3;
            try {
                byte[] bArrM49865 = r15.m49865();
                String name = r15.getName();
                String strM20779 = C7605.m20779(C7605.m20778(name));
                map = map5;
                try {
                    if (!name.endsWith(".dex")) {
                        map8.put(strM20779, name);
                    }
                    abstractC22044M49878.m49876(strM20779).m49849(bArrM49865);
                    abstractC22044M49876.m49876("smali/" + strM20779).m49853();
                    C6178 c6178 = new C6178();
                    M55779 = C24975.m55779(bArrM49865);
                    if (M55779.m55795() != 0) {
                        abstractC22044M49876 = abstractC22044M49876;
                        try {
                            bundle.putBoolean("opt_has_api_mod", true);
                        } catch (Exception e) {
                            e = e;
                            abstractC22044M49877 = abstractC22044M49877;
                            bundle = bundle;
                            r13 = r15;
                            map6 = map6;
                            r14 = r13;
                            it2 = it2;
                            z = z2;
                            M55779 = r14;
                            iOException = new IOException(C21576.m49059(R.string.MT_Protector, M55779.getName(), e.getMessage()), e);
                            if (!z) {
                            }
                            final ActivityC0848 activityC0848 = (ActivityC0848) c11398.f35861;
                            int i3 = ActivityC0848.f3169;
                            zArr = new boolean[]{false};
                            final CountDownLatch countDownLatch = new CountDownLatch(1);
                            C21576.m49068(new Runnable() { // from class: l.ۗۚۧ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i4 = ActivityC0848.f3169;
                                    ActivityC0848 activityC0849 = activityC0848;
                                    C2361 c2361BuildDialog = activityC0849.buildDialog();
                                    c2361BuildDialog.m8021(R.string.MT_Protector);
                                    IOException iOException2 = iOException;
                                    c2361BuildDialog.m8008(iOException2.getMessage());
                                    boolean[] zArr2 = zArr;
                                    CountDownLatch countDownLatch2 = countDownLatch;
                                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6179(0, zArr2, countDownLatch2));
                                    c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24079(0, zArr2, countDownLatch2));
                                    c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                    c2361BuildDialog.m8012(false);
                                    c2361BuildDialog.m8016().m22440().setOnClickListener(new ViewOnClickListenerC8386(3, activityC0849, iOException2));
                                }
                            });
                            try {
                                countDownLatch.await();
                                if (!zArr[0]) {
                                    throw new C20523();
                                }
                                hashSet4 = hashSet7;
                                hashSet3 = hashSet8;
                                map5 = map;
                                map6 = map6;
                                z2 = z;
                                abstractC22044M49876 = abstractC22044M49876;
                                bundle = bundle;
                                abstractC22044M49877 = abstractC22044M49877;
                                it2 = it2;
                            } catch (InterruptedException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    } else {
                        abstractC22044M49876 = abstractC22044M49876;
                    }
                    M55779.m55788(strM20779);
                    int iM55804 = M55779.m55804();
                    int i4 = 0;
                    while (i4 < iM55804) {
                        int i5 = iM55804;
                        int iM55784 = M55779.m55784(i4);
                        bundle = bundle;
                        try {
                            int iM55807 = M55779.m55807(i4);
                            abstractC22044M49877 = abstractC22044M49877;
                            try {
                                String strM55809 = M55779.m55809(iM55784);
                                ?? r25 = M55779;
                                map6 = map6;
                                try {
                                    String strSubstring = strM55809.substring(1, strM55809.length() - 1);
                                    if (hashSet5.add(strSubstring)) {
                                        try {
                                            int iLastIndexOf = strSubstring.lastIndexOf(47);
                                            int i6 = iLastIndexOf + 1;
                                            String strSubstring2 = strSubstring.substring(i6);
                                            it2 = it2;
                                            z = z2;
                                            if (iLastIndexOf <= 130) {
                                                try {
                                                    if (m53566(strSubstring)) {
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
                                                        M55779 = r15;
                                                        try {
                                                            sb.append(Long.toHexString(((long) strSubstring2.hashCode()) & 4294967295L));
                                                            str = strSubstring3 + sb.toString();
                                                            map7.put(strSubstring, str);
                                                            r9 = M55779;
                                                            strSubstring = str;
                                                            r8 = r9;
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            iOException = new IOException(C21576.m49059(R.string.MT_Protector, M55779.getName(), e.getMessage()), e);
                                                            if (!z) {
                                                            }
                                                            final ActivityC0848 activityC0849 = (ActivityC0848) c11398.f35861;
                                                            int i7 = ActivityC0848.f3169;
                                                            zArr = new boolean[]{false};
                                                            final CountDownLatch countDownLatch2 = new CountDownLatch(1);
                                                            C21576.m49068(new Runnable() { // from class: l.ۗۚۧ
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    int i8 = ActivityC0848.f3169;
                                                                    ActivityC0848 activityC08410 = activityC0849;
                                                                    C2361 c2361BuildDialog = activityC08410.buildDialog();
                                                                    c2361BuildDialog.m8021(R.string.MT_Protector);
                                                                    IOException iOException2 = iOException;
                                                                    c2361BuildDialog.m8008(iOException2.getMessage());
                                                                    boolean[] zArr2 = zArr;
                                                                    CountDownLatch countDownLatch3 = countDownLatch2;
                                                                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6179(0, zArr2, countDownLatch3));
                                                                    c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24079(0, zArr2, countDownLatch3));
                                                                    c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                                                    c2361BuildDialog.m8012(false);
                                                                    c2361BuildDialog.m8016().m22440().setOnClickListener(new ViewOnClickListenerC8386(3, activityC08410, iOException2));
                                                                }
                                                            });
                                                            countDownLatch2.await();
                                                            if (!zArr[0]) {
                                                                throw new C20523();
                                                            }
                                                            hashSet4 = hashSet7;
                                                            hashSet3 = hashSet8;
                                                            map5 = map;
                                                            map6 = map6;
                                                            z2 = z;
                                                            abstractC22044M49876 = abstractC22044M49876;
                                                            bundle = bundle;
                                                            abstractC22044M49877 = abstractC22044M49877;
                                                            it2 = it2;
                                                        }
                                                    } else {
                                                        r8 = r15;
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    M55779 = r15;
                                                    iOException = new IOException(C21576.m49059(R.string.MT_Protector, M55779.getName(), e.getMessage()), e);
                                                    if (!z) {
                                                    }
                                                    final ActivityC0848 activityC08410 = (ActivityC0848) c11398.f35861;
                                                    int i8 = ActivityC0848.f3169;
                                                    zArr = new boolean[]{false};
                                                    final CountDownLatch countDownLatch3 = new CountDownLatch(1);
                                                    C21576.m49068(new Runnable() { // from class: l.ۗۚۧ
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i9 = ActivityC0848.f3169;
                                                            ActivityC0848 activityC08411 = activityC08410;
                                                            C2361 c2361BuildDialog = activityC08411.buildDialog();
                                                            c2361BuildDialog.m8021(R.string.MT_Protector);
                                                            IOException iOException2 = iOException;
                                                            c2361BuildDialog.m8008(iOException2.getMessage());
                                                            boolean[] zArr2 = zArr;
                                                            CountDownLatch countDownLatch4 = countDownLatch3;
                                                            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6179(0, zArr2, countDownLatch4));
                                                            c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24079(0, zArr2, countDownLatch4));
                                                            c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                                            c2361BuildDialog.m8012(false);
                                                            c2361BuildDialog.m8016().m22440().setOnClickListener(new ViewOnClickListenerC8386(3, activityC08411, iOException2));
                                                        }
                                                    });
                                                    countDownLatch3.await();
                                                    if (!zArr[0]) {
                                                        throw new C20523();
                                                    }
                                                    hashSet4 = hashSet7;
                                                    hashSet3 = hashSet8;
                                                    map5 = map;
                                                    map6 = map6;
                                                    z2 = z;
                                                    abstractC22044M49876 = abstractC22044M49876;
                                                    bundle = bundle;
                                                    abstractC22044M49877 = abstractC22044M49877;
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
                                            c6178.m17786((CharSequence) strSubstring);
                                            if (iM55807 != 0) {
                                                c6178.writeInt(Integer.MIN_VALUE | iM55784);
                                                c6178.writeInt(iM55807);
                                            } else {
                                                c6178.writeInt(iM55784);
                                            }
                                            M55779 = r8;
                                        } catch (Exception e5) {
                                            e = e5;
                                            it2 = it2;
                                            z = z2;
                                        }
                                    } else {
                                        it2 = it2;
                                        z = z2;
                                        M55779 = r15;
                                        c6113.m17639(name, strSubstring.replace('/', '.'));
                                    }
                                    try {
                                        i4++;
                                        r15 = M55779;
                                        iM55804 = i5;
                                        bundle = bundle;
                                        abstractC22044M49877 = abstractC22044M49877;
                                        hashSet5 = hashSet5;
                                        M55779 = r25;
                                        map6 = map6;
                                        it2 = it2;
                                        z2 = z;
                                    } catch (Exception e6) {
                                        e = e6;
                                        iOException = new IOException(C21576.m49059(R.string.MT_Protector, M55779.getName(), e.getMessage()), e);
                                        if (!z) {
                                        }
                                        final ActivityC0848 activityC08411 = (ActivityC0848) c11398.f35861;
                                        int i9 = ActivityC0848.f3169;
                                        zArr = new boolean[]{false};
                                        final CountDownLatch countDownLatch4 = new CountDownLatch(1);
                                        C21576.m49068(new Runnable() { // from class: l.ۗۚۧ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i10 = ActivityC0848.f3169;
                                                ActivityC0848 activityC08412 = activityC08411;
                                                C2361 c2361BuildDialog = activityC08412.buildDialog();
                                                c2361BuildDialog.m8021(R.string.MT_Protector);
                                                IOException iOException2 = iOException;
                                                c2361BuildDialog.m8008(iOException2.getMessage());
                                                boolean[] zArr2 = zArr;
                                                CountDownLatch countDownLatch5 = countDownLatch4;
                                                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6179(0, zArr2, countDownLatch5));
                                                c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24079(0, zArr2, countDownLatch5));
                                                c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                                c2361BuildDialog.m8012(false);
                                                c2361BuildDialog.m8016().m22440().setOnClickListener(new ViewOnClickListenerC8386(3, activityC08412, iOException2));
                                            }
                                        });
                                        countDownLatch4.await();
                                        if (!zArr[0]) {
                                            throw new C20523();
                                        }
                                        hashSet4 = hashSet7;
                                        hashSet3 = hashSet8;
                                        map5 = map;
                                        map6 = map6;
                                        z2 = z;
                                        abstractC22044M49876 = abstractC22044M49876;
                                        bundle = bundle;
                                        abstractC22044M49877 = abstractC22044M49877;
                                        it2 = it2;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    r14 = r15;
                                    it2 = it2;
                                    z = z2;
                                    M55779 = r14;
                                    iOException = new IOException(C21576.m49059(R.string.MT_Protector, M55779.getName(), e.getMessage()), e);
                                    if (!z) {
                                    }
                                    final ActivityC0848 activityC08412 = (ActivityC0848) c11398.f35861;
                                    int i10 = ActivityC0848.f3169;
                                    zArr = new boolean[]{false};
                                    final CountDownLatch countDownLatch5 = new CountDownLatch(1);
                                    C21576.m49068(new Runnable() { // from class: l.ۗۚۧ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i11 = ActivityC0848.f3169;
                                            ActivityC0848 activityC08413 = activityC08412;
                                            C2361 c2361BuildDialog = activityC08413.buildDialog();
                                            c2361BuildDialog.m8021(R.string.MT_Protector);
                                            IOException iOException2 = iOException;
                                            c2361BuildDialog.m8008(iOException2.getMessage());
                                            boolean[] zArr2 = zArr;
                                            CountDownLatch countDownLatch6 = countDownLatch5;
                                            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6179(0, zArr2, countDownLatch6));
                                            c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24079(0, zArr2, countDownLatch6));
                                            c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                            c2361BuildDialog.m8012(false);
                                            c2361BuildDialog.m8016().m22440().setOnClickListener(new ViewOnClickListenerC8386(3, activityC08413, iOException2));
                                        }
                                    });
                                    countDownLatch5.await();
                                    if (!zArr[0]) {
                                        throw new C20523();
                                    }
                                    hashSet4 = hashSet7;
                                    hashSet3 = hashSet8;
                                    map5 = map;
                                    map6 = map6;
                                    z2 = z;
                                    abstractC22044M49876 = abstractC22044M49876;
                                    bundle = bundle;
                                    abstractC22044M49877 = abstractC22044M49877;
                                    it2 = it2;
                                }
                            } catch (Exception e8) {
                                e = e8;
                                r13 = r15;
                                map6 = map6;
                                r14 = r13;
                                it2 = it2;
                                z = z2;
                                M55779 = r14;
                                iOException = new IOException(C21576.m49059(R.string.MT_Protector, M55779.getName(), e.getMessage()), e);
                                if (!z) {
                                }
                                final ActivityC0848 activityC08413 = (ActivityC0848) c11398.f35861;
                                int i11 = ActivityC0848.f3169;
                                zArr = new boolean[]{false};
                                final CountDownLatch countDownLatch6 = new CountDownLatch(1);
                                C21576.m49068(new Runnable() { // from class: l.ۗۚۧ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i12 = ActivityC0848.f3169;
                                        ActivityC0848 activityC08414 = activityC08413;
                                        C2361 c2361BuildDialog = activityC08414.buildDialog();
                                        c2361BuildDialog.m8021(R.string.MT_Protector);
                                        IOException iOException2 = iOException;
                                        c2361BuildDialog.m8008(iOException2.getMessage());
                                        boolean[] zArr2 = zArr;
                                        CountDownLatch countDownLatch7 = countDownLatch6;
                                        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6179(0, zArr2, countDownLatch7));
                                        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24079(0, zArr2, countDownLatch7));
                                        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                        c2361BuildDialog.m8012(false);
                                        c2361BuildDialog.m8016().m22440().setOnClickListener(new ViewOnClickListenerC8386(3, activityC08414, iOException2));
                                    }
                                });
                                countDownLatch6.await();
                                if (!zArr[0]) {
                                    throw new C20523();
                                }
                                hashSet4 = hashSet7;
                                hashSet3 = hashSet8;
                                map5 = map;
                                map6 = map6;
                                z2 = z;
                                abstractC22044M49876 = abstractC22044M49876;
                                bundle = bundle;
                                abstractC22044M49877 = abstractC22044M49877;
                                it2 = it2;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            abstractC22044M49877 = abstractC22044M49877;
                            r13 = r15;
                        }
                    }
                    HashSet hashSet9 = hashSet5;
                    abstractC22044M49877 = abstractC22044M49877;
                    bundle = bundle;
                    it2 = it2;
                    abstractC22044M49878.m49876(strM20779 + "_list").m49844(c6178);
                    hashSet3 = hashSet6;
                    map6 = map7;
                    map5 = map8;
                    hashSet4 = hashSet9;
                    z2 = true;
                } catch (Exception e10) {
                    e = e10;
                    z = z2;
                    M55779 = r15;
                    iOException = new IOException(C21576.m49059(R.string.MT_Protector, M55779.getName(), e.getMessage()), e);
                    if (!z || it2.hasNext()) {
                        final ActivityC0848 activityC08414 = (ActivityC0848) c11398.f35861;
                        int i12 = ActivityC0848.f3169;
                        zArr = new boolean[]{false};
                        final CountDownLatch countDownLatch7 = new CountDownLatch(1);
                        C21576.m49068(new Runnable() { // from class: l.ۗۚۧ
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i13 = ActivityC0848.f3169;
                                ActivityC0848 activityC08415 = activityC08414;
                                C2361 c2361BuildDialog = activityC08415.buildDialog();
                                c2361BuildDialog.m8021(R.string.MT_Protector);
                                IOException iOException2 = iOException;
                                c2361BuildDialog.m8008(iOException2.getMessage());
                                boolean[] zArr2 = zArr;
                                CountDownLatch countDownLatch8 = countDownLatch7;
                                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6179(0, zArr2, countDownLatch8));
                                c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24079(0, zArr2, countDownLatch8));
                                c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                c2361BuildDialog.m8012(false);
                                c2361BuildDialog.m8016().m22440().setOnClickListener(new ViewOnClickListenerC8386(3, activityC08415, iOException2));
                            }
                        });
                        countDownLatch7.await();
                        if (!zArr[0]) {
                            throw new C20523();
                        }
                        hashSet4 = hashSet7;
                        hashSet3 = hashSet8;
                        map5 = map;
                        map6 = map6;
                        z2 = z;
                        abstractC22044M49876 = abstractC22044M49876;
                        bundle = bundle;
                        abstractC22044M49877 = abstractC22044M49877;
                        it2 = it2;
                    } else {
                        throw iOException;
                    }
                }
            } catch (Exception e11) {
                e = e11;
                map = map5;
            }
            abstractC22044M49876 = abstractC22044M49876;
            bundle = bundle;
            abstractC22044M49877 = abstractC22044M49877;
            it2 = it2;
        }
        AbstractC22044 abstractC22047 = abstractC22044M49877;
        Bundle bundle2 = bundle;
        HashMap map9 = map6;
        HashMap map10 = map5;
        if (map9.isEmpty()) {
            abstractC22045 = abstractC22047;
        } else {
            C6178 c6179 = new C6178();
            for (Map.Entry entry : map9.entrySet()) {
                c6179.m17786((CharSequence) entry.getKey());
                c6179.m17786((CharSequence) entry.getValue());
            }
            abstractC22045 = abstractC22047;
            abstractC22045.m49876("map").m49844(c6179);
        }
        if (!map10.isEmpty()) {
            C6178 c61710 = new C6178();
            for (Map.Entry entry2 : map10.entrySet()) {
                c61710.m17786((CharSequence) entry2.getKey());
                c61710.m17786((CharSequence) entry2.getValue());
            }
            abstractC22045.m49876("dex_name_map").m49844(c61710);
        }
        if (bundle2.isEmpty()) {
            i = 0;
        } else {
            Parcel parcelObtain = Parcel.obtain();
            i = 0;
            bundle2.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            abstractC22045.m49876("options").m49849(bArrMarshall);
        }
        AbstractC22044 abstractC22044M49868 = ((AbstractC22044) arrayList.get(i)).m49868("resources.arsc");
        if (abstractC22044M49868.mo2934()) {
            AbstractC22044 abstractC22044M49879 = abstractC22044.m49876("data/resources.arsc");
            abstractC22044M49879.mo49834();
            abstractC22044M49868.m49847(abstractC22044M49879, (C24523) null, (InterfaceC23711) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m53566(String str) {
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
