package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q18Y */
/* JADX INFO: loaded from: classes.dex */
public final class C21688 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC4534 f69219;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC4534 f69220;

    public C21688(AbstractC4534 abstractC4534, AbstractC4534 abstractC4535) {
        this.f69220 = abstractC4534;
        this.f69219 = abstractC4535;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10499(this.f69220, this.f69219);
    }
}
