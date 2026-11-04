package l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.۟۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B6NL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7919 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11555 f26296;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f26297;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f26298;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C13511 f26299;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f26300;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Runnable f26301;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f26302;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C24132 f26303;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Handler f26304;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f26305;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f26306;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f26307;

    public C7919(C24132 c24132, AbstractActivityC17204 abstractActivityC17204, int i, BooleanSupplier booleanSupplier) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f26304 = handler;
        RunnableC0461 runnableC0461 = new RunnableC0461(this);
        this.f26301 = runnableC0461;
        this.f26303 = c24132;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        this.f26300 = interfaceC19106M54021;
        this.f26307 = interfaceC19106M54021.mo15344();
        this.f26302 = c24132.f78049;
        this.f26296 = C11555.m29069(c24132);
        this.f26298 = booleanSupplier;
        C13511 c13511 = abstractActivityC17204 == null ? null : new C13511(abstractActivityC17204, i);
        this.f26299 = c13511;
        if (c13511 != null) {
            c13511.m33188(new RunnableC15052(3, this));
            handler.postDelayed(new RunnableC22358(2, this), 300L);
        }
        handler.postDelayed(runnableC0461, 200L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21459(C7919 c7919) {
        if (c7919.f26306 || !c7919.m21464()) {
            return;
        }
        c7919.f26299.m33192();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m21464() {
        if (this.f26297 || !this.f26296.m29071()) {
            return false;
        }
        InterfaceC19106 interfaceC19106M54021 = this.f26303.m54021();
        InterfaceC19106 interfaceC19106 = this.f26300;
        return interfaceC19106M54021 == interfaceC19106 && interfaceC19106.mo15344() == this.f26307 && this.f26303.f78049 == this.f26302 && this.f26298.getAsBoolean();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m21467() {
        if (this.f26297 || !this.f26296.m29071()) {
            return false;
        }
        return this.f26305 || m21464();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m21465() {
        return this.f26297;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m21468() {
        if (this.f26297 || Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Editor search canceled");
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m21463() {
        if (this.f26305) {
            return;
        }
        this.f26297 = true;
        m21466();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21462() {
        if (!m21464()) {
            return false;
        }
        this.f26305 = true;
        m21466();
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m21466() {
        this.f26306 = true;
        this.f26304.removeCallbacksAndMessages(null);
        C13511 c13511 = this.f26299;
        if (c13511 != null) {
            c13511.m33185();
        }
    }
}
