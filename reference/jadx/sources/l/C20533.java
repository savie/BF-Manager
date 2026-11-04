package l;

import android.content.pm.ApplicationInfo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 81Y6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20533 {

    /* JADX INFO: renamed from: ۨۡᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f65752 = {3677, -16800, -16775, -16777, -16815, -16806, -16819, -16806, -16876, -16809, -16806, -16811, -16804, -16876, -16792, -16817, -16823, -16814, -16811, -16804, -16896, -16777, -16815, -16806, -16819, -16806, -16876, -16809, -16806, -16811, -16804, -16876, -16792, -16817, -16823, -16814, -16811, -16804, -16896, -16777, -16815, -16806, -16819, -16806, -16876, -16809, -16806, -16811, -16804, -16876, -16792, -16817, -16823, -16814, -16811, -16804, -16896, -16777, -16815, -16806, -16819, -16806, -16876, -16809, -16806, -16811, -16804, -16876, -16792, -16817, -16823, -16814, -16811, -16804, -16896, -16800, -16775, -16800, -16792, -16782, -16782, -16782, -16777, -16815, -16806, -16819, -16806, -16876, -16809, -16806, -16811, -16804, -16876, -16780, -16807, -16815, -16802, -16808, -16817, -16896, -16777, -16815, -16806, -16819, -16806, -16876, -16809, -16806, -16811, -16804, -16876, -16780, -16807, -16815, -16802, -16808, -16817, -16896, -16782, -16782, -16782, -16817, -16802, -16810, -16821, -16875, -16807, -16818, -16814, -16809, -16801, -16875, -16801, -16802, -16829, -16812, -16818, -16817, -16875, -16806, -16821, -16816, -16818, -16814, -16801};

    /* JADX WARN: Code duplicated, block: B:86:0x0276  */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set m47086(AbstractC22044 abstractC22044, C14960 c14960, boolean z, boolean z2, List list, InterfaceC4787 interfaceC4787, InterfaceC23517 interfaceC23517) {
        List arrayList;
        AbstractC23166[] abstractC23166Arr;
        int iM3157;
        boolean z3;
        short s = f65752[0];
        int i = (s * 36932) - ((s * s) + 340993156) > 0 ? 57733 : 48699;
        C22420 c22420 = new C22420(abstractC22044, c14960, z, z2, interfaceC23517);
        ConcurrentMapC17249 concurrentMapC17249 = c22420.f72611;
        if (list == null || AbstractC0116.m1231(list)) {
            arrayList = list;
        } else {
            Iterator itM53423 = C23916.m53423(list);
            while (true) {
                if (C3998.m12923(itM53423)) {
                    InterfaceC4859 interfaceC4859 = (InterfaceC4859) C0950.m3796(itM53423);
                    if (C11235.m28315(RunnableC3055.m9941(interfaceC4859), 42) != -1 || C11235.m28315(interfaceC4859.mo6804(), 42) != -1) {
                        arrayList = new ArrayList();
                        Iterator itM53424 = C23916.m53423(list);
                        while (C1826.m6317(itM53424)) {
                            InterfaceC4859 interfaceC48510 = (InterfaceC4859) C4238.m13529(itM53424);
                            String strM9941 = RunnableC3055.m9941(interfaceC48510);
                            String strMo6804 = interfaceC48510.mo6804();
                            if (C11235.m28315(strM9941, 42) == -1 && C2375.m8073(strMo6804, 42) == -1) {
                                C1519.m5406(arrayList, interfaceC48510);
                            } else {
                                C4245 c4245M52087 = AbstractC23166.m52087(strM9941);
                                if (C11235.m28315(strMo6804, 42) == -1) {
                                    C7447 c7447 = (C7447) concurrentMapC17249.get(strMo6804);
                                    if (c7447 != null) {
                                        Iterator itM9936 = RunnableC3055.m9936(c7447.mo20405());
                                        while (C3998.m12923(itM9936)) {
                                            C5122 c5122 = (C5122) C0950.m3796(itM9936);
                                            if (AbstractC23166.m52089(interfaceC48510, c5122)) {
                                                c4245M52087.m13568reset((CharSequence) AbstractC0641.m2823(c5122));
                                                if (c4245M52087.matches()) {
                                                    System.out.println(c5122);
                                                    RunnableC0334.m2054(arrayList, c5122);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    C4245 c4245M52088 = AbstractC23166.m52087(strMo6804);
                                    Iterator itM53426 = C23916.m53426(concurrentMapC17249.values());
                                    while (C3998.m12923(itM53426)) {
                                        C7447 c7448 = (C7447) C4238.m13529(itM53426);
                                        c4245M52088.m13568reset((CharSequence) C20932.m47854(c7448));
                                        if (c4245M52088.matches()) {
                                            Iterator itM2811 = AbstractC0641.m2811(c7448.mo20405());
                                            while (C1826.m6317(itM2811)) {
                                                C5122 c5123 = (C5122) C4238.m13529(itM2811);
                                                if (AbstractC23166.m52089(interfaceC48510, c5123)) {
                                                    c4245M52087.m13568reset((CharSequence) RunnableC3055.m9941(c5123));
                                                    if (c4245M52087.matches()) {
                                                        System.out.println(c5123);
                                                        C1519.m5406(arrayList, c5123);
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
        if (C2375.m8058(interfaceC23517)) {
            return C4681.unmodifiableSet(c22420.f72607);
        }
        synchronized (interfaceC23517) {
            interfaceC23517.mo11095();
        }
        ?? r1 = 0;
        int i2 = 0;
        while (true) {
            i2++;
            C3379 c3379 = new C3379(interfaceC23517);
            if (arrayList == null || AbstractC0116.m1231(arrayList)) {
                AbstractC23166[] abstractC23166Arr2 = new AbstractC23166[10];
                abstractC23166Arr2[r1] = new C2283(c22420, c3379, C2966.m9670(f65752, 1, 20, i), true);
                abstractC23166Arr2[1] = new C17944(c22420, c3379, C11235.m28300(f65752, 21, 18, i), true);
                abstractC23166Arr2[2] = new C16452(c22420, c3379, C0487.m2361(f65752, 39, 36, i), true);
                abstractC23166Arr2[3] = new C6012(c22420, c3379, C2702.m8881(f65752, 75, 2, i), true);
                abstractC23166Arr2[4] = new C11977(c22420, c3379, "", r1);
                abstractC23166Arr2[5] = new C17198(c22420, c3379, RunnableC3646.m11809(f65752, 77, 5, i), r1);
                abstractC23166Arr2[6] = new C23912(c22420, c3379, C3099.m10092(f65752, 82, 36, i), r1);
                abstractC23166Arr2[7] = new C13469(c22420, c3379);
                abstractC23166Arr2[8] = new C25404(c22420, c3379, C2354.m7980(f65752, 118, 3, i), r1);
                abstractC23166Arr2[9] = new C3774(c22420, interfaceC23517);
                abstractC23166Arr = abstractC23166Arr2;
            } else {
                abstractC23166Arr = new AbstractC23166[C3448.m11247(arrayList) + 2];
                for (int i3 = 0; i3 < C3448.m11247(arrayList); i3++) {
                    abstractC23166Arr[i3] = new C20182(c22420, c3379, (InterfaceC4859) C3690.m11998(arrayList, i3));
                }
                abstractC23166Arr[C2834.m9336(arrayList)] = new C13469(c22420, c3379);
                abstractC23166Arr[C2834.m9336(arrayList) + 1] = new C3774(c22420, interfaceC23517);
            }
            if (i2 == 1) {
                try {
                    Field[] fields = C11650.class.getFields();
                    int length = fields.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            iM3157 = 0;
                            break;
                        }
                        Field field = fields[i4];
                        if (field.getType() == Integer.class) {
                            iM3157 = C0773.m3157((Integer) field.get(null));
                            break;
                        }
                        i4++;
                    }
                    ApplicationInfo applicationInfo = C1321.m4856().getApplicationInfo();
                    if (((iM3157 ^ C0773.m3157((Integer) C3734.m12155(applicationInfo).getField(C2287.m7749(f65752, 142, 3, i)).get(applicationInfo))) ^ (-1913575638)) != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } catch (Throwable unused) {
                }
            } else {
                z3 = true;
            }
            c3379.m11091(abstractC23166Arr.length);
            boolean z4 = false;
            for (AbstractC23166 abstractC23166 : abstractC23166Arr) {
                if (C2375.m8058(interfaceC23517)) {
                    break;
                }
                abstractC23166.mo7731();
                if (z3 && abstractC23166.mo33725(interfaceC4787)) {
                    z4 = true;
                }
                c3379.m11093(100 / abstractC23166Arr.length);
            }
            if (!z4 || C11235.m28304(interfaceC23517)) {
                break;
            }
            r1 = 0;
        }
        if (!C2375.m8058(interfaceC23517) && !c22420.f72607.isEmpty()) {
            interfaceC23517.mo11090();
            int size = c22420.f72611.values().size();
            AbstractC22044 abstractC22044M7806 = C2310.m7806(abstractC22044, C13473.m33137(f65752, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 14, i));
            try {
                C25179 c25179 = new C25179(C0269.m1774(abstractC22044, C0619.m2756(f65752, 135, 7, i)));
                try {
                    Iterator itM9937 = RunnableC3055.m9936(c22420.f72610.entrySet());
                    int size2 = 0;
                    int i5 = -1;
                    while (C3998.m12923(itM9937)) {
                        Map.Entry entry = (Map.Entry) C4238.m13529(itM9937);
                        if (C11235.m28304(interfaceC23517)) {
                            break;
                        }
                        String str = (String) entry.getKey();
                        Set set = (Set) entry.getValue();
                        Iterator itM9938 = RunnableC3055.m9936(set);
                        while (true) {
                            if (!C3998.m12923(itM9938)) {
                                size2 += set.size();
                                break;
                            }
                            if (C0487.m2352(c22420.f72607, (String) C4238.m13529(itM9938))) {
                                C8850 c8850 = new C8850(c22420.f72612.f74931);
                                Iterator itM53427 = C23916.m53426(c22420.f72611.values());
                                while (C1826.m6317(itM53427)) {
                                    C7447 c7449 = (C7447) C4238.m13529(itM53427);
                                    if (C11235.m28304(interfaceC23517)) {
                                        break;
                                    }
                                    if (set.contains(C0487.m2358(c7449))) {
                                        size2++;
                                        int i6 = (size2 * 100) / size;
                                        if (i6 != i5) {
                                            interfaceC23517.mo11094(i6);
                                            i5 = i6;
                                        }
                                        c8850.m23712((InterfaceC10122) c7449);
                                    }
                                }
                                if (!C2375.m8058(interfaceC23517)) {
                                    C17202.m40378(abstractC22044M7806);
                                    c8850.m52044(abstractC22044M7806);
                                    C3779.m12255(c25179, str);
                                    abstractC22044M7806.m49842(c25179.m56119(), (InterfaceC3573) null);
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    C0619.m2765(c25179);
                    C17202.m40378(abstractC22044M7806);
                } catch (Throwable th) {
                    try {
                        C0773.m3160(c25179);
                        throw th;
                    } catch (Throwable th2) {
                        C1146.m4219(th, th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                C3734.m12147(abstractC22044M7806);
                throw th3;
            }
        }
        return C4681.unmodifiableSet(c22420.f72607);
    }
}
