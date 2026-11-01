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

/* JADX INFO: renamed from: l.ᩴ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7MX */
/* JADX INFO: loaded from: classes5.dex */
public final class C18441 implements InterfaceC5263, InterfaceC2822 {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final C11445 f58781 = new C11445();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23285 f58782;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Handler f58783;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Uri f58784;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2440 f58785;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14113 f58786;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C16325 f58787;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5741 f58788;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f58789;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9270 f58790;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15992 f58791;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7512 f58794;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f58793 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashMap f58795 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f58792 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16325 m42785(C18441 c18441, C16325 c16325, C16325 c16326) {
        long j;
        long j2;
        int i;
        int size;
        int size2;
        int size3;
        boolean z = c16326.f52572;
        long j3 = c16326.f52591;
        boolean z2 = true;
        if (c16325 != null) {
            long j4 = c16325.f52591;
            if (j3 <= j4 && (j3 < j4 || ((size = c16326.f52586.size() - c16325.f52586.size()) == 0 ? !((size2 = c16326.f52583.size()) > (size3 = c16325.f52583.size()) || (size2 == size3 && z && !c16325.f52572)) : size <= 0))) {
                z2 = false;
            }
        }
        AbstractC22433 abstractC22433 = c16326.f52586;
        if (!z2) {
            return (!z || c16325.f52572) ? c16325 : new C16325(c16325.f52589, c16325.f36441, c16325.f36442, c16325.f52580, c16325.f52584, c16325.f52577, c16325.f52590, c16325.f52573, c16325.f52591, c16325.f52587, c16325.f52588, c16325.f52582, c16325.f36443, true, c16325.f52574, c16325.f52585, c16325.f52586, c16325.f52583, c16325.f52579, c16325.f52578, c16325.f52576);
        }
        if (c16326.f52574) {
            j2 = c16326.f52577;
        } else {
            C16325 c16327 = c18441.f58787;
            long j5 = c16327 != null ? c16327.f52577 : 0L;
            if (c16325 != null) {
                long j6 = c16325.f52577;
                long j7 = c16325.f52591;
                AbstractC22433 abstractC22434 = c16325.f52586;
                int size4 = abstractC22434.size();
                int i2 = (int) (j3 - j7);
                C15620 c15620 = i2 < abstractC22434.size() ? (C15620) abstractC22434.get(i2) : null;
                if (c15620 != null) {
                    j = c15620.f63678;
                } else if (size4 == j3 - j7) {
                    j = c16325.f52575;
                }
                j2 = j6 + j;
            }
            j2 = j5;
        }
        if (c16326.f52590) {
            i = c16326.f52573;
        } else {
            C16325 c16328 = c18441.f58787;
            i = c16328 != null ? c16328.f52573 : 0;
            if (c16325 != null) {
                int i3 = (int) (j3 - c16325.f52591);
                AbstractC22433 abstractC22435 = c16325.f52586;
                C15620 c15621 = i3 < abstractC22435.size() ? (C15620) abstractC22435.get(i3) : null;
                if (c15621 != null) {
                    i = (c16325.f52573 + c15621.f63683) - ((C15620) abstractC22433.get(0)).f63683;
                }
            }
        }
        return new C16325(c16326.f52589, c16326.f36441, c16326.f36442, c16326.f52580, c16326.f52584, j2, true, i, c16326.f52591, c16326.f52587, c16326.f52588, c16326.f52582, c16326.f36443, c16326.f52572, c16326.f52574, c16326.f52585, abstractC22433, c16326.f52583, c16326.f52579, c16326.f52578, c16326.f52576);
    }

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final C5645 mo7683(InterfaceC1411 interfaceC1411, long j, long j2, IOException iOException, int i) {
        C21873 c21873 = (C21873) interfaceC1411;
        long j3 = c21873.f70969;
        c21873.m48655();
        Map mapM48652 = c21873.m48652();
        c21873.m48654();
        C13863 c13863 = new C13863(j2, mapM48652);
        int i2 = c21873.f70971;
        long jMo5495 = this.f58786.mo5495(new C4939(iOException, i));
        boolean z = jMo5495 == -9223372036854775807L;
        this.f58794.m20017(c13863, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        if (z) {
            return C23285.f75524;
        }
        return C23285.m51360(jMo5495, false);
    }

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final void mo7686(InterfaceC1411 interfaceC1411, long j, long j2) {
        C5741 c5741;
        HashMap map;
        C21873 c21873 = (C21873) interfaceC1411;
        AbstractC10681 abstractC10681 = (AbstractC10681) c21873.m48653();
        boolean z = abstractC10681 instanceof C16325;
        if (z) {
            String str = abstractC10681.f36441;
            C5741 c5742 = C5741.f19525;
            Uri uri = Uri.parse(str);
            C10471 c10471 = new C10471();
            c10471.m26516("0");
            c10471.m26521("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new C17030(uri, c10471.m26497(), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            c5741 = new C5741("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            c5741 = (C5741) abstractC10681;
        }
        this.f58788 = c5741;
        this.f58784 = ((C17030) c5741.f19532.get(0)).f54408;
        this.f58793.add(new C14914(this));
        List list2 = c5741.f19534;
        int size = list2.size();
        int i = 0;
        while (true) {
            map = this.f58795;
            if (i >= size) {
                break;
            }
            Uri uri2 = (Uri) list2.get(i);
            map.put(uri2, new C17735(this, uri2));
            i++;
        }
        c21873.m48655();
        Map mapM48652 = c21873.m48652();
        c21873.m48654();
        C13863 c13863 = new C13863(j2, mapM48652);
        C17735 c17735 = (C17735) map.get(this.f58784);
        if (z) {
            c17735.m41281((C16325) abstractC10681, c13863);
        } else {
            c17735.m41292(false);
        }
        this.f58786.getClass();
        this.f58794.m20019(c13863, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final void mo7687(InterfaceC1411 interfaceC1411, long j, long j2, int i) {
        C13863 c13863;
        C21873 c21873 = (C21873) interfaceC1411;
        if (i == 0) {
            long j3 = c21873.f70969;
            c13863 = new C13863(c21873.f70970);
        } else {
            long j4 = c21873.f70969;
            c21873.m48655();
            Map mapM48652 = c21873.m48652();
            c21873.m48654();
            c13863 = new C13863(j2, mapM48652);
        }
        this.f58794.m20016(c13863, c21873.f70971, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final void mo7688(InterfaceC1411 interfaceC1411, long j, long j2, boolean z) {
        C21873 c21873 = (C21873) interfaceC1411;
        long j3 = c21873.f70969;
        c21873.m48655();
        Map mapM48652 = c21873.m48652();
        c21873.m48654();
        C13863 c13863 = new C13863(j2, mapM48652);
        this.f58786.getClass();
        this.f58794.m20015(c13863, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public C18441(InterfaceC15992 interfaceC15992, InterfaceC14113 interfaceC14113, InterfaceC9270 interfaceC9270) {
        this.f58791 = interfaceC15992;
        this.f58790 = interfaceC9270;
        this.f58786 = interfaceC14113;
    }

    @Override // l.InterfaceC5263
    public final void stop() {
        this.f58784 = null;
        this.f58787 = null;
        this.f58788 = null;
        this.f58792 = -9223372036854775807L;
        this.f58782.m51369((InterfaceC13407) null);
        this.f58782 = null;
        HashMap map = this.f58795;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C17735) it.next()).m41293();
        }
        this.f58783.removeCallbacksAndMessages(null);
        this.f58783 = null;
        map.clear();
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ܰ */
    public final void mo14545(InterfaceC4557 interfaceC4557) {
        this.f58793.add(interfaceC4557);
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۙ */
    public final void mo14539(InterfaceC4557 interfaceC4557) {
        this.f58793.remove(interfaceC4557);
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ܰ */
    public final C5741 mo14543() {
        return this.f58788;
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۙ */
    public final C16325 mo14536(Uri uri, boolean z) {
        HashMap map = this.f58795;
        C16325 c16325M41291 = ((C17735) map.get(uri)).m41291();
        if (c16325M41291 != null && z) {
            if (!uri.equals(this.f58784)) {
                List list = this.f58788.f19532;
                for (int i = 0; i < list.size(); i++) {
                    if (uri.equals(((C17030) list.get(i)).f54408)) {
                        C16325 c16325 = this.f58787;
                        if (c16325 != null && c16325.f52572) {
                            break;
                        }
                        this.f58784 = uri;
                        C17735 c17735 = (C17735) map.get(uri);
                        C16325 c16326 = c17735.f56279;
                        if (c16326 != null && c16326.f52572) {
                            this.f58787 = c16326;
                            this.f58785.mo7423(c16326);
                            break;
                        }
                        c17735.m41287(m42788(uri));
                        break;
                    }
                }
            }
            C17735 c17736 = (C17735) map.get(uri);
            C16325 c16325M41292 = c17736.m41291();
            if (!c17736.m41296()) {
                c17736.m41295(true);
                if (c16325M41292 != null && !c16325M41292.f52572) {
                    c17736.m41292(true);
                }
            }
        }
        return c16325M41291;
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۙ */
    public final long mo14535() {
        return this.f58792;
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo14534(Uri uri) {
        return ((C17735) this.f58795.get(uri)).m41294();
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۖ */
    public final void mo14533() throws IOException {
        C23285 c23285 = this.f58782;
        if (c23285 != null) {
            c23285.m51367(Integer.MIN_VALUE);
        }
        Uri uri = this.f58784;
        if (uri != null) {
            mo14544(uri);
        }
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ܰ */
    public final void mo14544(Uri uri) throws IOException {
        ((C17735) this.f58795.get(uri)).m41290();
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۨ */
    public final void mo14541(Uri uri) {
        ((C17735) this.f58795.get(uri)).m41292(true);
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo14542() {
        return this.f58789;
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14540(Uri uri, long j) {
        C17735 c17735 = (C17735) this.f58795.get(uri);
        if (c17735 != null) {
            return !C17735.m41284(c17735, j);
        }
        return false;
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۙ */
    public final void mo14537(Uri uri) {
        C17735 c17735 = (C17735) this.f58795.get(uri);
        if (c17735 != null) {
            c17735.m41295(false);
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m42795(C18441 c18441) {
        List list = c18441.f58788.f19532;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C17735 c17735 = (C17735) c18441.f58795.get(((C17030) list.get(i)).f54408);
            c17735.getClass();
            if (jElapsedRealtime > c17735.f56273) {
                Uri uri = c17735.f56274;
                c18441.f58784 = uri;
                c17735.m41287(c18441.m42788(uri));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private Uri m42788(Uri uri) {
        C20558 c20558;
        C16325 c16325 = this.f58787;
        if (c16325 == null || !c16325.f52579.f1024 || (c20558 = (C20558) c16325.f52578.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c20558.f66587));
        int i = c20558.f66589;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42786(C18441 c18441, Uri uri, C16325 c16325) {
        if (uri.equals(c18441.f58784)) {
            if (c18441.f58787 == null) {
                c18441.f58789 = !c16325.f52572;
                c18441.f58792 = c16325.f52577;
            }
            c18441.f58787 = c16325;
            c18441.f58785.mo7423(c16325);
        }
        Iterator it = c18441.f58793.iterator();
        while (it.hasNext()) {
            ((InterfaceC4557) it.next()).mo12697();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42787(C18441 c18441, Uri uri, C4939 c4939, boolean z) {
        Iterator it = c18441.f58793.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !((InterfaceC4557) it.next()).mo12698(uri, c4939, z);
        }
        return z2;
    }

    @Override // l.InterfaceC5263
    /* JADX INFO: renamed from: ۙ */
    public final void mo14538(Uri uri, C7512 c7512, InterfaceC2440 interfaceC2440) {
        this.f58783 = C17983.m41832((Handler.Callback) null);
        this.f58794 = c7512;
        this.f58785 = interfaceC2440;
        C16490 c16490 = new C16490();
        c16490.m38756(uri);
        c16490.m38754(1);
        C21873 c21873 = new C21873(this.f58791.mo12441(4), c16490.m38753(), this.f58790.mo20755());
        C2023.m6510(this.f58782 == null);
        C23285 c23285 = new C23285("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f58782 = c23285;
        c23285.m51368(c21873, this, this.f58786.mo5494(c21873.f70971));
    }
}
