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

/* JADX INFO: renamed from: l.ܽۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes4.dex */
public final class C16540 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f53123;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C0311 f53124;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Executor f53125;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C0311 f53126;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f53127;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C0219 f53128;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f53129;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C0311 f53130;

    public C16540() {
        ExecutorService executorService = C4716.f16636;
        C0219 c0219 = new C0219();
        this.f53129 = new Object();
        this.f53127 = new ArrayDeque();
        this.f53125 = executorService;
        this.f53128 = c0219;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38942(C15170 c15170, int i, C11662 c11662) {
        InterfaceC3153 interfaceC3153;
        synchronized (this.f53129) {
            C0311 c0311 = this.f53130;
            interfaceC3153 = null;
            if (c0311 == null || c0311.f1661 != i || !C13638.equals(c0311.f1665, c15170.m36393())) {
                if (c0311 != null) {
                    boolean z = true;
                    c0311.f1672 = true;
                    c0311.f1662++;
                    InterfaceC3153 interfaceC3154 = c0311.f1664;
                    if (interfaceC3154 == null) {
                        z = false;
                    }
                    c0311.f1664 = null;
                    if (c0311 != this.f53124 && (c0311 == this.f53126 || c0311.f1671 != null || z || !c0311.f1670.isEmpty())) {
                        this.f53127.addLast(c0311);
                    }
                    interfaceC3153 = interfaceC3154;
                }
                this.f53130 = new C0311(c15170, i, c11662);
                if (!this.f53123) {
                    m38935();
                }
            } else {
                c0311.f1667 = c15170;
                c0311.f1669 = c11662;
            }
        }
        if (interfaceC3153 != null) {
            this.f53125.execute(new RunnableC18656(interfaceC3153));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38940(int i, int i2) {
        synchronized (this.f53129) {
            C0311 c0311 = this.f53130;
            if (c0311 == null) {
                return;
            }
            c0311.f1674 = new C15835(c0311.f1667, c0311.f1662, c0311.f1669, Math.max(1, i), Math.max(1, i2));
            if (!this.f53123) {
                m38935();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38939() {
        InterfaceC3153 interfaceC3153;
        synchronized (this.f53129) {
            C0311 c0311 = this.f53130;
            interfaceC3153 = null;
            if (c0311 != null) {
                c0311.f1674 = null;
                c0311.f1662++;
                InterfaceC3153 interfaceC3154 = c0311.f1664;
                c0311.f1664 = null;
                interfaceC3153 = interfaceC3154;
            }
        }
        if (interfaceC3153 != null) {
            this.f53125.execute(new RunnableC18656(interfaceC3153));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38941(Runnable runnable) {
        synchronized (this.f53129) {
            C0311 c0311 = this.f53130;
            if (c0311 == null) {
                this.f53125.execute(runnable);
                return;
            }
            c0311.f1672 = true;
            c0311.f1670.addLast(runnable);
            c0311.f1674 = null;
            c0311.f1662++;
            InterfaceC3153 interfaceC3153 = c0311.f1664;
            c0311.f1664 = null;
            if (!this.f53123) {
                m38935();
            }
            if (interfaceC3153 != null) {
                this.f53125.execute(new RunnableC18656(interfaceC3153));
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m38935() {
        final C0311 c0311 = (C0311) this.f53127.pollFirst();
        Executor executor = this.f53125;
        if (c0311 != null) {
            this.f53123 = true;
            this.f53126 = c0311;
            this.f53124 = c0311;
            executor.execute(new Runnable() { // from class: l.ܶۡ۬
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49420.m38917(c0311);
                }
            });
            return;
        }
        final C0311 c0312 = this.f53130;
        if (c0312 == null) {
            return;
        }
        if (c0312.f1672) {
            this.f53123 = true;
            this.f53126 = c0312;
            this.f53124 = c0312;
            executor.execute(new Runnable() { // from class: l.᩸ۡ۬
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69791.m38917(c0312);
                }
            });
            return;
        }
        final C15835 c15835 = c0312.f1674;
        if (c15835 == null) {
            return;
        }
        c0312.f1674 = null;
        this.f53123 = true;
        this.f53126 = c0312;
        this.f53124 = null;
        executor.execute(new Runnable() { // from class: l.ᩳۡ۬
            @Override // java.lang.Runnable
            public final void run() {
                C16540.m38930(this.f57408, c0312, c15835);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38930(final C16540 c16540, final C0311 c0311, final C15835 c15835) {
        C19362 c19362M38934 = C19362.f62415;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    c19362M38934 = c16540.m38934(c0311, c15835);
                }
            } catch (Throwable th) {
                c16540.m38926(c0311, c15835);
                throw th;
            }
        } catch (Throwable unused) {
            m38936(c0311);
        }
        c16540.m38926(c0311, c15835);
        final Bitmap bitmapM44382 = c19362M38934.m44382();
        final C9587 c9587M44381 = c19362M38934.m44381();
        C16737.m39273(new Runnable() { // from class: l.۠ۡ۬
            @Override // java.lang.Runnable
            public final void run() {
                C16540.m38931(this.f28289, c0311, c15835, bitmapM44382, c9587M44381);
            }
        });
        c16540.m38933(c0311);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38931(C16540 c16540, C0311 c0311, C15835 c15835, Bitmap bitmap, C9587 c9587) {
        synchronized (c16540.f53129) {
            if (c16540.f53130 == c0311 && c0311.f1662 == c15835.m37644() && !c0311.f1672) {
                c15835.m37645().mo12748(c0311.f1661, bitmap);
                if (c9587 != null) {
                    c15835.m37645().mo12749(c0311.f1661, c9587);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38926(C0311 c0311, C15835 c15835) {
        synchronized (this.f53129) {
            if (c0311.f1662 == c15835.m37644()) {
                return;
            }
            m38936(c0311);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C19362 m38934(C0311 c0311, C15835 c15835) throws IOException {
        MediaMetadataRetriever mediaMetadataRetriever;
        C15170 c15170 = (C15170) c15835.m37646();
        C5250 c5250 = null;
        C9587 c9587M13303 = null;
        c5250 = null;
        if (c15170.m36389() == EnumC3879.MPEG_TS) {
            C19362 c19362 = c0311.f1668;
            if (c19362 != null && c0311.f1666 == c15835.m37643() && c0311.f1663 == c15835.m37647()) {
                return c19362;
            }
            InterfaceC3153 interfaceC3153M36391 = ((C15170) c15835.m37646()).m36391();
            C7367 c7367 = new C7367();
            try {
                C10190 c10190M38922 = m38922(c0311, c15835, interfaceC3153M36391, c7367);
                Throwable thM25964 = c10190M38922.m25964(c7367.m19634());
                if (thM25964 != null) {
                    m38932(thM25964);
                    throw null;
                }
                int iM37644 = c15835.m37644();
                synchronized (this.f53129) {
                    if (this.f53130 != c0311 || c0311.f1672 || c0311.f1662 != iM37644) {
                        throw new InterruptedIOException("HLS preview read was canceled");
                    }
                }
                if (c7367.m19634()) {
                    C19362 c19362M38923 = m38923(c0311, c15835, c7367, c10190M38922.f34816);
                    c7367.close();
                    return c19362M38923;
                }
                C19362 c19363 = C19362.f62415;
                c7367.close();
                return c19363;
            } catch (Throwable th) {
                try {
                    c7367.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        int iM37645 = c15835.m37644();
        if (c0311.f1673 == null) {
            try {
                C22890 c22890M36388 = c15170.m36388();
                try {
                    m38925(c0311, c22890M36388, iM37645);
                    c0311.f1673 = C19195.m44065(c22890M36388, c22890M36388.m50650());
                    c22890M36388.close();
                    m38924(c0311);
                } catch (Throwable th3) {
                    try {
                        c22890M36388.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                m38924(c0311);
                throw th5;
            }
        }
        C8612 c8612 = c0311.f1673;
        if (c8612 == null || c8612.m22386() == 0) {
            return C19362.f62415;
        }
        long jM22390 = c8612.m22390() + c15170.m36392();
        int iM22387 = c8612.m22387(jM22390);
        int iM37646 = c15835.m37644();
        C8612 c8613 = c0311.f1673;
        C13638.requireNonNull(c8613);
        long jM22388 = c8613.m22388(iM22387);
        C20068 c20068 = c0311.f1671;
        if (c20068 == null || c20068.f64219 != jM22388) {
            m38936(c0311);
            C22890 c22890M36389 = c15170.m36388();
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            try {
                m38925(c0311, c22890M36389, iM37646);
                long jM50650 = c22890M36389.m50650();
                long jM22389 = c8613.m22389(iM22387);
                mediaMetadataRetriever = mediaMetadataRetriever2;
                try {
                    C5250 c5251 = new C5250(c22890M36389, jM50650, jM22388, jM22389);
                    try {
                        mediaMetadataRetriever.setDataSource(c5251);
                        C20068 c20069 = new C20068(jM22388, mediaMetadataRetriever, c5251, c22890M36389);
                        c0311.f1671 = c20069;
                        m38924(c0311);
                        c20068 = c20069;
                    } catch (Throwable th6) {
                        th = th6;
                        c5250 = c5251;
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused) {
                        }
                        try {
                            C19431.m44468(c5250);
                            if (c5250 == null) {
                                C19431.m44468(c22890M36389);
                            }
                            if (th instanceof IOException) {
                                throw th;
                            }
                            throw new IOException("Failed to open HLS preview fragment", th);
                        } catch (Throwable th7) {
                            m38924(c0311);
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
        int iM37643 = c15835.m37643();
        int iM37647 = c15835.m37647();
        int iM37648 = c15835.m37644();
        InterfaceC3153 interfaceC3153 = c20068.f64222;
        MediaMetadataRetriever mediaMetadataRetriever3 = c20068.f64221;
        m38925(c0311, interfaceC3153, iM37648);
        try {
            Bitmap bitmapM38919 = m38919(mediaMetadataRetriever3, jM22390, iM37643, iM37647);
            try {
                int i = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(18));
                int i2 = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(19));
                String strExtractMetadata = mediaMetadataRetriever3.extractMetadata(24);
                c9587M13303 = C4791.m13303(i, i2, strExtractMetadata == null ? 0 : Integer.parseInt(strExtractMetadata), 1.0f);
            } catch (RuntimeException unused2) {
            }
            return new C19362(bitmapM38919, c9587M13303);
        } finally {
            m38924(c0311);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C10190 m38922(C0311 c0311, C15835 c15835, InterfaceC3153 interfaceC3153, C7367 c7367) {
        C23347 c23347;
        C8779 c8779;
        C10190 c10190 = new C10190();
        C8779 c87710 = null;
        e = null;
        c87710 = null;
        try {
            try {
                m38925(c0311, interfaceC3153, c15835.m37644());
                if (((C5456) interfaceC3153).length() > 0) {
                    c23347 = new C23347(interfaceC3153);
                    try {
                        this.f53128.getClass();
                        c8779 = new C8779();
                    } catch (Throwable th) {
                        try {
                            c10190.f34817 = th;
                            c8779 = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    try {
                        if (c10190.f34817 == null) {
                            try {
                                c8779.m22852(c23347);
                            } catch (Throwable th3) {
                                e = th3;
                            }
                            try {
                                c23347.m51469();
                                IOException iOException = (IOException) m38921(e, IOException.class);
                                if (iOException != null) {
                                    e = iOException;
                                }
                            } catch (IOException e) {
                                e = e;
                            }
                            if (e != null) {
                                c10190.m25965(e);
                            } else {
                                int iM37644 = c15835.m37644();
                                synchronized (this.f53129) {
                                    if (this.f53130 != c0311 || c0311.f1672 || c0311.f1662 != iM37644) {
                                        throw new InterruptedIOException("HLS preview read was canceled");
                                    }
                                }
                                m38928(c8779, c23347, c7367, c10190, c15835.m37643(), c15835.m37647());
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c87710 = c8779;
                        c10190.m25965(th);
                        c8779 = c87710;
                    }
                    m38927(c8779, c23347, interfaceC3153, c10190);
                    return c10190;
                }
                m38927((C8779) null, (C23347) null, interfaceC3153, c10190);
                m38924(c0311);
                return c10190;
            } catch (Throwable th5) {
                th = th5;
                c23347 = null;
            }
            c10190.m25965(th);
            c8779 = c87710;
            m38927(c8779, c23347, interfaceC3153, c10190);
            return c10190;
        } finally {
            m38927(c87710, c23347, interfaceC3153, c10190);
            m38924(c0311);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38928(C8779 c8779, C23347 c23347, C7367 c7367, C10190 c10190, int i, int i2) {
        IOException e;
        Bitmap bitmapM22850;
        try {
            bitmapM22850 = c8779.m22850(i, i2);
            e = null;
        } catch (Throwable th) {
            e = th;
            bitmapM22850 = null;
        }
        if (bitmapM22850 != null) {
            c7367.m19633(bitmapM22850);
        }
        try {
            c23347.m51469();
            IOException iOException = (IOException) m38921(e, IOException.class);
            if (iOException != null) {
                e = iOException;
            }
        } catch (IOException e2) {
            e = e2;
        }
        if (e != null) {
            c10190.m25965(e);
            return;
        }
        if (c7367.m19634()) {
            int i3 = Integer.parseInt(c8779.m22851(18));
            int i4 = Integer.parseInt(c8779.m22851(19));
            String strM22851 = c8779.m22851(24);
            c10190.f34816 = C4791.m13303(i3, i4, strM22851 == null ? 0 : Integer.parseInt(strM22851), 1.0f);
            e = null;
            try {
                c23347.m51469();
                IOException iOException2 = (IOException) m38921(e, IOException.class);
                if (iOException2 != null) {
                    e = iOException2;
                }
            } catch (IOException e3) {
                e = e3;
            }
            if (e == null) {
                return;
            }
            if (m38921(e, InterruptedIOException.class) != null || m38921(e, C18260.class) != null || m38921(e, Error.class) != null) {
                c10190.m25965(e);
            } else {
                c10190.f34816 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38927(C8779 c8779, C23347 c23347, InterfaceC3153 interfaceC3153, C10190 c10190) {
        ArrayList arrayList = c10190.f34818;
        if (c8779 != null) {
            try {
                c8779.close();
            } catch (Throwable th) {
                arrayList.add(th);
            }
        }
        if (c23347 != null) {
            try {
                c23347.close();
                return;
            } catch (Throwable th2) {
                arrayList.add(th2);
                return;
            }
        }
        try {
            ((C5456) interfaceC3153).close();
        } catch (Throwable th3) {
            arrayList.add(th3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38925(C0311 c0311, InterfaceC3153 interfaceC3153, int i) {
        synchronized (this.f53129) {
            if (this.f53130 != c0311 || c0311.f1672 || c0311.f1662 != i) {
                throw new InterruptedIOException("HLS preview read was canceled");
            }
            c0311.f1664 = interfaceC3153;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38924(C0311 c0311) {
        synchronized (this.f53129) {
            c0311.f1664 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m38917(C0311 c0311) {
        ArrayList arrayList;
        m38936(c0311);
        synchronized (this.f53129) {
            arrayList = new ArrayList(c0311.f1670);
            c0311.f1670.clear();
            if (this.f53130 == c0311) {
                this.f53130 = null;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException unused) {
            }
        }
        m38933(c0311);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m38933(C0311 c0311) {
        synchronized (this.f53129) {
            if (this.f53126 == c0311) {
                this.f53126 = null;
            }
            if (this.f53124 == c0311) {
                this.f53124 = null;
            }
            this.f53123 = false;
            m38935();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m38936(C0311 c0311) {
        C20068 c20068 = c0311.f1671;
        c0311.f1671 = null;
        if (c20068 != null) {
            try {
                c20068.f64221.release();
            } catch (Throwable unused) {
            }
            C19431.m44468(c20068.f64220);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m38919(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 27) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j, 2, i, i2);
        }
        return m38918(mediaMetadataRetriever.getFrameAtTime(j, 2), i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m38918(Bitmap bitmap, int i, int i2) {
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
    private C19362 m38923(C0311 c0311, C15835 c15835, C7367 c7367, C9587 c9587) {
        C19362 c19362;
        synchronized (this.f53129) {
            int iM37644 = c15835.m37644();
            if (this.f53130 == c0311 && !c0311.f1672 && c0311.f1662 == iM37644) {
                c19362 = new C19362(c7367.take(), c9587);
                c0311.f1668 = c19362;
                c0311.f1666 = c15835.m37643();
                c0311.f1663 = c15835.m37647();
            } else {
                throw new InterruptedIOException("HLS preview read was canceled");
            }
        }
        return c19362;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m38938(Throwable th) {
        return (m38921(th, InterruptedIOException.class) == null && m38921(th, C18260.class) == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Throwable m38921(Throwable th, Class cls) {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m38932(Throwable th) throws IOException {
        Error error = (Error) m38921(th, Error.class);
        if (error != null) {
            throw error;
        }
        IOException iOException = (IOException) m38921(th, IOException.class);
        if (iOException != null) {
            throw iOException;
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        throw new IOException("Failed to load HLS MPEG-TS preview frame", th);
    }
}
