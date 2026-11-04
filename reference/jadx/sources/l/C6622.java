package l;

/* JADX INFO: renamed from: l.ۛ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes3.dex */
public class C6622 extends AbstractC9713 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17567 f22120 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18557(AbstractC17567 abstractC17567) {
        if (this.f22120 != null) {
            throw new AssertionError("Delegate is already set");
        }
        this.f22120 = abstractC17567;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) {
        AbstractC17567 abstractC17567 = this.f22120;
        if (abstractC17567 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        return abstractC17567.mo3722(c4208);
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) {
        AbstractC17567 abstractC17567 = this.f22120;
        if (abstractC17567 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC17567.mo3723(c21362, obj);
    }

    @Override // l.AbstractC9713
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC17567 mo18558() {
        AbstractC17567 abstractC17567 = this.f22120;
        if (abstractC17567 != null) {
            return abstractC17567;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
