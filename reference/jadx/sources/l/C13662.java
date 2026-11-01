package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܰۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes3.dex */
public final class C13662 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Runnable f45049;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f45050;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f45051 = false;

    public C13662(C11545 c11545, Runnable runnable) {
        this.f45050 = c11545;
        this.f45049 = runnable;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m33367() {
        return this.f45051;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m33366() {
        return !this.f45051;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33365() {
        m33364(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33363(C13662 c13662) {
        c13662.m33364(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33364(boolean z) {
        C5563 c5563;
        synchronized (this) {
            if (this.f45051) {
                return;
            }
            this.f45051 = true;
            Runnable runnable = z ? this.f45049 : null;
            this.f45049 = null;
            synchronized (this.f45050.f38805) {
                if (this.f45050.f38805.remove(this)) {
                    boolean zIsEmpty = this.f45050.f38805.isEmpty();
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (zIsEmpty) {
                        C2994 c2994 = this.f45050.f38803;
                        if (c2994.f11240 == null || (c5563 = c2994.f11239) == null || c2994.f11242 == null) {
                            return;
                        }
                        c5563.cancel();
                        c2994.f11242.cancel();
                        C5563 c5564 = c2994.f11241;
                        if (c5564 != null) {
                            c5564.cancel();
                        }
                        if (c2994.f11240.getAlpha() <= 0.07f) {
                            c2994.f11240.setVisibility(4);
                            c2994.f11240 = null;
                            c2994.f11239 = null;
                            c2994.f11242 = null;
                            c2994.f11241 = null;
                            return;
                        }
                        ViewGroup viewGroup = c2994.f11240;
                        C5563 c5563M15349 = C5563.m15349(viewGroup, viewGroup.getAlpha(), 0.0f);
                        c2994.f11238 = c5563M15349;
                        c5563M15349.m5665(new C9346(c2994));
                        c2994.f11238.m35318();
                        c2994.f11239 = null;
                        c2994.f11242 = null;
                        c2994.f11241 = null;
                    }
                }
            }
        }
    }
}
