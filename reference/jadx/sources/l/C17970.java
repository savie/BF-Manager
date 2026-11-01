package l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ᩳۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O6K0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17970 extends AbstractC1886 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 f57479;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 f57480;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC1886 f57481;

    public C17970(AbstractC1886 abstractC1886, AbstractC9677 abstractC9677, InterfaceC2557 interfaceC2557) {
        this.f57481 = abstractC1886;
        this.f57480 = abstractC9677;
        this.f57479 = interfaceC2557;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ֨ */
    public final String mo5281() {
        return this.f57481.mo5281();
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۖ */
    public final String mo5282() {
        return this.f57481.mo5282();
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo5285() {
        return this.f57481.mo5285();
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۠ */
    public final C14588 mo5283() {
        return this.f57481.mo5283();
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6138() {
        return this.f57481.mo6138();
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo6141() {
        return this.f57481.mo6141();
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۨ */
    public final File mo5284() {
        return this.f57481.mo5284();
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۙ */
    public final void mo6136(OutputStream outputStream, boolean z, InterfaceC5614 interfaceC5614) throws IOException {
        this.f57481.mo6136(outputStream, z, interfaceC5614);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019c  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01be  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:147:0x0216  */
    /* JADX WARN: Code duplicated, block: B:157:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x01e2 A[EXC_TOP_SPLITTER, PHI: r5 r12 r13
      0x01e2: PHI (r5v4 android.graphics.Bitmap) = (r5v3 android.graphics.Bitmap), (r5v39 android.graphics.Bitmap) binds: [B:132:0x01e0, B:110:0x01af] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r12v4 l.᩸ۢ۬) = (r12v3 l.᩸ۢ۬), (r12v6 l.᩸ۢ۬) binds: [B:132:0x01e0, B:110:0x01af] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r13v2 l.֡᩻۬) = (r13v1 l.֡᩻۬), (r13v14 l.֡᩻۬) binds: [B:132:0x01e0, B:110:0x01af] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0110  */
    /* JADX WARN: Code duplicated, block: B:72:0x0153 A[Catch: all -> 0x017c, IOException | RuntimeException -> 0x017e, TryCatch #21 {IOException | RuntimeException -> 0x017e, all -> 0x017c, blocks: (B:64:0x010b, B:70:0x011a, B:72:0x0153, B:74:0x0157, B:76:0x0160, B:78:0x016b), top: B:184:0x010b }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20232 m41799(C0745 c0745, long j, C3630 c3630) throws Throwable {
        C0745 c0746;
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap bitmapCreateBitmap;
        C20502 c20502M3239;
        C21498 c21498;
        C20502 c20502M32310;
        boolean z;
        C21498 c21498M48134;
        int i;
        Bitmap bitmapCreateScaledBitmap;
        AbstractC1886.m6135(c3630);
        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
        try {
            try {
                AbstractC9677 abstractC9677 = this.f57480;
                boolean z2 = abstractC9677 instanceof C21611;
                int i2 = 0;
                InterfaceC2557 interfaceC2557 = this.f57479;
                if (z2) {
                    AbstractC20745 abstractC20745Mo7989 = interfaceC2557.mo7989();
                    if (Build.VERSION.SDK_INT >= 23) {
                        c21498M48134 = C21498.m48135(mediaMetadataRetriever2, abstractC20745Mo7989, c3630);
                    } else {
                        if (abstractC20745Mo7989.m46729()) {
                            mediaMetadataRetriever2.setDataSource(abstractC20745Mo7989.mo24643());
                        } else if (abstractC20745Mo7989.mo40126()) {
                            mediaMetadataRetriever2.setDataSource(C16737.m39277(), abstractC20745Mo7989.mo40127());
                        } else {
                            c21498M48134 = null;
                            z = false;
                        }
                        c21498M48134 = null;
                    }
                    z = true;
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (abstractC9677 instanceof AbstractC12233)) {
                        AbstractC12233 abstractC12233 = (AbstractC12233) abstractC9677;
                        if (abstractC12233.mo19632() && interfaceC2557.getSize() > 0) {
                            c21498M48134 = C21498.m48134(mediaMetadataRetriever2, abstractC12233, interfaceC2557, c3630);
                            z = true;
                        }
                    }
                    z = false;
                    c21498M48134 = null;
                }
                c21498 = c21498M48134;
                try {
                    if (z) {
                        try {
                            try {
                                AbstractC1886.m6135(c3630);
                                try {
                                    i = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(18));
                                } catch (NumberFormatException unused) {
                                    i = 0;
                                }
                                try {
                                    i2 = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(19));
                                } catch (NumberFormatException unused2) {
                                }
                                if (i <= 0 || i2 <= 0) {
                                    c0746 = c0745;
                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                } else {
                                    double d = i;
                                    double d2 = i2;
                                    try {
                                        try {
                                            double dMin = Math.min(1.0d, Math.min(1280.0d / ((double) Math.max(i, i2)), Math.sqrt(Math.min(j, 4194304L) / ((d * 8.0d) * d2))));
                                            int iMax = Math.max(1, (int) (d * dMin));
                                            int iMax2 = Math.max(1, (int) (d2 * dMin));
                                            long j2 = ((long) iMax) * 8 * ((long) iMax2);
                                            int i3 = Build.VERSION.SDK_INT;
                                            long j3 = i3 >= 27 ? j2 : (((long) i) * 8 * ((long) i2)) + j2;
                                            if (j3 <= j) {
                                                c0746 = c0745;
                                                try {
                                                    c20502M3239 = c0746.m3239(j3);
                                                    if (c20502M3239 != null) {
                                                        if (i3 >= 27) {
                                                            try {
                                                                bitmapCreateBitmap = mediaMetadataRetriever2.getScaledFrameAtTime(-1L, 2, iMax, iMax2);
                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                try {
                                                                    AbstractC1886.m6135(c3630);
                                                                    if (bitmapCreateBitmap != null) {
                                                                        if (i3 < 27 && dMin < 1.0d) {
                                                                            double dMin2 = Math.min(1.0d, Math.sqrt(j2 / ((((double) bitmapCreateBitmap.getWidth()) * 8.0d) * ((double) bitmapCreateBitmap.getHeight()))));
                                                                            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, Math.max(1, (int) (((double) bitmapCreateBitmap.getWidth()) * dMin2)), Math.max(1, (int) (((double) bitmapCreateBitmap.getHeight()) * dMin2)), true);
                                                                            if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                                                                                bitmapCreateBitmap.recycle();
                                                                            }
                                                                            bitmapCreateBitmap = bitmapCreateScaledBitmap;
                                                                        }
                                                                        if (bitmapCreateBitmap.getAllocationByteCount() <= j && c20502M3239.m46302(bitmapCreateBitmap.getAllocationByteCount())) {
                                                                            C20232 c20232 = new C20232(bitmapCreateBitmap, c20502M3239, 1);
                                                                            try {
                                                                                mediaMetadataRetriever.release();
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                            if (c21498 != null) {
                                                                                try {
                                                                                    C22979.m50821((Object) c21498);
                                                                                } catch (Exception unused4) {
                                                                                }
                                                                            }
                                                                            return c20232;
                                                                        }
                                                                    }
                                                                } catch (IOException | RuntimeException unused5) {
                                                                    if (bitmapCreateBitmap != null) {
                                                                        bitmapCreateBitmap.recycle();
                                                                    }
                                                                    if (c20502M3239 != null) {
                                                                        c20502M3239.close();
                                                                    }
                                                                    try {
                                                                        mediaMetadataRetriever.release();
                                                                    } catch (Exception unused6) {
                                                                    }
                                                                    if (c21498 != null) {
                                                                        try {
                                                                            C22979.m50821((Object) c21498);
                                                                        } catch (Exception unused7) {
                                                                        }
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    if (bitmapCreateBitmap != null) {
                                                                        bitmapCreateBitmap.recycle();
                                                                    }
                                                                    if (c20502M3239 != null) {
                                                                        c20502M3239.close();
                                                                    }
                                                                    try {
                                                                        mediaMetadataRetriever.release();
                                                                    } catch (Exception unused8) {
                                                                    }
                                                                    if (c21498 != null) {
                                                                        throw th;
                                                                    }
                                                                    try {
                                                                        C22979.m50821((Object) c21498);
                                                                        throw th;
                                                                    } catch (Exception unused9) {
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (IOException | RuntimeException unused10) {
                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c20502M3239 != null) {
                                                                    c20502M3239.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c21498 != null) {
                                                                    C22979.m50821((Object) c21498);
                                                                }
                                                                AbstractC1886.m6135(c3630);
                                                                c20502M32310 = c0746.m3239(57600L);
                                                                if (c20502M32310 == null) {
                                                                    throw new C10354("No room for video placeholder");
                                                                }
                                                                try {
                                                                    bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                                    bitmapCreateBitmap.eraseColor(-12303292);
                                                                    return new C20232(bitmapCreateBitmap, c20502M32310, 1);
                                                                } catch (OutOfMemoryError | RuntimeException e) {
                                                                    if (bitmapCreateBitmap != null) {
                                                                        bitmapCreateBitmap.recycle();
                                                                    }
                                                                    c20502M32310.close();
                                                                    throw e;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c20502M3239 != null) {
                                                                    c20502M3239.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c21498 != null) {
                                                                    throw th;
                                                                }
                                                                C22979.m50821((Object) c21498);
                                                                throw th;
                                                            }
                                                        } else {
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            try {
                                                                bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(-1L);
                                                                AbstractC1886.m6135(c3630);
                                                                if (bitmapCreateBitmap != null) {
                                                                    if (i3 < 27) {
                                                                        double dMin3 = Math.min(1.0d, Math.sqrt(j2 / ((((double) bitmapCreateBitmap.getWidth()) * 8.0d) * ((double) bitmapCreateBitmap.getHeight()))));
                                                                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, Math.max(1, (int) (((double) bitmapCreateBitmap.getWidth()) * dMin3)), Math.max(1, (int) (((double) bitmapCreateBitmap.getHeight()) * dMin3)), true);
                                                                        if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                                                                            bitmapCreateBitmap.recycle();
                                                                        }
                                                                        bitmapCreateBitmap = bitmapCreateScaledBitmap;
                                                                    }
                                                                    if (bitmapCreateBitmap.getAllocationByteCount() <= j) {
                                                                        C20232 c20233 = new C20232(bitmapCreateBitmap, c20502M3239, 1);
                                                                        mediaMetadataRetriever.release();
                                                                        if (c21498 != null) {
                                                                            C22979.m50821((Object) c21498);
                                                                        }
                                                                        return c20233;
                                                                    }
                                                                }
                                                            } catch (IOException | RuntimeException unused11) {
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c20502M3239 != null) {
                                                                    c20502M3239.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c21498 != null) {
                                                                    C22979.m50821((Object) c21498);
                                                                }
                                                                AbstractC1886.m6135(c3630);
                                                                c20502M32310 = c0746.m3239(57600L);
                                                                if (c20502M32310 == null) {
                                                                    throw new C10354("No room for video placeholder");
                                                                }
                                                                bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                                bitmapCreateBitmap.eraseColor(-12303292);
                                                                return new C20232(bitmapCreateBitmap, c20502M32310, 1);
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c20502M3239 != null) {
                                                                    c20502M3239.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c21498 != null) {
                                                                    throw th;
                                                                }
                                                                C22979.m50821((Object) c21498);
                                                                throw th;
                                                            }
                                                        }
                                                        AbstractC1886.m6135(c3630);
                                                        c20502M32310 = c0746.m3239(57600L);
                                                        if (c20502M32310 == null) {
                                                            throw new C10354("No room for video placeholder");
                                                        }
                                                        bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                        bitmapCreateBitmap.eraseColor(-12303292);
                                                        return new C20232(bitmapCreateBitmap, c20502M32310, 1);
                                                    }
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    bitmapCreateBitmap = null;
                                                } catch (IOException | RuntimeException unused12) {
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    bitmapCreateBitmap = null;
                                                    c20502M3239 = null;
                                                    if (bitmapCreateBitmap != null) {
                                                        bitmapCreateBitmap.recycle();
                                                    }
                                                    if (c20502M3239 != null) {
                                                        c20502M3239.close();
                                                    }
                                                    mediaMetadataRetriever.release();
                                                    if (c21498 != null) {
                                                        C22979.m50821((Object) c21498);
                                                    }
                                                    AbstractC1886.m6135(c3630);
                                                    c20502M32310 = c0746.m3239(57600L);
                                                    if (c20502M32310 == null) {
                                                        throw new C10354("No room for video placeholder");
                                                    }
                                                    bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                    bitmapCreateBitmap.eraseColor(-12303292);
                                                    return new C20232(bitmapCreateBitmap, c20502M32310, 1);
                                                }
                                            } else {
                                                c0746 = c0745;
                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                            }
                                        } catch (IOException | RuntimeException unused13) {
                                            c0746 = c0745;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                        bitmapCreateBitmap = null;
                                        c20502M3239 = null;
                                        if (bitmapCreateBitmap != null) {
                                            bitmapCreateBitmap.recycle();
                                        }
                                        if (c20502M3239 != null) {
                                            c20502M3239.close();
                                        }
                                        mediaMetadataRetriever.release();
                                        if (c21498 != null) {
                                            throw th;
                                        }
                                        C22979.m50821((Object) c21498);
                                        throw th;
                                    }
                                }
                                bitmapCreateBitmap = null;
                                c20502M3239 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                mediaMetadataRetriever = mediaMetadataRetriever2;
                            }
                        } catch (IOException | RuntimeException unused14) {
                            c0746 = c0745;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                        }
                    } else {
                        c0746 = c0745;
                        mediaMetadataRetriever = mediaMetadataRetriever2;
                        bitmapCreateBitmap = null;
                        c20502M3239 = null;
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception unused15) {
                }
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.recycle();
                }
                if (c20502M3239 != null) {
                    c20502M3239.close();
                }
                if (c21498 != null) {
                    C22979.m50821((Object) c21498);
                }
            } catch (Throwable th6) {
                th = th6;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                bitmapCreateBitmap = null;
                c20502M3239 = null;
                c21498 = null;
            }
        } catch (IOException | RuntimeException unused16) {
            c0746 = c0745;
            mediaMetadataRetriever = mediaMetadataRetriever2;
            bitmapCreateBitmap = null;
            c20502M3239 = null;
            c21498 = null;
        }
        AbstractC1886.m6135(c3630);
        c20502M32310 = c0746.m3239(57600L);
        if (c20502M32310 == null) {
            throw new C10354("No room for video placeholder");
        }
        bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(-12303292);
        return new C20232(bitmapCreateBitmap, c20502M32310, 1);
    }
}
