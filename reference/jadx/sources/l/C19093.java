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

/* JADX INFO: renamed from: l.ᩳ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19093 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f61808;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f61809;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f61810;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Bitmap f61811;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f61812;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Drawable f61813;

    public C19093(C14902 c14902, CharSequence charSequence, CharSequence charSequence2, byte[] bArr) {
        boolean z;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = m44205(c14902.f48685);
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(charSequence2)) {
            charSequence2 = "unknown";
        } else {
            z = false;
        }
        this.f61810 = charSequence.toString();
        this.f61812 = charSequence2.toString();
        if (bArr != null) {
            this.f61813 = new C0448(C21576.m49055(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            z = false;
        } else {
            this.f61813 = C21331.m48556((((long) charSequence2.hashCode()) & 4294967295L) | (((long) charSequence.hashCode()) << 32));
        }
        this.f61809 = z;
        int i = Build.VERSION.SDK_INT;
        this.f61808 = m44204(512, 512, this.f61813, 33 <= i && i <= 35);
        this.f61811 = m44204(256, 256, this.f61813, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m44204(int i, int i2, Drawable drawable, boolean z) {
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
    public static C7906 m44206(C14902 c14902, InterfaceC2386 interfaceC2386) throws IOException {
        AbstractC22044 abstractC22044Mo8093 = interfaceC2386.mo8093();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            ParcelFileDescriptor parcelFileDescriptorMo4279 = abstractC22044Mo8093.mo4279("r");
            try {
                if (parcelFileDescriptorMo4279 == null) {
                    throw new IOException("Music file descriptor is unavailable");
                }
                mediaMetadataRetriever.setDataSource(parcelFileDescriptorMo4279.getFileDescriptor());
                C19093 c19093 = new C19093(c14902, mediaMetadataRetriever);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                long jMax = 0;
                if (!TextUtils.isEmpty(strExtractMetadata)) {
                    try {
                        jMax = Math.max(Long.parseLong(strExtractMetadata), 0L);
                    } catch (NumberFormatException unused) {
                    }
                }
                parcelFileDescriptorMo4279.close();
                mediaMetadataRetriever.release();
                if (c19093.f61809) {
                    C13961 c13961M49855 = abstractC22044Mo8093.m49855("r");
                    try {
                        C20342 c20342M46733 = C20342.m46733(c13961M49855);
                        if (c20342M46733 != null) {
                            c19093 = new C19093(c14902, c20342M46733.m46735(), c20342M46733.m46734(), c20342M46733.m46736());
                        }
                        c13961M49855.close();
                    } catch (Throwable th) {
                        try {
                            c13961M49855.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return new C7906(c19093, jMax);
            } catch (Throwable th3) {
                if (parcelFileDescriptorMo4279 != null) {
                    try {
                        parcelFileDescriptorMo4279.close();
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
    public C19093(C14902 c14902, MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(7);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(3);
        this(c14902, strExtractMetadata, TextUtils.isEmpty(strExtractMetadata2) ? mediaMetadataRetriever.extractMetadata(2) : strExtractMetadata2, mediaMetadataRetriever.getEmbeddedPicture());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44205(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            iLastIndexOf = str.length();
        }
        return C18969.m44060(50, str.substring(0, iLastIndexOf));
    }
}
