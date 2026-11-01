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

/* JADX INFO: renamed from: l.ۧۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I6M7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10916 implements InterfaceC10625 {

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f37118 = Executors.newSingleThreadExecutor(new ThreadFactoryC17265());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Paint f37119 = new Paint(2);

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f37120;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Bitmap f37121;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C16269 f37122;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f37123;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final int f37124;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int f37125;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public Runnable f37126;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f37127;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f37128;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final int f37129;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f37130;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Bitmap f37131;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C11765 f37132;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Canvas f37133;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public long f37134;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public byte[] f37135;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f37136;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public long f37137;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f37138;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37139;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37140;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f37141;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC16560 f37142;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final RectF f37143;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f37144;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C20502 f37145;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final long f37146;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Paint f37147;

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ܽۢ۬] */
    public C10916(C16269 c16269, C11765 c11765, C20502 c20502, byte[] bArr, Bitmap bitmap, int i, long j) {
        Paint paint = new Paint(2);
        this.f37144 = paint;
        Paint paint2 = new Paint();
        this.f37147 = paint2;
        this.f37143 = new RectF();
        this.f37120 = new Handler(Looper.getMainLooper());
        this.f37142 = new Runnable() { // from class: l.ܽۢ۬
            @Override // java.lang.Runnable
            public final void run() {
                C10916.m27362(this.f53189);
            }
        };
        this.f37146 = j;
        this.f37122 = c16269;
        this.f37132 = c11765;
        this.f37145 = c20502;
        this.f37135 = bArr;
        this.f37131 = bitmap;
        this.f37124 = i;
        this.f37129 = c11765.f39499;
        this.f37125 = c11765.f39493;
        this.f37133 = new Canvas(bitmap);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint2.setColor(c11765.f39492);
        this.f37137 = Math.max(20, ((C13882) c11765.f39490.get(0)).f45751);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v28, types: [l.ܺ᩻۬] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ܺ᩻۬] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10916 m27352(AbstractC1886 abstractC1886, C14588 c14588, C0745 c0745, long j, C22682 c22682) throws Throwable {
        ?? r13;
        Bitmap bitmapCreateBitmap;
        C10916 c10916;
        ?? r1;
        Bitmap bitmap;
        ?? M46302;
        C20502 c20502M3239 = c0745.m3239(65536L);
        if (c20502M3239 == null) {
            throw new C10354("WebP scan exceeds budget");
        }
        try {
            C16269 c16269 = new C16269(abstractC1886);
            try {
                C11765 c11765M27353 = m27353(c16269, j, c20502M3239, c22682);
                ArrayList arrayList = c11765M27353.f39490;
                long size = (c11765M27353.f39491 * 4) + (((long) c11765M27353.f39498) * 2) + (((long) arrayList.size()) * 128) + 65536 + ((long) c11765M27353.f39496) + 30;
                long size2 = (((long) c11765M27353.f39497) * 4) + (((long) arrayList.size()) * 128) + 65536 + ((long) c11765M27353.f39498);
                try {
                    long j2 = C21207.m47667(Math.max(size, size2), c11765M27353.f39499, c11765M27353.f39493, 4, j).f25681;
                    C7802 c7802M47667 = C21207.m47667(Math.max(size, size2), c11765M27353.f39499, c11765M27353.f39493, 4, Math.min(j, (c0745.m3238() - c0745.m3241()) + c20502M3239.m46301()));
                    int i = c7802M47667.f25682;
                    M46302 = c20502M3239.m46302(c7802M47667.f25681);
                    try {
                        if (M46302 == 0) {
                            throw new C10354("WebP allocation exceeds budget");
                        }
                        int i2 = c11765M27353.f39498;
                        byte[] bArr = new byte[i2];
                        r1 = c16269;
                        try {
                            r1.m38432(c11765M27353.f39489, bArr, 0, i2, c22682);
                            int iM27350 = m27350((C16269) r1, c11765M27353, c22682);
                            bitmapCreateBitmap = Bitmap.createBitmap((int) C16704.m39173(c11765M27353.f39499, i), (int) C16704.m39173(c11765M27353.f39493, i), Bitmap.Config.ARGB_8888);
                            try {
                                if ((((long) bitmapCreateBitmap.getAllocationByteCount()) * 4) + Math.max(size, size2) > c20502M3239.m46301()) {
                                    throw new C10354("WebP canvas allocation exceeds reservation");
                                }
                                c10916 = new C10916(r1, c11765M27353, c20502M3239, bArr, bitmapCreateBitmap, iM27350, j2);
                                try {
                                    c10916.f37121 = c10916.m27351(0, c22682);
                                    abstractC1886.m6137(c14588);
                                    AbstractC1886.m6135(c22682);
                                    return c10916;
                                } catch (IOException e) {
                                    e = e;
                                } catch (Error e2) {
                                    e = e2;
                                } catch (RuntimeException e3) {
                                    e = e3;
                                }
                            } catch (IOException | Error | RuntimeException e4) {
                                e = e4;
                                c10916 = null;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            M46302 = c16269;
                            r13 = M46302;
                            bitmapCreateBitmap = null;
                            ?? r27 = r13;
                            c10916 = null;
                            r1 = r27;
                        } catch (Error e6) {
                            e = e6;
                            M46302 = c16269;
                            r13 = M46302;
                            bitmapCreateBitmap = null;
                            ?? r28 = r13;
                            c10916 = null;
                            r1 = r28;
                        } catch (RuntimeException e7) {
                            e = e7;
                            M46302 = c16269;
                            r13 = M46302;
                            bitmapCreateBitmap = null;
                            ?? r29 = r13;
                            c10916 = null;
                            r1 = r29;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        r13 = M46302;
                        bitmapCreateBitmap = null;
                        ?? r210 = r13;
                        c10916 = null;
                        r1 = r210;
                    } catch (Error e9) {
                        e = e9;
                        r13 = M46302;
                        bitmapCreateBitmap = null;
                        ?? r211 = r13;
                        c10916 = null;
                        r1 = r211;
                    } catch (RuntimeException e10) {
                        e = e10;
                        r13 = M46302;
                        bitmapCreateBitmap = null;
                        ?? r212 = r13;
                        c10916 = null;
                        r1 = r212;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (Error e12) {
                    e = e12;
                } catch (RuntimeException e13) {
                    e = e13;
                }
                M46302 = c16269;
            } catch (IOException | Error | RuntimeException e14) {
                e = e14;
                M46302 = c16269;
            }
            r13 = M46302;
        } catch (IOException | Error | RuntimeException e15) {
            e = e15;
            r13 = 0;
        }
        bitmapCreateBitmap = null;
        ?? r213 = r13;
        c10916 = null;
        r1 = r213;
        if (c10916 != null && (bitmap = c10916.f37121) != null) {
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
        c20502M3239.close();
        throw e;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27350(C16269 c16269, C11765 c11765, C22682 c22682) {
        int i = c11765.f39497;
        if (i != 0) {
            int i2 = i + 6;
            byte[] bArr = new byte[i2];
            c16269.m38432(c11765.f39495, bArr, 6, i, c22682);
            int i3 = 6;
            boolean zM8065 = C2591.m8065("Exif\u0000\u0000", 6, bArr);
            C2591.m8068("Exif\u0000\u0000", 0, bArr);
            try {
                if (!zM8065) {
                    i3 = 0;
                }
                if (zM8065) {
                    i2 = c11765.f39497;
                }
                int iM9015 = new C3021(new ByteArrayInputStream(bArr, i3, i2), 1).m9015();
                if (iM9015 >= 1 && iM9015 <= 8) {
                    return iM9015;
                }
            } catch (IOException unused) {
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Bitmap m27351(int i, InterfaceC5614 interfaceC5614) throws IOException {
        RectF rectF = this.f37143;
        C11765 c11765 = this.f37132;
        C13882 c13882 = (C13882) c11765.f39490.get(i);
        int length = this.f37135.length + 30 + c13882.f45745;
        byte[] bArr = new byte[length];
        C2591.m8068("RIFF", 0, bArr);
        int i2 = length - 8;
        C2591.m8062(4, i2, bArr);
        bArr[7] = (byte) (i2 >>> 24);
        C2591.m8068("WEBP", 8, bArr);
        C2591.m8068("VP8X", 12, bArr);
        C2591.m8062(16, 10, bArr);
        bArr[19] = (byte) 0;
        bArr[20] = (byte) ((this.f37135.length == 0 ? 0 : 32) | 16);
        C2591.m8062(24, c13882.f45744 - 1, bArr);
        C2591.m8062(27, c13882.f45749 - 1, bArr);
        byte[] bArr2 = this.f37135;
        System.arraycopy(bArr2, 0, bArr, 30, bArr2.length);
        this.f37122.m38432(c13882.f45748, bArr, this.f37135.length + 30, c13882.f45745, interfaceC5614);
        AbstractC1886.m6135(interfaceC5614);
        double d = c13882.f45744;
        Bitmap bitmap = this.f37131;
        double width = d * ((double) bitmap.getWidth());
        int i3 = this.f37129;
        final int iMax = Math.max(1, (int) Math.ceil(width / ((double) i3)));
        double height = ((double) c13882.f45749) * ((double) bitmap.getHeight());
        int i4 = this.f37125;
        final int iMax2 = Math.max(1, (int) Math.ceil(height / ((double) i4)));
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(ByteBuffer.wrap(bArr)), new ImageDecoder.OnHeaderDecodedListener() { // from class: l.۫ۢ۬
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                C10916.m27354(iMax, iMax2, imageDecoder);
            }
        });
        try {
            AbstractC1886.m6135(interfaceC5614);
            if (bitmapDecodeBitmap.getAllocationByteCount() > bitmap.getAllocationByteCount()) {
                throw new IOException("WebP subframe allocation exceeds reservation");
            }
            Canvas canvas = this.f37133;
            if (i == 0) {
                canvas.drawColor(c11765.f39492, PorterDuff.Mode.SRC);
            }
            float f = i3;
            float f2 = i4;
            rectF.set((c13882.f45750 * bitmap.getWidth()) / f, (c13882.f45746 * bitmap.getHeight()) / f2, ((c13882.f45750 + c13882.f45744) * bitmap.getWidth()) / f, ((c13882.f45746 + c13882.f45749) * bitmap.getHeight()) / f2);
            canvas.drawBitmap(bitmapDecodeBitmap, (Rect) null, rectF, c13882.f45752 ? this.f37144 : this.f37119);
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            if (bitmapCopy == null) {
                throw new IOException("WebP frame could not be copied");
            }
            if (c13882.f45747) {
                canvas.drawRect(rectF, this.f37147);
            }
            bitmapDecodeBitmap.recycle();
            return bitmapCopy;
        } catch (Throwable th) {
            bitmapDecodeBitmap.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27354(int i, int i2, ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(1);
        imageDecoder.setTargetSize(i, i2);
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
    }

    @Override // l.InterfaceC10625
    /* JADX INFO: renamed from: ۨ */
    public final long mo23241() {
        long jM46301 = this.f37145.m46301();
        long j = this.f37146;
        if (j > jM46301) {
            return j;
        }
        return 0L;
    }

    @Override // l.InterfaceC10625
    /* JADX INFO: renamed from: ۙ */
    public final long mo23237() {
        return this.f37145.m46301();
    }

    @Override // l.InterfaceC10625
    /* JADX INFO: renamed from: ۙ */
    public final void mo23238(Canvas canvas, RectF rectF, Paint paint) {
        if (this.f37140) {
            return;
        }
        canvas.drawBitmap(this.f37121, (Rect) null, rectF, paint);
    }

    @Override // l.InterfaceC10625
    /* JADX INFO: renamed from: ۙ */
    public final void mo23240(boolean z, RunnableC7159 runnableC7159) {
        if (this.f37140) {
            return;
        }
        if (!z) {
            runnableC7159 = null;
        }
        this.f37126 = runnableC7159;
        boolean z2 = z & (this.f37132.f39490.size() > 1);
        if (z2 == this.f37141) {
            return;
        }
        this.f37141 = z2;
        this.f37138 = z2;
        this.f37123++;
        this.f37120.removeCallbacks(this.f37142);
        if (z2) {
            if (this.f37136) {
                this.f37127 = 0;
                this.f37137 = 1L;
            }
            long jMax = Math.max(1L, this.f37137) + SystemClock.uptimeMillis();
            this.f37134 = jMax;
            this.f37120.postAtTime(this.f37142, jMax);
            return;
        }
        this.f37137 = Math.max(1L, this.f37134 - SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m27362(final C10916 c10916) {
        int i;
        if (c10916.f37140 || !c10916.f37138 || c10916.f37139) {
            return;
        }
        if (!c10916.f37136 && c10916.f37130 == c10916.f37132.f39490.size() - 1 && (i = c10916.f37132.f39494) > 0 && c10916.f37127 + 1 >= i) {
            c10916.f37138 = false;
            c10916.f37136 = true;
            return;
        }
        final int size = c10916.f37136 ? 0 : (c10916.f37130 + 1) % c10916.f37132.f39490.size();
        final int i2 = c10916.f37123;
        Bitmap bitmap = c10916.f37128;
        if (bitmap != null) {
            c10916.f37128 = null;
            c10916.m27355(bitmap, size, i2);
        } else {
            c10916.f37139 = true;
            f37118.execute(new Runnable() { // from class: l.ۛۢ۬
                @Override // java.lang.Runnable
                public final void run() {
                    C10916.m27356(this.f20338, size, i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27356(final C10916 c10916, final int i, final int i2) {
        final Bitmap bitmapM27351 = null;
        try {
            if (!c10916.f37140) {
                bitmapM27351 = c10916.m27351(i, new InterfaceC5614() { // from class: l.᩷ۢ۬
                    @Override // l.InterfaceC5614
                    /* JADX INFO: renamed from: ֨ */
                    public final boolean mo2357() {
                        return this.f67620.f37140;
                    }
                });
            }
        } catch (IOException | OutOfMemoryError | RuntimeException unused) {
        }
        c10916.f37120.post(new Runnable() { // from class: l.ܺۢ۬
            @Override // java.lang.Runnable
            public final void run() {
                this.f51318.m27355(bitmapM27351, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27355(Bitmap bitmap, int i, int i2) {
        this.f37139 = false;
        if (this.f37140) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        boolean z = this.f37138;
        if (!z || this.f37123 != i2) {
            this.f37128 = bitmap;
            if (z) {
                this.f37120.post(this.f37142);
                return;
            }
            return;
        }
        if (bitmap == null) {
            this.f37138 = false;
            return;
        }
        Bitmap bitmap2 = this.f37121;
        this.f37121 = bitmap;
        this.f37130 = i;
        bitmap2.recycle();
        if (i == 0 && !this.f37136) {
            this.f37127++;
        }
        this.f37136 = false;
        this.f37137 = Math.max(20, ((C13882) this.f37132.f39490.get(i)).f45751);
        this.f37134 = Math.max(SystemClock.uptimeMillis(), this.f37134 + this.f37137);
        Runnable runnable = this.f37126;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f37138 || this.f37140) {
            return;
        }
        this.f37120.postAtTime(this.f37142, this.f37134);
    }

    @Override // l.InterfaceC10625
    /* JADX INFO: renamed from: ۙ */
    public final void mo23239(C20502 c20502) {
        synchronized (this) {
            if (this.f37140) {
                return;
            }
            this.f37140 = true;
            RunnableC0331 runnableC0331 = new RunnableC0331(0, this, c20502);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC0331.run();
            } else {
                this.f37120.post(runnableC0331);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27363(C10916 c10916, C20502 c20502) {
        c10916.f37141 = false;
        c10916.f37138 = false;
        c10916.f37126 = null;
        c10916.f37120.removeCallbacks(c10916.f37142);
        c10916.f37121.recycle();
        Bitmap bitmap = c10916.f37128;
        if (bitmap != null) {
            bitmap.recycle();
            c10916.f37128 = null;
        }
        f37118.execute(new RunnableC6825(c10916, c20502, 1));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27361(final C10916 c10916, final C20502 c20502) {
        c10916.f37131.recycle();
        c10916.f37135 = null;
        c10916.f37132.f39490.clear();
        try {
            c10916.f37122.close();
        } catch (IOException unused) {
        }
        c10916.f37120.post(new Runnable() { // from class: l.᩶ۢ۬
            @Override // java.lang.Runnable
            public final void run() {
                C10916.m27358(this.f65268, c20502);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27358(C10916 c10916, C20502 c20502) {
        c10916.f37145.close();
        if (c20502 != null) {
            c20502.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11765 m27353(C16269 c16269, long j, C20502 c20502, C22682 c22682) throws IOException {
        C11765 c11765;
        int i;
        long j2;
        int iM8056;
        int iM8057;
        long j3 = j;
        byte[] bArr = new byte[30];
        c16269.m38432(0L, bArr, 0, 30, c22682);
        int i2 = 0;
        if (!C2591.m8065("RIFF", 0, bArr) || !C2591.m8065("WEBP", 8, bArr) || !C2591.m8065("VP8X", 12, bArr) || C2591.m8066(16, bArr) != 10 || (bArr[20] & 2) == 0) {
            throw new IOException("Invalid animated WebP header");
        }
        int i3 = 4;
        long j4 = 8;
        long jM8066 = C2591.m8066(4, bArr) + 8;
        if (jM8066 > 268435456) {
            throw new IOException("WebP input exceeds byte limit");
        }
        C11765 c11766 = new C11765(C2591.m8067(24, bArr) + 1, C2591.m8067(27, bArr) + 1);
        C0475 c0475 = C0475.f2151;
        int i4 = c11766.f39499;
        int i5 = c11766.f39493;
        c0475.m2343(i4, i5);
        long j5 = 30;
        boolean z = false;
        while (true) {
            ArrayList arrayList = c11766.f39490;
            if (j5 >= jM8066) {
                C11765 c11767 = c11766;
                if (!z || arrayList.isEmpty()) {
                    throw new IOException("WebP contains no animation frames");
                }
                return c11767;
            }
            if (jM8066 - j5 < j4) {
                throw new IOException("Truncated WebP chunk");
            }
            int i6 = i5;
            int i7 = i4;
            C11765 c11768 = c11766;
            byte[] bArr2 = bArr;
            c16269.m38432(j5, bArr, 0, 8, c22682);
            long jM8067 = C2591.m8066(i3, bArr2);
            long j6 = j5 + 8;
            long j7 = j6 + jM8067;
            long j8 = j7 + (jM8067 & 1);
            if (j8 > jM8066) {
                throw new IOException("Truncated WebP chunk data");
            }
            if (C2591.m8065("ANIM", i2, bArr2)) {
                if (jM8067 != 6 || z || !arrayList.isEmpty()) {
                    throw new IOException("Invalid WebP animation header");
                }
                c16269.m38432(j6, bArr2, 0, 6, c22682);
                c11765 = c11768;
                c11765.f39492 = (int) C2591.m8066(i2, bArr2);
                c11765.f39494 = C2591.m8056(i3, bArr2);
                z = true;
            } else {
                c11765 = c11768;
                if (C2591.m8065("ICCP", i2, bArr2)) {
                    if (c11765.f39498 != 0) {
                        throw new IOException("Duplicate WebP color profile");
                    }
                    c11765.f39489 = (int) j5;
                    c11765.f39498 = (int) (j8 - j5);
                } else if (C2591.m8065("EXIF", i2, bArr2)) {
                    c11765.f39495 = (int) j6;
                    c11765.f39497 = (int) jM8067;
                } else {
                    if (C2591.m8065("ANMF", i2, bArr2)) {
                        if (!z || jM8067 < 24) {
                            throw new IOException("Invalid WebP animation frame");
                        }
                        m27359(c11765, j3, c20502);
                        c16269.m38432(j6, bArr2, 0, 16, c22682);
                        C13882 c13882 = new C13882();
                        c13882.f45750 = C2591.m8067(i2, bArr2) * 2;
                        c13882.f45746 = C2591.m8067(3, bArr2) * 2;
                        c13882.f45744 = C2591.m8067(6, bArr2) + 1;
                        c13882.f45749 = C2591.m8067(9, bArr2) + 1;
                        c13882.f45751 = C2591.m8067(12, bArr2);
                        byte b = bArr2[15];
                        c13882.f45752 = (b & 2) != 0;
                        c13882.f45747 = (b & 1) != 0;
                        int i8 = ((int) j6) + 16;
                        c13882.f45748 = i8;
                        c13882.f45745 = ((int) jM8067) - 16;
                        int i9 = i7;
                        if (((long) c13882.f45750) + ((long) c13882.f45744) <= i9) {
                            int i10 = i6;
                            if (((long) c13882.f45746) + ((long) c13882.f45749) <= i10) {
                                long j9 = i8;
                                boolean z2 = false;
                                while (j9 < j7) {
                                    if (j7 - j9 < 8) {
                                        throw new IOException("Truncated WebP frame chunk");
                                    }
                                    int i11 = i10;
                                    int i12 = i9;
                                    c16269.m38432(j9, bArr2, 0, 8, c22682);
                                    long jM8068 = C2591.m8066(4, bArr2);
                                    long j10 = j9 + 8;
                                    long j11 = j10 + jM8068 + (jM8068 & 1);
                                    if (j11 > j7) {
                                        throw new IOException("Truncated WebP frame payload");
                                    }
                                    if (C2591.m8065("VP8 ", i2, bArr2) || C2591.m8065("VP8L", i2, bArr2)) {
                                        if (z2) {
                                            throw new IOException("Duplicate WebP frame image");
                                        }
                                        c16269.m38432(j10, bArr2, 8, (int) Math.min(10L, jM8068), c22682);
                                        int i13 = (int) jM8068;
                                        int i14 = c13882.f45744;
                                        int i15 = c13882.f45749;
                                        if (C2591.m8065("VP8L", 0, bArr2)) {
                                            if (i13 < 5 || bArr2[8] != 47) {
                                                throw new IOException("Invalid lossless WebP frame header");
                                            }
                                            long jM8069 = C2591.m8066(9, bArr2);
                                            iM8056 = ((int) (jM8069 & 16383)) + 1;
                                            iM8057 = ((int) ((jM8069 >> 14) & 16383)) + 1;
                                        } else {
                                            if (i13 < 10 || (bArr2[8] & 1) != 0 || (bArr2[11] & 255) != 157 || bArr2[12] != 1 || bArr2[13] != 42) {
                                                throw new IOException("Invalid lossy WebP frame header");
                                            }
                                            iM8056 = C2591.m8056(14, bArr2) & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;
                                            iM8057 = C2591.m8056(16, bArr2) & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;
                                        }
                                        if (iM8056 != i14 || iM8057 != i15) {
                                            throw new IOException("WebP frame dimensions disagree with container");
                                        }
                                        z2 = true;
                                    } else if (!C2591.m8065("ALPH", i2, bArr2)) {
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
                                arrayList.add(c13882);
                                c11765.f39491 = Math.max(c11765.f39491, ((long) c13882.f45744) * ((long) c13882.f45749));
                                c11765.f39496 = Math.max(c11765.f39496, c13882.f45745);
                            }
                        }
                        throw new IOException("WebP frame exceeds canvas");
                    }
                    j3 = j;
                    m27359(c11765, j3, c20502);
                    c16269.m38432(j8 - 1, bArr2, 0, 1, c22682);
                    i2 = 0;
                    i3 = 4;
                    bArr = bArr2;
                    c11766 = c11765;
                    j4 = j2;
                    i4 = i7;
                    i5 = i;
                    j5 = j8;
                    jM8066 = jM8066;
                }
            }
            i = i6;
            j2 = 8;
            j3 = j;
            m27359(c11765, j3, c20502);
            c16269.m38432(j8 - 1, bArr2, 0, 1, c22682);
            i2 = 0;
            i3 = 4;
            bArr = bArr2;
            c11766 = c11765;
            j4 = j2;
            i4 = i7;
            i5 = i;
            j5 = j8;
            jM8066 = jM8066;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27359(C11765 c11765, long j, C20502 c20502) throws C10354 {
        long size = (((long) (c11765.f39490.size() + 1)) * 128) + 65536;
        if ((((long) c11765.f39497) * 4) + (((long) c11765.f39498) * 2) + size > j || !c20502.m46302(size)) {
            throw new C10354("WebP index exceeds allocation limit");
        }
    }
}
