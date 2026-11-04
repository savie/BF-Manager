package l;

/* JADX INFO: renamed from: l.ۗۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3368 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19929 f10977;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f10978 = true;

    public C3368(C19929 c19929) {
        this.f10977 = c19929;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11063() {
        synchronized (this) {
            this.f10977 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11064(String str) {
        synchronized (this) {
            if (this.f10977 != null) {
                C14270 c14270 = new C14270();
                c14270.m34621(str);
                this.f10977.m45857(c14270);
                this.f10978 = false;
                this.f10977 = null;
            }
        }
    }
}
