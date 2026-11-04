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

/* JADX INFO: renamed from: l.۟֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7553 implements InterfaceC7663, AutoCloseable, Drawable.Callback {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17311 f24906;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f24907;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Runnable f24908;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f24909;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Handler f24910 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Bitmap f24911;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C9153 f24912;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17994 f24913;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f24914;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int f24915;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f24916;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f24917;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f24918;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f24919;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f24920;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24921;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f24922;

    public C7553(C17311 c17311, C17994 c17994, C9153 c9153, C10535 c10535, Bitmap bitmap, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j) {
        this.f24922 = scheduledThreadPoolExecutor;
        this.f24916 = j;
        this.f24906 = c17311;
        this.f24913 = c17994;
        this.f24912 = c9153;
        this.f24911 = bitmap;
        this.f24915 = c10535.f33508;
        this.f24907 = c10535.f33507;
        this.f24919 = c10535.f33511;
        c17311.setCallback(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18850 m20626(C10535 c10535, long j) {
        return C9899.m25718(C11958.m29929(Math.min(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX, c10535.f33506) + (((long) c10535.f33511) * 128) + c10535.f33510, 2L, c10535.f33509, 65536L), c10535.f33508, c10535.f33507, c10535.f33512 ? 4 : 3, j);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7553 m20624(AbstractC13057 abstractC13057, C15294 c15294, C2442 c2442, long j, C4108 c4108, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) throws Throwable {
        C17994 c17994;
        C17311 c17311M52394;
        IOException iOException;
        C9153 c9153M8242 = c2442.m8242(X931RNG.BLOCK64_RESEED_MAX);
        if (c9153M8242 == null) {
            throw new C18740("GIF reservation exceeds budget");
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(abstractC13057.mo17428(), 32768);
            try {
                C10535 c10535M20625 = m20625(bufferedInputStream, c4108);
                bufferedInputStream.close();
                c9153M8242.close();
                long j2 = m20626(c10535M20625, j).f61229;
                C18850 c18850M20626 = m20626(c10535M20625, Math.min(j, c2442.m8241() - c2442.m8244()));
                int i = c18850M20626.f61230;
                C9153 c9153M8243 = c2442.m8242(c18850M20626.f61229);
                if (c9153M8243 == null) {
                    throw new C18740("GIF reservation exceeds budget");
                }
                Bitmap bitmap = null;
                try {
                    AbstractC13057.m32543(c4108);
                    C15819 c15819M52397 = new C15819().m52392(i).m52393(scheduledThreadPoolExecutor).m52397();
                    if (abstractC13057.mo17424() != null) {
                        c15819M52397.m52395(abstractC13057.mo17424());
                        c17994 = null;
                    } else {
                        c17994 = new C17994(abstractC13057, c4108);
                        try {
                            c15819M52397.m52396(c17994);
                        } catch (IOException | Error | RuntimeException e) {
                            e = e;
                            c17311M52394 = null;
                            if (0 != 0) {
                                bitmap.recycle();
                            }
                            if (c17311M52394 != null) {
                                c17311M52394.m40658();
                            }
                            if (c17994 != null) {
                                c17994.close();
                            }
                            c9153M8243.close();
                            throw e;
                        }
                    }
                    c17311M52394 = c15819M52397.m52394();
                    try {
                        c17311M52394.stop();
                        if (c17994 != null && (iOException = c17994.f58938) != null) {
                            throw iOException;
                        }
                        AbstractC13057.m32543(c4108);
                        if (c17311M52394.m40661() != c10535M20625.f33511) {
                            throw new IOException("GIF frame count changed during decode");
                        }
                        if ((C13519.m33204(c10535M20625.f33508, c10535M20625.f33507, i) * 2) + c17311M52394.m40656() + c17311M52394.m40662() > c9153M8243.m24287()) {
                            throw new C18740("GIF native allocation exceeds reservation");
                        }
                        Bitmap bitmapM40663 = c17311M52394.m40663();
                        if (c17311M52394.m40664() != EnumC3141.NO_ERROR) {
                            throw new IOException("GIF first frame could not be decoded");
                        }
                        abstractC13057.m32544(c15294);
                        AbstractC13057.m32543(c4108);
                        if (c17994 != null) {
                            c17994.f58937 = new C8730();
                        }
                        return new C7553(c17311M52394, c17994, c9153M8243, c10535M20625, bitmapM40663, scheduledThreadPoolExecutor, j2);
                    } catch (IOException e2) {
                        e = e2;
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        if (c17311M52394 != null) {
                            c17311M52394.m40658();
                        }
                        if (c17994 != null) {
                            c17994.close();
                        }
                        c9153M8243.close();
                        throw e;
                    } catch (Error e3) {
                        e = e3;
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        if (c17311M52394 != null) {
                            c17311M52394.m40658();
                        }
                        if (c17994 != null) {
                            c17994.close();
                        }
                        c9153M8243.close();
                        throw e;
                    } catch (RuntimeException e4) {
                        e = e4;
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        if (c17311M52394 != null) {
                            c17311M52394.m40658();
                        }
                        if (c17994 != null) {
                            c17994.close();
                        }
                        c9153M8243.close();
                        throw e;
                    }
                } catch (IOException | Error | RuntimeException e5) {
                    e = e5;
                    c17994 = null;
                    c17311M52394 = null;
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
            c9153M8242.close();
            throw th3;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        m20631();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f24910.postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f24910.removeCallbacks(runnable);
    }

    @Override // l.InterfaceC7663
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long mo20638() {
        long jM24287 = this.f24912.m24287();
        long j = this.f24916;
        if (j > jM24287) {
            return j;
        }
        return 0L;
    }

    @Override // l.InterfaceC7663
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo20634() {
        return this.f24912.m24287();
    }

    @Override // l.InterfaceC7663
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20635(Canvas canvas, RectF rectF, Paint paint) {
        if (this.f24918) {
            return;
        }
        canvas.drawBitmap(this.f24911, (Rect) null, rectF, paint);
    }

    @Override // l.InterfaceC7663
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20637(boolean z, RunnableC8582 runnableC8582) {
        if (this.f24918) {
            return;
        }
        if (!z) {
            runnableC8582 = null;
        }
        this.f24908 = runnableC8582;
        final boolean z2 = z & (this.f24919 > 1);
        if (z2 == this.f24921) {
            return;
        }
        this.f24921 = z2;
        this.f24917 = z2;
        this.f24914++;
        this.f24922.execute(new Runnable() { // from class: l.ۘ֫֫
            @Override // java.lang.Runnable
            public final void run() {
                C7553.m20630(this.f13042, z2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20630(C7553 c7553, boolean z) {
        if (c7553.f24918) {
            return;
        }
        if (z) {
            if (c7553.f24906.m40660()) {
                c7553.f24906.m40655();
                return;
            } else {
                c7553.f24906.start();
                return;
            }
        }
        c7553.f24906.stop();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m20631() {
        if (this.f24918 || !this.f24917) {
            return;
        }
        if (this.f24920) {
            this.f24909 = true;
            return;
        }
        this.f24920 = true;
        this.f24909 = false;
        final int i = this.f24914;
        this.f24922.execute(new Runnable() { // from class: l.ܰ֫֫
            @Override // java.lang.Runnable
            public final void run() {
                C7553.m20627(this.f45075, i);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20627(final C7553 c7553, final int i) {
        Bitmap bitmapM40663;
        int i2;
        final Bitmap bitmap;
        final int i3;
        final boolean z;
        boolean zIsRunning;
        IOException iOException;
        try {
            if (c7553.f24918) {
                bitmapM40663 = null;
                zIsRunning = false;
                i2 = 0;
            } else {
                C17994 c17994 = c7553.f24913;
                if (c17994 != null && (iOException = c17994.f58938) != null) {
                    throw iOException;
                }
                if (c7553.f24906.m40664() != EnumC3141.NO_ERROR) {
                    throw new IOException("GIF frame could not be decoded");
                }
                bitmapM40663 = c7553.f24906.m40663();
                try {
                    if (c7553.f24906.m40660()) {
                        i2 = c7553.f24919 - 1;
                    } else {
                        int iM40659 = c7553.f24906.m40659();
                        int i4 = c7553.f24919;
                        i2 = ((iM40659 + i4) - 1) % i4;
                    }
                    try {
                        zIsRunning = c7553.f24906.isRunning();
                    } catch (IOException | OutOfMemoryError | RuntimeException unused) {
                        if (bitmapM40663 != null) {
                            bitmapM40663.recycle();
                        }
                        c7553.f24906.stop();
                        bitmap = null;
                        i3 = i2;
                        z = false;
                    }
                } catch (IOException | OutOfMemoryError | RuntimeException unused2) {
                    i2 = 0;
                    if (bitmapM40663 != null) {
                        bitmapM40663.recycle();
                    }
                    c7553.f24906.stop();
                    bitmap = null;
                    i3 = i2;
                    z = false;
                    c7553.f24910.post(new Runnable(i, bitmap, i3, z) { // from class: l.᩵֫֫

                        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ boolean f64928;

                        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ Bitmap f64930;

                        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ int f64931;

                        {
                            this.f64928 = z;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C7553.m20628(this.f64929, this.f64931, this.f64930, this.f64928);
                        }
                    });
                }
            }
            z = zIsRunning;
            bitmap = bitmapM40663;
            i3 = i2;
        } catch (IOException | OutOfMemoryError | RuntimeException unused3) {
            bitmapM40663 = null;
        }
        c7553.f24910.post(new Runnable(i, bitmap, i3, z) { // from class: l.᩵֫֫

            /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ boolean f64928;

            /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Bitmap f64930;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f64931;

            {
                this.f64928 = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7553.m20628(this.f64929, this.f64931, this.f64930, this.f64928);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20628(C7553 c7553, int i, Bitmap bitmap, boolean z) {
        c7553.f24920 = false;
        if (c7553.f24918 || !c7553.f24917 || i != c7553.f24914) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            if (c7553.f24918 || !c7553.f24917) {
                return;
            }
            c7553.m20631();
            return;
        }
        if (bitmap == null) {
            c7553.f24917 = false;
            return;
        }
        Bitmap bitmap2 = c7553.f24911;
        c7553.f24911 = bitmap;
        c7553.f24917 = z;
        bitmap2.recycle();
        Runnable runnable = c7553.f24908;
        if (runnable != null) {
            runnable.run();
        }
        if (c7553.f24909) {
            c7553.m20631();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        mo20636(null);
    }

    @Override // l.InterfaceC7663
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20636(final C9153 c9153) {
        synchronized (this) {
            if (this.f24918) {
                return;
            }
            this.f24918 = true;
            Runnable runnable = new Runnable() { // from class: l.᩶֫֫
                @Override // java.lang.Runnable
                public final void run() {
                    C7553.m20629(this.f67083, c9153);
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                this.f24910.post(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20629(final C7553 c7553, final C9153 c9153) {
        c7553.f24921 = false;
        c7553.f24917 = false;
        c7553.f24908 = null;
        c7553.f24911.recycle();
        c7553.f24922.execute(new Runnable() { // from class: l.ۗ֫֫
            @Override // java.lang.Runnable
            public final void run() {
                C7553.m20632(this.f10000, c9153);
            }
        });
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20632(C7553 c7553, C9153 c9153) {
        Handler handler = c7553.f24910;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = c7553.f24922;
        C17994 c17994 = c7553.f24913;
        C17311 c17311 = c7553.f24906;
        try {
            c17311.setCallback(null);
            c17311.m40658();
        } finally {
            if (c17994 != null) {
                c17994.close();
            }
            scheduledThreadPoolExecutor.shutdown();
            handler.post(new RunnableC12027(c7553, c9153, 0));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20633(C7553 c7553, C9153 c9153) {
        c7553.f24912.close();
        if (c9153 != null) {
            c9153.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10535 m20625(BufferedInputStream bufferedInputStream, C4108 c4108) throws IOException {
        long jMax;
        C0095 c0095 = new C0095(bufferedInputStream, c4108);
        byte[] bArr = new byte[13];
        for (int i = 0; i < 13; i++) {
            bArr[i] = (byte) c0095.m1194();
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
                        C6808.f22671.m18989(i6, i7);
                        byte b2 = bArr[10];
                        long j = (b2 & GCMSIVBlockCipher.MASK) != 0 ? 3 << ((b2 & 7) + 1) : 0L;
                        c0095.m1195((int) j);
                        int i8 = 0;
                        long j2 = j;
                        long j3 = 0;
                        long j4 = 0;
                        long j5 = 0;
                        boolean z = false;
                        while (true) {
                            int iM1194 = c0095.m1194();
                            if (iM1194 == 59) {
                                if (i8 == 0) {
                                    throw new IOException("GIF contains no frames");
                                }
                                return new C10535(i6, i7, i8, j4, j3, j2, z);
                            }
                            if (iM1194 == 33) {
                                int iM1195 = c0095.m1194();
                                if (iM1195 != 249) {
                                    long j6 = 0;
                                    while (true) {
                                        int iM1196 = c0095.m1194();
                                        if (iM1196 == 0) {
                                            break;
                                        }
                                        j6 += (long) iM1196;
                                        c0095.m1195(iM1196);
                                    }
                                    if (iM1195 == 254) {
                                        j4 += j6;
                                    }
                                } else {
                                    if (c0095.m1194() != i4) {
                                        throw new IOException("Invalid GIF graphics control");
                                    }
                                    z |= ((c0095.m1194() >> i2) & i5) == i3;
                                    c0095.m1195(i3);
                                    if (c0095.m1194() != 0) {
                                        throw new IOException("Invalid GIF graphics terminator");
                                    }
                                }
                                jMax = j3;
                            } else if (iM1194 == 44) {
                                int iM1197 = c0095.m1196();
                                int iM1198 = c0095.m1196();
                                int iM1199 = c0095.m1196();
                                int iM11910 = c0095.m1196();
                                int iM11911 = c0095.m1194();
                                if (iM1199 <= 0 || iM11910 <= 0 || iM1197 + iM1199 > i6 || iM1198 + iM11910 > i7) {
                                    break;
                                }
                                i8++;
                                long j7 = ((long) iM1199) * ((long) iM11910);
                                if (j7 > j5) {
                                    jMax = Math.max(j3, j5 + j7);
                                    j5 = j7;
                                } else {
                                    jMax = j3;
                                }
                                if ((iM11911 & 128) != 0) {
                                    int i9 = 3 << ((iM11911 & 7) + 1);
                                    j2 += (long) i9;
                                    c0095.m1195(i9);
                                }
                                int iM11912 = c0095.m1194();
                                if (iM11912 < 2 || iM11912 > 8) {
                                    throw new IOException("Invalid GIF code size");
                                }
                                while (true) {
                                    int iM11913 = c0095.m1194();
                                    if (iM11913 != 0) {
                                        c0095.m1195(iM11913);
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
