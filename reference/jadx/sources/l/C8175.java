package l;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.Build;

/* JADX INFO: renamed from: l.۠۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P79M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8175 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21474(Context context, AbstractC20745 abstractC20745) {
        int i;
        int i2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        C1667 c1667 = null;
        try {
            if (abstractC20745.m46729()) {
                mediaMetadataRetriever.setDataSource(abstractC20745.mo24643());
            } else if (abstractC20745.mo40126()) {
                mediaMetadataRetriever.setDataSource(context, abstractC20745.mo40127());
            } else if (Build.VERSION.SDK_INT >= 23) {
                C1667 c1668 = new C1667(abstractC20745);
                try {
                    mediaMetadataRetriever.setDataSource(c1668);
                    c1667 = c1668;
                } catch (Throwable unused) {
                    c1667 = c1668;
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Throwable unused2) {
                    }
                    C19431.m44468(c1667);
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
            int iM51133 = C23137.m51133(iMax, iMax2, i3, 1.0f);
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused7) {
            }
            C19431.m44468(c1667);
            return iM51133;
        } catch (Throwable unused8) {
        }
    }
}
