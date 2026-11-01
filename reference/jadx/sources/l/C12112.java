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

/* JADX INFO: renamed from: l.۫ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB25 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12112 implements InterfaceC5055 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ThreadPoolExecutor f40553;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0116 f40554;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C14329 f40555;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC21989 f40556;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f40557 = new Object();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ThreadPoolExecutor f40558;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ContentObserver f40559;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Context f40560;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Handler f40561;

    public C12112(Context context, C14329 c14329, C0116 c0116) {
        C9535.m24383(context, "Context cannot be null");
        this.f40560 = context.getApplicationContext();
        this.f40555 = c14329;
        this.f40554 = c0116;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30149(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (this.f40557) {
            this.f40558 = threadPoolExecutor;
        }
    }

    @Override // l.InterfaceC5055
    /* JADX INFO: renamed from: ۙ */
    public final void mo14095(AbstractC21989 abstractC21989) {
        synchronized (this.f40557) {
            this.f40556 = abstractC21989;
        }
        m30150();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30150() {
        synchronized (this.f40557) {
            if (this.f40556 == null) {
                return;
            }
            if (this.f40558 == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0385("emojiCompat"));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                this.f40553 = threadPoolExecutor;
                this.f40558 = threadPoolExecutor;
            }
            this.f40558.execute(new Runnable() { // from class: l.ܽۖۙ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52631.m30148();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C5300 m30146() {
        try {
            C0116 c0116 = this.f40554;
            Context context = this.f40560;
            C14329 c14329 = this.f40555;
            c0116.getClass();
            C2477 c2477M4027 = C1066.m4027(context, c14329);
            if (c2477M4027.m7608() != 0) {
                throw new RuntimeException("fetchFonts failed (" + c2477M4027.m7608() + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            C5300[] c5300ArrM7607 = c2477M4027.m7607();
            if (c5300ArrM7607 == null || c5300ArrM7607.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c5300ArrM7607[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m30147() {
        synchronized (this.f40557) {
            this.f40556 = null;
            ContentObserver contentObserver = this.f40559;
            if (contentObserver != null) {
                C0116 c0116 = this.f40554;
                Context context = this.f40560;
                c0116.getClass();
                context.getContentResolver().unregisterContentObserver(contentObserver);
                this.f40559 = null;
            }
            Handler handler = this.f40561;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.f40561 = null;
            ThreadPoolExecutor threadPoolExecutor = this.f40553;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.f40558 = null;
            this.f40553 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30148() {
        synchronized (this.f40557) {
            if (this.f40556 == null) {
                return;
            }
            try {
                C5300 c5300M30146 = m30146();
                int iM14694 = c5300M30146.m14694();
                if (iM14694 == 2) {
                    synchronized (this.f40557) {
                    }
                }
                if (iM14694 != 0) {
                    throw new RuntimeException("fetchFonts result is not OK. (" + iM14694 + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                try {
                    int i = C8684.f29888;
                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                    C0116 c0116 = this.f40554;
                    Context context = this.f40560;
                    c0116.getClass();
                    Typeface typefaceM32723 = C13248.m32723(context, new C5300[]{c5300M30146}, 0);
                    MappedByteBuffer mappedByteBufferM44693 = C19598.m44693(this.f40560, c5300M30146.m14696());
                    if (mappedByteBufferM44693 == null || typefaceM32723 == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    C1527 c1527M5297 = C1527.m5297(typefaceM32723, mappedByteBufferM44693);
                    Trace.endSection();
                    synchronized (this.f40557) {
                        AbstractC21989 abstractC21989 = this.f40556;
                        if (abstractC21989 != null) {
                            abstractC21989.mo34913(c1527M5297);
                        }
                    }
                    m30147();
                } catch (Throwable th) {
                    int i2 = C8684.f29888;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                synchronized (this.f40557) {
                    AbstractC21989 abstractC219810 = this.f40556;
                    if (abstractC219810 != null) {
                        abstractC219810.mo34912(th2);
                    }
                    m30147();
                }
            }
        }
    }
}
