package l;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ۙ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7MX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4769 implements InterfaceC0294, InterfaceC14805 {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final C12351 f16725 = new C12351();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15955 f16727;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6261 f16728;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC18193 f16729;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C24907 f16730;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f16731;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Handler f16732;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4365 f16734;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Uri f16735;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5341 f16736;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1382 f16737;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15617 f16739;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f16738 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final HashMap f16733 = new HashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f16726 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24907 m14722(C4769 c4769, C24907 c24907, C24907 c24908) {
        long j;
        long j2;
        int i;
        int size;
        int size2;
        int size3;
        boolean z = c24908.f80600;
        long j3 = c24908.f80612;
        boolean z2 = true;
        if (c24907 != null) {
            long j4 = c24907.f80612;
            if (j3 <= j4 && (j3 < j4 || ((size = c24908.f80607.size() - c24907.f80607.size()) == 0 ? !((size2 = c24908.f80601.size()) > (size3 = c24907.f80601.size()) || (size2 == size3 && z && !c24907.f80600)) : size <= 0))) {
                z2 = false;
            }
        }
        AbstractC1928 abstractC1928 = c24908.f80607;
        if (!z2) {
            return (!z || c24907.f80600) ? c24907 : new C24907(c24907.f80605, c24907.f75794, c24907.f75795, c24907.f80597, c24907.f80603, c24907.f80611, c24907.f80602, c24907.f80609, c24907.f80612, c24907.f80608, c24907.f80595, c24907.f80604, c24907.f75796, true, c24907.f80593, c24907.f80610, c24907.f80607, c24907.f80601, c24907.f80599, c24907.f80594, c24907.f80598);
        }
        if (c24908.f80593) {
            j2 = c24908.f80611;
        } else {
            C24907 c24909 = c4769.f16730;
            long j5 = c24909 != null ? c24909.f80611 : 0L;
            if (c24907 != null) {
                long j6 = c24907.f80611;
                long j7 = c24907.f80612;
                AbstractC1928 abstractC1929 = c24907.f80607;
                int size4 = abstractC1929.size();
                int i2 = (int) (j3 - j7);
                C5515 c5515 = i2 < abstractC1929.size() ? (C5515) abstractC1929.get(i2) : null;
                if (c5515 != null) {
                    j = c5515.f6095;
                } else if (size4 == j3 - j7) {
                    j = c24907.f80606;
                }
                j2 = j6 + j;
            }
            j2 = j5;
        }
        if (c24908.f80602) {
            i = c24908.f80609;
        } else {
            C24907 c249010 = c4769.f16730;
            i = c249010 != null ? c249010.f80609 : 0;
            if (c24907 != null) {
                int i3 = (int) (j3 - c24907.f80612);
                AbstractC1928 abstractC19210 = c24907.f80607;
                C5515 c5516 = i3 < abstractC19210.size() ? (C5515) abstractC19210.get(i3) : null;
                if (c5516 != null) {
                    i = (c24907.f80609 + c5516.f6098) - ((C5515) abstractC1928.get(0)).f6098;
                }
            }
        }
        return new C24907(c24908.f80605, c24908.f75794, c24908.f75795, c24908.f80597, c24908.f80603, j2, true, i, c24908.f80612, c24908.f80608, c24908.f80595, c24908.f80604, c24908.f75796, c24908.f80600, c24908.f80593, c24908.f80610, abstractC1928, c24908.f80601, c24908.f80599, c24908.f80594, c24908.f80598);
    }

    @Override // l.InterfaceC14805
    /* JADX INFO: renamed from: ۙ */
    public final C21519 mo6404(InterfaceC0636 interfaceC0636, long j, long j2, IOException iOException, int i) {
        C2873 c2873 = (C2873) interfaceC0636;
        long j3 = c2873.f9455;
        c2873.m9473();
        Map mapM9475 = c2873.m9475();
        c2873.m9472();
        C14368 c14368 = new C14368(j2, mapM9475);
        int i2 = c2873.f9456;
        long jMo13868 = this.f16734.mo13868(new C24503(iOException, i));
        boolean z = jMo13868 == -9223372036854775807L;
        this.f16739.m37366(c14368, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        if (z) {
            return C1382.f4931;
        }
        return C1382.m5076(jMo13868, false);
    }

    @Override // l.InterfaceC14805
    /* JADX INFO: renamed from: ۙ */
    public final void mo6406(InterfaceC0636 interfaceC0636, long j, long j2) {
        C15955 c15955;
        HashMap map;
        C2873 c2873 = (C2873) interfaceC0636;
        AbstractC23415 abstractC23415 = (AbstractC23415) c2873.m9474();
        boolean z = abstractC23415 instanceof C24907;
        if (z) {
            String str = abstractC23415.f75794;
            C15955 c15956 = C15955.f51795;
            Uri uri = Uri.parse(str);
            C20124 c20124 = new C20124();
            c20124.m46309("0");
            c20124.m46327("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new C17447(uri, c20124.m46295(), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            c15955 = new C15955("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            c15955 = (C15955) abstractC23415;
        }
        this.f16727 = c15955;
        this.f16735 = ((C17447) c15955.f51801.get(0)).f56744;
        this.f16738.add(new C8323(this));
        List list2 = c15955.f51800;
        int size = list2.size();
        int i = 0;
        while (true) {
            map = this.f16733;
            if (i >= size) {
                break;
            }
            Uri uri2 = (Uri) list2.get(i);
            map.put(uri2, new C13543(this, uri2));
            i++;
        }
        c2873.m9473();
        Map mapM9475 = c2873.m9475();
        c2873.m9472();
        C14368 c14368 = new C14368(j2, mapM9475);
        C13543 c13543 = (C13543) map.get(this.f16735);
        if (z) {
            c13543.m33250((C24907) abstractC23415, c14368);
        } else {
            c13543.m33258(false);
        }
        this.f16734.getClass();
        this.f16739.m37367(c14368, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // l.InterfaceC14805
    /* JADX INFO: renamed from: ۙ */
    public final void mo6407(InterfaceC0636 interfaceC0636, long j, long j2, int i) {
        C14368 c14368;
        C2873 c2873 = (C2873) interfaceC0636;
        if (i == 0) {
            long j3 = c2873.f9455;
            c14368 = new C14368(c2873.f9458);
        } else {
            long j4 = c2873.f9455;
            c2873.m9473();
            Map mapM9475 = c2873.m9475();
            c2873.m9472();
            c14368 = new C14368(j2, mapM9475);
        }
        this.f16739.m37365(c14368, c2873.f9456, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // l.InterfaceC14805
    /* JADX INFO: renamed from: ۙ */
    public final void mo6408(InterfaceC0636 interfaceC0636, long j, long j2, boolean z) {
        C2873 c2873 = (C2873) interfaceC0636;
        long j3 = c2873.f9455;
        c2873.m9473();
        Map mapM9475 = c2873.m9475();
        c2873.m9472();
        C14368 c14368 = new C14368(j2, mapM9475);
        this.f16734.getClass();
        this.f16739.m37364(c14368, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public C4769(InterfaceC5341 interfaceC5341, InterfaceC4365 interfaceC4365, InterfaceC6261 interfaceC6261) {
        this.f16736 = interfaceC5341;
        this.f16728 = interfaceC6261;
        this.f16734 = interfaceC4365;
    }

    @Override // l.InterfaceC0294
    public final void stop() {
        this.f16735 = null;
        this.f16730 = null;
        this.f16727 = null;
        this.f16726 = -9223372036854775807L;
        this.f16737.m5083((InterfaceC8094) null);
        this.f16737 = null;
        HashMap map = this.f16733;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C13543) it.next()).m33260();
        }
        this.f16732.removeCallbacksAndMessages(null);
        this.f16732 = null;
        map.clear();
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1872(InterfaceC4023 interfaceC4023) {
        this.f16738.add(interfaceC4023);
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1866(InterfaceC4023 interfaceC4023) {
        this.f16738.remove(interfaceC4023);
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ᩷ */
    public final C15955 mo1870() {
        return this.f16727;
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۙ */
    public final C24907 mo1863(Uri uri, boolean z) {
        HashMap map = this.f16733;
        C24907 c24907M33257 = ((C13543) map.get(uri)).m33257();
        if (c24907M33257 != null && z) {
            if (!uri.equals(this.f16735)) {
                List list = this.f16727.f51801;
                for (int i = 0; i < list.size(); i++) {
                    if (uri.equals(((C17447) list.get(i)).f56744)) {
                        C24907 c24907 = this.f16730;
                        if (c24907 != null && c24907.f80600) {
                            break;
                        }
                        this.f16735 = uri;
                        C13543 c13543 = (C13543) map.get(uri);
                        C24907 c24908 = c13543.f43012;
                        if (c24908 != null && c24908.f80600) {
                            this.f16730 = c24908;
                            this.f16729.mo14515(c24908);
                            break;
                        }
                        c13543.m33255(m14730(uri));
                        break;
                    }
                }
            }
            C13543 c13544 = (C13543) map.get(uri);
            C24907 c24907M33258 = c13544.m33257();
            if (!c13544.m33262()) {
                c13544.m33261(true);
                if (c24907M33258 != null && !c24907M33258.f80600) {
                    c13544.m33258(true);
                }
            }
        }
        return c24907M33257;
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۙ */
    public final long mo1862() {
        return this.f16726;
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo1874(Uri uri) {
        return ((C13543) this.f16733.get(uri)).m33259();
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1873() throws IOException {
        C1382 c1382 = this.f16737;
        if (c1382 != null) {
            c1382.m5081(Integer.MIN_VALUE);
        }
        Uri uri = this.f16735;
        if (uri != null) {
            mo1871(uri);
        }
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1871(Uri uri) throws IOException {
        ((C13543) this.f16733.get(uri)).m33263();
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۤ */
    public final void mo1868(Uri uri) {
        ((C13543) this.f16733.get(uri)).m33258(true);
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo1869() {
        return this.f16731;
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1867(Uri uri, long j) {
        C13543 c13543 = (C13543) this.f16733.get(uri);
        if (c13543 != null) {
            return !C13543.m33251(c13543, j);
        }
        return false;
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1864(Uri uri) {
        C13543 c13543 = (C13543) this.f16733.get(uri);
        if (c13543 != null) {
            c13543.m33261(false);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m14734(C4769 c4769) {
        List list = c4769.f16727.f51801;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C13543 c13543 = (C13543) c4769.f16733.get(((C17447) list.get(i)).f56744);
            c13543.getClass();
            if (jElapsedRealtime > c13543.f43019) {
                Uri uri = c13543.f43015;
                c4769.f16735 = uri;
                c13543.m33255(c4769.m14730(uri));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private Uri m14730(Uri uri) {
        C12972 c12972;
        C24907 c24907 = this.f16730;
        if (c24907 == null || !c24907.f80599.f36108 || (c12972 = (C12972) c24907.f80594.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c12972.f41589));
        int i = c12972.f41591;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14723(C4769 c4769, Uri uri, C24907 c24907) {
        if (uri.equals(c4769.f16735)) {
            if (c4769.f16730 == null) {
                c4769.f16731 = !c24907.f80600;
                c4769.f16726 = c24907.f80611;
            }
            c4769.f16730 = c24907;
            c4769.f16729.mo14515(c24907);
        }
        Iterator it = c4769.f16738.iterator();
        while (it.hasNext()) {
            ((InterfaceC4023) it.next()).mo12991();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14724(C4769 c4769, Uri uri, C24503 c24503, boolean z) {
        Iterator it = c4769.f16738.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !((InterfaceC4023) it.next()).mo12990(uri, c24503, z);
        }
        return z2;
    }

    @Override // l.InterfaceC0294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1865(Uri uri, C15617 c15617, InterfaceC18193 interfaceC18193) {
        this.f16732 = C7116.m19479((Handler.Callback) null);
        this.f16739 = c15617;
        this.f16729 = interfaceC18193;
        C11941 c11941 = new C11941();
        c11941.m29911(uri);
        c11941.m29909(1);
        C2873 c2873 = new C2873(this.f16736.mo6799(4), c11941.m29908(), this.f16728.mo7989());
        C20782.m47568(this.f16737 == null);
        C1382 c1382 = new C1382("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f16737 = c1382;
        c1382.m5082(c2873, this, this.f16734.mo13867(c2873.f9456));
    }
}
