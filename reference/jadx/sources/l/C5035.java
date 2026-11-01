package l;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.ۚ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NF */
/* JADX INFO: loaded from: classes3.dex */
public final class C5035 implements InterfaceC2822, InterfaceC13407, InterfaceC19445, InterfaceC15690, InterfaceC21561 {

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public static final Set f17552 = C0561.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C20930 f17553;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean[] f17554;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C7512 f17555;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f17556;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int[] f17557;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f17558;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f17559;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final int f17560;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final C7648 f17561;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14113 f17562;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public boolean f17563;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC1879 f17564;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16967 f17565;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public boolean f17566;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C19519 f17567;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final List f17568;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17569;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f17570;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17571;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public C23679 f17572;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f17573;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f17574;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean[] f17575;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public AbstractC3216 f17576;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public C7648 f17577;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21200 f17578;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int[] f17579;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final int f17580;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C23285 f17581 = new C23285("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public final String f17582;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Handler f17583;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C0468 f17584;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public Set f17585;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15732 f17586;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public long f17587;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C7648 f17588;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public HashSet f17589;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8354 f17590;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public C2212[] f17591;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public long f17592;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f17593;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f17594;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC13503 f17595;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public SparseIntArray f17596;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17597;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final Map f17598;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17599;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC9642 f17600;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f17601;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17602;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int m14020(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ۙ */
    public final void mo7690(InterfaceC6599 interfaceC6599) {
    }

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final C5645 mo7683(InterfaceC1411 interfaceC1411, long j, long j2, IOException iOException, int i) {
        C5645 c5645M51360;
        int i2;
        AbstractC3216 abstractC3216 = (AbstractC3216) interfaceC1411;
        boolean z = abstractC3216 instanceof C0468;
        if (z && !((C0468) abstractC3216).m2333() && (iOException instanceof C1360) && ((i2 = ((C1360) iOException).f5709) == 410 || i2 == 404)) {
            return C23285.f75525;
        }
        long jM9625 = abstractC3216.m9625();
        abstractC3216.m9624();
        C13863 c13863 = new C13863(j2, abstractC3216.m9623());
        C17983.m41856(abstractC3216.f12013);
        C17983.m41856(abstractC3216.f12014);
        C4939 c4939 = new C4939(iOException, i);
        C20930 c20930 = this.f17553;
        C9382 c9382M21026 = C7970.m21026(c20930.m47063());
        InterfaceC14113 interfaceC14113 = this.f17562;
        C3030 c3030Mo5496 = interfaceC14113.mo5496(c9382M21026, c4939);
        boolean zM47058 = (c3030Mo5496 == null || c3030Mo5496.f11340 != 2) ? false : c20930.m47058(abstractC3216, c3030Mo5496.f11339);
        if (zM47058) {
            if (z && jM9625 == 0) {
                ArrayList arrayList = this.f17599;
                C2023.m6510(((C0468) C17745.m41308(arrayList, 1)) == abstractC3216);
                if (arrayList.isEmpty()) {
                    this.f17592 = this.f17559;
                } else {
                    ((C0468) C22808.m50475(arrayList)).m2334();
                }
            }
            c5645M51360 = C23285.f75523;
        } else {
            long jMo5495 = interfaceC14113.mo5495(c4939);
            c5645M51360 = jMo5495 != -9223372036854775807L ? C23285.m51360(jMo5495, false) : C23285.f75524;
        }
        C5645 c5645 = c5645M51360;
        boolean zM15534 = c5645.m15534();
        this.f17555.m20017(c13863, abstractC3216.f12011, this.f17560, abstractC3216.f12017, abstractC3216.f12015, abstractC3216.f12009, abstractC3216.f12013, abstractC3216.f12014, iOException, !zM15534);
        if (!zM15534) {
            this.f17576 = null;
        }
        if (zM47058) {
            if (!this.f17569) {
                C23815 c23815 = new C23815();
                c23815.m52494(this.f17559);
                mo1390(c23815.m52491());
                return c5645;
            }
            ((C17402) this.f17595).mo2532(this);
        }
        return c5645;
    }

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final void mo7686(InterfaceC1411 interfaceC1411, long j, long j2) {
        AbstractC3216 abstractC3216 = (AbstractC3216) interfaceC1411;
        this.f17576 = null;
        this.f17553.m47051(abstractC3216);
        long j3 = abstractC3216.f12010;
        abstractC3216.m9624();
        Map mapM9623 = abstractC3216.m9623();
        abstractC3216.m9625();
        C13863 c13863 = new C13863(j2, mapM9623);
        this.f17562.getClass();
        this.f17555.m20019(c13863, abstractC3216.f12011, this.f17560, abstractC3216.f12017, abstractC3216.f12015, abstractC3216.f12009, abstractC3216.f12013, abstractC3216.f12014);
        if (!this.f17569) {
            C23815 c23815 = new C23815();
            c23815.m52494(this.f17559);
            mo1390(c23815.m52491());
            return;
        }
        ((C17402) this.f17595).mo2532(this);
    }

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final void mo7687(InterfaceC1411 interfaceC1411, long j, long j2, int i) {
        C13863 c13863;
        AbstractC3216 abstractC3216 = (AbstractC3216) interfaceC1411;
        if (i == 0) {
            long j3 = abstractC3216.f12010;
            c13863 = new C13863(abstractC3216.f12016);
        } else {
            long j4 = abstractC3216.f12010;
            abstractC3216.m9624();
            Map mapM9623 = abstractC3216.m9623();
            abstractC3216.m9625();
            c13863 = new C13863(j2, mapM9623);
        }
        this.f17555.m20016(c13863, abstractC3216.f12011, this.f17560, abstractC3216.f12017, abstractC3216.f12015, abstractC3216.f12009, abstractC3216.f12013, abstractC3216.f12014, i);
    }

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final void mo7688(InterfaceC1411 interfaceC1411, long j, long j2, boolean z) {
        AbstractC3216 abstractC3216 = (AbstractC3216) interfaceC1411;
        this.f17576 = null;
        long j3 = abstractC3216.f12010;
        abstractC3216.m9624();
        Map mapM9623 = abstractC3216.m9623();
        abstractC3216.m9625();
        C13863 c13863 = new C13863(j2, mapM9623);
        this.f17562.getClass();
        this.f17555.m20015(c13863, abstractC3216.f12011, this.f17560, abstractC3216.f12017, abstractC3216.f12015, abstractC3216.f12009, abstractC3216.f12013, abstractC3216.f12014);
        if (z) {
            return;
        }
        if (m14028() || this.f17601 == 0) {
            m14026();
        }
        if (this.f17601 > 0) {
            ((C17402) this.f17595).mo2532(this);
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [l.֫ܳۙ] */
    /* JADX WARN: Type inference failed for: r1v13, types: [l.ۢܳۙ] */
    public C5035(String str, int i, InterfaceC13503 interfaceC13503, C20930 c20930, Map map, InterfaceC15732 interfaceC15732, long j, C7648 c7648, InterfaceC16967 interfaceC16967, C21200 c21200, InterfaceC14113 interfaceC14113, C7512 c7512, int i2) {
        this.f17582 = str;
        this.f17560 = i;
        this.f17595 = interfaceC13503;
        this.f17553 = c20930;
        this.f17598 = map;
        this.f17586 = interfaceC15732;
        this.f17561 = c7648;
        this.f17565 = interfaceC16967;
        this.f17578 = c21200;
        this.f17562 = interfaceC14113;
        this.f17555 = c7512;
        this.f17580 = i2;
        C19519 c19519 = new C19519();
        c19519.f62765 = null;
        c19519.f62767 = false;
        c19519.f62766 = null;
        this.f17567 = c19519;
        this.f17579 = new int[0];
        Set set = f17552;
        this.f17589 = new HashSet(set.size());
        this.f17596 = new SparseIntArray(set.size());
        this.f17591 = new C2212[0];
        this.f17554 = new boolean[0];
        this.f17575 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f17599 = arrayList;
        this.f17568 = C0561.unmodifiableList(arrayList);
        this.f17571 = new ArrayList();
        this.f17564 = new Runnable() { // from class: l.֫ܳۙ
            @Override // java.lang.Runnable
            public final void run() {
                this.f7117.m14029();
            }
        };
        this.f17600 = new Runnable() { // from class: l.ۢܳۙ
            @Override // java.lang.Runnable
            public final void run() {
                C5035.m14031(this.f32442);
            }
        };
        this.f17583 = C17983.m41832((Handler.Callback) null);
        this.f17559 = j;
        this.f17592 = j;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m14047() {
        if (this.f17569) {
            return;
        }
        C23815 c23815 = new C23815();
        c23815.m52494(this.f17559);
        mo1390(c23815.m52491());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14043(C17216[] c17216Arr, int... iArr) {
        this.f17572 = m14022(c17216Arr);
        this.f17585 = new HashSet();
        for (int i : iArr) {
            this.f17585.add(this.f17572.m52136(i));
        }
        this.f17573 = 0;
        final InterfaceC13503 interfaceC13503 = this.f17595;
        this.f17583.post(new Runnable() { // from class: l.ۗܳۙ
            @Override // java.lang.Runnable
            public final void run() {
                ((C17402) interfaceC13503).m40548();
            }
        });
        this.f17569 = true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m14046() {
        m14052();
        if (this.f17558 && !this.f17569) {
            throw C22861.m50610("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23679 m14034() {
        m14027();
        return this.f17572;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m14036(int i) {
        m14027();
        this.f17557.getClass();
        int i2 = this.f17557[i];
        if (i2 == -1) {
            return this.f17585.contains(this.f17572.m52136(i)) ? -3 : -2;
        }
        boolean[] zArr = this.f17575;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m14035(int i) {
        m14027();
        this.f17557.getClass();
        int i2 = this.f17557[i];
        C2023.m6510(this.f17575[i2]);
        this.f17575[i2] = false;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x011d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14045(InterfaceC6558[] interfaceC6558Arr, boolean[] zArr, InterfaceC18739[] interfaceC18739Arr, boolean[] zArr2, long j, boolean z) {
        boolean z2;
        m14027();
        int i = this.f17601;
        for (int i2 = 0; i2 < interfaceC6558Arr.length; i2++) {
            C14581 c14581 = (C14581) interfaceC18739Arr[i2];
            if (c14581 != null && (interfaceC6558Arr[i2] == null || !zArr[i2])) {
                this.f17601--;
                c14581.m35053();
                interfaceC18739Arr[i2] = null;
            }
        }
        boolean z3 = z || (!this.f17602 ? j == this.f17559 : i != 0);
        C20930 c20930 = this.f17553;
        InterfaceC6558 interfaceC6558M47063 = c20930.m47063();
        boolean z4 = z3;
        InterfaceC6558 interfaceC6558 = interfaceC6558M47063;
        for (int i3 = 0; i3 < interfaceC6558Arr.length; i3++) {
            InterfaceC6558 interfaceC6559 = interfaceC6558Arr[i3];
            if (interfaceC6559 != null) {
                int iM52135 = this.f17572.m52135(interfaceC6559.mo37959());
                if (iM52135 == this.f17573) {
                    c20930.m47052(interfaceC6559);
                    interfaceC6558 = interfaceC6559;
                }
                if (interfaceC18739Arr[i3] == null) {
                    this.f17601++;
                    C14581 c14582 = new C14581(this, iM52135);
                    interfaceC18739Arr[i3] = c14582;
                    zArr2[i3] = true;
                    if (this.f17557 != null) {
                        c14582.m35054();
                        if (!z4) {
                            C2212 c2212 = this.f17591[this.f17557[iM52135]];
                            z4 = (c2212.m42019() == 0 || c2212.m42014(j, true)) ? false : true;
                        }
                    }
                }
            }
        }
        int i4 = this.f17601;
        ArrayList arrayList = this.f17599;
        if (i4 == 0) {
            c20930.m47060();
            this.f17588 = null;
            this.f17593 = true;
            arrayList.clear();
            C23285 c23285 = this.f17581;
            if (c23285.m51365()) {
                if (this.f17566) {
                    for (C2212 c2213 : this.f17591) {
                        c2213.m41999();
                    }
                }
                c23285.m51366();
            } else {
                m14026();
            }
        } else {
            if (arrayList.isEmpty() || C13638.equals(interfaceC6558, interfaceC6558M47063)) {
                z2 = z;
            } else {
                if (!this.f17602) {
                    long j2 = j < 0 ? -j : 0L;
                    C0468 c0468M14032 = m14032();
                    interfaceC6558.mo17789(j, j2, -9223372036854775807L, this.f17568, c20930.m47059(c0468M14032, j));
                    if (interfaceC6558.mo17783() == c20930.m47050().m40158(c0468M14032.f12017)) {
                        z2 = z;
                    }
                }
                this.f17593 = true;
                z2 = true;
                z4 = true;
            }
            if (z4) {
                m14051(j, z2);
                for (int i5 = 0; i5 < interfaceC18739Arr.length; i5++) {
                    if (interfaceC18739Arr[i5] != null) {
                        zArr2[i5] = true;
                    }
                }
            }
        }
        ArrayList arrayList2 = this.f17571;
        arrayList2.clear();
        for (InterfaceC18739 interfaceC18739 : interfaceC18739Arr) {
            if (interfaceC18739 != null) {
                arrayList2.add((C14581) interfaceC18739);
            }
        }
        this.f17602 = true;
        return z4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14040(long j, boolean z) {
        if (!this.f17566 || m14028()) {
            return;
        }
        int length = this.f17591.length;
        for (int i = 0; i < length; i++) {
            this.f17591[i].m42001(j, z, this.f17575[i]);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m14051(long j, boolean z) {
        C0468 c0468;
        boolean z2;
        boolean zM42014;
        this.f17559 = j;
        if (m14028()) {
            this.f17592 = j;
            return true;
        }
        boolean zM47061 = this.f17553.m47061();
        ArrayList arrayList = this.f17599;
        if (!zM47061) {
            c0468 = null;
            break;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                c0468 = null;
                break;
            }
            c0468 = (C0468) arrayList.get(i);
            if (c0468.f12013 == j) {
                break;
            }
            i++;
        }
        if (this.f17566 && !z && !arrayList.isEmpty()) {
            int length = this.f17591.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = true;
                    break;
                }
                C2212 c2212 = this.f17591[i2];
                if (c0468 != null) {
                    zM42014 = c2212.m42013(c0468.m2329(i2));
                } else {
                    long jMo1392 = mo1392();
                    zM42014 = c2212.m42014(j, jMo1392 == Long.MIN_VALUE || j < jMo1392);
                }
                if (!zM42014 && (this.f17554[i2] || !this.f17556)) {
                    z2 = false;
                    break;
                }
                i2++;
            }
            if (z2) {
                return false;
            }
        }
        this.f17592 = j;
        this.f17558 = false;
        arrayList.clear();
        C23285 c23285 = this.f17581;
        if (c23285.m51365()) {
            if (this.f17566) {
                for (C2212 c2213 : this.f17591) {
                    c2213.m41999();
                }
            }
            c23285.m51366();
            return true;
        }
        c23285.m51371();
        m14026();
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m14053() {
        ArrayList arrayList = this.f17599;
        if (arrayList.isEmpty()) {
            return;
        }
        final C0468 c0468 = (C0468) C22808.m50475(arrayList);
        C20930 c20930 = this.f17553;
        int iM47048 = c20930.m47048(c0468);
        if (iM47048 == 1) {
            if (c0468.m2333()) {
                return;
            }
            c0468.m2331(c20930.m47062(c0468));
        } else if (iM47048 == 0) {
            this.f17583.post(new Runnable() { // from class: l.ۙ֫ۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C5035.m14024(this.f15524, c0468);
                }
            });
        } else {
            if (iM47048 != 2 || this.f17558) {
                return;
            }
            C23285 c23285 = this.f17581;
            if (c23285.m51365()) {
                c23285.m51366();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14024(C5035 c5035, C0468 c0468) {
        InterfaceC13503 interfaceC13503 = c5035.f17595;
        ((C17402) interfaceC13503).f55382.f20863.mo14541(c0468.f2125);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m14054() {
        if (this.f17569) {
            for (C2212 c2212 : this.f17591) {
                c2212.m42018();
            }
        }
        this.f17553.m47060();
        this.f17581.m51369(this);
        this.f17583.removeCallbacksAndMessages(null);
        this.f17597 = true;
        this.f17571.clear();
    }

    @Override // l.InterfaceC13407
    /* JADX INFO: renamed from: ۖ */
    public final void mo7676() {
        for (C2212 c2212 : this.f17591) {
            c2212.m42016();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14042(boolean z) {
        this.f17553.m47054(z);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14044(Uri uri, C4939 c4939, boolean z) {
        long j;
        C20930 c20930 = this.f17553;
        if (!c20930.m47056(uri)) {
            return true;
        }
        if (z) {
            j = -9223372036854775807L;
        } else {
            C3030 c3030Mo5496 = this.f17562.mo5496(C7970.m21026(c20930.m47063()), c4939);
            if (c3030Mo5496 == null || c3030Mo5496.f11340 != 2) {
                j = -9223372036854775807L;
            } else {
                j = c3030Mo5496.f11339;
            }
        }
        return c20930.m47057(uri, j);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m14056() {
        return this.f17570 == 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m14039(long j, C6901 c6901) {
        return this.f17553.m47049(j, c6901);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m14050(int i) {
        return !m14028() && this.f17591[i].m42003(this.f17558);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m14048(int i) {
        m14052();
        this.f17591[i].m42020();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m14052() {
        this.f17581.m51367(Integer.MIN_VALUE);
        this.f17553.m47046();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m14038(int i, C12526 c12526, C16033 c16033, int i2) {
        int i3;
        C7648 c7648;
        if (m14028()) {
            return -3;
        }
        ArrayList arrayList = this.f17599;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            loop0: while (i4 < arrayList.size() - 1) {
                int i5 = ((C0468) arrayList.get(i4)).f2112;
                int length = this.f17591.length;
                for (int i6 = 0; i6 < length; i6++) {
                    if (this.f17575[i6] && this.f17591[i6].m42015() == i5) {
                        break loop0;
                    }
                }
                i4++;
            }
            String str = C17983.f57504;
            if (i4 > arrayList.size() || i4 < 0) {
                throw new IllegalArgumentException();
            }
            if (i4 != 0) {
                arrayList.subList(0, i4).clear();
            }
            C0468 c0468 = (C0468) arrayList.get(0);
            C7648 c7649 = c0468.f12017;
            if (!c7649.equals(this.f17588)) {
                C13157 c13157 = new C13157(1, this.f17560, c7649, c0468.f12015, c0468.f12009, C17983.m41856(c0468.f12013), -9223372036854775807L);
                C7512 c7512 = this.f17555;
                c7512.m20014(new C17548(c7512, c13157));
            }
            this.f17588 = c7649;
        }
        if (arrayList.isEmpty()) {
            i3 = 0;
        } else {
            i3 = 0;
            if (!((C0468) arrayList.get(0)).m2333()) {
                return -3;
            }
        }
        int iM41998 = this.f17591[i].m41998(c12526, c16033, i2, this.f17558);
        if (iM41998 == -5) {
            C7648 c7648M20203 = c12526.f41899;
            c7648M20203.getClass();
            if (i == this.f17594) {
                int iM39818 = C17039.m39818(this.f17591[i].m42015());
                while (i3 < arrayList.size() && ((C0468) arrayList.get(i3)).f2112 != iM39818) {
                    i3++;
                }
                if (i3 < arrayList.size()) {
                    c7648 = ((C0468) arrayList.get(i3)).f12017;
                } else {
                    c7648 = this.f17577;
                    c7648.getClass();
                }
                c7648M20203 = c7648M20203.m20203(c7648);
            }
            c12526.f41899 = c7648M20203;
        }
        return iM41998;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m14037(int i, long j) {
        Object next;
        Object objM43861;
        if (m14028()) {
            return 0;
        }
        C2212 c2212 = this.f17591[i];
        int iM41997 = c2212.m41997(j, this.f17558);
        ArrayList arrayList = this.f17599;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                objM43861 = next;
            } else {
                objM43861 = null;
            }
        } else if (arrayList.isEmpty()) {
            objM43861 = null;
        } else {
            objM43861 = C19084.m43861(arrayList, 1);
        }
        C0468 c0468 = (C0468) objM43861;
        if (c0468 != null && !c0468.m2333()) {
            iM41997 = Math.min(iM41997, c0468.m2329(i) - c2212.m42019());
        }
        c2212.m42007(iM41997);
        return iM41997;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۬ */
    public final long mo1391() {
        if (this.f17558) {
            return Long.MIN_VALUE;
        }
        if (m14028()) {
            return this.f17592;
        }
        long jMax = this.f17559;
        C0468 c0468M14032 = m14032();
        if (!c0468M14032.m2328()) {
            ArrayList arrayList = this.f17599;
            c0468M14032 = arrayList.size() > 1 ? (C0468) C19084.m43861(arrayList, 2) : null;
        }
        if (c0468M14032 != null) {
            jMax = Math.max(jMax, c0468M14032.f12014);
        }
        if (this.f17566) {
            for (C2212 c2212 : this.f17591) {
                jMax = Math.max(jMax, c2212.m41994());
            }
        }
        return jMax;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final long mo1392() {
        if (m14028()) {
            return this.f17592;
        }
        if (this.f17558) {
            return Long.MIN_VALUE;
        }
        return m14032().f12014;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1390(C14643 c14643) {
        long jMax;
        long j;
        long j2;
        List list;
        if (!this.f17558) {
            C23285 c23285 = this.f17581;
            if (!c23285.m51365() && !c23285.m51370()) {
                if (m14028()) {
                    List list2 = Collections.EMPTY_LIST;
                    long j3 = this.f17592;
                    for (C2212 c2212 : this.f17591) {
                        c2212.m42008(this.f17592);
                    }
                    list = list2;
                    j = j3;
                    j2 = j;
                } else {
                    C0468 c0468M14032 = m14032();
                    if (!c0468M14032.m2328() || !c0468M14032.m2333()) {
                        jMax = Math.max(this.f17559, c0468M14032.f12013);
                    } else {
                        jMax = c0468M14032.m2327();
                    }
                    long j4 = jMax;
                    long jMax2 = this.f17559;
                    boolean z = this.f17566;
                    List list3 = this.f17568;
                    if (z) {
                        for (C2212 c2213 : this.f17591) {
                            jMax2 = Math.max(jMax2, c2213.m42004());
                        }
                    }
                    j = j4;
                    j2 = jMax2;
                    list = list3;
                }
                C19519 c19519 = this.f17567;
                c19519.f62765 = null;
                c19519.f62767 = false;
                c19519.f62766 = null;
                this.f17553.m47053(c14643, j, j2, list, this.f17569 || !list.isEmpty(), this.f17567);
                boolean z2 = c19519.f62767;
                AbstractC3216 abstractC3216 = c19519.f62765;
                Uri uri = c19519.f62766;
                if (z2) {
                    this.f17592 = -9223372036854775807L;
                    this.f17558 = true;
                    return true;
                }
                if (abstractC3216 != null) {
                    if (abstractC3216 instanceof C0468) {
                        C0468 c0468 = (C0468) abstractC3216;
                        ArrayList arrayList = this.f17599;
                        if (!arrayList.isEmpty()) {
                            if (!m14032().m2333()) {
                                m14033(arrayList.size() - 1);
                            }
                            if (c0468.f2127 && c0468.m2337()) {
                                for (int size = arrayList.size() - 1; size >= 0; size--) {
                                    long j5 = ((C0468) arrayList.get(size)).f12013;
                                    long j6 = c0468.f12013;
                                    if (j5 < j6) {
                                        break;
                                    }
                                    if (j5 == j6 && m14025(size)) {
                                        m14033(size);
                                        c0468.m2336();
                                        break;
                                    }
                                }
                            }
                        }
                        this.f17584 = c0468;
                        this.f17577 = c0468.f12017;
                        this.f17592 = -9223372036854775807L;
                        arrayList.add(c0468);
                        int i = AbstractC22433.f73217;
                        C4793 c4793 = new C4793();
                        for (C2212 c2214 : this.f17591) {
                            c4793.m52163(Integer.valueOf(c2214.m42009()));
                        }
                        c0468.m2332(this, c4793.m13309());
                        for (C2212 c2215 : this.f17591) {
                            c2215.getClass();
                            c2215.m41995(c0468.f2112);
                            if (c0468.m2337()) {
                                c2215.m42017();
                            }
                        }
                    }
                    this.f17576 = abstractC3216;
                    c23285.m51368(abstractC3216, this, this.f17562.mo5494(abstractC3216.f12011));
                    return true;
                }
                if (uri != null) {
                    ((C17402) this.f17595).f55382.f20863.mo14541(uri);
                    return false;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1389() {
        return this.f17581.m51365();
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final void mo1393(long j) {
        C23285 c23285 = this.f17581;
        if (c23285.m51370() || m14028()) {
            return;
        }
        boolean zM51365 = c23285.m51365();
        C20930 c20930 = this.f17553;
        List list = this.f17568;
        if (zM51365) {
            this.f17576.getClass();
            if (c20930.m47055(j, this.f17576, list)) {
                c23285.m51366();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && c20930.m47048((C0468) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            m14033(size);
        }
        int iM47047 = c20930.m47047(j, list);
        if (iM47047 < this.f17599.size()) {
            m14033(iM47047);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m14033(int i) {
        ArrayList arrayList;
        C2023.m6510(!this.f17581.m51365());
        while (true) {
            arrayList = this.f17599;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (m14025(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = m14032().f12014;
        C0468 c0468 = (C0468) arrayList.get(i);
        int size = arrayList.size();
        String str = C17983.f57504;
        if (i < 0 || size > arrayList.size() || i > size) {
            throw new IllegalArgumentException();
        }
        if (i != size) {
            arrayList.subList(i, size).clear();
        }
        for (int i2 = 0; i2 < this.f17591.length; i2++) {
            this.f17591[i2].m42000(c0468.m2329(i2));
        }
        if (arrayList.isEmpty()) {
            this.f17592 = this.f17559;
        } else {
            ((C0468) C22808.m50475(arrayList)).m2334();
        }
        this.f17558 = false;
        C13157 c13157 = new C13157(1, this.f17570, null, 3, null, C17983.m41856(c0468.f12013), C17983.m41856(j));
        C7512 c7512 = this.f17555;
        C15274 c15274 = c7512.f24997;
        c15274.getClass();
        c7512.m20014(new C1024(c7512, c15274, c13157));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [l.ۖ֫ۙ[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ۖ֫ۙ[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [l.۠ۜܰ] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.ۖ֫ۙ, l.ᩳۨܰ] */
    /* JADX WARN: Type inference failed for: r5v6, types: [l.۠ۘܰ] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC8011 mo7684(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = f17552;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.f17589;
        SparseIntArray sparseIntArray = this.f17596;
        ?? c2212 = 0;
        c2212 = 0;
        if (zContains) {
            C2023.m6507(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.f17579[i3] = i;
                }
                if (this.f17579[i3] == i) {
                    c2212 = this.f17591[i3];
                } else {
                    c2212 = m14030(i, i2);
                }
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.f17591;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.f17579[i4] == i) {
                    c2212 = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (c2212 == 0) {
            if (this.f17563) {
                return m14030(i, i2);
            }
            int length = this.f17591.length;
            boolean z = i2 == 1 || i2 == 2;
            c2212 = new C2212(this.f17586, this.f17565, this.f17578, this.f17598);
            c2212.m42008(this.f17559);
            if (z) {
                c2212.m6826(this.f17590);
            }
            c2212.m42011(this.f17587);
            C0468 c0468 = this.f17584;
            if (c0468 != null) {
                c2212.m41995(c0468.f2112);
            }
            c2212.m42002(this);
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f17579, i5);
            this.f17579 = iArrCopyOf;
            iArrCopyOf[length] = i;
            C2212[] c2212Arr = this.f17591;
            String str = C17983.f57504;
            ?? CopyOf = Arrays.copyOf(c2212Arr, c2212Arr.length + 1);
            CopyOf[c2212Arr.length] = c2212;
            this.f17591 = (C2212[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f17554, i5);
            this.f17554 = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.f17556 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (m14020(i2) > m14020(this.f17570)) {
                this.f17594 = length;
                this.f17570 = i2;
            }
            this.f17575 = Arrays.copyOf(this.f17575, i5);
        }
        if (i2 != 5) {
            return c2212;
        }
        if (this.f17574 == null) {
            this.f17574 = new C11386(c2212, this.f17580);
        }
        return this.f17574;
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ᩹ */
    public final void mo7696() {
        this.f17563 = true;
        this.f17583.post(this.f17600);
    }

    @Override // l.InterfaceC21561
    /* JADX INFO: renamed from: ۘ */
    public final void mo7677() {
        this.f17583.post(this.f17564);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m14055() {
        this.f17589.clear();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m14049(long j) {
        if (this.f17587 != j) {
            this.f17587 = j;
            for (C2212 c2212 : this.f17591) {
                c2212.m42011(j);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14041(C8354 c8354) {
        if (C13638.equals(this.f17590, c8354)) {
            return;
        }
        this.f17590 = c8354;
        int i = 0;
        while (true) {
            C2212[] c2212Arr = this.f17591;
            if (i >= c2212Arr.length) {
                return;
            }
            if (this.f17554[i]) {
                c2212Arr[i].m6826(c8354);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m14025(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.f17599;
            if (i2 < arrayList.size()) {
                if (((C0468) arrayList.get(i2)).m2337()) {
                    return false;
                }
                i2++;
            } else {
                C0468 c0468 = (C0468) arrayList.get(i);
                for (int i3 = 0; i3 < this.f17591.length; i3++) {
                    if (this.f17591[i3].m42019() > c0468.m2329(i3)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m14026() {
        for (C2212 c2212 : this.f17591) {
            c2212.m42012(this.f17593);
        }
        this.f17593 = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m14031(C5035 c5035) {
        c5035.f17566 = true;
        c5035.m14029();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m14029() {
        if (!this.f17597 && this.f17557 == null && this.f17566) {
            for (C2212 c2212 : this.f17591) {
                if (c2212.m41993() == null) {
                    return;
                }
            }
            C23679 c23679 = this.f17572;
            if (c23679 != null) {
                int i = c23679.f76614;
                int[] iArr = new int[i];
                this.f17557 = iArr;
                Arrays.fill(iArr, -1);
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = 0;
                    while (true) {
                        C2212[] c2212Arr = this.f17591;
                        if (i3 >= c2212Arr.length) {
                            break;
                        }
                        C7648 c7648M41993 = c2212Arr[i3].m41993();
                        C2023.m6508(c7648M41993);
                        C7648 c7648M40159 = this.f17572.m52136(i2).m40159(0);
                        String str = c7648M41993.f25265;
                        String str2 = c7648M40159.f25265;
                        int iM17981 = C6632.m17981(str);
                        if (iM17981 != 3) {
                            if (iM17981 == C6632.m17981(str2)) {
                                this.f17557[i2] = i3;
                                break;
                            }
                            i3++;
                        } else {
                            if (C13638.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c7648M41993.f25247 == c7648M40159.f25247)) {
                                this.f17557[i2] = i3;
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
                Iterator it = this.f17571.iterator();
                while (it.hasNext()) {
                    ((C14581) it.next()).m35054();
                }
                return;
            }
            int length = this.f17591.length;
            int i4 = 0;
            int i5 = -2;
            int i6 = -1;
            while (true) {
                int i7 = 1;
                if (i4 >= length) {
                    break;
                }
                C7648 c7648M41994 = this.f17591[i4].m41993();
                C2023.m6508(c7648M41994);
                String str3 = c7648M41994.f25265;
                if (C6632.m17982(str3)) {
                    i7 = 2;
                } else if (!C6632.m17975(str3)) {
                    i7 = C6632.m17977(str3) ? 3 : -2;
                }
                if (m14020(i7) > m14020(i5)) {
                    i6 = i4;
                    i5 = i7;
                } else if (i7 == i5 && i6 != -1) {
                    i6 = -1;
                }
                i4++;
            }
            C17216 c17216M47050 = this.f17553.m47050();
            int i8 = c17216M47050.f54864;
            this.f17573 = -1;
            this.f17557 = new int[length];
            for (int i9 = 0; i9 < length; i9++) {
                this.f17557[i9] = i9;
            }
            C17216[] c17216Arr = new C17216[length];
            int i10 = 0;
            while (i10 < length) {
                C7648 c7648M41995 = this.f17591[i10].m41993();
                C2023.m6508(c7648M41995);
                String str4 = this.f17582;
                C7648 c7648 = this.f17561;
                if (i10 == i6) {
                    C7648[] c7648Arr = new C7648[i8];
                    for (int i11 = 0; i11 < i8; i11++) {
                        C7648 c7648M401510 = c17216M47050.m40159(i11);
                        if (i5 == 1 && c7648 != null) {
                            c7648M401510 = c7648M401510.m20203(c7648);
                        }
                        c7648Arr[i11] = i8 == 1 ? c7648M41995.m20203(c7648M401510) : m14021(c7648M401510, c7648M41995, true);
                    }
                    c17216Arr[i10] = new C17216(str4, c7648Arr);
                    this.f17573 = i10;
                } else {
                    if (i5 != 2 || !C6632.m17975(c7648M41995.f25265)) {
                        c7648 = null;
                    }
                    StringBuilder sbM8976 = C3012.m8976(str4, ":muxed:");
                    sbM8976.append(i10 < i6 ? i10 : i10 - 1);
                    c17216Arr[i10] = new C17216(sbM8976.toString(), m14021(c7648, c7648M41995, false));
                }
                i10++;
            }
            this.f17572 = m14022(c17216Arr);
            C2023.m6510(this.f17585 == null);
            this.f17585 = Collections.EMPTY_SET;
            this.f17569 = true;
            ((C17402) this.f17595).m40548();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23679 m14022(C17216[] c17216Arr) {
        for (int i = 0; i < c17216Arr.length; i++) {
            C17216 c17216 = c17216Arr[i];
            C7648[] c7648Arr = new C7648[c17216.f54864];
            for (int i2 = 0; i2 < c17216.f54864; i2++) {
                C7648 c7648M40159 = c17216.m40159(i2);
                c7648Arr[i2] = c7648M40159.m20200(this.f17565.mo39756(c7648M40159));
            }
            c17216Arr[i] = new C17216(c17216.f54867, c7648Arr);
        }
        return new C23679(c17216Arr);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C0468 m14032() {
        return (C0468) C19084.m43861(this.f17599, 1);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private boolean m14028() {
        return this.f17592 != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m14027() {
        C2023.m6510(this.f17569);
        this.f17572.getClass();
        this.f17585.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7648 m14021(C7648 c7648, C7648 c7649, boolean z) {
        String strM17987;
        if (c7648 == null) {
            return c7649;
        }
        String str = c7648.f25277;
        String strM17986 = c7649.f25265;
        int iM17981 = C6632.m17981(strM17986);
        if (C17983.m41815(iM17981, str) == 1) {
            strM17987 = C17983.m41860(iM17981, str);
            strM17986 = C6632.m17986(strM17987);
        } else {
            strM17987 = C6632.m17987(str, strM17986);
        }
        C10471 c10471M20201 = c7649.m20201();
        c10471M20201.m26516(c7648.f25275);
        c10471M20201.m26495(c7648.f25274);
        c10471M20201.m26522(c7648.f25238);
        c10471M20201.m26509(c7648.f25269);
        c10471M20201.m26530(c7648.f25243);
        c10471M20201.m26513(c7648.f25244);
        c10471M20201.m26515(z ? c7648.f25259 : -1);
        c10471M20201.m26528(z ? c7648.f25266 : -1);
        c10471M20201.m26502(strM17987);
        if (iM17981 == 2) {
            c10471M20201.m26525(c7648.f25246);
            c10471M20201.m26534(c7648.f25253);
            c10471M20201.m26498(c7648.f25273);
        }
        if (strM17986 != null) {
            c10471M20201.m26533(strM17986);
        }
        int i = c7648.f25249;
        if (i != -1 && iM17981 == 1) {
            c10471M20201.m26494(i);
        }
        C0987 c0987M3791 = c7648.f25258;
        if (c0987M3791 != null) {
            C0987 c0987 = c7649.f25258;
            if (c0987 != null) {
                c0987M3791 = c0987.m3791(c0987M3791);
            }
            c10471M20201.m26504(c0987M3791);
        }
        return c10471M20201.m26497();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C7928 m14030(int i, int i2) {
        C0303.m1848("Unmapped track with id " + i + " of type " + i2);
        return new C7928();
    }
}
