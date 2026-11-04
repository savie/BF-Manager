package l;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7N6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12798 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f40940;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f40942;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceC1470 f40944;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2684 f40945;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f40946;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16549 f40947;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Uri f40948;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0294 f40950;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C20738 f40951;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15648[] f40952;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f40953;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C1664 f40954;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC1612 f40955;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f40956;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Uri[] f40957;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Uri f40958;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4595 f40949 = new C4595();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte[] f40941 = C7116.f23453;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f40943 = -9223372036854775807L;

    public C12798(InterfaceC1612 interfaceC1612, InterfaceC0294 interfaceC0294, Uri[] uriArr, C15648[] c15648Arr, InterfaceC5341 interfaceC5341, InterfaceC4639 interfaceC4639, C1664 c1664, List list, C20738 c20738) {
        this.f40955 = interfaceC1612;
        this.f40950 = interfaceC0294;
        this.f40957 = uriArr;
        this.f40952 = c15648Arr;
        this.f40954 = c1664;
        this.f40946 = list;
        this.f40951 = c20738;
        InterfaceC13433 interfaceC13433Mo6799 = interfaceC5341.mo6799(1);
        this.f40940 = interfaceC13433Mo6799;
        if (interfaceC4639 != null) {
            interfaceC13433Mo6799.mo10894(interfaceC4639);
        }
        this.f40942 = interfaceC5341.mo6799(3);
        this.f40947 = new C16549("", c15648Arr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c15648Arr[i].f50834 & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f40944 = new C19511(this.f40947, C18444.m42973(arrayList));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m31726() throws C2684 {
        C2684 c2684 = this.f40945;
        if (c2684 != null) {
            throw c2684;
        }
        Uri uri = this.f40948;
        if (uri == null || !uri.equals(this.f40958)) {
            return;
        }
        this.f40950.mo1871(this.f40948);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16549 m31712() {
        return this.f40947;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m31722() {
        return this.f40956;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC1470 m31725() {
        return this.f40944;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31716(boolean z) {
        this.f40953 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m31711(long j, C9221 c9221) {
        int iMo5247 = this.f40944.mo5247();
        Uri[] uriArr = this.f40957;
        int length = uriArr.length;
        InterfaceC0294 interfaceC0294 = this.f40950;
        C24907 c24907Mo1863 = (iMo5247 >= length || iMo5247 == -1) ? null : interfaceC0294.mo1863(uriArr[this.f40944.mo5257()], true);
        if (c24907Mo1863 != null) {
            AbstractC1928 abstractC1928 = c24907Mo1863.f80607;
            if (!abstractC1928.isEmpty()) {
                long jMo1862 = c24907Mo1863.f80611 - interfaceC0294.mo1862();
                long j2 = j - jMo1862;
                int iM19469 = C7116.m19469((List) abstractC1928, Long.valueOf(j2), true);
                long j3 = ((C5515) abstractC1928.get(iM19469)).f6095;
                return c9221.m24397(j2, j3, (!c24907Mo1863.f75796 || iM19469 == abstractC1928.size() - 1) ? j3 : ((C5515) abstractC1928.get(iM19469 + 1)).f6095) + jMo1862;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31710(C24733 c24733) {
        AbstractC1928 abstractC1928;
        int i = c24733.f80058;
        if (i == -1) {
            return 1;
        }
        C24907 c24907Mo1863 = this.f40950.mo1863(this.f40957[this.f40947.m39193(c24733.f78511)], false);
        c24907Mo1863.getClass();
        AbstractC1928 abstractC1929 = c24907Mo1863.f80607;
        int i2 = (int) (c24733.f45824 - c24907Mo1863.f80612);
        if (i2 < 0) {
            return 1;
        }
        if (i2 < abstractC1929.size()) {
            abstractC1928 = ((C5515) abstractC1929.get(i2)).f19195;
        } else {
            abstractC1928 = c24907Mo1863.f80601;
        }
        if (i >= abstractC1928.size()) {
            return 2;
        }
        C15209 c15209 = (C15209) abstractC1928.get(i);
        if (c15209.f49639) {
            return 0;
        }
        return C17359.equals(Uri.parse(C9352.m24648(c24907Mo1863.f75794, c15209.f6097)), c24733.f78513.f81907) ? 1 : 2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m31724(C24733 c24733) {
        AbstractC1928 abstractC1928;
        int i = c24733.f80058;
        C20782.m47568(i != -1);
        C24907 c24907Mo1863 = this.f40950.mo1863(this.f40957[this.f40947.m39193(c24733.f78511)], false);
        c24907Mo1863.getClass();
        AbstractC1928 abstractC1929 = c24907Mo1863.f80607;
        int i2 = (int) (c24733.f45824 - c24907Mo1863.f80612);
        if (i2 < 0) {
            return 0L;
        }
        if (i2 < abstractC1929.size()) {
            abstractC1928 = ((C5515) abstractC1929.get(i2)).f19195;
        } else {
            abstractC1928 = c24907Mo1863.f80601;
        }
        return ((C15209) abstractC1928.get(i)).f6093;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31714(C20191 c20191, long j, long j2, List list, boolean z, C10560 c10560) {
        long j3;
        Uri uri;
        boolean z2;
        String str;
        C15035 c15035M31707;
        C24733 c24733 = list.isEmpty() ? null : (C24733) C16625.m39339(list);
        int iM39193 = c24733 == null ? -1 : this.f40947.m39193(c24733.f78511);
        long j4 = c20191.f64821;
        long jMax = j - j4;
        long j5 = this.f40943;
        long jMax2 = j5 != -9223372036854775807L ? j5 - j4 : -9223372036854775807L;
        if (c24733 == null || this.f40956) {
            j3 = -9223372036854775807L;
        } else {
            long j6 = c24733.f78509 - c24733.f78512;
            jMax = Math.max(0L, jMax - j6);
            j3 = -9223372036854775807L;
            if (jMax2 != -9223372036854775807L) {
                jMax2 = Math.max(0L, jMax2 - j6);
            }
        }
        this.f40944.mo5250(j4, jMax, jMax2, list, m31721(c24733, j));
        int iMo5257 = this.f40944.mo5257();
        boolean z3 = iM39193 != iMo5257;
        Uri[] uriArr = this.f40957;
        Uri uri2 = uriArr[iMo5257];
        InterfaceC0294 interfaceC0294 = this.f40950;
        if (!interfaceC0294.mo1874(uri2)) {
            c10560.f33548 = uri2;
            this.f40958 = uri2;
            return;
        }
        C24907 c24907Mo1863 = interfaceC0294.mo1863(uri2, true);
        c24907Mo1863.getClass();
        long j7 = c24907Mo1863.f80611;
        this.f40956 = c24907Mo1863.f75796;
        this.f40943 = c24907Mo1863.f80600 ? j3 : (c24907Mo1863.f80606 + j7) - interfaceC0294.mo1862();
        long jMo1862 = j7 - interfaceC0294.mo1862();
        C24907 c24907 = c24907Mo1863;
        Pair pairM31706 = m31706(c24733, z3, c24907Mo1863, jMo1862, j);
        long jLongValue = ((Long) pairM31706.first).longValue();
        int iIntValue = ((Integer) pairM31706.second).intValue();
        if (z3 && c24733 != null && (jLongValue < c24907.f80612 || ((c15035M31707 = m31707(c24907, jLongValue, iIntValue)) != null && c15035M31707.f49080.f6095 + jMo1862 < j2))) {
            Uri uri3 = uriArr[iM39193];
            C24907 c24907Mo1864 = interfaceC0294.mo1863(uri3, true);
            c24907Mo1864.getClass();
            jMo1862 = c24907Mo1864.f80611 - interfaceC0294.mo1862();
            Pair pairM31707 = m31706(c24733, false, c24907Mo1864, jMo1862, j);
            jLongValue = ((Long) pairM31707.first).longValue();
            iIntValue = ((Integer) pairM31707.second).intValue();
            uri = uri3;
            c24907 = c24907Mo1864;
            iMo5257 = iM39193;
        } else {
            uri = uri2;
        }
        String str2 = c24907.f75794;
        boolean z4 = c24907.f75796;
        long j8 = c24907.f80612;
        AbstractC1928 abstractC1928 = c24907.f80607;
        if (iMo5257 != iM39193 && iM39193 != -1) {
            interfaceC0294.mo1864(uriArr[iM39193]);
        }
        if (jLongValue < j8) {
            this.f40945 = new C2684();
            return;
        }
        C15035 c15035M31708 = m31707(c24907, jLongValue, iIntValue);
        if (c15035M31708 == null) {
            if (!c24907.f80600) {
                c10560.f33548 = uri;
                this.f40958 = uri;
                return;
            } else {
                if (z || abstractC1928.isEmpty()) {
                    c10560.f33549 = true;
                    return;
                }
                c15035M31708 = new C15035((C1786) C16625.m39339(abstractC1928), (j8 + ((long) abstractC1928.size())) - 1, -1);
            }
        }
        C15035 c15035 = c15035M31708;
        C1786 c1786 = c15035.f49080;
        this.f40958 = null;
        SystemClock.elapsedRealtime();
        C5515 c5515 = c1786.f6094;
        Uri uriM24651 = (c5515 == null || (str = c5515.f6102) == null) ? null : C9352.m24651(str2, str);
        AbstractC24240 abstractC24240M31708 = m31708(uriM24651, iMo5257, true);
        c10560.f33547 = abstractC24240M31708;
        if (abstractC24240M31708 != null) {
            return;
        }
        String str3 = c1786.f6102;
        Uri uriM24652 = str3 != null ? C9352.m24651(str2, str3) : null;
        boolean z5 = false;
        AbstractC24240 abstractC24240M31709 = m31708(uriM24652, iMo5257, false);
        c10560.f33547 = abstractC24240M31709;
        if (abstractC24240M31709 != null) {
            return;
        }
        if (c1786 instanceof C15209) {
            if (((C15209) c1786).f49638 || (c15035.f49078 == 0 && z4)) {
                z5 = true;
            }
            z2 = z5;
        } else {
            z2 = z4;
        }
        boolean zM55209 = C24733.m55209(c24733, j, uri, z2, c15035, jMo1862);
        if (zM55209 && c15035.f49077) {
            return;
        }
        int iMo5246 = this.f40944.mo5246();
        Object objMo5259 = this.f40944.mo5259();
        boolean z6 = this.f40953;
        C4595 c4595 = this.f40949;
        c10560.f33547 = C24733.m55207(this.f40955, this.f40940, this.f40952[iMo5257], jMo1862, c24907, c15035, uri, this.f40946, iMo5246, objMo5259, z6, this.f40954, c24733, c4595.m14393(uriM24652), c4595.m14393(uriM24651), zM55209, z2, this.f40951);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15035 m31707(C24907 c24907, long j, int i) {
        long j2 = c24907.f80612;
        AbstractC1928 abstractC1928 = c24907.f80601;
        int i2 = (int) (j - j2);
        AbstractC1928 abstractC1929 = c24907.f80607;
        if (i2 == abstractC1929.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < abstractC1928.size()) {
                return new C15035((C1786) abstractC1928.get(i), j, i);
            }
            return null;
        }
        C5515 c5515 = (C5515) abstractC1929.get(i2);
        if (i == -1) {
            return new C15035(c5515, j, -1);
        }
        if (i < c5515.f19195.size()) {
            return new C15035((C1786) c5515.f19195.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < abstractC1929.size()) {
            return new C15035((C1786) abstractC1929.get(i3), j + 1, -1);
        }
        if (abstractC1928.isEmpty()) {
            return null;
        }
        return new C15035((C1786) abstractC1928.get(0), j + 1, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31715(AbstractC24240 abstractC24240) {
        if (abstractC24240 instanceof C21749) {
            C21749 c21749 = (C21749) abstractC24240;
            this.f40941 = c21749.m13195();
            Uri uri = c21749.f78513.f81907;
            byte[] bArrM49297 = c21749.m49297();
            bArrM49297.getClass();
            this.f40949.m14392(uri, bArrM49297);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31720(AbstractC24240 abstractC24240, long j) {
        InterfaceC1470 interfaceC1470 = this.f40944;
        return interfaceC1470.mo5260(interfaceC1470.indexOf(this.f40947.m39193(abstractC24240.f78511)), j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31719(Uri uri, long j) {
        int iIndexOf;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.f40957;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(uri)) {
                break;
            }
            i++;
        }
        if (i == -1 || (iIndexOf = this.f40944.indexOf(i)) == -1) {
            return true;
        }
        this.f40948 = uri;
        return j != -9223372036854775807L && this.f40944.mo5260(iIndexOf, j) && this.f40950.mo1867(uri, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18272[] m31721(C24733 c24733, long j) {
        List listOf;
        int iM39193 = c24733 == null ? -1 : this.f40947.m39193(c24733.f78511);
        int length = this.f40944.length();
        InterfaceC18272[] interfaceC18272Arr = new InterfaceC18272[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iMo9649 = this.f40944.mo9649(i);
            Uri uri = this.f40957[iMo9649];
            InterfaceC0294 interfaceC0294 = this.f40950;
            if (!interfaceC0294.mo1874(uri)) {
                interfaceC18272Arr[i] = InterfaceC18272.f59613;
            } else {
                C24907 c24907Mo1863 = interfaceC0294.mo1863(uri, z);
                c24907Mo1863.getClass();
                long jMo1862 = c24907Mo1863.f80611 - interfaceC0294.mo1862();
                Pair pairM31706 = m31706(c24733, iMo9649 != iM39193, c24907Mo1863, jMo1862, j);
                long jLongValue = ((Long) pairM31706.first).longValue();
                int iIntValue = ((Integer) pairM31706.second).intValue();
                long j2 = c24907Mo1863.f80612;
                AbstractC1928 abstractC1928 = c24907Mo1863.f80601;
                AbstractC1928 abstractC1929 = c24907Mo1863.f80607;
                int i2 = (int) (jLongValue - j2);
                if (i2 < 0 || abstractC1929.size() < i2) {
                    listOf = AbstractC1928.of();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < abstractC1929.size()) {
                        if (iIntValue != -1) {
                            C5515 c5515 = (C5515) abstractC1929.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(c5515);
                            } else if (iIntValue < c5515.f19195.size()) {
                                AbstractC1928 abstractC19210 = c5515.f19195;
                                arrayList.addAll(abstractC19210.subList(iIntValue, abstractC19210.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(abstractC1929.subList(i2, abstractC1929.size()));
                        iIntValue = 0;
                    }
                    if (c24907Mo1863.f80604 != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < abstractC1928.size()) {
                            arrayList.addAll(abstractC1928.subList(iIntValue, abstractC1928.size()));
                        }
                    }
                    listOf = C4681.unmodifiableList(arrayList);
                }
                interfaceC18272Arr[i] = new C22495(jMo1862, listOf);
            }
            i++;
            z = false;
        }
        return interfaceC18272Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31709(long j, List list) {
        if (this.f40945 != null || this.f40944.length() < 2) {
            return list.size();
        }
        return this.f40944.mo5248(j, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31717(long j, AbstractC24240 abstractC24240, List list) {
        if (this.f40945 != null) {
            return false;
        }
        return this.f40944.mo5253(j, abstractC24240, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31718(Uri uri) {
        return C7116.m19489(uri, this.f40957);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Pair m31706(C24733 c24733, boolean z, C24907 c24907, long j, long j2) {
        boolean z2 = true;
        if (c24733 != null) {
            long j3 = c24733.f45824;
            int i = c24733.f80058;
            if (!z) {
                if (c24733.m55211()) {
                    if (i == -1) {
                        j3 = j3 != -1 ? j3 + 1 : -1L;
                    }
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i != -1 ? i + 1 : -1));
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i));
            }
        }
        long j4 = c24907.f80606;
        AbstractC1928 abstractC1928 = c24907.f80601;
        long j5 = c24907.f80612;
        AbstractC1928 abstractC1929 = c24907.f80607;
        long j6 = j4 + j;
        if (c24733 != null && !this.f40956) {
            j2 = c24733.f78512;
        }
        if (!c24907.f80600 && j2 >= j6) {
            return new Pair(Long.valueOf(j5 + ((long) abstractC1929.size())), -1);
        }
        long j7 = j2 - j;
        Long lValueOf = Long.valueOf(j7);
        int i2 = 0;
        if (this.f40950.mo1869() && c24733 != null) {
            z2 = false;
        }
        int iM19469 = C7116.m19469(abstractC1929, lValueOf, z2);
        long j8 = ((long) iM19469) + j5;
        if (iM19469 >= 0) {
            C5515 c5515 = (C5515) abstractC1929.get(iM19469);
            AbstractC1928 abstractC19210 = j7 < c5515.f6095 + c5515.f6093 ? c5515.f19195 : abstractC1928;
            while (i2 < abstractC19210.size()) {
                C15209 c15209 = (C15209) abstractC19210.get(i2);
                if (j7 >= c15209.f6095 + c15209.f6093) {
                    i2++;
                } else if (c15209.f49638) {
                    j8 += abstractC19210 == abstractC1928 ? 1L : 0L;
                }
            }
            i2 = -1;
        } else {
            i2 = -1;
        }
        return new Pair(Long.valueOf(j8), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC24240 m31708(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        C4595 c4595 = this.f40949;
        byte[] bArrM14394 = c4595.m14394(uri);
        if (bArrM14394 != null) {
            c4595.m14392(uri, bArrM14394);
            return null;
        }
        C11941 c11941 = new C11941();
        c11941.m29911(uri);
        c11941.m29909(1);
        return new C21749(this.f40942, c11941.m29908(), this.f40952[i], this.f40944.mo5246(), this.f40944.mo5259(), this.f40941);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31713(InterfaceC1470 interfaceC1470) {
        this.f40950.mo1864(this.f40957[this.f40944.mo5257()]);
        this.f40944 = interfaceC1470;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m31723() {
        this.f40950.mo1864(this.f40957[this.f40944.mo5257()]);
        this.f40945 = null;
    }
}
