package l;

import android.net.Uri;
import android.os.SystemClock;
import com.alipay.sdk.m.c0.c;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7MX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13543 implements InterfaceC14805 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f43010;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C1382 f43011 = new C1382("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C24907 f43012;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4769 f43013;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f43014;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Uri f43015;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public IOException f43016;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f43017;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f43018;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f43019;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f43020;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f43021;

    @Override // l.InterfaceC14805
    /* JADX INFO: renamed from: ۙ */
    public final C21519 mo6404(InterfaceC0636 interfaceC0636, long j, long j2, IOException iOException, int i) {
        C21519 c21519M5076;
        C2873 c2873 = (C2873) interfaceC0636;
        long j3 = c2873.f9455;
        int i2 = c2873.f9456;
        c2873.m9473();
        Map mapM9475 = c2873.m9475();
        c2873.m9472();
        C14368 c14368 = new C14368(j2, mapM9475);
        boolean z = c2873.m9473().getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof C3277;
        C21519 c21519 = C1382.f4932;
        C4769 c4769 = this.f43013;
        if (z || z2) {
            int i3 = iOException instanceof C8213 ? ((C8213) iOException).f27043 : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.f43021 = SystemClock.elapsedRealtime();
                m33258(false);
                C15617 c15617 = c4769.f16739;
                String str = C7116.f23455;
                c15617.m37366(c14368, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                return c21519;
            }
        }
        C24503 c24503 = new C24503(iOException, i);
        if (C4769.m14724(c4769, this.f43015, c24503, false)) {
            long jMo13868 = c4769.f16734.mo13868(c24503);
            if (jMo13868 != -9223372036854775807L) {
                c21519M5076 = C1382.m5076(jMo13868, false);
            } else {
                c21519M5076 = C1382.f4931;
            }
            c21519 = c21519M5076;
        }
        boolean zM48926 = c21519.m48926();
        c4769.f16739.m37366(c14368, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !zM48926);
        if (!zM48926) {
            c4769.f16734.getClass();
        }
        return c21519;
    }

    @Override // l.InterfaceC14805
    /* JADX INFO: renamed from: ۙ */
    public final void mo6406(InterfaceC0636 interfaceC0636, long j, long j2) {
        C2873 c2873 = (C2873) interfaceC0636;
        AbstractC23415 abstractC23415 = (AbstractC23415) c2873.m9474();
        c2873.m9473();
        Map mapM9475 = c2873.m9475();
        c2873.m9472();
        C14368 c14368 = new C14368(j2, mapM9475);
        boolean z = abstractC23415 instanceof C24907;
        C4769 c4769 = this.f43013;
        if (z) {
            m33250((C24907) abstractC23415, c14368);
            c4769.f16739.m37367(c14368, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            this.f43016 = C2970.m9686("Loaded playlist has unexpected type.");
            c4769.f16739.m37366(c14368, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, this.f43016, true);
        }
        c4769.f16734.getClass();
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
        this.f43013.f16739.m37365(c14368, c2873.f9456, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
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
        C4769 c4769 = this.f43013;
        c4769.f16734.getClass();
        c4769.f16739.m37364(c14368, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public C13543(C4769 c4769, Uri uri) {
        this.f43013 = c4769;
        this.f43015 = uri;
        this.f43017 = c4769.f16736.mo6799(4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24907 m33257() {
        return this.f43012;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m33259() {
        int i;
        if (this.f43012 == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, C7116.m19506(this.f43012.f80606));
        C24907 c24907 = this.f43012;
        return c24907.f80600 || (i = c24907.f80605) == 2 || i == 1 || this.f43014 + jMax > jElapsedRealtime;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33258(boolean z) {
        m33255(z ? m33253() : this.f43015);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m33263() throws IOException {
        this.f43011.m5081(Integer.MIN_VALUE);
        IOException iOException = this.f43016;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m33262() {
        return this.f43018;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33261(boolean z) {
        this.f43018 = z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m33260() {
        this.f43011.m5083((InterfaceC8094) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m33255(final Uri uri) {
        this.f43019 = 0L;
        if (this.f43020) {
            return;
        }
        C1382 c1382 = this.f43011;
        if (c1382.m5086() || c1382.m5084()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime < this.f43021) {
            this.f43020 = true;
            this.f43013.f16732.postDelayed(new Runnable() { // from class: l.ۜۖۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C13543.m33248(this.f22700, uri);
                }
            }, this.f43021 - jElapsedRealtime);
        } else {
            m33247(uri);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33248(C13543 c13543, Uri uri) {
        c13543.f43020 = false;
        c13543.m33247(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33247(Uri uri) {
        C4769 c4769 = this.f43013;
        InterfaceC9584 interfaceC9584Mo7990 = c4769.f16728.mo7990(c4769.f16727, this.f43012);
        C11941 c11941 = new C11941();
        c11941.m29911(uri);
        c11941.m29909(1);
        C2873 c2873 = new C2873(this.f43017, c11941.m29908(), interfaceC9584Mo7990);
        this.f43011.m5082(c2873, this, c4769.f16734.mo13867(c2873.f9456));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m33250(C24907 c24907, C14368 c14368) {
        boolean z;
        C24907 c24908 = this.f43012;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f43014 = jElapsedRealtime;
        C4769 c4769 = this.f43013;
        C24907 c24907M14722 = C4769.m14722(c4769, c24908, c24907);
        this.f43012 = c24907M14722;
        IOException c21177 = null;
        Uri uri = this.f43015;
        if (c24907M14722 != c24908) {
            this.f43016 = null;
            this.f43010 = jElapsedRealtime;
            C4769.m14723(c4769, uri, c24907M14722);
        } else if (!c24907M14722.f80600) {
            long size = c24907.f80612 + ((long) c24907.f80607.size());
            C24907 c24909 = this.f43012;
            if (size < c24909.f80612) {
                c21177 = new C14463();
                z = true;
            } else {
                double d = jElapsedRealtime - this.f43010;
                double dM19506 = C7116.m19506(c24909.f80595) * 3.5d;
                z = false;
                if (d > dM19506) {
                    c21177 = new C21177();
                }
            }
            if (c21177 != null) {
                this.f43016 = c21177;
                C4769.m14724(c4769, uri, new C24503(c21177, 1), z);
            }
        }
        C24907 c249010 = this.f43012;
        C11480 c11480 = c249010.f80599;
        long j = c249010.f80595;
        if (c11480.f36108) {
            if (c249010 == c24908) {
                long j2 = c249010.f80604;
                if (j2 != -9223372036854775807L) {
                    j = j2 / 2;
                } else {
                    j /= 2;
                }
            } else {
                j = 0;
            }
        } else if (c249010 == c24908) {
            j /= 2;
        }
        this.f43021 = (C7116.m19506(j) + jElapsedRealtime) - c14368.f45300;
        if (this.f43012.f80600) {
            return;
        }
        if (uri.equals(c4769.f16735) || this.f43018) {
            m33255(m33253());
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private Uri m33253() {
        C24907 c24907 = this.f43012;
        Uri uri = this.f43015;
        if (c24907 != null) {
            C11480 c11480 = c24907.f80599;
            if (c11480.f36110 != -9223372036854775807L || c11480.f36108) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                C24907 c24908 = this.f43012;
                if (c24908.f80599.f36108) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c24908.f80612 + ((long) c24908.f80607.size())));
                    C24907 c24909 = this.f43012;
                    if (c24909.f80604 != -9223372036854775807L) {
                        AbstractC1928 abstractC1928 = c24909.f80601;
                        int size = abstractC1928.size();
                        if (!abstractC1928.isEmpty() && ((C15209) C16625.m39339(abstractC1928)).f49639) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                C11480 c11481 = this.f43012.f80599;
                if (c11481.f36110 != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", c11481.f36111 ? c.d : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33251(C13543 c13543, long j) {
        c13543.f43019 = SystemClock.elapsedRealtime() + j;
        Uri uri = c13543.f43015;
        C4769 c4769 = c13543.f43013;
        return uri.equals(c4769.f16735) && !C4769.m14734(c4769);
    }
}
