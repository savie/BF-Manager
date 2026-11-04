package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.bouncycastle.asn1.ASN1RelativeOID;

/* JADX INFO: renamed from: l.ܽܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I6M7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17685 implements InterfaceC7663 {

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f58117 = Executors.newSingleThreadExecutor(new ThreadFactoryC25145());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f58118;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Bitmap f58119;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final int f58120;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f58121;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final int f58122;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int f58123;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public long f58124;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f58125;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Canvas f58126;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Bitmap f58127;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Paint f58128;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f58129;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C24708 f58130;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f58131;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f58132;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f58133;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f58134;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C9153 f58135;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f58136;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public long f58137;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final Paint f58138;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Paint f58139 = new Paint(2);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f58140;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public Runnable f58141;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final RectF f58142;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f58143;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C0951 f58144;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC2024 f58145;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final long f58146;

    /* JADX WARN: Type inference failed for: r2v2, types: [l.֫ܺ֫] */
    public C17685(C0951 c0951, C24708 c24708, C9153 c9153, byte[] bArr, Bitmap bitmap, int i, long j) {
        Paint paint = new Paint(2);
        this.f58138 = paint;
        Paint paint2 = new Paint();
        this.f58128 = paint2;
        this.f58142 = new RectF();
        this.f58132 = new Handler(Looper.getMainLooper());
        this.f58145 = new Runnable() { // from class: l.֫ܺ֫
            @Override // java.lang.Runnable
            public final void run() {
                C17685.m41390(this.f6738);
            }
        };
        this.f58146 = j;
        this.f58144 = c0951;
        this.f58130 = c24708;
        this.f58135 = c9153;
        this.f58143 = bArr;
        this.f58119 = bitmap;
        this.f58120 = i;
        this.f58122 = c24708.f79983;
        this.f58123 = c24708.f79980;
        this.f58126 = new Canvas(bitmap);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint2.setColor(c24708.f79974);
        this.f58137 = Math.max(20, ((C11281) c24708.f79982.get(0)).f35589);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v28, types: [l.֨ۚ֫] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.֨ۚ֫] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17685 m41380(AbstractC13057 abstractC13057, C15294 c15294, C2442 c2442, long j, C4108 c4108) throws Throwable {
        ?? r13;
        Bitmap bitmapCreateBitmap;
        C17685 c17685;
        ?? r1;
        Bitmap bitmap;
        ?? M24288;
        C9153 c9153M8242 = c2442.m8242(65536L);
        if (c9153M8242 == null) {
            throw new C18740("WebP scan exceeds budget");
        }
        try {
            C0951 c0951 = new C0951(abstractC13057);
            try {
                C24708 c24708M41381 = m41381(c0951, j, c9153M8242, c4108);
                ArrayList arrayList = c24708M41381.f79982;
                long size = (c24708M41381.f79973 * 4) + (((long) c24708M41381.f79979) * 2) + (((long) arrayList.size()) * 128) + 65536 + ((long) c24708M41381.f79975) + 30;
                long size2 = (((long) c24708M41381.f79981) * 4) + (((long) arrayList.size()) * 128) + 65536 + ((long) c24708M41381.f79979);
                try {
                    long j2 = C9899.m25718(Math.max(size, size2), c24708M41381.f79983, c24708M41381.f79980, 4, j).f61229;
                    C18850 c18850M25718 = C9899.m25718(Math.max(size, size2), c24708M41381.f79983, c24708M41381.f79980, 4, Math.min(j, (c2442.m8241() - c2442.m8244()) + c9153M8242.m24287()));
                    int i = c18850M25718.f61230;
                    M24288 = c9153M8242.m24288(c18850M25718.f61229);
                    try {
                        if (M24288 == 0) {
                            throw new C18740("WebP allocation exceeds budget");
                        }
                        int i2 = c24708M41381.f79979;
                        byte[] bArr = new byte[i2];
                        r1 = c0951;
                        try {
                            r1.m3798(c24708M41381.f79978, bArr, 0, i2, c4108);
                            int iM41378 = m41378((C0951) r1, c24708M41381, c4108);
                            bitmapCreateBitmap = Bitmap.createBitmap((int) C13519.m33203(c24708M41381.f79983, i), (int) C13519.m33203(c24708M41381.f79980, i), Bitmap.Config.ARGB_8888);
                            try {
                                if ((((long) bitmapCreateBitmap.getAllocationByteCount()) * 4) + Math.max(size, size2) > c9153M8242.m24287()) {
                                    throw new C18740("WebP canvas allocation exceeds reservation");
                                }
                                c17685 = new C17685(r1, c24708M41381, c9153M8242, bArr, bitmapCreateBitmap, iM41378, j2);
                                try {
                                    c17685.f58127 = c17685.m41379(0, c4108);
                                    abstractC13057.m32544(c15294);
                                    AbstractC13057.m32543(c4108);
                                    return c17685;
                                } catch (IOException e) {
                                    e = e;
                                } catch (Error e2) {
                                    e = e2;
                                } catch (RuntimeException e3) {
                                    e = e3;
                                }
                            } catch (IOException | Error | RuntimeException e4) {
                                e = e4;
                                c17685 = null;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            M24288 = c0951;
                            r13 = M24288;
                            bitmapCreateBitmap = null;
                            ?? r27 = r13;
                            c17685 = null;
                            r1 = r27;
                        } catch (Error e6) {
                            e = e6;
                            M24288 = c0951;
                            r13 = M24288;
                            bitmapCreateBitmap = null;
                            ?? r28 = r13;
                            c17685 = null;
                            r1 = r28;
                        } catch (RuntimeException e7) {
                            e = e7;
                            M24288 = c0951;
                            r13 = M24288;
                            bitmapCreateBitmap = null;
                            ?? r29 = r13;
                            c17685 = null;
                            r1 = r29;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        r13 = M24288;
                        bitmapCreateBitmap = null;
                        ?? r210 = r13;
                        c17685 = null;
                        r1 = r210;
                    } catch (Error e9) {
                        e = e9;
                        r13 = M24288;
                        bitmapCreateBitmap = null;
                        ?? r211 = r13;
                        c17685 = null;
                        r1 = r211;
                    } catch (RuntimeException e10) {
                        e = e10;
                        r13 = M24288;
                        bitmapCreateBitmap = null;
                        ?? r212 = r13;
                        c17685 = null;
                        r1 = r212;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (Error e12) {
                    e = e12;
                } catch (RuntimeException e13) {
                    e = e13;
                }
                M24288 = c0951;
            } catch (IOException | Error | RuntimeException e14) {
                e = e14;
                M24288 = c0951;
            }
            r13 = M24288;
        } catch (IOException | Error | RuntimeException e15) {
            e = e15;
            r13 = 0;
        }
        bitmapCreateBitmap = null;
        ?? r213 = r13;
        c17685 = null;
        r1 = r213;
        if (c17685 != null && (bitmap = c17685.f58127) != null) {
            bitmap.recycle();
        }
        if (bitmapCreateBitmap != null) {
            bitmapCreateBitmap.recycle();
        }
        if (r1 != 0) {
            try {
                r1.close();
            } catch (IOException unused) {
            }
        }
        c9153M8242.close();
        throw e;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41378(C0951 c0951, C24708 c24708, C4108 c4108) {
        int i = c24708.f79981;
        if (i != 0) {
            int i2 = i + 6;
            byte[] bArr = new byte[i2];
            c0951.m3798(c24708.f79976, bArr, 6, i, c4108);
            int i3 = 6;
            boolean zM39139 = C16502.m39139("Exif\u0000\u0000", 6, bArr);
            C16502.m39142("Exif\u0000\u0000", 0, bArr);
            try {
                if (!zM39139) {
                    i3 = 0;
                }
                if (zM39139) {
                    i2 = c24708.f79981;
                }
                int iM23690 = new C8826(new ByteArrayInputStream(bArr, i3, i2), 1).m23690(1, "Orientation");
                if (iM23690 >= 1 && iM23690 <= 8) {
                    return iM23690;
                }
            } catch (IOException unused) {
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Bitmap m41379(int i, InterfaceC7509 interfaceC7509) throws IOException {
        RectF rectF = this.f58142;
        C24708 c24708 = this.f58130;
        C11281 c11281 = (C11281) c24708.f79982.get(i);
        int length = this.f58143.length + 30 + c11281.f35590;
        byte[] bArr = new byte[length];
        C16502.m39142("RIFF", 0, bArr);
        int i2 = length - 8;
        C16502.m39136(4, i2, bArr);
        bArr[7] = (byte) (i2 >>> 24);
        C16502.m39142("WEBP", 8, bArr);
        C16502.m39142("VP8X", 12, bArr);
        C16502.m39136(16, 10, bArr);
        bArr[19] = (byte) 0;
        bArr[20] = (byte) ((this.f58143.length == 0 ? 0 : 32) | 16);
        C16502.m39136(24, c11281.f35586 - 1, bArr);
        C16502.m39136(27, c11281.f35585 - 1, bArr);
        byte[] bArr2 = this.f58143;
        System.arraycopy(bArr2, 0, bArr, 30, bArr2.length);
        this.f58144.m3798(c11281.f35588, bArr, this.f58143.length + 30, c11281.f35590, interfaceC7509);
        AbstractC13057.m32543(interfaceC7509);
        double d = c11281.f35586;
        Bitmap bitmap = this.f58119;
        double width = d * ((double) bitmap.getWidth());
        int i3 = this.f58122;
        final int iMax = Math.max(1, (int) Math.ceil(width / ((double) i3)));
        double height = ((double) c11281.f35585) * ((double) bitmap.getHeight());
        int i4 = this.f58123;
        final int iMax2 = Math.max(1, (int) Math.ceil(height / ((double) i4)));
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(ByteBuffer.wrap(bArr)), new ImageDecoder.OnHeaderDecodedListener() { // from class: l.ۧܺ֫
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                C17685.m41382(iMax, iMax2, imageDecoder);
            }
        });
        try {
            AbstractC13057.m32543(interfaceC7509);
            if (bitmapDecodeBitmap.getAllocationByteCount() > bitmap.getAllocationByteCount()) {
                throw new IOException("WebP subframe allocation exceeds reservation");
            }
            Canvas canvas = this.f58126;
            if (i == 0) {
                canvas.drawColor(c24708.f79974, PorterDuff.Mode.SRC);
            }
            float f = i3;
            float f2 = i4;
            rectF.set((c11281.f35584 * bitmap.getWidth()) / f, (c11281.f35582 * bitmap.getHeight()) / f2, ((c11281.f35584 + c11281.f35586) * bitmap.getWidth()) / f, ((c11281.f35582 + c11281.f35585) * bitmap.getHeight()) / f2);
            canvas.drawBitmap(bitmapDecodeBitmap, (Rect) null, rectF, c11281.f35587 ? this.f58138 : this.f58139);
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            if (bitmapCopy == null) {
                throw new IOException("WebP frame could not be copied");
            }
            if (c11281.f35583) {
                canvas.drawRect(rectF, this.f58128);
            }
            bitmapDecodeBitmap.recycle();
            return bitmapCopy;
        } catch (Throwable th) {
            bitmapDecodeBitmap.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41382(int i, int i2, ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(1);
        imageDecoder.setTargetSize(i, i2);
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
    }

    @Override // l.InterfaceC7663
    /* JADX INFO: renamed from: ᩷ */
    public final long mo20638() {
        long jM24287 = this.f58135.m24287();
        long j = this.f58146;
        if (j > jM24287) {
            return j;
        }
        return 0L;
    }

    @Override // l.InterfaceC7663
    /* JADX INFO: renamed from: ۙ */
    public final long mo20634() {
        return this.f58135.m24287();
    }

    @Override // l.InterfaceC7663
    /* JADX INFO: renamed from: ۙ */
    public final void mo20635(Canvas canvas, RectF rectF, Paint paint) {
        if (this.f58140) {
            return;
        }
        canvas.drawBitmap(this.f58127, (Rect) null, rectF, paint);
    }

    @Override // l.InterfaceC7663
    /* JADX INFO: renamed from: ۙ */
    public final void mo20637(boolean z, RunnableC8582 runnableC8582) {
        if (this.f58140) {
            return;
        }
        if (!z) {
            runnableC8582 = null;
        }
        this.f58141 = runnableC8582;
        boolean z2 = z & (this.f58130.f79982.size() > 1);
        if (z2 == this.f58136) {
            return;
        }
        this.f58136 = z2;
        this.f58134 = z2;
        this.f58133++;
        this.f58132.removeCallbacks(this.f58145);
        if (z2) {
            if (this.f58121) {
                this.f58129 = 0;
                this.f58137 = 1L;
            }
            long jMax = Math.max(1L, this.f58137) + SystemClock.uptimeMillis();
            this.f58124 = jMax;
            this.f58132.postAtTime(this.f58145, jMax);
            return;
        }
        this.f58137 = Math.max(1L, this.f58124 - SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m41390(final C17685 c17685) {
        int i;
        if (c17685.f58140 || !c17685.f58134 || c17685.f58118) {
            return;
        }
        if (!c17685.f58121 && c17685.f58125 == c17685.f58130.f79982.size() - 1 && (i = c17685.f58130.f79977) > 0 && c17685.f58129 + 1 >= i) {
            c17685.f58134 = false;
            c17685.f58121 = true;
            return;
        }
        final int size = c17685.f58121 ? 0 : (c17685.f58125 + 1) % c17685.f58130.f79982.size();
        final int i2 = c17685.f58133;
        Bitmap bitmap = c17685.f58131;
        if (bitmap != null) {
            c17685.f58131 = null;
            c17685.m41383(bitmap, size, i2);
        } else {
            c17685.f58118 = true;
            f58117.execute(new Runnable() { // from class: l.ܺܺ֫
                @Override // java.lang.Runnable
                public final void run() {
                    C17685.m41384(this.f55343, size, i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41384(final C17685 c17685, final int i, final int i2) {
        final Bitmap bitmapM41379 = null;
        try {
            if (!c17685.f58140) {
                bitmapM41379 = c17685.m41379(i, new InterfaceC7509() { // from class: l.ᩴܺ֫
                    @Override // l.InterfaceC7509
                    /* JADX INFO: renamed from: ۫ */
                    public final boolean mo924() {
                        return this.f64084.f58140;
                    }
                });
            }
        } catch (IOException | OutOfMemoryError | RuntimeException unused) {
        }
        c17685.f58132.post(new Runnable() { // from class: l.ܳܺ֫
            @Override // java.lang.Runnable
            public final void run() {
                this.f50304.m41383(bitmapM41379, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m41383(Bitmap bitmap, int i, int i2) {
        this.f58118 = false;
        if (this.f58140) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        boolean z = this.f58134;
        if (!z || this.f58133 != i2) {
            this.f58131 = bitmap;
            if (z) {
                this.f58132.post(this.f58145);
                return;
            }
            return;
        }
        if (bitmap == null) {
            this.f58134 = false;
            return;
        }
        Bitmap bitmap2 = this.f58127;
        this.f58127 = bitmap;
        this.f58125 = i;
        bitmap2.recycle();
        if (i == 0 && !this.f58121) {
            this.f58129++;
        }
        this.f58121 = false;
        this.f58137 = Math.max(20, ((C11281) this.f58130.f79982.get(i)).f35589);
        this.f58124 = Math.max(SystemClock.uptimeMillis(), this.f58124 + this.f58137);
        Runnable runnable = this.f58141;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f58134 || this.f58140) {
            return;
        }
        this.f58132.postAtTime(this.f58145, this.f58124);
    }

    @Override // l.InterfaceC7663
    /* JADX INFO: renamed from: ۙ */
    public final void mo20636(C9153 c9153) {
        synchronized (this) {
            if (this.f58140) {
                return;
            }
            this.f58140 = true;
            RunnableC5753 runnableC5753 = new RunnableC5753(0, this, c9153);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC5753.run();
            } else {
                this.f58132.post(runnableC5753);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41391(C17685 c17685, C9153 c9153) {
        c17685.f58136 = false;
        c17685.f58134 = false;
        c17685.f58141 = null;
        c17685.f58132.removeCallbacks(c17685.f58145);
        c17685.f58127.recycle();
        Bitmap bitmap = c17685.f58131;
        if (bitmap != null) {
            bitmap.recycle();
            c17685.f58131 = null;
        }
        f58117.execute(new RunnableC12027(c17685, c9153, 1));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41389(final C17685 c17685, final C9153 c9153) {
        c17685.f58119.recycle();
        c17685.f58143 = null;
        c17685.f58130.f79982.clear();
        try {
            c17685.f58144.close();
        } catch (IOException unused) {
        }
        c17685.f58132.post(new Runnable() { // from class: l.۫ܺ֫
            @Override // java.lang.Runnable
            public final void run() {
                C17685.m41386(this.f42172, c9153);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41386(C17685 c17685, C9153 c9153) {
        c17685.f58135.close();
        if (c9153 != null) {
            c9153.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24708 m41381(C0951 c0951, long j, C9153 c9153, C4108 c4108) throws IOException {
        C24708 c24708;
        int i;
        long j2;
        int iM39129;
        int iM391210;
        long j3 = j;
        byte[] bArr = new byte[30];
        c0951.m3798(0L, bArr, 0, 30, c4108);
        int i2 = 0;
        if (!C16502.m39139("RIFF", 0, bArr) || !C16502.m39139("WEBP", 8, bArr) || !C16502.m39139("VP8X", 12, bArr) || C16502.m39140(16, bArr) != 10 || (bArr[20] & 2) == 0) {
            throw new IOException("Invalid animated WebP header");
        }
        int i3 = 4;
        long j4 = 8;
        long jM39140 = C16502.m39140(4, bArr) + 8;
        if (jM39140 > 268435456) {
            throw new IOException("WebP input exceeds byte limit");
        }
        C24708 c24709 = new C24708(C16502.m39141(24, bArr) + 1, C16502.m39141(27, bArr) + 1);
        C6808 c6808 = C6808.f22671;
        int i4 = c24709.f79983;
        int i5 = c24709.f79980;
        c6808.m18989(i4, i5);
        long j5 = 30;
        boolean z = false;
        while (true) {
            ArrayList arrayList = c24709.f79982;
            if (j5 >= jM39140) {
                C24708 c247010 = c24709;
                if (!z || arrayList.isEmpty()) {
                    throw new IOException("WebP contains no animation frames");
                }
                return c247010;
            }
            if (jM39140 - j5 < j4) {
                throw new IOException("Truncated WebP chunk");
            }
            int i6 = i5;
            int i7 = i4;
            C24708 c247011 = c24709;
            byte[] bArr2 = bArr;
            c0951.m3798(j5, bArr, 0, 8, c4108);
            long jM39141 = C16502.m39140(i3, bArr2);
            long j6 = j5 + 8;
            long j7 = j6 + jM39141;
            long j8 = j7 + (jM39141 & 1);
            if (j8 > jM39140) {
                throw new IOException("Truncated WebP chunk data");
            }
            if (C16502.m39139("ANIM", i2, bArr2)) {
                if (jM39141 != 6 || z || !arrayList.isEmpty()) {
                    throw new IOException("Invalid WebP animation header");
                }
                c0951.m3798(j6, bArr2, 0, 6, c4108);
                c24708 = c247011;
                c24708.f79974 = (int) C16502.m39140(i2, bArr2);
                c24708.f79977 = C16502.m39129(i3, bArr2);
                z = true;
            } else {
                c24708 = c247011;
                if (C16502.m39139("ICCP", i2, bArr2)) {
                    if (c24708.f79979 != 0) {
                        throw new IOException("Duplicate WebP color profile");
                    }
                    c24708.f79978 = (int) j5;
                    c24708.f79979 = (int) (j8 - j5);
                } else if (C16502.m39139("EXIF", i2, bArr2)) {
                    c24708.f79976 = (int) j6;
                    c24708.f79981 = (int) jM39141;
                } else {
                    if (C16502.m39139("ANMF", i2, bArr2)) {
                        if (!z || jM39141 < 24) {
                            throw new IOException("Invalid WebP animation frame");
                        }
                        m41387(c24708, j3, c9153);
                        c0951.m3798(j6, bArr2, 0, 16, c4108);
                        C11281 c11281 = new C11281();
                        c11281.f35584 = C16502.m39141(i2, bArr2) * 2;
                        c11281.f35582 = C16502.m39141(3, bArr2) * 2;
                        c11281.f35586 = C16502.m39141(6, bArr2) + 1;
                        c11281.f35585 = C16502.m39141(9, bArr2) + 1;
                        c11281.f35589 = C16502.m39141(12, bArr2);
                        byte b = bArr2[15];
                        c11281.f35587 = (b & 2) != 0;
                        c11281.f35583 = (b & 1) != 0;
                        int i8 = ((int) j6) + 16;
                        c11281.f35588 = i8;
                        c11281.f35590 = ((int) jM39141) - 16;
                        int i9 = i7;
                        if (((long) c11281.f35584) + ((long) c11281.f35586) <= i9) {
                            int i10 = i6;
                            if (((long) c11281.f35582) + ((long) c11281.f35585) <= i10) {
                                long j9 = i8;
                                boolean z2 = false;
                                while (j9 < j7) {
                                    if (j7 - j9 < 8) {
                                        throw new IOException("Truncated WebP frame chunk");
                                    }
                                    int i11 = i10;
                                    int i12 = i9;
                                    c0951.m3798(j9, bArr2, 0, 8, c4108);
                                    long jM39142 = C16502.m39140(4, bArr2);
                                    long j10 = j9 + 8;
                                    long j11 = j10 + jM39142 + (jM39142 & 1);
                                    if (j11 > j7) {
                                        throw new IOException("Truncated WebP frame payload");
                                    }
                                    if (C16502.m39139("VP8 ", i2, bArr2) || C16502.m39139("VP8L", i2, bArr2)) {
                                        if (z2) {
                                            throw new IOException("Duplicate WebP frame image");
                                        }
                                        c0951.m3798(j10, bArr2, 8, (int) Math.min(10L, jM39142), c4108);
                                        int i13 = (int) jM39142;
                                        int i14 = c11281.f35586;
                                        int i15 = c11281.f35585;
                                        if (C16502.m39139("VP8L", 0, bArr2)) {
                                            if (i13 < 5 || bArr2[8] != 47) {
                                                throw new IOException("Invalid lossless WebP frame header");
                                            }
                                            long jM39143 = C16502.m39140(9, bArr2);
                                            iM39129 = ((int) (jM39143 & 16383)) + 1;
                                            iM391210 = ((int) ((jM39143 >> 14) & 16383)) + 1;
                                        } else {
                                            if (i13 < 10 || (bArr2[8] & 1) != 0 || (bArr2[11] & 255) != 157 || bArr2[12] != 1 || bArr2[13] != 42) {
                                                throw new IOException("Invalid lossy WebP frame header");
                                            }
                                            iM39129 = C16502.m39129(14, bArr2) & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;
                                            iM391210 = C16502.m39129(16, bArr2) & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;
                                        }
                                        if (iM39129 != i14 || iM391210 != i15) {
                                            throw new IOException("WebP frame dimensions disagree with container");
                                        }
                                        z2 = true;
                                    } else if (!C16502.m39139("ALPH", i2, bArr2)) {
                                        throw new IOException("Unsupported WebP frame chunk");
                                    }
                                    i2 = 0;
                                    i9 = i12;
                                    i10 = i11;
                                    j9 = j11;
                                }
                                i = i10;
                                i7 = i9;
                                j2 = 8;
                                if (!z2) {
                                    throw new IOException("Missing WebP frame image");
                                }
                                arrayList.add(c11281);
                                c24708.f79973 = Math.max(c24708.f79973, ((long) c11281.f35586) * ((long) c11281.f35585));
                                c24708.f79975 = Math.max(c24708.f79975, c11281.f35590);
                            }
                        }
                        throw new IOException("WebP frame exceeds canvas");
                    }
                    j3 = j;
                    m41387(c24708, j3, c9153);
                    c0951.m3798(j8 - 1, bArr2, 0, 1, c4108);
                    i2 = 0;
                    i3 = 4;
                    bArr = bArr2;
                    c24709 = c24708;
                    j4 = j2;
                    i4 = i7;
                    i5 = i;
                    j5 = j8;
                    jM39140 = jM39140;
                }
            }
            i = i6;
            j2 = 8;
            j3 = j;
            m41387(c24708, j3, c9153);
            c0951.m3798(j8 - 1, bArr2, 0, 1, c4108);
            i2 = 0;
            i3 = 4;
            bArr = bArr2;
            c24709 = c24708;
            j4 = j2;
            i4 = i7;
            i5 = i;
            j5 = j8;
            jM39140 = jM39140;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41387(C24708 c24708, long j, C9153 c9153) throws C18740 {
        long size = (((long) (c24708.f79982.size() + 1)) * 128) + 65536;
        if ((((long) c24708.f79981) * 4) + (((long) c24708.f79979) * 2) + size > j || !c9153.m24288(size)) {
            throw new C18740("WebP index exceeds allocation limit");
        }
    }
}
