package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡ۙ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 77E4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0202 extends C14618 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C17355 f1340;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C23497 f1341;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f1342;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C7834 f1343;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1344;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C23497 f1345;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C23497 f1346;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f1347;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f1348;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public HashMap f1349;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C11562 f1350;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C23497 f1351;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C23497 f1352;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f1353;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f1354;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C25340 f1355;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11562 f1356;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C1122 f1357;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C21259 f1358;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C23497 f1359;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C21259 f1360;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public C7834 f1361;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0202(C25340 c25340, int i, C21259 c21259, C21259 c212510) {
        C15291 c15291 = c25340.f20376;
        super(c15291, EnumC13127.f41940);
        this.f1347 = 0;
        this.f1348 = 0L;
        this.f1353 = new ArrayList();
        this.f1352 = null;
        this.f1341 = null;
        this.f1355 = c25340;
        this.f1340 = c25340.f81813;
        C1122 c1122 = (C1122) c25340.m17326();
        this.f1357 = c1122;
        this.f1358 = c21259;
        this.f1360 = c212510;
        this.f1354 = new ArrayList(Collections.nCopies(c212510 != null ? c212510.f67820 : i, null));
        this.f1344 = new ArrayList(Collections.nCopies(c212510 != null ? c212510.f67820 : i, null));
        C7834 c7834 = new C7834(c25340, c1122);
        this.f1361 = c7834;
        this.f1343 = c7834;
        this.f1350 = new C11562(0);
        C11562 c11562 = new C11562();
        this.f1356 = c11562;
        if (c1122.m32302()) {
            C23497 c23497 = new C23497(c15291, EnumC13127.f41946);
            this.f1346 = c23497;
            c11562.m29081(c23497);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1598(ArrayList arrayList, boolean z) {
        C23497 c23497 = z ? this.f1351 : this.f1359;
        if (c23497 == null) {
            c23497 = new C23497(this.f1355.f20376, z ? EnumC13127.f41974 : EnumC13127.f41957);
            this.f1356.m29081(c23497);
        }
        c23497.addAll(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1597(ArrayList arrayList) {
        if (this.f1345 == null) {
            C6169 c6169 = new C6169();
            C11562 c11562 = this.f1356;
            C23497 c23497 = (C23497) c11562.m29080(c6169).orElse(null);
            if (c23497 == null) {
                C17355 c17355 = this.f1340;
                C23497 c23498 = new C23497(c17355.f20376, c17355.f56482.m51469() ? EnumC13127.f41967 : EnumC13127.f41972);
                this.f1345 = c23498;
                c11562.m29081(c23498);
            } else {
                this.f1345 = c23497;
            }
        }
        this.f1345.addAll(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18101 m1595(long j, String str) {
        C18101 c18101;
        HashMap map = this.f1342;
        if (map == null) {
            this.f1342 = new HashMap(10);
            c18101 = null;
        } else {
            c18101 = (C18101) map.get(str);
        }
        if (c18101 != null) {
            return c18101;
        }
        C18101 c18102 = new C18101(str);
        c18102.f59239 = -1;
        c18102.f59238 = -1;
        c18102.f59240 = j;
        this.f1342.put(str, c18102);
        return c18102;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m1602() {
        HashMap map = this.f1342;
        C1122 c1122 = this.f1357;
        if (map != null) {
            for (C18101 c18101 : map.values()) {
                if (!c18101.f67360) {
                    c1122.mo4166(c18101.f59240, "No <catch {0}> declared", c18101.f67359);
                }
            }
            for (C6343 c6343 : this.f1350.f36349) {
                C18101 c18102 = c6343.f21469;
                long j = c6343.f21471;
                int i = c18102.f59239;
                String str = c18102.f67359;
                if (i == -1) {
                    c1122.mo4159(j, "No <try {0}> found", str);
                }
                if (c18102.f59238 == -1) {
                    c1122.mo4159(j, "No <endtry {0}> found", str);
                }
            }
        }
        m1600(EnumC22268.f71959);
        m1600(EnumC22268.f72102);
        HashMap map2 = this.f1349;
        if (map2 != null) {
            for (C14371 c14371 : map2.values()) {
                if (!c14371.f67361) {
                    c1122.mo4160("Label {0} not declared", c14371.f67359);
                }
            }
        }
        C23497 c23497 = this.f1352;
        C11562 c11562 = this.f1356;
        if (c23497 != null) {
            c11562.m29081(c23497);
        }
        C23497 c23498 = this.f1341;
        if (c23498 != null) {
            c11562.m29081(c23498);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14371 m1594(String str) {
        C14371 c14371;
        HashMap map = this.f1349;
        if (map == null) {
            this.f1349 = new HashMap(10);
            c14371 = null;
        } else {
            c14371 = (C14371) map.get(str);
        }
        if (c14371 != null) {
            return c14371;
        }
        C14371 c14372 = new C14371(str);
        this.f1349.put(str, c14372);
        return c14372;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1600(EnumC22268 enumC22268) {
        ArrayList arrayList = enumC22268 == EnumC22268.f71959 ? this.f1354 : this.f1344;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null) {
                ((C15642) arrayList.get(i)).m37393(this.f1347);
                C1122 c1122 = this.f1357;
                c1122.mo4166(c1122.m4164(), enumC22268 == EnumC22268.f71959 ? "endvar {0}; expected for the local variable" : "endtype {0}; expected for the local variable", Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C13930 m1601() {
        ArrayList arrayList = this.f1353;
        int size = arrayList.size();
        if (size != 0) {
            return (C13930) arrayList.get(size - 1);
        }
        C13930 c13930 = new C13930(this.f1357, this.f1340.f56482.m51469());
        arrayList.add(c13930);
        return c13930;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1596(long j, EnumC22268 enumC22268, C21259 c21259, Object obj) {
        int i;
        int i2;
        int i3;
        C13930 c13930;
        C0202 c0202;
        C7660 c7660;
        EnumC19767 enumC19767;
        C25340 c25340 = this.f1355;
        C1122 c1122 = this.f1357;
        C7834 c7834 = new C7834(c25340, c1122);
        c7834.m21358(this.f1347, c1122.m4164(), enumC22268, c21259, obj);
        this.f1343.f26115 = c7834;
        this.f1343 = c7834;
        int iM50329 = enumC22268.m50329();
        int i4 = C3931.f13421[enumC22268.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                C22071 c22071 = (C22071) obj;
                int i5 = this.f1347;
                c22071.f71160 = i5;
                int i6 = (3 - i5) & 3;
                c22071.f71162 = i6;
                int size = i6 + 1 + ((c22071.f71166.size() + 1) * 8);
                if (c22071.f71159 == null) {
                    c22071.f71159 = new C21259(i5 + size);
                }
                int i7 = C23014.f74679;
                if (size >= 16384) {
                    c1122.mo4159(j, "The length of the {0} instruction {1} exceeds the allowed limit of {2} bytes", EnumC22268.f71748.m50326(), Integer.valueOf(size), 16384);
                }
                iM50329 = size;
            } else if (i4 == 3) {
                C7660 c7661 = (C7660) c21259;
                EnumC19767 enumC19768 = EnumC19767.LDC;
                if (c7661.f25233.f63617 > enumC19768.f63617) {
                    c7661.f25233 = enumC19768;
                }
            } else if ((c21259 instanceof C7660) && (enumC19767 = (c7660 = (C7660) c21259).f25233) != EnumC19767.LDC) {
                EnumC19767 enumC19769 = EnumC19767.ANY;
                if (enumC19767.f63617 > enumC19769.f63617) {
                    c7660.f25233 = enumC19769;
                }
            }
            c13930 = null;
        } else {
            C22071 c22072 = (C22071) obj;
            int i8 = this.f1347;
            C1122 c1123 = c22072.f71165;
            int size2 = c22072.f71166.size();
            if (size2 > 0) {
                i2 = Integer.MAX_VALUE;
                i3 = Integer.MIN_VALUE;
                for (int i9 = 0; i9 < size2; i9++) {
                    int iIntValue = ((Integer) c22072.f71166.get(i9)).intValue();
                    if (iIntValue > i3) {
                        i3 = iIntValue;
                    }
                    if (iIntValue < i2) {
                        i2 = iIntValue;
                    }
                }
                i = (i3 - i2) + 1;
            } else {
                i = 0;
                i2 = Integer.MAX_VALUE;
                i3 = Integer.MIN_VALUE;
            }
            c1123.m32315(String.format("  recalcTableSwitch: low=%d high=%d", Integer.valueOf(i2), Integer.valueOf(i3)), new Object[0]);
            c22072.f71160 = i8;
            int i10 = (3 - i8) & 3;
            c22072.f71162 = i10;
            int iM31441 = C12669.m31441(i, 3, 4, i10 + 1);
            if (c22072.f71159 == null) {
                c22072.f71159 = new C21259(i8 + iM31441);
            }
            C21259[] c21259Arr = new C21259[i];
            for (int i11 = 0; i11 < i; i11++) {
                c21259Arr[i11] = c22072.f71159;
            }
            int i12 = 0;
            while (i12 < size2) {
                c1123.m32315(String.format("   keys.data[%d]=%s", Integer.valueOf(i12), c22072.f71166.get(i12)), new Object[0]);
                c21259Arr[((Integer) c22072.f71166.get(i12)).intValue() - i2] = (C21259) c22072.f71164.get(i12);
                i12++;
                size2 = size2;
            }
            c22072.f71158 = c21259Arr;
            c13930 = null;
            c22072.f71164 = null;
            c22072.f71166 = null;
            c22072.f71161 = i3;
            c22072.f71163 = i2;
            int i13 = C23014.f74679;
            if (iM31441 >= 16384) {
                c1122.mo4159(j, "The length of the {0} instruction {1} exceeds the allowed limit of {2} bytes", EnumC22268.f71926.m50326(), Integer.valueOf(iM31441), 16384);
            }
            iM50329 = iM31441;
        }
        if (c1122.m32302()) {
            long jM4158 = c1122.m4158(j);
            c0202 = this;
            if (jM4158 != c0202.f1348) {
                c0202.f1346.m52689(new C23102(c0202.f1347, jM4158));
                c0202.f1348 = jM4158;
            }
        } else {
            c0202 = this;
        }
        ArrayList<C13930> arrayList = c0202.f1353;
        if (!arrayList.isEmpty()) {
            C23497 c23497 = c0202.f1345;
            if (c23497 == null) {
                C17355 c17355 = c0202.f1340;
                C23497 c23498 = new C23497(c17355.f20376, c17355.f56482.m51469() ? EnumC13127.f41967 : EnumC13127.f41972);
                c0202.f1345 = c23498;
                c0202.f1356.m29081(c23498);
            } else {
                int size3 = c23497.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    C13930 c13931 = (C13930) c0202.f1345.get(size3);
                    if (!c13931.m33919()) {
                        c13930 = c13931;
                        break;
                    }
                }
            }
            for (C13930 c13932 : arrayList) {
                if (!c13932.m33919()) {
                    c13932.m33921(c0202.f1347);
                    c13932.m33916(c13930);
                }
            }
            c0202.f1345.addAll(arrayList);
            arrayList.clear();
        }
        c0202.f1347 += iM50329;
    }

    @Override // l.C14618
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo1603() {
        return this.f1356.m29083() + this.f1350.m29083() + this.f1347 + 8;
    }

    @Override // l.C14618, l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C21259 c21259 = this.f1358;
        int i = c21259 != null ? c21259.f67820 : 0;
        C21259 c212510 = this.f1360;
        int iMax = c212510 != null ? c212510.f67820 : Math.max(this.f1354.size(), this.f1344.size());
        super.mo1599(interfaceC9397);
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(i);
        c11388.m28740(iMax);
        c11388.m28741(this.f1347);
        C7834 c7834 = this.f1361;
        while (true) {
            c7834 = c7834.f26115;
            if (c7834 != null) {
                c7834.m21359(c11388);
            } else {
                this.f1350.m29082(c11388);
                this.f1356.m29082(c11388);
                return;
            }
        }
    }
}
