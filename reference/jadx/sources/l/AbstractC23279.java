package l;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.᩹ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S2V9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23279 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ScheduledThreadPoolExecutor f75436;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f75437 = true;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC11101 f75438;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6125 f75439;

    public AbstractC23279() {
        C6125 c6125 = new C6125();
        c6125.f20896 = (char) 1;
        this.f75439 = c6125;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15819 m52392(int i) {
        C6125 c6125 = this.f75439;
        if (i < 1 || i > 65535) {
            c6125.f20896 = (char) 1;
        } else {
            c6125.f20896 = (char) i;
        }
        return (C15819) this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17311 m52394() {
        AbstractC11101 abstractC11101 = this.f75438;
        if (abstractC11101 == null) {
            throw new NullPointerException("Source is not set");
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f75436;
        boolean z = this.f75437;
        GifInfoHandle gifInfoHandleMo15528 = abstractC11101.mo15528();
        gifInfoHandleMo15528.m56804(false, this.f75439.f20896);
        return new C17311(gifInfoHandleMo15528, scheduledThreadPoolExecutor, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15819 m52393(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f75436 = scheduledThreadPoolExecutor;
        return (C15819) this;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15819 m52397() {
        this.f75437 = false;
        return (C15819) this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52396(InputStream inputStream) {
        this.f75438 = new C5136(inputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52395(File file) {
        this.f75438 = new C13581(file);
    }
}
