package l;

import android.net.Uri;
import android.os.SystemClock;
import com.alipay.sdk.m.c0.c;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7MX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17735 implements InterfaceC2822 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f56273;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Uri f56274;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f56275;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18441 f56276;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23285 f56277 = new C23285("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f56278;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C16325 f56279;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f56280;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f56281;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f56282;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f56283;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public IOException f56284;

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final C5645 mo7683(InterfaceC1411 interfaceC1411, long j, long j2, IOException iOException, int i) {
        C5645 c5645M51360;
        C21873 c21873 = (C21873) interfaceC1411;
        long j3 = c21873.f70969;
        int i2 = c21873.f70971;
        c21873.m48655();
        Map mapM48652 = c21873.m48652();
        c21873.m48654();
        C13863 c13863 = new C13863(j2, mapM48652);
        boolean z = c21873.m48655().getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof C23381;
        C5645 c5645 = C23285.f75523;
        C18441 c18441 = this.f56276;
        if (z || z2) {
            int i3 = iOException instanceof C1360 ? ((C1360) iOException).f5709 : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.f56283 = SystemClock.elapsedRealtime();
                m41292(false);
                C7512 c7512 = c18441.f58794;
                String str = C17983.f57504;
                c7512.m20017(c13863, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                return c5645;
            }
        }
        C4939 c4939 = new C4939(iOException, i);
        if (C18441.m42787(c18441, this.f56274, c4939, false)) {
            long jMo5495 = c18441.f58786.mo5495(c4939);
            if (jMo5495 != -9223372036854775807L) {
                c5645M51360 = C23285.m51360(jMo5495, false);
            } else {
                c5645M51360 = C23285.f75524;
            }
            c5645 = c5645M51360;
        }
        boolean zM15534 = c5645.m15534();
        c18441.f58794.m20017(c13863, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !zM15534);
        if (!zM15534) {
            c18441.f58786.getClass();
        }
        return c5645;
    }

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final void mo7686(InterfaceC1411 interfaceC1411, long j, long j2) {
        C21873 c21873 = (C21873) interfaceC1411;
        AbstractC10681 abstractC10681 = (AbstractC10681) c21873.m48653();
        c21873.m48655();
        Map mapM48652 = c21873.m48652();
        c21873.m48654();
        C13863 c13863 = new C13863(j2, mapM48652);
        boolean z = abstractC10681 instanceof C16325;
        C18441 c18441 = this.f56276;
        if (z) {
            m41281((C16325) abstractC10681, c13863);
            c18441.f58794.m20019(c13863, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            this.f56284 = C22861.m50608("Loaded playlist has unexpected type.");
            c18441.f58794.m20017(c13863, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, this.f56284, true);
        }
        c18441.f58786.getClass();
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
        this.f56276.f58794.m20016(c13863, c21873.f70971, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
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
        C18441 c18441 = this.f56276;
        c18441.f58786.getClass();
        c18441.f58794.m20015(c13863, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public C17735(C18441 c18441, Uri uri) {
        this.f56276 = c18441;
        this.f56274 = uri;
        this.f56275 = c18441.f58791.mo12441(4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16325 m41291() {
        return this.f56279;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m41294() {
        int i;
        if (this.f56279 == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, C17983.m41856(this.f56279.f52575));
        C16325 c16325 = this.f56279;
        return c16325.f52572 || (i = c16325.f52589) == 2 || i == 1 || this.f56278 + jMax > jElapsedRealtime;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41292(boolean z) {
        m41287(z ? m41289() : this.f56274);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m41290() throws IOException {
        this.f56277.m51367(Integer.MIN_VALUE);
        IOException iOException = this.f56284;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m41296() {
        return this.f56280;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41295(boolean z) {
        this.f56280 = z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m41293() {
        this.f56277.m51369((InterfaceC13407) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m41287(final Uri uri) {
        this.f56273 = 0L;
        if (this.f56282) {
            return;
        }
        C23285 c23285 = this.f56277;
        if (c23285.m51365() || c23285.m51370()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime < this.f56283) {
            this.f56282 = true;
            this.f56276.f58783.postDelayed(new Runnable() { // from class: l.᩸֫ۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C17735.m41282(this.f69235, uri);
                }
            }, this.f56283 - jElapsedRealtime);
        } else {
            m41280(uri);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41282(C17735 c17735, Uri uri) {
        c17735.f56282 = false;
        c17735.m41280(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41280(Uri uri) {
        C18441 c18441 = this.f56276;
        InterfaceC15524 interfaceC15524Mo20756 = c18441.f58790.mo20756(c18441.f58788, this.f56279);
        C16490 c16490 = new C16490();
        c16490.m38756(uri);
        c16490.m38754(1);
        C21873 c21873 = new C21873(this.f56275, c16490.m38753(), interfaceC15524Mo20756);
        this.f56277.m51368(c21873, this, c18441.f58786.mo5494(c21873.f70971));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m41281(C16325 c16325, C13863 c13863) {
        boolean z;
        C16325 c16326 = this.f56279;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f56278 = jElapsedRealtime;
        C18441 c18441 = this.f56276;
        C16325 c16325M42785 = C18441.m42785(c18441, c16326, c16325);
        this.f56279 = c16325M42785;
        IOException c11614 = null;
        Uri uri = this.f56274;
        if (c16325M42785 != c16326) {
            this.f56284 = null;
            this.f56281 = jElapsedRealtime;
            C18441.m42786(c18441, uri, c16325M42785);
        } else if (!c16325M42785.f52572) {
            long size = c16325.f52591 + ((long) c16325.f52586.size());
            C16325 c16327 = this.f56279;
            if (size < c16327.f52591) {
                c11614 = new C13731();
                z = true;
            } else {
                double d = jElapsedRealtime - this.f56281;
                double dM41856 = C17983.m41856(c16327.f52588) * 3.5d;
                z = false;
                if (d > dM41856) {
                    c11614 = new C11614();
                }
            }
            if (c11614 != null) {
                this.f56284 = c11614;
                C18441.m42787(c18441, uri, new C4939(c11614, 1), z);
            }
        }
        C16325 c16328 = this.f56279;
        C0096 c0096 = c16328.f52579;
        long j = c16328.f52588;
        if (c0096.f1024) {
            if (c16328 == c16326) {
                long j2 = c16328.f52582;
                if (j2 != -9223372036854775807L) {
                    j = j2 / 2;
                } else {
                    j /= 2;
                }
            } else {
                j = 0;
            }
        } else if (c16328 == c16326) {
            j /= 2;
        }
        this.f56283 = (C17983.m41856(j) + jElapsedRealtime) - c13863.f45704;
        if (this.f56279.f52572) {
            return;
        }
        if (uri.equals(c18441.f58784) || this.f56280) {
            m41287(m41289());
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private Uri m41289() {
        C16325 c16325 = this.f56279;
        Uri uri = this.f56274;
        if (c16325 != null) {
            C0096 c0096 = c16325.f52579;
            if (c0096.f1025 != -9223372036854775807L || c0096.f1024) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                C16325 c16326 = this.f56279;
                if (c16326.f52579.f1024) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c16326.f52591 + ((long) c16326.f52586.size())));
                    C16325 c16327 = this.f56279;
                    if (c16327.f52582 != -9223372036854775807L) {
                        AbstractC22433 abstractC22433 = c16327.f52583;
                        int size = abstractC22433.size();
                        if (!abstractC22433.isEmpty() && ((C7152) C22808.m50475(abstractC22433)).f23909) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                C0096 c0097 = this.f56279.f52579;
                if (c0097.f1025 != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", c0097.f1027 ? c.d : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41284(C17735 c17735, long j) {
        c17735.f56273 = SystemClock.elapsedRealtime() + j;
        Uri uri = c17735.f56274;
        C18441 c18441 = c17735.f56276;
        return uri.equals(c18441.f58784) && !C18441.m42795(c18441);
    }
}
