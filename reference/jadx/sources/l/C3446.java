package l;

/* JADX INFO: renamed from: l.ۗ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes3.dex */
public final class C3446 extends C4660 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22664 f11236;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12395 f11237;

    public C3446(C12395 c12395, AbstractC22664 abstractC22664) {
        this.f11237 = c12395;
        this.f11236 = abstractC22664;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1510(C11018 c11018) {
        AbstractC22295 abstractC22295 = c11018.f34795;
        if (abstractC22295 != null) {
            C12395 c12395 = this.f11237;
            AbstractC22664 abstractC22664 = c12395.f39880;
            try {
                c12395.f39880 = this.f11236;
                c12395.mo5474(abstractC22295);
            } finally {
                c12395.f39880 = abstractC22664;
            }
        }
    }
}
