package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9DK */
/* JADX INFO: loaded from: classes3.dex */
public final class C3945 extends AbstractC4691 implements Iterable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashSet f13463;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f13464;

    public C3945() {
        throw null;
    }

    public C3945(HashSet hashSet, byte[] bArr) {
        super(AbstractC15877.f51625);
        this.f13463 = hashSet;
        this.f13464 = bArr;
    }

    @Override // l.AbstractC4691
    public final Object getValue() {
        return new HashSet(this.f13463);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new HashSet(this.f13463).iterator();
    }
}
