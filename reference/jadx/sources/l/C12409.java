package l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12409 implements InterfaceC17347 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16642 f41442;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6265 f41443;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13551 f41444;

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ void mo6593() {
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo6594() {
        return false;
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۙ */
    public final Bitmap mo6591(long j, int i, int i2, InterfaceC0413 interfaceC0413) {
        interfaceC0413.mo2170();
        C13551 c13551 = this.f41444;
        int iM33137 = c13551.m33137(j);
        try {
            return C6058.m16457(m30861(iM33137).f53370, c13551.m33139(iM33137), i, i2);
        } catch (Throwable unused) {
            C16642 c16642 = this.f41442;
            this.f41442 = null;
            if (c16642 != null) {
                C16642.m39105(c16642);
            }
            return null;
        }
    }

    public C12409(C6265 c6265, C13551 c13551) {
        this.f41443 = c6265;
        this.f41444 = c13551;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12409 m30860(C6265 c6265) throws IOException {
        if (Build.VERSION.SDK_INT >= 23) {
            InterfaceC3153 interfaceC3153M17348 = c6265.m17348();
            if (interfaceC3153M17348 != null) {
                try {
                    C13551 c13551M44067 = C19195.m44067(interfaceC3153M17348);
                    if (c13551M44067 != null && c13551M44067.m33136() != 0) {
                        C12409 c12409 = new C12409(c6265, c13551M44067);
                        interfaceC3153M17348.close();
                        return c12409;
                    }
                    interfaceC3153M17348.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        interfaceC3153M17348.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (interfaceC3153M17348 != null) {
                interfaceC3153M17348.close();
            }
        }
        return null;
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۖ */
    public final C9587 mo6590() {
        try {
            C16642 c16642 = this.f41442;
            if (c16642 == null) {
                return null;
            }
            return C6058.m16458(c16642.f53370);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C16642 m30861(int i) throws IOException {
        C13551 c13551 = this.f41444;
        C16642 c16642 = this.f41442;
        if (c16642 != null && c16642.f53369 == i) {
            return c16642;
        }
        C16642 c16643 = this.f41442;
        C5250 c5250 = null;
        this.f41442 = null;
        if (c16643 != null) {
            C16642.m39105(c16643);
        }
        InterfaceC3153 interfaceC3153M17348 = this.f41443.m17348();
        if (interfaceC3153M17348 == null) {
            throw new IOException("Missing fragmented MP4 preview metadata handle");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            C5250 c5251 = new C5250(interfaceC3153M17348, c13551.m33141(), c13551.m33138(i), c13551.m33140(i));
            try {
                mediaMetadataRetriever.setDataSource(c5251);
                C16642 c16644 = new C16642(i, mediaMetadataRetriever, c5251);
                this.f41442 = c16644;
                return c16644;
            } catch (Throwable th) {
                th = th;
                c5250 = c5251;
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused) {
                }
                C19431.m44468(c5250);
                if (c5250 == null) {
                    C19431.m44468(interfaceC3153M17348);
                }
                if (th instanceof IOException) {
                    throw th;
                }
                throw new IOException("Failed to open fragmented MP4 preview chunk", th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۙ */
    public final void mo6592() {
        C16642 c16642 = this.f41442;
        this.f41442 = null;
        if (c16642 != null) {
            C16642.m39105(c16642);
        }
    }
}
