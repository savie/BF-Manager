package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes.dex */
public final class C22249 implements InterfaceC5095 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Closeable f71658;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final MediaMetadataRetriever f71659;

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
        return m50306(this.f71659, j, i, i2);
    }

    public C22249(MediaMetadataRetriever mediaMetadataRetriever, Closeable closeable) {
        this.f71659 = mediaMetadataRetriever;
        this.f71658 = closeable;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5095 m50304(Context context, C6044 c6044) {
        IOException th;
        MediaDataSource c0596;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C14131 c14131M34349 = C14131.m34349(c6044);
                if (c14131M34349 != null) {
                    return c14131M34349;
                }
            } catch (IOException unused) {
            }
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Closeable closeable = null;
        closeable = null;
        try {
            if (c6044.m17551()) {
                AbstractC22044 abstractC22044M17543 = c6044.m17543();
                if (abstractC22044M17543 == null) {
                    throw new IOException("Missing local preview file");
                }
                if (abstractC22044M17543.m49870()) {
                    mediaMetadataRetriever.setDataSource(abstractC22044M17543.mo4278());
                } else if (abstractC22044M17543.mo42886()) {
                    mediaMetadataRetriever.setDataSource(context, abstractC22044M17543.mo42888());
                } else if (Build.VERSION.SDK_INT >= 23) {
                    c0596 = new C0596(abstractC22044M17543);
                    try {
                        mediaMetadataRetriever.setDataSource(c0596);
                        closeable = c0596;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused2) {
                        }
                        C20244.m46520(c0596);
                        if (th instanceof IOException) {
                            throw th;
                        }
                        throw new IOException("Failed to open video preview data source", th);
                    }
                } else {
                    throw new IOException("Unsupported video preview data source");
                }
                return new C22249(mediaMetadataRetriever, closeable);
            }
            if (c6044.m17548() && Build.VERSION.SDK_INT >= 23) {
                C20960 c20960M17546 = c6044.m17546();
                if (c20960M17546 == null) {
                    throw new IOException("Missing network preview descriptor");
                }
                C17976 c17976M47918 = c20960M17546.m47918();
                c17976M47918.m41955(mediaMetadataRetriever);
                closeable = c17976M47918;
            } else if (c6044.m17547() && Build.VERSION.SDK_INT >= 23) {
                InterfaceC1278 interfaceC1278M17552 = c6044.m17552();
                if (interfaceC1278M17552 == null) {
                    throw new IOException("Missing paged preview handle");
                }
                C10797 c10797 = new C10797(interfaceC1278M17552);
                try {
                    mediaMetadataRetriever.setDataSource(c10797);
                    c10797.m27504();
                    closeable = c10797;
                } catch (Throwable th3) {
                    th = th3;
                    c0596 = c10797;
                    mediaMetadataRetriever.release();
                    C20244.m46520(c0596);
                    if (th instanceof IOException) {
                        throw th;
                    }
                    throw new IOException("Failed to open video preview data source", th);
                }
            } else {
                throw new IOException("Unsupported video preview data source");
            }
            return new C22249(mediaMetadataRetriever, closeable);
        } catch (Throwable th4) {
            th = th4;
            c0596 = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Bitmap m50306(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2) {
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

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ᩸ */
    public final C13298 mo15407() {
        return m50307(this.f71659);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13298 m50307(MediaMetadataRetriever mediaMetadataRetriever) {
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
        return C2112.m7291(iMax, iMax2, i3, 1.0f);
    }

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ۙ */
    public final void mo15404() {
        try {
            this.f71659.release();
        } catch (Throwable unused) {
        }
        C20244.m46520(this.f71658);
    }
}
