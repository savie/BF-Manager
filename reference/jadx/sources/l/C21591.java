package l;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.Build;

/* JADX INFO: renamed from: l.᩶᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P79M */
/* JADX INFO: loaded from: classes.dex */
public final class C21591 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m49121(Context context, AbstractC22044 abstractC22044) {
        int i;
        int i2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        C0596 c0596 = null;
        try {
            if (abstractC22044.m49870()) {
                mediaMetadataRetriever.setDataSource(abstractC22044.mo4278());
            } else if (abstractC22044.mo42886()) {
                mediaMetadataRetriever.setDataSource(context, abstractC22044.mo42888());
            } else if (Build.VERSION.SDK_INT >= 23) {
                C0596 c0597 = new C0596(abstractC22044);
                try {
                    mediaMetadataRetriever.setDataSource(c0597);
                    c0596 = c0597;
                } catch (Throwable unused) {
                    c0596 = c0597;
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Throwable unused2) {
                    }
                    C20244.m46520(c0596);
                    return -1;
                }
            } else {
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused3) {
                }
                return -1;
            }
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
            int i3 = 0;
            if (strExtractMetadata == null || strExtractMetadata.isEmpty()) {
                i = 0;
            } else {
                try {
                    i = Integer.parseInt(strExtractMetadata);
                } catch (NumberFormatException unused4) {
                    i = 0;
                }
            }
            int iMax = Math.max(i, 0);
            if (strExtractMetadata2 == null || strExtractMetadata2.isEmpty()) {
                i2 = 0;
            } else {
                try {
                    i2 = Integer.parseInt(strExtractMetadata2);
                } catch (NumberFormatException unused5) {
                    i2 = 0;
                }
            }
            int iMax2 = Math.max(i2, 0);
            if (strExtractMetadata3 != null && !strExtractMetadata3.isEmpty()) {
                try {
                    i3 = Integer.parseInt(strExtractMetadata3);
                } catch (NumberFormatException unused6) {
                }
            }
            int iM31230 = C12552.m31230(iMax, iMax2, i3, 1.0f);
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused7) {
            }
            C20244.m46520(c0596);
            return iM31230;
        } catch (Throwable unused8) {
        }
    }
}
