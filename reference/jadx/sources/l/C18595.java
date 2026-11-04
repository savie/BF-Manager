package l;

/* JADX INFO: renamed from: l.ܿ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18595 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19143 f60392;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f60393;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m43172() {
        return this.f60393 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m43173(Object obj, C19143 c19143) {
        return this.f60393 == obj && this.f60392 == c19143;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m43174(C19143 c19143) {
        return this.f60393 != null && this.f60392 == c19143;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m43175(Object obj, C19143 c19143) {
        if (this.f60393 != null) {
            return false;
        }
        this.f60393 = obj;
        this.f60392 = c19143;
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m43176(Object obj, C19143 c19143) {
        if (m43173(obj, c19143)) {
            this.f60393 = null;
            this.f60392 = null;
        }
    }
}
