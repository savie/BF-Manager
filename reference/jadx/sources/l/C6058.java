package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6058 implements InterfaceC17347 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Closeable f20561;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final MediaMetadataRetriever f20562;

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
        return m16457(this.f20562, j, i, i2);
    }

    public C6058(MediaMetadataRetriever mediaMetadataRetriever, Closeable closeable) {
        this.f20562 = mediaMetadataRetriever;
        this.f20561 = closeable;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17347 m16456(Context context, C6265 c6265) {
        IOException th;
        MediaDataSource c1667;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C12409 c12409M30860 = C12409.m30860(c6265);
                if (c12409M30860 != null) {
                    return c12409M30860;
                }
            } catch (IOException unused) {
            }
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Closeable closeable = null;
        closeable = null;
        try {
            if (c6265.m17339()) {
                AbstractC20745 abstractC20745M17341 = c6265.m17341();
                if (abstractC20745M17341 == null) {
                    throw new IOException("Missing local preview file");
                }
                if (abstractC20745M17341.m46729()) {
                    mediaMetadataRetriever.setDataSource(abstractC20745M17341.mo24643());
                } else if (abstractC20745M17341.mo40126()) {
                    mediaMetadataRetriever.setDataSource(context, abstractC20745M17341.mo40127());
                } else if (Build.VERSION.SDK_INT >= 23) {
                    c1667 = new C1667(abstractC20745M17341);
                    try {
                        mediaMetadataRetriever.setDataSource(c1667);
                        closeable = c1667;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused2) {
                        }
                        C19431.m44468(c1667);
                        if (th instanceof IOException) {
                            throw th;
                        }
                        throw new IOException("Failed to open video preview data source", th);
                    }
                } else {
                    throw new IOException("Unsupported video preview data source");
                }
                return new C6058(mediaMetadataRetriever, closeable);
            }
            if (c6265.m17347() && Build.VERSION.SDK_INT >= 23) {
                C2031 c2031M17343 = c6265.m17343();
                if (c2031M17343 == null) {
                    throw new IOException("Missing network preview descriptor");
                }
                C9794 c9794M6523 = c2031M17343.m6523();
                c9794M6523.m24902(mediaMetadataRetriever);
                closeable = c9794M6523;
            } else if (c6265.m17338() && Build.VERSION.SDK_INT >= 23) {
                InterfaceC3153 interfaceC3153M17348 = c6265.m17348();
                if (interfaceC3153M17348 == null) {
                    throw new IOException("Missing paged preview handle");
                }
                C23347 c23347 = new C23347(interfaceC3153M17348);
                try {
                    mediaMetadataRetriever.setDataSource(c23347);
                    c23347.m51469();
                    closeable = c23347;
                } catch (Throwable th3) {
                    th = th3;
                    c1667 = c23347;
                    mediaMetadataRetriever.release();
                    C19431.m44468(c1667);
                    if (th instanceof IOException) {
                        throw th;
                    }
                    throw new IOException("Failed to open video preview data source", th);
                }
            } else {
                throw new IOException("Unsupported video preview data source");
            }
            return new C6058(mediaMetadataRetriever, closeable);
        } catch (Throwable th4) {
            th = th4;
            c1667 = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Bitmap m16457(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 27) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j, 2, Math.max(1, i), Math.max(1, i2));
        }
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 2);
        if (frameAtTime == null) {
            return null;
        }
        int iMax = Math.max(1, i);
        int iMax2 = Math.max(1, i2);
        if (frameAtTime.getWidth() <= iMax && frameAtTime.getHeight() <= iMax2) {
            return frameAtTime;
        }
        float fMin = Math.min(iMax / frameAtTime.getWidth(), iMax2 / frameAtTime.getHeight());
        return Bitmap.createScaledBitmap(frameAtTime, Math.max(1, Math.round(frameAtTime.getWidth() * fMin)), Math.max(1, Math.round(frameAtTime.getHeight() * fMin)), true);
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۖ */
    public final C9587 mo6590() {
        return m16458(this.f20562);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9587 m16458(MediaMetadataRetriever mediaMetadataRetriever) {
        int i;
        int i2;
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        int i3 = 0;
        if (strExtractMetadata == null || strExtractMetadata.isEmpty()) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(strExtractMetadata);
            } catch (NumberFormatException unused) {
                i = 0;
            }
        }
        int iMax = Math.max(0, i);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
        if (strExtractMetadata2 == null || strExtractMetadata2.isEmpty()) {
            i2 = 0;
        } else {
            try {
                i2 = Integer.parseInt(strExtractMetadata2);
            } catch (NumberFormatException unused2) {
                i2 = 0;
            }
        }
        int iMax2 = Math.max(0, i2);
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
        if (strExtractMetadata3 != null && !strExtractMetadata3.isEmpty()) {
            try {
                i3 = Integer.parseInt(strExtractMetadata3);
            } catch (NumberFormatException unused3) {
            }
        }
        return C4791.m13303(iMax, iMax2, i3, 1.0f);
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۙ */
    public final void mo6592() {
        try {
            this.f20562.release();
        } catch (Throwable unused) {
        }
        C19431.m44468(this.f20561);
    }
}
