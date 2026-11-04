package l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.᩹ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes.dex */
public final class C23438 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Executor f75865;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13921 f75866;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f75867;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f75868;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15978 f75869;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C15978 f75870;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f75871;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15978 f75872;

    public C23438() {
        ExecutorService executorService = C5261.f18540;
        C13921 c13921 = new C13921(1);
        this.f75871 = new Object();
        this.f75867 = new ArrayDeque();
        this.f75865 = executorService;
        this.f75866 = c13921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52658(C21750 c21750, int i, C13101 c13101) {
        InterfaceC1278 interfaceC1278;
        synchronized (this.f75871) {
            C15978 c15978 = this.f75869;
            interfaceC1278 = null;
            if (c15978 == null || c15978.f51867 != i || !C17359.equals(c15978.f51872, c21750.m49307())) {
                if (c15978 != null) {
                    boolean z = true;
                    c15978.f51871 = true;
                    c15978.f51874++;
                    InterfaceC1278 interfaceC1279 = c15978.f51863;
                    if (interfaceC1279 == null) {
                        z = false;
                    }
                    c15978.f51863 = null;
                    if (c15978 != this.f75872 && (c15978 == this.f75870 || c15978.f51869 != null || z || !c15978.f51870.isEmpty())) {
                        this.f75867.addLast(c15978);
                    }
                    interfaceC1278 = interfaceC1279;
                }
                this.f75869 = new C15978(c21750, i, c13101);
                if (!this.f75868) {
                    m52650();
                }
            } else {
                c15978.f51865 = c21750;
                c15978.f51873 = c13101;
            }
        }
        if (interfaceC1278 != null) {
            this.f75865.execute(new RunnableC7909(3, interfaceC1278));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52656(int i, int i2) {
        synchronized (this.f75871) {
            C15978 c15978 = this.f75869;
            if (c15978 == null) {
                return;
            }
            c15978.f51875 = new C16724(c15978.f51865, c15978.f51874, c15978.f51873, Math.max(1, i), Math.max(1, i2));
            if (!this.f75868) {
                m52650();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52655() {
        InterfaceC1278 interfaceC1278;
        synchronized (this.f75871) {
            C15978 c15978 = this.f75869;
            interfaceC1278 = null;
            if (c15978 != null) {
                c15978.f51875 = null;
                c15978.f51874++;
                InterfaceC1278 interfaceC1279 = c15978.f51863;
                c15978.f51863 = null;
                interfaceC1278 = interfaceC1279;
            }
        }
        if (interfaceC1278 != null) {
            this.f75865.execute(new RunnableC7909(3, interfaceC1278));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52657(Runnable runnable) {
        synchronized (this.f75871) {
            C15978 c15978 = this.f75869;
            if (c15978 == null) {
                this.f75865.execute(runnable);
                return;
            }
            c15978.f51871 = true;
            c15978.f51870.addLast(runnable);
            c15978.f51875 = null;
            c15978.f51874++;
            InterfaceC1278 interfaceC1278 = c15978.f51863;
            c15978.f51863 = null;
            if (!this.f75868) {
                m52650();
            }
            if (interfaceC1278 != null) {
                this.f75865.execute(new RunnableC7909(3, interfaceC1278));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m52650() {
        final C15978 c15978 = (C15978) this.f75867.pollFirst();
        Executor executor = this.f75865;
        if (c15978 != null) {
            this.f75868 = true;
            this.f75870 = c15978;
            this.f75872 = c15978;
            executor.execute(new Runnable() { // from class: l.ۤۡۚ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34155.m52654(c15978);
                }
            });
            return;
        }
        final C15978 c15979 = this.f75869;
        if (c15979 == null) {
            return;
        }
        if (c15979.f51871) {
            this.f75868 = true;
            this.f75870 = c15979;
            this.f75872 = c15979;
            executor.execute(new Runnable() { // from class: l.᩸ۡۚ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73672.m52654(c15979);
                }
            });
            return;
        }
        final C16724 c16724 = c15979.f51875;
        if (c16724 == null) {
            return;
        }
        c15979.f51875 = null;
        this.f75868 = true;
        this.f75870 = c15979;
        this.f75872 = null;
        executor.execute(new Runnable() { // from class: l.ᩴۡۚ
            @Override // java.lang.Runnable
            public final void run() {
                C23438.m52645(this.f63444, c15979, c16724);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52645(final C23438 c23438, final C15978 c15978, final C16724 c16724) {
        C12995 c12995M52649 = C12995.f41646;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    c12995M52649 = c23438.m52649(c15978, c16724);
                }
            } catch (Throwable th) {
                c23438.m52643(c15978, c16724);
                throw th;
            }
        } catch (Throwable unused) {
            m52651(c15978);
        }
        c23438.m52643(c15978, c16724);
        final Bitmap bitmapM32416 = c12995M52649.m32416();
        final C13298 c13298M32415 = c12995M52649.m32415();
        C21576.m49068(new Runnable() { // from class: l.ܳۡۚ
            @Override // java.lang.Runnable
            public final void run() {
                C23438.m52646(this.f49703, c15978, c16724, bitmapM32416, c13298M32415);
            }
        });
        c23438.m52648(c15978);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52646(C23438 c23438, C15978 c15978, C16724 c16724, Bitmap bitmap, C13298 c13298) {
        synchronized (c23438.f75871) {
            if (c23438.f75869 == c15978 && c15978.f51874 == c16724.m39491() && !c15978.f51871) {
                c16724.m39490().mo9641(c15978.f51867, bitmap);
                if (c13298 != null) {
                    c16724.m39490().mo9642(c15978.f51867, c13298);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52643(C15978 c15978, C16724 c16724) {
        synchronized (this.f75871) {
            if (c15978.f51874 == c16724.m39491()) {
                return;
            }
            m52651(c15978);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C12995 m52649(C15978 c15978, C16724 c16724) throws IOException {
        MediaMetadataRetriever mediaMetadataRetriever;
        C21750 c21750 = (C21750) c16724.m39494();
        C9026 c9026 = null;
        C13298 c13298M7291 = null;
        c9026 = null;
        if (c21750.m49303() == EnumC7029.MPEG_TS) {
            C12995 c12995 = c15978.f51864;
            if (c12995 != null && c15978.f51866 == c16724.m39492() && c15978.f51862 == c16724.m39493()) {
                return c12995;
            }
            InterfaceC1278 interfaceC1278M49306 = ((C21750) c16724.m39494()).m49306();
            C11503 c11503 = new C11503();
            try {
                C1809 c1809M52637 = m52637(c15978, c16724, interfaceC1278M49306, c11503);
                Throwable thM6292 = c1809M52637.m6292(c11503.m28964());
                if (thM6292 != null) {
                    m52647(thM6292);
                    throw null;
                }
                int iM39491 = c16724.m39491();
                synchronized (this.f75871) {
                    if (this.f75869 != c15978 || c15978.f51871 || c15978.f51874 != iM39491) {
                        throw new InterruptedIOException("HLS preview read was canceled");
                    }
                }
                if (c11503.m28964()) {
                    C12995 c12995M52638 = m52638(c15978, c16724, c11503, c1809M52637.f6156);
                    c11503.close();
                    return c12995M52638;
                }
                C12995 c12996 = C12995.f41646;
                c11503.close();
                return c12996;
            } catch (Throwable th) {
                try {
                    c11503.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        int iM39492 = c16724.m39491();
        if (c15978.f51868 == null) {
            try {
                C21946 c21946M49308 = c21750.m49308();
                try {
                    m52642(c15978, c21946M49308, iM39492);
                    c15978.f51868 = C16961.m39975(c21946M49308, c21946M49308.m49655());
                    c21946M49308.close();
                    m52641(c15978);
                } catch (Throwable th3) {
                    try {
                        c21946M49308.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                m52641(c15978);
                throw th5;
            }
        }
        C17707 c17707 = c15978.f51868;
        if (c17707 == null || c17707.m41464() == 0) {
            return C12995.f41646;
        }
        long jM41468 = c17707.m41468() + c21750.m49305();
        int iM41465 = c17707.m41465(jM41468);
        int iM39493 = c16724.m39491();
        C17707 c17708 = c15978.f51868;
        C17359.requireNonNull(c17708);
        long jM41466 = c17708.m41466(iM41465);
        C17470 c17470 = c15978.f51869;
        if (c17470 == null || c17470.f56801 != jM41466) {
            m52651(c15978);
            C21946 c21946M49309 = c21750.m49308();
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            try {
                m52642(c15978, c21946M49309, iM39493);
                long jM49655 = c21946M49309.m49655();
                long jM41467 = c17708.m41467(iM41465);
                mediaMetadataRetriever = mediaMetadataRetriever2;
                try {
                    C9026 c9027 = new C9026(c21946M49309, jM49655, jM41466, jM41467);
                    try {
                        mediaMetadataRetriever.setDataSource(c9027);
                        C17470 c17471 = new C17470(jM41466, mediaMetadataRetriever, c9027, c21946M49309);
                        c15978.f51869 = c17471;
                        m52641(c15978);
                        c17470 = c17471;
                    } catch (Throwable th6) {
                        th = th6;
                        c9026 = c9027;
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused) {
                        }
                        try {
                            C20244.m46520(c9026);
                            if (c9026 == null) {
                                C20244.m46520(c21946M49309);
                            }
                            if (th instanceof IOException) {
                                throw th;
                            }
                            throw new IOException("Failed to open HLS preview fragment", th);
                        } catch (Throwable th7) {
                            m52641(c15978);
                            throw th7;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Throwable th9) {
                th = th9;
                mediaMetadataRetriever = mediaMetadataRetriever2;
            }
        }
        int iM39494 = c16724.m39492();
        int iM39495 = c16724.m39493();
        int iM39496 = c16724.m39491();
        InterfaceC1278 interfaceC1278 = c17470.f56800;
        MediaMetadataRetriever mediaMetadataRetriever3 = c17470.f56799;
        m52642(c15978, interfaceC1278, iM39496);
        try {
            Bitmap bitmapM52634 = m52634(mediaMetadataRetriever3, jM41468, iM39494, iM39495);
            try {
                int i = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(18));
                int i2 = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(19));
                String strExtractMetadata = mediaMetadataRetriever3.extractMetadata(24);
                c13298M7291 = C2112.m7291(i, i2, strExtractMetadata == null ? 0 : Integer.parseInt(strExtractMetadata), 1.0f);
            } catch (RuntimeException unused2) {
            }
            return new C12995(bitmapM52634, c13298M7291);
        } finally {
            m52641(c15978);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1809 m52637(C15978 c15978, C16724 c16724, InterfaceC1278 interfaceC1278, C11503 c11503) {
        C10797 c10797;
        C5538 c5538;
        C1809 c1809 = new C1809();
        C5538 c5539 = null;
        e = null;
        c5539 = null;
        try {
            try {
                m52642(c15978, interfaceC1278, c16724.m39491());
                if (((C25061) interfaceC1278).length() > 0) {
                    c10797 = new C10797(interfaceC1278);
                    try {
                        this.f75866.getClass();
                        c5538 = new C5538();
                    } catch (Throwable th) {
                        try {
                            c1809.f6157 = th;
                            c5538 = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    try {
                        if (c1809.f6157 == null) {
                            try {
                                c5538.m16450(c10797);
                            } catch (Throwable th3) {
                                e = th3;
                            }
                            try {
                                c10797.m27504();
                                IOException iOException = (IOException) m52636(e, IOException.class);
                                if (iOException != null) {
                                    e = iOException;
                                }
                            } catch (IOException e) {
                                e = e;
                            }
                            if (e != null) {
                                c1809.m6293(e);
                            } else {
                                int iM39491 = c16724.m39491();
                                synchronized (this.f75871) {
                                    if (this.f75869 != c15978 || c15978.f51871 || c15978.f51874 != iM39491) {
                                        throw new InterruptedIOException("HLS preview read was canceled");
                                    }
                                }
                                m52640(c5538, c10797, c11503, c1809, c16724.m39492(), c16724.m39493());
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c5539 = c5538;
                        c1809.m6293(th);
                        c5538 = c5539;
                    }
                    m52639(c5538, c10797, interfaceC1278, c1809);
                    return c1809;
                }
                m52639((C5538) null, (C10797) null, interfaceC1278, c1809);
                m52641(c15978);
                return c1809;
            } catch (Throwable th5) {
                th = th5;
                c10797 = null;
            }
            c1809.m6293(th);
            c5538 = c5539;
            m52639(c5538, c10797, interfaceC1278, c1809);
            return c1809;
        } finally {
            m52639(c5539, c10797, interfaceC1278, c1809);
            m52641(c15978);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52640(C5538 c5538, C10797 c10797, C11503 c11503, C1809 c1809, int i, int i2) {
        IOException e;
        Bitmap bitmapM16448;
        try {
            bitmapM16448 = c5538.m16448(i, i2);
            e = null;
        } catch (Throwable th) {
            e = th;
            bitmapM16448 = null;
        }
        if (bitmapM16448 != null) {
            c11503.m28963(bitmapM16448);
        }
        try {
            c10797.m27504();
            IOException iOException = (IOException) m52636(e, IOException.class);
            if (iOException != null) {
                e = iOException;
            }
        } catch (IOException e2) {
            e = e2;
        }
        if (e != null) {
            c1809.m6293(e);
            return;
        }
        if (c11503.m28964()) {
            int i3 = Integer.parseInt(c5538.m16449(18));
            int i4 = Integer.parseInt(c5538.m16449(19));
            String strM16449 = c5538.m16449(24);
            c1809.f6156 = C2112.m7291(i3, i4, strM16449 == null ? 0 : Integer.parseInt(strM16449), 1.0f);
            e = null;
            try {
                c10797.m27504();
                IOException iOException2 = (IOException) m52636(e, IOException.class);
                if (iOException2 != null) {
                    e = iOException2;
                }
            } catch (IOException e3) {
                e = e3;
            }
            if (e == null) {
                return;
            }
            if (m52636(e, InterruptedIOException.class) != null || m52636(e, C10517.class) != null || m52636(e, Error.class) != null) {
                c1809.m6293(e);
            } else {
                c1809.f6156 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52639(C5538 c5538, C10797 c10797, InterfaceC1278 interfaceC1278, C1809 c1809) {
        ArrayList arrayList = c1809.f6158;
        if (c5538 != null) {
            try {
                c5538.close();
            } catch (Throwable th) {
                arrayList.add(th);
            }
        }
        if (c10797 != null) {
            try {
                c10797.close();
                return;
            } catch (Throwable th2) {
                arrayList.add(th2);
                return;
            }
        }
        try {
            ((C25061) interfaceC1278).close();
        } catch (Throwable th3) {
            arrayList.add(th3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52642(C15978 c15978, InterfaceC1278 interfaceC1278, int i) {
        synchronized (this.f75871) {
            if (this.f75869 != c15978 || c15978.f51871 || c15978.f51874 != i) {
                throw new InterruptedIOException("HLS preview read was canceled");
            }
            c15978.f51863 = interfaceC1278;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52641(C15978 c15978) {
        synchronized (this.f75871) {
            c15978.f51863 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m52654(C15978 c15978) {
        ArrayList arrayList;
        m52651(c15978);
        synchronized (this.f75871) {
            arrayList = new ArrayList(c15978.f51870);
            c15978.f51870.clear();
            if (this.f75869 == c15978) {
                this.f75869 = null;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException unused) {
            }
        }
        m52648(c15978);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m52648(C15978 c15978) {
        synchronized (this.f75871) {
            if (this.f75870 == c15978) {
                this.f75870 = null;
            }
            if (this.f75872 == c15978) {
                this.f75872 = null;
            }
            this.f75868 = false;
            m52650();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m52651(C15978 c15978) {
        C17470 c17470 = c15978.f51869;
        c15978.f51869 = null;
        if (c17470 != null) {
            try {
                c17470.f56799.release();
            } catch (Throwable unused) {
            }
            C20244.m46520(c17470.f56798);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m52634(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 27) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j, 2, i, i2);
        }
        return m52633(mediaMetadataRetriever.getFrameAtTime(j, 2), i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m52633(Bitmap bitmap, int i, int i2) {
        if (bitmap == null || (bitmap.getWidth() <= i && bitmap.getHeight() <= i2)) {
            return bitmap;
        }
        float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, Math.round(bitmap.getWidth() * fMin)), Math.max(1, Math.round(bitmap.getHeight() * fMin)), true);
            if (bitmapCreateScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            return bitmapCreateScaledBitmap;
        } catch (Throwable th) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12995 m52638(C15978 c15978, C16724 c16724, C11503 c11503, C13298 c13298) {
        C12995 c12995;
        synchronized (this.f75871) {
            int iM39491 = c16724.m39491();
            if (this.f75869 == c15978 && !c15978.f51871 && c15978.f51874 == iM39491) {
                c12995 = new C12995(c11503.take(), c13298);
                c15978.f51864 = c12995;
                c15978.f51866 = c16724.m39492();
                c15978.f51862 = c16724.m39493();
            } else {
                throw new InterruptedIOException("HLS preview read was canceled");
            }
        }
        return c12995;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m52653(Throwable th) {
        return (m52636(th, InterruptedIOException.class) == null && m52636(th, C10517.class) == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Throwable m52636(Throwable th, Class cls) {
        while (th != null) {
            if (cls.isInstance(th)) {
                return (Throwable) cls.cast(th);
            }
            Throwable cause = th.getCause();
            if (cause == th) {
                return null;
            }
            th = cause;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m52647(Throwable th) throws IOException {
        Error error = (Error) m52636(th, Error.class);
        if (error != null) {
            throw error;
        }
        IOException iOException = (IOException) m52636(th, IOException.class);
        if (iOException != null) {
            throw iOException;
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        throw new IOException("Failed to load HLS MPEG-TS preview frame", th);
    }
}
