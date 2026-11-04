package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes.dex */
public final class C22483 extends AbstractC15023 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC19499 f72769;

    public C22483(AbstractC19499 abstractC19499) {
        this.f72769 = abstractC19499;
    }

    @Override // l.AbstractC15023
    /* JADX INFO: renamed from: ᩷ */
    public final Map mo31670() {
        return this.f72769;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return ((C2125) this.f72769).f7003.mo18859();
    }
}
