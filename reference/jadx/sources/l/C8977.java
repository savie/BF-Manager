package l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.۠᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O6K0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8977 extends AbstractC13057 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 f29273;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 f29274;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC13057 f29275;

    public C8977(AbstractC13057 abstractC13057, AbstractC7629 abstractC7629, InterfaceC2386 interfaceC2386) {
        this.f29275 = abstractC13057;
        this.f29274 = abstractC7629;
        this.f29273 = interfaceC2386;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۫ */
    public final String mo17426() {
        return this.f29275.mo17426();
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۤ */
    public final String mo17425() {
        return this.f29275.mo17425();
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ᩹ */
    public final InputStream mo17428() {
        return this.f29275.mo17428();
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۗ */
    public final C15294 mo17423() {
        return this.f29275.mo17423();
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo23981() {
        return this.f29275.mo23981();
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo23982() {
        return this.f29275.mo23982();
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final File mo23983() {
        return this.f29275.mo23983();
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23980(OutputStream outputStream, boolean z, InterfaceC7509 interfaceC7509) throws IOException {
        this.f29275.mo23980(outputStream, z, interfaceC7509);
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
      0x01e2: PHI (r12v4 l.ۖ᩻֫) = (r12v3 l.ۖ᩻֫), (r12v6 l.ۖ᩻֫) binds: [B:132:0x01e0, B:110:0x01af] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r13v2 l.ۖۚ֫) = (r13v1 l.ۖۚ֫), (r13v14 l.ۖۚ֫) binds: [B:132:0x01e0, B:110:0x01af] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0110  */
    /* JADX WARN: Code duplicated, block: B:72:0x0153 A[Catch: all -> 0x017c, IOException | RuntimeException -> 0x017e, TryCatch #21 {IOException | RuntimeException -> 0x017e, all -> 0x017c, blocks: (B:64:0x010b, B:70:0x011a, B:72:0x0153, B:74:0x0157, B:76:0x0160, B:78:0x016b), top: B:184:0x010b }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8299 m23979(C2442 c2442, long j, C6346 c6346) throws Throwable {
        C2442 c2443;
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap bitmapCreateBitmap;
        C9153 c9153M8242;
        C3011 c3011;
        C9153 c9153M8243;
        boolean z;
        C3011 c3011M9817;
        int i;
        Bitmap bitmapCreateScaledBitmap;
        AbstractC13057.m32543(c6346);
        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
        try {
            try {
                AbstractC7629 abstractC7629 = this.f29274;
                boolean z2 = abstractC7629 instanceof C11969;
                int i2 = 0;
                InterfaceC2386 interfaceC2386 = this.f29273;
                if (z2) {
                    AbstractC22044 abstractC22044Mo8093 = interfaceC2386.mo8093();
                    if (Build.VERSION.SDK_INT >= 23) {
                        c3011M9817 = C3011.m9818(mediaMetadataRetriever2, abstractC22044Mo8093, c6346);
                    } else {
                        if (abstractC22044Mo8093.m49870()) {
                            mediaMetadataRetriever2.setDataSource(abstractC22044Mo8093.mo4278());
                        } else if (abstractC22044Mo8093.mo42886()) {
                            mediaMetadataRetriever2.setDataSource(C21576.m49084(), abstractC22044Mo8093.mo42888());
                        } else {
                            c3011M9817 = null;
                            z = false;
                        }
                        c3011M9817 = null;
                    }
                    z = true;
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (abstractC7629 instanceof AbstractC18881)) {
                        AbstractC18881 abstractC18881 = (AbstractC18881) abstractC7629;
                        if (abstractC18881.mo35568() && interfaceC2386.getSize() > 0) {
                            c3011M9817 = C3011.m9817(mediaMetadataRetriever2, abstractC18881, interfaceC2386, c6346);
                            z = true;
                        }
                    }
                    z = false;
                    c3011M9817 = null;
                }
                c3011 = c3011M9817;
                try {
                    if (z) {
                        try {
                            try {
                                AbstractC13057.m32543(c6346);
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
                                    c2443 = c2442;
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
                                                c2443 = c2442;
                                                try {
                                                    c9153M8242 = c2443.m8242(j3);
                                                    if (c9153M8242 != null) {
                                                        if (i3 >= 27) {
                                                            try {
                                                                bitmapCreateBitmap = mediaMetadataRetriever2.getScaledFrameAtTime(-1L, 2, iMax, iMax2);
                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                try {
                                                                    AbstractC13057.m32543(c6346);
                                                                    if (bitmapCreateBitmap != null) {
                                                                        if (i3 < 27 && dMin < 1.0d) {
                                                                            double dMin2 = Math.min(1.0d, Math.sqrt(j2 / ((((double) bitmapCreateBitmap.getWidth()) * 8.0d) * ((double) bitmapCreateBitmap.getHeight()))));
                                                                            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, Math.max(1, (int) (((double) bitmapCreateBitmap.getWidth()) * dMin2)), Math.max(1, (int) (((double) bitmapCreateBitmap.getHeight()) * dMin2)), true);
                                                                            if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                                                                                bitmapCreateBitmap.recycle();
                                                                            }
                                                                            bitmapCreateBitmap = bitmapCreateScaledBitmap;
                                                                        }
                                                                        if (bitmapCreateBitmap.getAllocationByteCount() <= j && c9153M8242.m24288(bitmapCreateBitmap.getAllocationByteCount())) {
                                                                            C8299 c8299 = new C8299(bitmapCreateBitmap, c9153M8242, 1);
                                                                            try {
                                                                                mediaMetadataRetriever.release();
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                            if (c3011 != null) {
                                                                                try {
                                                                                    C3188.m10407(c3011);
                                                                                } catch (Exception unused4) {
                                                                                }
                                                                            }
                                                                            return c8299;
                                                                        }
                                                                    }
                                                                } catch (IOException | RuntimeException unused5) {
                                                                    if (bitmapCreateBitmap != null) {
                                                                        bitmapCreateBitmap.recycle();
                                                                    }
                                                                    if (c9153M8242 != null) {
                                                                        c9153M8242.close();
                                                                    }
                                                                    try {
                                                                        mediaMetadataRetriever.release();
                                                                    } catch (Exception unused6) {
                                                                    }
                                                                    if (c3011 != null) {
                                                                        try {
                                                                            C3188.m10407(c3011);
                                                                        } catch (Exception unused7) {
                                                                        }
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    if (bitmapCreateBitmap != null) {
                                                                        bitmapCreateBitmap.recycle();
                                                                    }
                                                                    if (c9153M8242 != null) {
                                                                        c9153M8242.close();
                                                                    }
                                                                    try {
                                                                        mediaMetadataRetriever.release();
                                                                    } catch (Exception unused8) {
                                                                    }
                                                                    if (c3011 != null) {
                                                                        throw th;
                                                                    }
                                                                    try {
                                                                        C3188.m10407(c3011);
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
                                                                if (c9153M8242 != null) {
                                                                    c9153M8242.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c3011 != null) {
                                                                    C3188.m10407(c3011);
                                                                }
                                                                AbstractC13057.m32543(c6346);
                                                                c9153M8243 = c2443.m8242(57600L);
                                                                if (c9153M8243 == null) {
                                                                    throw new C18740("No room for video placeholder");
                                                                }
                                                                try {
                                                                    bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                                    bitmapCreateBitmap.eraseColor(-12303292);
                                                                    return new C8299(bitmapCreateBitmap, c9153M8243, 1);
                                                                } catch (OutOfMemoryError | RuntimeException e) {
                                                                    if (bitmapCreateBitmap != null) {
                                                                        bitmapCreateBitmap.recycle();
                                                                    }
                                                                    c9153M8243.close();
                                                                    throw e;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c9153M8242 != null) {
                                                                    c9153M8242.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c3011 != null) {
                                                                    throw th;
                                                                }
                                                                C3188.m10407(c3011);
                                                                throw th;
                                                            }
                                                        } else {
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            try {
                                                                bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(-1L);
                                                                AbstractC13057.m32543(c6346);
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
                                                                        C8299 c82910 = new C8299(bitmapCreateBitmap, c9153M8242, 1);
                                                                        mediaMetadataRetriever.release();
                                                                        if (c3011 != null) {
                                                                            C3188.m10407(c3011);
                                                                        }
                                                                        return c82910;
                                                                    }
                                                                }
                                                            } catch (IOException | RuntimeException unused11) {
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c9153M8242 != null) {
                                                                    c9153M8242.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c3011 != null) {
                                                                    C3188.m10407(c3011);
                                                                }
                                                                AbstractC13057.m32543(c6346);
                                                                c9153M8243 = c2443.m8242(57600L);
                                                                if (c9153M8243 == null) {
                                                                    throw new C18740("No room for video placeholder");
                                                                }
                                                                bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                                bitmapCreateBitmap.eraseColor(-12303292);
                                                                return new C8299(bitmapCreateBitmap, c9153M8243, 1);
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c9153M8242 != null) {
                                                                    c9153M8242.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c3011 != null) {
                                                                    throw th;
                                                                }
                                                                C3188.m10407(c3011);
                                                                throw th;
                                                            }
                                                        }
                                                        AbstractC13057.m32543(c6346);
                                                        c9153M8243 = c2443.m8242(57600L);
                                                        if (c9153M8243 == null) {
                                                            throw new C18740("No room for video placeholder");
                                                        }
                                                        bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                        bitmapCreateBitmap.eraseColor(-12303292);
                                                        return new C8299(bitmapCreateBitmap, c9153M8243, 1);
                                                    }
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    bitmapCreateBitmap = null;
                                                } catch (IOException | RuntimeException unused12) {
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    bitmapCreateBitmap = null;
                                                    c9153M8242 = null;
                                                    if (bitmapCreateBitmap != null) {
                                                        bitmapCreateBitmap.recycle();
                                                    }
                                                    if (c9153M8242 != null) {
                                                        c9153M8242.close();
                                                    }
                                                    mediaMetadataRetriever.release();
                                                    if (c3011 != null) {
                                                        C3188.m10407(c3011);
                                                    }
                                                    AbstractC13057.m32543(c6346);
                                                    c9153M8243 = c2443.m8242(57600L);
                                                    if (c9153M8243 == null) {
                                                        throw new C18740("No room for video placeholder");
                                                    }
                                                    bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                    bitmapCreateBitmap.eraseColor(-12303292);
                                                    return new C8299(bitmapCreateBitmap, c9153M8243, 1);
                                                }
                                            } else {
                                                c2443 = c2442;
                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                            }
                                        } catch (IOException | RuntimeException unused13) {
                                            c2443 = c2442;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                        bitmapCreateBitmap = null;
                                        c9153M8242 = null;
                                        if (bitmapCreateBitmap != null) {
                                            bitmapCreateBitmap.recycle();
                                        }
                                        if (c9153M8242 != null) {
                                            c9153M8242.close();
                                        }
                                        mediaMetadataRetriever.release();
                                        if (c3011 != null) {
                                            throw th;
                                        }
                                        C3188.m10407(c3011);
                                        throw th;
                                    }
                                }
                                bitmapCreateBitmap = null;
                                c9153M8242 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                mediaMetadataRetriever = mediaMetadataRetriever2;
                            }
                        } catch (IOException | RuntimeException unused14) {
                            c2443 = c2442;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                        }
                    } else {
                        c2443 = c2442;
                        mediaMetadataRetriever = mediaMetadataRetriever2;
                        bitmapCreateBitmap = null;
                        c9153M8242 = null;
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception unused15) {
                }
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.recycle();
                }
                if (c9153M8242 != null) {
                    c9153M8242.close();
                }
                if (c3011 != null) {
                    C3188.m10407(c3011);
                }
            } catch (Throwable th6) {
                th = th6;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                bitmapCreateBitmap = null;
                c9153M8242 = null;
                c3011 = null;
            }
        } catch (IOException | RuntimeException unused16) {
            c2443 = c2442;
            mediaMetadataRetriever = mediaMetadataRetriever2;
            bitmapCreateBitmap = null;
            c9153M8242 = null;
            c3011 = null;
        }
        AbstractC13057.m32543(c6346);
        c9153M8243 = c2443.m8242(57600L);
        if (c9153M8243 == null) {
            throw new C18740("No room for video placeholder");
        }
        bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(-12303292);
        return new C8299(bitmapCreateBitmap, c9153M8243, 1);
    }
}
