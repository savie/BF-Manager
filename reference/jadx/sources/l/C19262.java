package l;

/* JADX INFO: renamed from: l.ᩳᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19262 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10377 f62294;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10311 f62295;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f62296;

    public C19262(C10311 c10311, AbstractC22664 abstractC22664, C10377 c10377) {
        this.f62295 = c10311;
        this.f62296 = abstractC22664;
        this.f62294 = c10377;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19262)) {
            return false;
        }
        C19262 c19262 = (C19262) obj;
        return c19262.f62294 == this.f62294 && this.f62295.f32911.m55149(this.f62296, c19262.f62296);
    }

    public final int hashCode() {
        C24705 c24705 = this.f62295.f32911;
        return C24705.m55059(this.f62296) & (~this.f62294.hashCode());
    }
}
