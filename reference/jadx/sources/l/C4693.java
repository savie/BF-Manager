package l;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۙۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C4693 extends C25049 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public transient Object[] f16575;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public transient Object[] f16576;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Comparator f16577;

    @Override // l.C25049
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17589 mo14568() {
        throw null;
    }

    public C4693(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.f16577 = comparator;
        this.f16576 = new Object[4];
        this.f16575 = new Object[4];
    }

    @Override // l.C25049
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25049 mo14569(Object obj, Object obj2) {
        int i = this.f81024 + 1;
        Object[] objArr = this.f16576;
        if (i > objArr.length) {
            int iM33910 = AbstractC13924.m33910(objArr.length, i);
            this.f16576 = Arrays.copyOf(this.f16576, iM33910);
            this.f16575 = Arrays.copyOf(this.f16575, iM33910);
        }
        C19278.m44624(obj, obj2);
        Object[] objArr2 = this.f16576;
        int i2 = this.f81024;
        objArr2[i2] = obj;
        this.f16575[i2] = obj2;
        this.f81024 = i2 + 1;
        return this;
    }

    @Override // l.C25049
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC17589 mo14570() {
        int i = this.f81024;
        Comparator comparator = this.f16577;
        if (i == 0) {
            return C19609.m45258(comparator);
        }
        if (i == 1) {
            Object obj = this.f16576[0];
            C17359.requireNonNull(obj);
            Object obj2 = this.f16575[0];
            C17359.requireNonNull(obj2);
            AbstractC1928 abstractC1928Of = AbstractC1928.of(obj);
            comparator.getClass();
            return new C19609(new C5613(abstractC1928Of, comparator), AbstractC1928.of(obj2), null);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f16576, i);
        Arrays.sort(objArrCopyOf, comparator);
        int i2 = this.f81024;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < this.f81024; i3++) {
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (comparator.compare(objArrCopyOf[i4], objArrCopyOf[i3]) == 0) {
                    throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i4] + " and " + objArrCopyOf[i3]);
                }
            }
            Object obj3 = this.f16576[i3];
            C17359.requireNonNull(obj3);
            int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, comparator);
            Object obj4 = this.f16575[i3];
            C17359.requireNonNull(obj4);
            objArr[iBinarySearch] = obj4;
        }
        return new C19609(new C5613(AbstractC1928.m6618(objArrCopyOf.length, objArrCopyOf), comparator), AbstractC1928.m6618(i2, objArr), null);
    }
}
