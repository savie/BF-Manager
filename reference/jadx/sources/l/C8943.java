package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۡܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8943 implements InterfaceC10625, AutoCloseable, Drawable.Callback {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile boolean f30650;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20502 f30651;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f30652;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f30653;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f30654;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f30655;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Handler f30656 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f30657;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int f30658;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Bitmap f30659;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f30660;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Runnable f30661;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f30662;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4479 f30663;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f30664;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f30665;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C8237 f30666;

    public C8943(C4479 c4479, C8237 c8237, C20502 c20502, C24030 c24030, Bitmap bitmap, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j) {
        this.f30652 = scheduledThreadPoolExecutor;
        this.f30653 = j;
        this.f30663 = c4479;
        this.f30666 = c8237;
        this.f30651 = c20502;
        this.f30659 = bitmap;
        this.f30658 = c24030.f77850;
        this.f30657 = c24030.f77854;
        this.f30664 = c24030.f77855;
        c4479.setCallback(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7802 m23228(C24030 c24030, long j) {
        return C21207.m47667(C7309.m19505(Math.min(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX, c24030.f77852) + (((long) c24030.f77855) * 128) + c24030.f77853, 2L, c24030.f77856, 65536L), c24030.f77850, c24030.f77854, c24030.f77851 ? 4 : 3, j);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8943 m23229(AbstractC1886 abstractC1886, C14588 c14588, C0745 c0745, long j, C22682 c22682, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) throws Throwable {
        C8237 c8237;
        C4479 c4479M28706;
        IOException iOException;
        C20502 c20502M3239 = c0745.m3239(X931RNG.BLOCK64_RESEED_MAX);
        if (c20502M3239 == null) {
            throw new C10354("GIF reservation exceeds budget");
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(abstractC1886.mo5285(), 32768);
            try {
                C24030 c24030M23230 = m23230(bufferedInputStream, c22682);
                bufferedInputStream.close();
                c20502M3239.close();
                long j2 = m23228(c24030M23230, j).f25681;
                C7802 c7802M23228 = m23228(c24030M23230, Math.min(j, c0745.m3238() - c0745.m3241()));
                int i = c7802M23228.f25682;
                C20502 c20502M32310 = c0745.m3239(c7802M23228.f25681);
                if (c20502M32310 == null) {
                    throw new C10354("GIF reservation exceeds budget");
                }
                Bitmap bitmap = null;
                try {
                    AbstractC1886.m6135(c22682);
                    C13653 c13653M28711 = new C13653().m28707(i).m28708(scheduledThreadPoolExecutor).m28711();
                    if (abstractC1886.mo6139() != null) {
                        c13653M28711.m28709(abstractC1886.mo6139());
                        c8237 = null;
                    } else {
                        c8237 = new C8237(abstractC1886, c22682);
                        try {
                            c13653M28711.m28710(c8237);
                        } catch (IOException | Error | RuntimeException e) {
                            e = e;
                            c4479M28706 = null;
                            if (0 != 0) {
                                bitmap.recycle();
                            }
                            if (c4479M28706 != null) {
                                c4479M28706.m12506();
                            }
                            if (c8237 != null) {
                                c8237.close();
                            }
                            c20502M32310.close();
                            throw e;
                        }
                    }
                    c4479M28706 = c13653M28711.m28706();
                    try {
                        c4479M28706.stop();
                        if (c8237 != null && (iOException = c8237.f28676) != null) {
                            throw iOException;
                        }
                        AbstractC1886.m6135(c22682);
                        if (c4479M28706.m12508() != c24030M23230.f77855) {
                            throw new IOException("GIF frame count changed during decode");
                        }
                        if ((C16704.m39174(c24030M23230.f77850, c24030M23230.f77854, i) * 2) + c4479M28706.m12502() + c4479M28706.m12504() > c20502M32310.m46301()) {
                            throw new C10354("GIF native allocation exceeds reservation");
                        }
                        Bitmap bitmapM12507 = c4479M28706.m12507();
                        if (c4479M28706.m12500() != EnumC2362.NO_ERROR) {
                            throw new IOException("GIF first frame could not be decoded");
                        }
                        abstractC1886.m6137(c14588);
                        AbstractC1886.m6135(c22682);
                        if (c8237 != null) {
                            c8237.f28680 = new C14681();
                        }
                        return new C8943(c4479M28706, c8237, c20502M32310, c24030M23230, bitmapM12507, scheduledThreadPoolExecutor, j2);
                    } catch (IOException e2) {
                        e = e2;
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        if (c4479M28706 != null) {
                            c4479M28706.m12506();
                        }
                        if (c8237 != null) {
                            c8237.close();
                        }
                        c20502M32310.close();
                        throw e;
                    } catch (Error e3) {
                        e = e3;
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        if (c4479M28706 != null) {
                            c4479M28706.m12506();
                        }
                        if (c8237 != null) {
                            c8237.close();
                        }
                        c20502M32310.close();
                        throw e;
                    } catch (RuntimeException e4) {
                        e = e4;
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        if (c4479M28706 != null) {
                            c4479M28706.m12506();
                        }
                        if (c8237 != null) {
                            c8237.close();
                        }
                        c20502M32310.close();
                        throw e;
                    }
                } catch (IOException | Error | RuntimeException e5) {
                    e = e5;
                    c8237 = null;
                    c4479M28706 = null;
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            c20502M3239.close();
            throw th3;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        m23227();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f30656.postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f30656.removeCallbacks(runnable);
    }

    @Override // l.InterfaceC10625
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long mo23241() {
        long jM46301 = this.f30651.m46301();
        long j = this.f30653;
        if (j > jM46301) {
            return j;
        }
        return 0L;
    }

    @Override // l.InterfaceC10625
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo23237() {
        return this.f30651.m46301();
    }

    @Override // l.InterfaceC10625
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23238(Canvas canvas, RectF rectF, Paint paint) {
        if (this.f30650) {
            return;
        }
        canvas.drawBitmap(this.f30659, (Rect) null, rectF, paint);
    }

    @Override // l.InterfaceC10625
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23240(boolean z, RunnableC7159 runnableC7159) {
        if (this.f30650) {
            return;
        }
        if (!z) {
            runnableC7159 = null;
        }
        this.f30661 = runnableC7159;
        final boolean z2 = z & (this.f30664 > 1);
        if (z2 == this.f30660) {
            return;
        }
        this.f30660 = z2;
        this.f30662 = z2;
        this.f30655++;
        this.f30652.execute(new Runnable() { // from class: l.᩸ܳ۬
            @Override // java.lang.Runnable
            public final void run() {
                C8943.m23234(this.f70171, z2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23234(C8943 c8943, boolean z) {
        if (c8943.f30650) {
            return;
        }
        if (z) {
            if (c8943.f30663.m12499()) {
                c8943.f30663.m12501();
                return;
            } else {
                c8943.f30663.start();
                return;
            }
        }
        c8943.f30663.stop();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m23227() {
        if (this.f30650 || !this.f30662) {
            return;
        }
        if (this.f30665) {
            this.f30654 = true;
            return;
        }
        this.f30665 = true;
        this.f30654 = false;
        final int i = this.f30655;
        this.f30652.execute(new Runnable() { // from class: l.ᩳܳ۬
            @Override // java.lang.Runnable
            public final void run() {
                C8943.m23231(this.f57928, i);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23231(final C8943 c8943, final int i) {
        Bitmap bitmapM12507;
        int i2;
        final Bitmap bitmap;
        final int i3;
        final boolean z;
        boolean zIsRunning;
        IOException iOException;
        try {
            if (c8943.f30650) {
                bitmapM12507 = null;
                zIsRunning = false;
                i2 = 0;
            } else {
                C8237 c8237 = c8943.f30666;
                if (c8237 != null && (iOException = c8237.f28676) != null) {
                    throw iOException;
                }
                if (c8943.f30663.m12500() != EnumC2362.NO_ERROR) {
                    throw new IOException("GIF frame could not be decoded");
                }
                bitmapM12507 = c8943.f30663.m12507();
                try {
                    if (c8943.f30663.m12499()) {
                        i2 = c8943.f30664 - 1;
                    } else {
                        int iM12505 = c8943.f30663.m12505();
                        int i4 = c8943.f30664;
                        i2 = ((iM12505 + i4) - 1) % i4;
                    }
                    try {
                        zIsRunning = c8943.f30663.isRunning();
                    } catch (IOException | OutOfMemoryError | RuntimeException unused) {
                        if (bitmapM12507 != null) {
                            bitmapM12507.recycle();
                        }
                        c8943.f30663.stop();
                        bitmap = null;
                        i3 = i2;
                        z = false;
                    }
                } catch (IOException | OutOfMemoryError | RuntimeException unused2) {
                    i2 = 0;
                    if (bitmapM12507 != null) {
                        bitmapM12507.recycle();
                    }
                    c8943.f30663.stop();
                    bitmap = null;
                    i3 = i2;
                    z = false;
                    c8943.f30656.post(new Runnable(i, bitmap, i3, z) { // from class: l.ۘܳ۬

                        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ Bitmap f14846;

                        /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ boolean f14848;

                        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ int f14849;

                        {
                            this.f14848 = z;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C8943.m23232(this.f14847, this.f14849, this.f14846, this.f14848);
                        }
                    });
                }
            }
            z = zIsRunning;
            bitmap = bitmapM12507;
            i3 = i2;
        } catch (IOException | OutOfMemoryError | RuntimeException unused3) {
            bitmapM12507 = null;
        }
        c8943.f30656.post(new Runnable(i, bitmap, i3, z) { // from class: l.ۘܳ۬

            /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Bitmap f14846;

            /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ boolean f14848;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f14849;

            {
                this.f14848 = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C8943.m23232(this.f14847, this.f14849, this.f14846, this.f14848);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23232(C8943 c8943, int i, Bitmap bitmap, boolean z) {
        c8943.f30665 = false;
        if (c8943.f30650 || !c8943.f30662 || i != c8943.f30655) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            if (c8943.f30650 || !c8943.f30662) {
                return;
            }
            c8943.m23227();
            return;
        }
        if (bitmap == null) {
            c8943.f30662 = false;
            return;
        }
        Bitmap bitmap2 = c8943.f30659;
        c8943.f30659 = bitmap;
        c8943.f30662 = z;
        bitmap2.recycle();
        Runnable runnable = c8943.f30661;
        if (runnable != null) {
            runnable.run();
        }
        if (c8943.f30654) {
            c8943.m23227();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        mo23239(null);
    }

    @Override // l.InterfaceC10625
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23239(final C20502 c20502) {
        synchronized (this) {
            if (this.f30650) {
                return;
            }
            this.f30650 = true;
            Runnable runnable = new Runnable() { // from class: l.ᩴܳ۬
                @Override // java.lang.Runnable
                public final void run() {
                    C8943.m23233(this.f60995, c20502);
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                this.f30656.post(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23233(final C8943 c8943, final C20502 c20502) {
        c8943.f30660 = false;
        c8943.f30662 = false;
        c8943.f30661 = null;
        c8943.f30659.recycle();
        c8943.f30652.execute(new Runnable() { // from class: l.۬ܳ۬
            @Override // java.lang.Runnable
            public final void run() {
                C8943.m23235(this.f43871, c20502);
            }
        });
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23235(C8943 c8943, C20502 c20502) {
        Handler handler = c8943.f30656;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = c8943.f30652;
        C8237 c8237 = c8943.f30666;
        C4479 c4479 = c8943.f30663;
        try {
            c4479.setCallback(null);
            c4479.m12506();
        } finally {
            if (c8237 != null) {
                c8237.close();
            }
            scheduledThreadPoolExecutor.shutdown();
            handler.post(new RunnableC6825(c8943, c20502, 0));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23236(C8943 c8943, C20502 c20502) {
        c8943.f30651.close();
        if (c20502 != null) {
            c20502.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24030 m23230(BufferedInputStream bufferedInputStream, C22682 c22682) throws IOException {
        long jMax;
        C19526 c19526 = new C19526(bufferedInputStream, c22682);
        byte[] bArr = new byte[13];
        for (int i = 0; i < 13; i++) {
            bArr[i] = (byte) c19526.m44607();
        }
        if (bArr[0] == 71 && bArr[1] == 73) {
            int i2 = 2;
            if (bArr[2] == 70) {
                int i3 = 3;
                if (bArr[3] == 56) {
                    int i4 = 4;
                    byte b = bArr[4];
                    if ((b == 55 || b == 57) && bArr[5] == 97) {
                        int i5 = 7;
                        int i6 = (bArr[6] & 255) | ((bArr[7] & 255) << 8);
                        int i7 = (bArr[8] & 255) | ((bArr[9] & 255) << 8);
                        C0475.f2151.m2343(i6, i7);
                        byte b2 = bArr[10];
                        long j = (b2 & GCMSIVBlockCipher.MASK) != 0 ? 3 << ((b2 & 7) + 1) : 0L;
                        c19526.m44608((int) j);
                        int i8 = 0;
                        long j2 = j;
                        long j3 = 0;
                        long j4 = 0;
                        long j5 = 0;
                        boolean z = false;
                        while (true) {
                            int iM44607 = c19526.m44607();
                            if (iM44607 == 59) {
                                if (i8 == 0) {
                                    throw new IOException("GIF contains no frames");
                                }
                                return new C24030(i6, i7, i8, j4, j3, j2, z);
                            }
                            if (iM44607 == 33) {
                                int iM44608 = c19526.m44607();
                                if (iM44608 != 249) {
                                    long j6 = 0;
                                    while (true) {
                                        int iM44609 = c19526.m44607();
                                        if (iM44609 == 0) {
                                            break;
                                        }
                                        j6 += (long) iM44609;
                                        c19526.m44608(iM44609);
                                    }
                                    if (iM44608 == 254) {
                                        j4 += j6;
                                    }
                                } else {
                                    if (c19526.m44607() != i4) {
                                        throw new IOException("Invalid GIF graphics control");
                                    }
                                    z |= ((c19526.m44607() >> i2) & i5) == i3;
                                    c19526.m44608(i3);
                                    if (c19526.m44607() != 0) {
                                        throw new IOException("Invalid GIF graphics terminator");
                                    }
                                }
                                jMax = j3;
                            } else if (iM44607 == 44) {
                                int iM446010 = c19526.m44609();
                                int iM446011 = c19526.m44609();
                                int iM446012 = c19526.m44609();
                                int iM446013 = c19526.m44609();
                                int iM446014 = c19526.m44607();
                                if (iM446012 <= 0 || iM446013 <= 0 || iM446010 + iM446012 > i6 || iM446011 + iM446013 > i7) {
                                    break;
                                }
                                i8++;
                                long j7 = ((long) iM446012) * ((long) iM446013);
                                if (j7 > j5) {
                                    jMax = Math.max(j3, j5 + j7);
                                    j5 = j7;
                                } else {
                                    jMax = j3;
                                }
                                if ((iM446014 & 128) != 0) {
                                    int i9 = 3 << ((iM446014 & 7) + 1);
                                    j2 += (long) i9;
                                    c19526.m44608(i9);
                                }
                                int iM446015 = c19526.m44607();
                                if (iM446015 < 2 || iM446015 > 8) {
                                    throw new IOException("Invalid GIF code size");
                                }
                                while (true) {
                                    int iM446016 = c19526.m44607();
                                    if (iM446016 != 0) {
                                        c19526.m44608(iM446016);
                                    }
                                }
                            } else {
                                throw new IOException("Invalid GIF block");
                            }
                            i2 = 2;
                            i3 = 3;
                            i4 = 4;
                            j3 = jMax;
                            i5 = 7;
                        }
                        throw new IOException("GIF frame exceeds safe bounds");
                    }
                }
            }
        }
        throw new IOException("Invalid GIF header");
    }
}
