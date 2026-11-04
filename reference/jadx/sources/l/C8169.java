package l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Trace;
import com.google.android.material.motion.MotionUtils;
import java.nio.MappedByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۟᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB25 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8169 implements InterfaceC15626 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21701 f26941;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC13389 f26942;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ContentObserver f26943;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ThreadPoolExecutor f26944;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ThreadPoolExecutor f26945;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Handler f26946;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f26947 = new Object();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Context f26948;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18610 f26949;

    public C8169(Context context, C21701 c21701, C18610 c18610) {
        C11293.m28552(context, "Context cannot be null");
        this.f26948 = context.getApplicationContext();
        this.f26941 = c21701;
        this.f26949 = c18610;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22080(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (this.f26947) {
            this.f26944 = threadPoolExecutor;
        }
    }

    @Override // l.InterfaceC15626
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22081(AbstractC13389 abstractC13389) {
        synchronized (this.f26947) {
            this.f26942 = abstractC13389;
        }
        m22082();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22082() {
        synchronized (this.f26947) {
            if (this.f26942 == null) {
                return;
            }
            if (this.f26944 == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC18259("emojiCompat"));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                this.f26945 = threadPoolExecutor;
                this.f26944 = threadPoolExecutor;
            }
            this.f26944.execute(new Runnable() { // from class: l.֡᩸ۙ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2629.m22079();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C11258 m22078() {
        try {
            C18610 c18610 = this.f26949;
            Context context = this.f26948;
            C21701 c21701 = this.f26941;
            c18610.getClass();
            C1564 c1564M39107 = C16479.m39107(context, c21701);
            if (c1564M39107.m5523() != 0) {
                throw new RuntimeException("fetchFonts failed (" + c1564M39107.m5523() + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            C11258[] c11258ArrM5522 = c1564M39107.m5522();
            if (c11258ArrM5522 == null || c11258ArrM5522.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c11258ArrM5522[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m22077() {
        synchronized (this.f26947) {
            this.f26942 = null;
            ContentObserver contentObserver = this.f26943;
            if (contentObserver != null) {
                C18610 c18610 = this.f26949;
                Context context = this.f26948;
                c18610.getClass();
                context.getContentResolver().unregisterContentObserver(contentObserver);
                this.f26943 = null;
            }
            Handler handler = this.f26946;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.f26946 = null;
            ThreadPoolExecutor threadPoolExecutor = this.f26945;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.f26944 = null;
            this.f26945 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22079() {
        synchronized (this.f26947) {
            if (this.f26942 == null) {
                return;
            }
            try {
                C11258 c11258M22078 = m22078();
                int iM28498 = c11258M22078.m28498();
                if (iM28498 == 2) {
                    synchronized (this.f26947) {
                    }
                }
                if (iM28498 != 0) {
                    throw new RuntimeException("fetchFonts result is not OK. (" + iM28498 + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                try {
                    int i = C21217.f67711;
                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                    C18610 c18610 = this.f26949;
                    Context context = this.f26948;
                    c18610.getClass();
                    Typeface typefaceM41562 = C17750.m41562(context, new C11258[]{c11258M22078}, 0);
                    MappedByteBuffer mappedByteBufferM35534 = C14766.m35534(this.f26948, c11258M22078.m28499());
                    if (mappedByteBufferM35534 == null || typefaceM41562 == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    C8914 c8914M23825 = C8914.m23825(typefaceM41562, mappedByteBufferM35534);
                    Trace.endSection();
                    synchronized (this.f26947) {
                        AbstractC13389 abstractC13389 = this.f26942;
                        if (abstractC13389 != null) {
                            abstractC13389.mo8715(c8914M23825);
                        }
                    }
                    m22077();
                } catch (Throwable th) {
                    int i2 = C21217.f67711;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                synchronized (this.f26947) {
                    AbstractC13389 abstractC133810 = this.f26942;
                    if (abstractC133810 != null) {
                        abstractC133810.mo8714(th2);
                    }
                    m22077();
                }
            }
        }
    }
}
