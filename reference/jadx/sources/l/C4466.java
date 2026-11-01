package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P9KH */
/* JADX INFO: loaded from: classes3.dex */
public final class C4466 extends AbstractC9032 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f15877;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f15878;

    public C4466() {
        throw null;
    }

    public C4466(ArrayList arrayList, byte[] bArr) {
        super(AbstractC14676.f47976);
        this.f15877 = arrayList;
        this.f15878 = bArr;
    }

    public C4466(ArrayList arrayList) {
        super(AbstractC14676.f47976);
        this.f15877 = arrayList;
    }

    @Override // l.AbstractC9032
    public final Object getValue() {
        return new ArrayList(this.f15877);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ArrayList(this.f15877).iterator();
    }

    public final AbstractC9032 get(int i) {
        return (AbstractC9032) this.f15877.get(i);
    }
}
