package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: R8UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C20979 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Drawable f68320;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f68321;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Bitmap f68322;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f68323;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f68324;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f68325;

    public C20979(C13689 c13689, CharSequence charSequence, CharSequence charSequence2, byte[] bArr) {
        boolean z;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = m47147(c13689.f45154);
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(charSequence2)) {
            charSequence2 = "unknown";
        } else {
            z = false;
        }
        this.f68325 = charSequence.toString();
        this.f68324 = charSequence2.toString();
        if (bArr != null) {
            this.f68320 = new C10396(C16737.m39279(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            z = false;
        } else {
            this.f68320 = C19568.m44667((((long) charSequence2.hashCode()) & 4294967295L) | (((long) charSequence.hashCode()) << 32));
        }
        this.f68323 = z;
        int i = Build.VERSION.SDK_INT;
        this.f68321 = m47146(this.f68320, 512, 512, 33 <= i && i <= 35);
        this.f68322 = m47146(this.f68320, 256, 256, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m47146(Drawable drawable, int i, int i2, boolean z) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        if (z) {
            canvas.drawColor(1073741824);
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7573 m47148(C13689 c13689, InterfaceC2557 interfaceC2557) throws IOException {
        AbstractC20745 abstractC20745Mo7989 = interfaceC2557.mo7989();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            ParcelFileDescriptor parcelFileDescriptorMo33981 = abstractC20745Mo7989.mo33981("r");
            try {
                if (parcelFileDescriptorMo33981 == null) {
                    throw new IOException("Music file descriptor is unavailable");
                }
                mediaMetadataRetriever.setDataSource(parcelFileDescriptorMo33981.getFileDescriptor());
                C20979 c20979 = new C20979(c13689, mediaMetadataRetriever);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                long jMax = 0;
                if (!TextUtils.isEmpty(strExtractMetadata)) {
                    try {
                        jMax = Math.max(Long.parseLong(strExtractMetadata), 0L);
                    } catch (NumberFormatException unused) {
                    }
                }
                parcelFileDescriptorMo33981.close();
                mediaMetadataRetriever.release();
                if (c20979.f68323) {
                    C1388 c1388M46710 = abstractC20745Mo7989.m46710("r");
                    try {
                        C7096 c7096M18967 = C7096.m18967(c1388M46710);
                        if (c7096M18967 != null) {
                            c20979 = new C20979(c13689, c7096M18967.m18969(), c7096M18967.m18970(), c7096M18967.m18971());
                        }
                        c1388M46710.close();
                    } catch (Throwable th) {
                        try {
                            c1388M46710.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return new C7573(c20979, jMax);
            } catch (Throwable th3) {
                if (parcelFileDescriptorMo33981 != null) {
                    try {
                        parcelFileDescriptorMo33981.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            mediaMetadataRetriever.release();
            throw th5;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20979(C13689 c13689, MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(7);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(3);
        this(c13689, strExtractMetadata, TextUtils.isEmpty(strExtractMetadata2) ? mediaMetadataRetriever.extractMetadata(2) : strExtractMetadata2, mediaMetadataRetriever.getEmbeddedPicture());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47147(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            iLastIndexOf = str.length();
        }
        return C13012.m32189(50, str.substring(0, iLastIndexOf));
    }
}
