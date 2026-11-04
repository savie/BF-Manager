package l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14131 implements InterfaceC5095 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7420 f44701;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6044 f44702;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2769 f44703;

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ void mo15405() {
    }

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ boolean mo15406() {
        return false;
    }

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ۙ */
    public final Bitmap mo15403(long j, int i, int i2, InterfaceC8911 interfaceC8911) {
        interfaceC8911.mo23824();
        C2769 c2769 = this.f44703;
        int iM9141 = c2769.m9141(j);
        try {
            return C22249.m50306(m34348(iM9141).f24432, c2769.m9143(iM9141), i, i2);
        } catch (Throwable unused) {
            C7420 c7420 = this.f44701;
            this.f44701 = null;
            if (c7420 != null) {
                C7420.m20334(c7420);
            }
            return null;
        }
    }

    public C14131(C6044 c6044, C2769 c2769) {
        this.f44702 = c6044;
        this.f44703 = c2769;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14131 m34349(C6044 c6044) throws IOException {
        if (Build.VERSION.SDK_INT >= 23) {
            InterfaceC1278 interfaceC1278M17552 = c6044.m17552();
            if (interfaceC1278M17552 != null) {
                try {
                    C2769 c2769M39973 = C16961.m39973(interfaceC1278M17552);
                    if (c2769M39973 != null && c2769M39973.m9140() != 0) {
                        C14131 c14131 = new C14131(c6044, c2769M39973);
                        interfaceC1278M17552.close();
                        return c14131;
                    }
                    interfaceC1278M17552.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        interfaceC1278M17552.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (interfaceC1278M17552 != null) {
                interfaceC1278M17552.close();
            }
        }
        return null;
    }

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ᩸ */
    public final C13298 mo15407() {
        try {
            C7420 c7420 = this.f44701;
            if (c7420 == null) {
                return null;
            }
            return C22249.m50307(c7420.f24432);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7420 m34348(int i) throws IOException {
        C2769 c2769 = this.f44703;
        C7420 c7420 = this.f44701;
        if (c7420 != null && c7420.f24431 == i) {
            return c7420;
        }
        C7420 c7421 = this.f44701;
        C9026 c9026 = null;
        this.f44701 = null;
        if (c7421 != null) {
            C7420.m20334(c7421);
        }
        InterfaceC1278 interfaceC1278M17552 = this.f44702.m17552();
        if (interfaceC1278M17552 == null) {
            throw new IOException("Missing fragmented MP4 preview metadata handle");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            C9026 c9027 = new C9026(interfaceC1278M17552, c2769.m9145(), c2769.m9142(i), c2769.m9144(i));
            try {
                mediaMetadataRetriever.setDataSource(c9027);
                C7420 c7422 = new C7420(i, mediaMetadataRetriever, c9027);
                this.f44701 = c7422;
                return c7422;
            } catch (Throwable th) {
                th = th;
                c9026 = c9027;
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused) {
                }
                C20244.m46520(c9026);
                if (c9026 == null) {
                    C20244.m46520(interfaceC1278M17552);
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

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ۙ */
    public final void mo15404() {
        C7420 c7420 = this.f44701;
        this.f44701 = null;
        if (c7420 != null) {
            C7420.m20334(c7420);
        }
    }
}
