package l;

import android.content.pm.ApplicationInfo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.۟ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81Y6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7294 {

    /* JADX INFO: renamed from: ᩵ܿ᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f24223 = {8649, -9378, -9401, -9399, -9361, -9372, -9357, -9372, -9430, -9367, -9372, -9365, -9374, -9430, -9386, -9359, -9353, -9364, -9365, -9374, -9410, -9399, -9361, -9372, -9357, -9372, -9430, -9367, -9372, -9365, -9374, -9430, -9386, -9359, -9353, -9364, -9365, -9374, -9410, -9399, -9361, -9372, -9357, -9372, -9430, -9367, -9372, -9365, -9374, -9430, -9386, -9359, -9353, -9364, -9365, -9374, -9410, -9399, -9361, -9372, -9357, -9372, -9430, -9367, -9372, -9365, -9374, -9430, -9386, -9359, -9353, -9364, -9365, -9374, -9410, -9378, -9401, -9378, -9386, -9396, -9396, -9396, -9399, -9361, -9372, -9357, -9372, -9430, -9367, -9372, -9365, -9374, -9430, -9398, -9369, -9361, -9376, -9370, -9359, -9410, -9399, -9361, -9372, -9357, -9372, -9430, -9367, -9372, -9365, -9374, -9430, -9398, -9369, -9361, -9376, -9370, -9359, -9410, -9396, -9396, -9396, -9359, -9376, -9368, -9355, -9429, -9369, -9360, -9364, -9367, -9375, -9429, -9375, -9376, -9347, -9366, -9360, -9359, -9429, -9372, -9355, -9362, -9360, -9364, -9375};

    /* JADX WARN: Code duplicated, block: B:86:0x026f  */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set m19445(AbstractC20745 abstractC20745, C16944 c16944, boolean z, boolean z2, List list, InterfaceC3183 interfaceC3183, InterfaceC8706 interfaceC8706) {
        List arrayList;
        AbstractC1421[] abstractC1421Arr;
        int iM3400;
        boolean z3;
        short s = f24223[0];
        int i = s * 22928;
        int i2 = s + 5732;
        int i3 = i - (i2 * i2) <= 0 ? 56069 : 31087;
        C5655 c5655 = new C5655(abstractC20745, c16944, z, z2, interfaceC8706);
        ConcurrentMapC13783 concurrentMapC13783 = c5655.f19322;
        if (list == null || C0629.m2899(list)) {
            arrayList = list;
        } else {
            Iterator itM5072 = C1461.m5072(list);
            while (true) {
                if (RunnableC1564.m5348(itM5072)) {
                    InterfaceC8858 interfaceC8858 = (InterfaceC8858) C0216.m1584(itM5072);
                    if (C3577.m10572(RunnableC1564.m5343(interfaceC8858), 42) != -1 || ViewTreeObserverOnPreDrawListenerC3327.m9878(interfaceC8858.mo9700(), 42) != -1) {
                        arrayList = new ArrayList();
                        Iterator itM5073 = C1461.m5072(list);
                        while (C0962.m3748(itM5073)) {
                            InterfaceC8858 interfaceC8859 = (InterfaceC8858) C0216.m1584(itM5073);
                            String strM3752 = C0962.m3752(interfaceC8859);
                            String strMo9700 = interfaceC8859.mo9700();
                            if (C3577.m10572(strM3752, 42) == -1 && C3577.m10572(strMo9700, 42) == -1) {
                                C2249.m6905(arrayList, interfaceC8859);
                            } else {
                                C6222 c6222M4979 = AbstractC1421.m4979(strM3752);
                                if (C3577.m10572(strMo9700, 42) == -1) {
                                    C19213 c19213 = (C19213) concurrentMapC13783.get(strMo9700);
                                    if (c19213 != null) {
                                        Iterator itM4831 = C1377.m4831(c19213.mo20495());
                                        while (C0962.m3748(itM4831)) {
                                            C10124 c10124 = (C10124) C0278.m1776(itM4831);
                                            if (AbstractC1421.m4981(interfaceC8859, c10124)) {
                                                c6222M4979.m17276reset((CharSequence) RunnableC1564.m5343(c10124));
                                                if (c6222M4979.matches()) {
                                                    System.out.println(c10124);
                                                    C2249.m6905(arrayList, c10124);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    C6222 c6222M49710 = AbstractC1421.m4979(strMo9700);
                                    Iterator itM5470 = RunnableC1606.m5470(concurrentMapC13783.values());
                                    while (RunnableC1564.m5348(itM5470)) {
                                        C19213 c19214 = (C19213) C0278.m1776(itM5470);
                                        c6222M49710.m17276reset((CharSequence) C1189.m4356(c19214));
                                        if (c6222M49710.matches()) {
                                            Iterator itM4832 = C1377.m4831(c19214.mo20495());
                                            while (RunnableC1564.m5348(itM4832)) {
                                                C10124 c10125 = (C10124) C0278.m1776(itM4832);
                                                if (AbstractC1421.m4981(interfaceC8859, c10125)) {
                                                    c6222M4979.m17276reset((CharSequence) RunnableC1564.m5343(c10125));
                                                    if (c6222M4979.matches()) {
                                                        System.out.println(c10125);
                                                        C3660.m10788(arrayList, c10125);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = list;
                }
            }
        }
        if (C3577.m10564(interfaceC8706)) {
            return C0561.unmodifiableSet(c5655.f19319);
        }
        synchronized (interfaceC8706) {
            interfaceC8706.mo22530();
        }
        ?? r1 = 0;
        int i4 = 0;
        while (true) {
            i4++;
            C10117 c10117 = new C10117(interfaceC8706);
            if (arrayList == null || C0629.m2899(arrayList)) {
                AbstractC1421[] abstractC1421Arr2 = new AbstractC1421[10];
                abstractC1421Arr2[r1] = new C15534(c5655, c10117, C2704.m8240(f24223, 1, 20, i3), true);
                abstractC1421Arr2[1] = new C8478(c5655, c10117, C0671.m3009(f24223, 21, 18, i3), true);
                abstractC1421Arr2[2] = new C19767(c5655, c10117, C3577.m10571(f24223, 39, 36, i3), true);
                abstractC1421Arr2[3] = new C23295(c5655, c10117, C3535.m10423(f24223, 75, 2, i3), true);
                abstractC1421Arr2[4] = new C21883(c5655, c10117, "", r1);
                abstractC1421Arr2[5] = new C19061(c5655, c10117, C1875.m6105(f24223, 77, 5, i3), r1);
                abstractC1421Arr2[6] = new C9184(c5655, c10117, C2332.m7082(f24223, 82, 36, i3), r1);
                abstractC1421Arr2[7] = new C7066(c5655, c10117);
                abstractC1421Arr2[8] = new C18355(c5655, c10117, CallableC1627.m5502(f24223, 118, 3, i3), r1);
                abstractC1421Arr2[9] = new C10595(c5655, interfaceC8706);
                abstractC1421Arr = abstractC1421Arr2;
            } else {
                abstractC1421Arr = new AbstractC1421[C7105.m18986(arrayList) + 2];
                for (int i5 = 0; i5 < C1937.m6276(arrayList); i5++) {
                    abstractC1421Arr[i5] = new C13417(c5655, c10117, (InterfaceC8858) RunnableC1606.m5478(arrayList, i5));
                }
                abstractC1421Arr[C1937.m6276(arrayList)] = new C7066(c5655, c10117);
                abstractC1421Arr[C1937.m6276(arrayList) + 1] = new C10595(c5655, interfaceC8706);
            }
            if (i4 == 1) {
                try {
                    Field[] fields = C21444.class.getFields();
                    int length = fields.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            iM3400 = 0;
                            break;
                        }
                        Field field = fields[i6];
                        if (field.getType() == Integer.class) {
                            iM3400 = C0817.m3400((Integer) field.get(null));
                            break;
                        }
                        i6++;
                    }
                    ApplicationInfo applicationInfo = C1377.m4826().getApplicationInfo();
                    if (((iM3400 ^ C2124.m6682((Integer) C0526.m2429(applicationInfo).getField(C3535.m10423(f24223, 142, 3, i3)).get(applicationInfo))) ^ (-1913575638)) != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } catch (Throwable unused) {
                }
            } else {
                z3 = true;
            }
            c10117.m25744(abstractC1421Arr.length);
            boolean z4 = false;
            for (AbstractC1421 abstractC1421 : abstractC1421Arr) {
                if (C3577.m10564(interfaceC8706)) {
                    break;
                }
                abstractC1421.mo4983();
                if (z3 && abstractC1421.mo4984(interfaceC3183)) {
                    z4 = true;
                }
                c10117.m25743(100 / abstractC1421Arr.length);
            }
            if (!z4 || ViewTreeObserverOnPreDrawListenerC3327.m9866(interfaceC8706)) {
                break;
            }
            r1 = 0;
        }
        if (!ViewTreeObserverOnPreDrawListenerC3327.m9866(interfaceC8706) && !c5655.f19319.isEmpty()) {
            interfaceC8706.mo22532();
            int size = c5655.f19322.values().size();
            AbstractC20745 abstractC20745M4364 = C1189.m4364(abstractC20745, C0671.m3009(f24223, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 14, i3));
            try {
                C22918 c22918 = new C22918(C1189.m4364(abstractC20745, C1460.m5047(f24223, 135, 7, i3)));
                try {
                    Iterator itM4833 = C1377.m4831(c5655.f19320.entrySet());
                    int size2 = 0;
                    int i7 = -1;
                    while (C0962.m3748(itM4833)) {
                        Map.Entry entry = (Map.Entry) C0278.m1776(itM4833);
                        if (C3577.m10564(interfaceC8706)) {
                            break;
                        }
                        String str = (String) entry.getKey();
                        Set set = (Set) entry.getValue();
                        Iterator itM943 = C0050.m943(set);
                        while (true) {
                            if (!RunnableC1564.m5348(itM943)) {
                                size2 += set.size();
                                break;
                            }
                            if (C1398.m4905(c5655.f19319, (String) C0278.m1776(itM943))) {
                                C8485 c8485 = new C8485(c5655.f19318.f51667);
                                Iterator itM7605 = C2477.m7605(c5655.f19322.values());
                                while (C0962.m3748(itM7605)) {
                                    C19213 c19215 = (C19213) C0216.m1584(itM7605);
                                    if (C3577.m10564(interfaceC8706)) {
                                        break;
                                    }
                                    if (set.contains(C1189.m4356(c19215))) {
                                        size2++;
                                        int i8 = (size2 * 100) / size;
                                        if (i8 != i7) {
                                            interfaceC8706.mo22533(i8);
                                            i7 = i8;
                                        }
                                        c8485.m22160((InterfaceC22762) c19215);
                                    }
                                }
                                if (!ViewTreeObserverOnPreDrawListenerC3327.m9866(interfaceC8706)) {
                                    C0526.m2436(abstractC20745M4364);
                                    c8485.m37937(abstractC20745M4364);
                                    C2249.m6909(c22918, str);
                                    abstractC20745M4364.m46696(c22918.m50720(), (InterfaceC10389) null);
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    RunnableC3388.m10059(c22918);
                    C0526.m2436(abstractC20745M4364);
                } catch (Throwable th) {
                    try {
                        RunnableC3388.m10059(c22918);
                        throw th;
                    } catch (Throwable th2) {
                        ViewGroupOnHierarchyChangeListenerC1916.m6242(th, th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                C0526.m2436(abstractC20745M4364);
                throw th3;
            }
        }
        return C0561.unmodifiableSet(c5655.f19319);
    }
}
