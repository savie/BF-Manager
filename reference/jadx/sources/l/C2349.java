package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R9DK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2349 extends AbstractC9032 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashSet f8289;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f8290;

    public C2349() {
        throw null;
    }

    public C2349(HashSet hashSet, byte[] bArr) {
        super(AbstractC14676.f47973);
        this.f8289 = hashSet;
        this.f8290 = bArr;
    }

    @Override // l.AbstractC9032
    public final Object getValue() {
        return new HashSet(this.f8289);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new HashSet(this.f8289).iterator();
    }
}
