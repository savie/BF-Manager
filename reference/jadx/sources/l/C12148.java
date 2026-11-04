package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9KH */
/* JADX INFO: loaded from: classes4.dex */
public final class C12148 extends AbstractC4691 implements Iterable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39057;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f39058;

    public C12148() {
        throw null;
    }

    public C12148(ArrayList arrayList, byte[] bArr) {
        super(AbstractC15877.f51628);
        this.f39057 = arrayList;
        this.f39058 = bArr;
    }

    public C12148(ArrayList arrayList) {
        super(AbstractC15877.f51628);
        this.f39057 = arrayList;
    }

    @Override // l.AbstractC4691
    public final Object getValue() {
        return new ArrayList(this.f39057);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ArrayList(this.f39057).iterator();
    }

    public final AbstractC4691 get(int i) {
        return (AbstractC4691) this.f39057.get(i);
    }
}
