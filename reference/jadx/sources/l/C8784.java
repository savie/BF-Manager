package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q18Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C8784 implements Iterable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC19367 f30204;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC19367 f30205;

    public C8784(AbstractC19367 abstractC19367, AbstractC19367 abstractC19368) {
        this.f30205 = abstractC19367;
        this.f30204 = abstractC19368;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10195(this.f30205, this.f30204);
    }
}
