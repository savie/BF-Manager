package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۖۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes2.dex */
public final class C2648 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Runnable f8458;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f8459;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f8460 = false;

    public C2648(C8614 c8614, Runnable runnable) {
        this.f8459 = c8614;
        this.f8458 = runnable;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m8779() {
        return this.f8460;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m8778() {
        return !this.f8460;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8777() {
        m8776(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8775(C2648 c2648) {
        c2648.m8776(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8776(boolean z) {
        C12060 c12060;
        synchronized (this) {
            if (this.f8460) {
                return;
            }
            this.f8460 = true;
            Runnable runnable = z ? this.f8458 : null;
            this.f8458 = null;
            synchronized (this.f8459.f28143) {
                if (this.f8459.f28143.remove(this)) {
                    boolean zIsEmpty = this.f8459.f28143.isEmpty();
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (zIsEmpty) {
                        C10105 c10105 = this.f8459.f28154;
                        if (c10105.f32375 != null && (c12060 = c10105.f32371) != null && c10105.f32376 != null) {
                            c12060.cancel();
                            c10105.f32376.cancel();
                            C12060 c12061 = c10105.f32372;
                            if (c12061 != null) {
                                c12061.cancel();
                            }
                            if (c10105.f32375.getAlpha() <= 0.07f) {
                                c10105.f32375.setVisibility(4);
                                c10105.f32375 = null;
                                c10105.f32371 = null;
                                c10105.f32376 = null;
                                c10105.f32372 = null;
                            } else {
                                ViewGroup viewGroup = c10105.f32375;
                                C12060 c12060M30238 = C12060.m30238(viewGroup, viewGroup.getAlpha(), 0.0f);
                                c10105.f32377 = c12060M30238;
                                c12060M30238.m55250(new C19056(c10105));
                                c10105.f32377.m28879();
                                c10105.f32371 = null;
                                c10105.f32376 = null;
                                c10105.f32372 = null;
                            }
                        }
                        final C8614 c8614 = this.f8459;
                        C21576.m49068(new Runnable() { // from class: l.֨ۨܳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                c8614.m23159();
                            }
                        });
                    }
                }
            }
        }
    }
}
