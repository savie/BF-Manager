package l;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ۨۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S2V9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11536 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0951 f38766;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ScheduledThreadPoolExecutor f38767;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f38768 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC16475 f38769;

    public AbstractC11536() {
        C0951 c0951 = new C0951();
        c0951.f3769 = (char) 1;
        this.f38766 = c0951;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13653 m28707(int i) {
        C0951 c0951 = this.f38766;
        if (i < 1 || i > 65535) {
            c0951.f3769 = (char) 1;
        } else {
            c0951.f3769 = (char) i;
        }
        return (C13653) this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4479 m28706() {
        AbstractC16475 abstractC16475 = this.f38769;
        if (abstractC16475 == null) {
            throw new NullPointerException("Source is not set");
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f38767;
        boolean z = this.f38768;
        GifInfoHandle gifInfoHandleMo1681 = abstractC16475.mo1681();
        gifInfoHandleMo1681.m52907(false, this.f38766.f3769);
        return new C4479(gifInfoHandleMo1681, scheduledThreadPoolExecutor, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13653 m28708(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f38767 = scheduledThreadPoolExecutor;
        return (C13653) this;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13653 m28711() {
        this.f38768 = false;
        return (C13653) this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28710(InputStream inputStream) {
        this.f38769 = new C20003(inputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28709(File file) {
        this.f38769 = new C15770(file);
    }
}
