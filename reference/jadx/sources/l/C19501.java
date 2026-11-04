package l;

/* JADX INFO: renamed from: l.ᩴ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: PIYN */
/* JADX INFO: loaded from: classes5.dex */
public final class C19501 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23435 f62950;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC6281 f62951;

    public C19501(InterfaceC23435 interfaceC23435, InterfaceC6281 interfaceC6281) {
        C17359.requireNonNull(interfaceC6281);
        this.f62951 = interfaceC6281;
        C17359.requireNonNull(interfaceC23435);
        this.f62950 = interfaceC23435;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23435 m45024() {
        return this.f62950;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC6281 m45025() {
        return this.f62951;
    }

    public final String toString() {
        return "BlockParentContainer{" + this.f62950 + ", parent=" + this.f62951 + '}';
    }
}
