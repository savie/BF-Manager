package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.᩻ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C25096 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19106 f81156;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5704 f81157;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23056 f81158;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 f81159;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f81160;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0902 f81161;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11713 f81162;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C24132 f81163;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RunnableC2393 f81164;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f81165;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1975 f81166;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public FutureC23690 f81167;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public FutureC23690 f81168;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f81169;

    /* JADX WARN: Type inference failed for: r2v5, types: [l.֫ܰ᩸] */
    public C25096(C7941 c7941, C23056 c23056) {
        this.f81165 = c7941;
        C24132 c24132 = c7941.f26387;
        this.f81163 = c24132;
        C11713 c11713 = c7941.f23993;
        this.f81162 = c11713;
        this.f81160 = c7941.m19934().f30601.mo4294();
        this.f81159 = new FutureC23690();
        this.f81164 = new RunnableC2393(2, this);
        this.f81166 = new InterfaceC16438() { // from class: l.֫ܰ᩸
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                this.f6629.m55947();
            }
        };
        this.f81158 = c23056;
        InterfaceC19106 interfaceC19106M54021 = null;
        if (c7941.f26384 == null && c7941.f26411 == null && ((c11713 == null || !c11713.m29430()) && c24132 != null)) {
            interfaceC19106M54021 = c24132.m54021();
        }
        this.f81156 = interfaceC19106M54021;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55947() {
        if (this.f81169 || this.f81159.isDone()) {
            return;
        }
        this.f81169 = true;
        C21576.m49068(new Runnable() { // from class: l.ۧܰ᩸
            @Override // java.lang.Runnable
            public final void run() {
                C25096 c25096 = this.f37811;
                C11713 c11713 = c25096.f81162;
                C24132 c24132 = c25096.f81163;
                C7941 c7941 = c25096.f81165;
                c25096.f81169 = false;
                FutureC23690 futureC23690 = c25096.f81159;
                if (futureC23690.isDone()) {
                    return;
                }
                try {
                    if (!c7941.f26388 || c24132 == null || c7941.f26387 != c24132 || c7941.f23993 != c11713 || !c25096.f81160.equals(c7941.m19934().f30601.mo4294()) || (c25096.f81156 != null && c24132.m54021() != c25096.f81156)) {
                        throw new CancellationException("Saving owner changed before capture");
                    }
                    FutureC23690 futureC23691 = c25096.f81167;
                    if (futureC23691 != null) {
                        if (!futureC23691.isDone()) {
                            return;
                        } else {
                            c25096.f81167.m52947();
                        }
                    }
                    FutureC23690 futureC23692 = c25096.f81168;
                    if (futureC23692 != null) {
                        if (!futureC23692.isDone()) {
                            return;
                        }
                        if (((C16320) c25096.f81168.m52947()).f52980 != c24132.m54021()) {
                            throw new CancellationException("Saving loaded content was replaced");
                        }
                    }
                    if (c7941.f26384 == null && c7941.f26411 == null) {
                        if (c7941.f26402 != null) {
                            C0902 c0902 = c7941.f26402;
                            C0902 c0903 = c25096.f81161;
                            if (c0902 != c0903) {
                                if (c0903 != null || c25096.f81156 != null) {
                                    throw new CancellationException("Saving preparation was superseded");
                                }
                                C0902 c0904 = c7941.f26402;
                                c25096.f81161 = c0904;
                                FutureC23690 futureC23690M3666 = c0904.m3666();
                                c25096.f81168 = futureC23690M3666;
                                futureC23690M3666.m52931((InterfaceC2017) new C22288(c25096));
                            }
                        }
                        if (c11713.m29430()) {
                            return;
                        }
                        if (c7941.f26381 == null || c7941.f26381.isDone()) {
                            if (c7941.m19927()) {
                                throw new IllegalStateException("Cannot save failed editor content");
                            }
                            if (c25096.f81156 == null) {
                                c25096.f81156 = c24132.m54021();
                            }
                            C5704 c5704M21600 = C7941.m21600(c7941, c25096.f81158);
                            c25096.f81157 = c5704M21600;
                            if (c5704M21600 != null) {
                                c25096.m55945();
                                futureC23690.m52935(c25096.f81157);
                            } else if (c24132.m54094()) {
                                throw new IllegalStateException("Editor content is not available for saving");
                            }
                        }
                    }
                } catch (Throwable th) {
                    c25096.m55946(th);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55946(Throwable th) {
        FutureC23690 futureC23690 = this.f81159;
        if (futureC23690.isDone()) {
            return;
        }
        m55945();
        futureC23690.m52937(th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55945() {
        FutureC23690 futureC23690 = this.f81167;
        if (futureC23690 != null) {
            futureC23690.cancel(false);
        }
        FutureC23690 futureC23691 = this.f81168;
        if (futureC23691 != null) {
            futureC23691.cancel(false);
        }
        C24132 c24132 = this.f81163;
        if (c24132 != null) {
            c24132.m54076(this.f81164);
        }
        C11713 c11713 = this.f81162;
        if (c11713 != null) {
            c11713.m29422(this.f81166);
        }
        C7941 c7941 = this.f81165;
        if (c7941.f26375 == this) {
            c7941.f26375 = null;
        }
    }
}
