package l;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܰۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13636 extends C13261 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Comparator f44989;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public transient Object[] f44990;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient Object[] f44991;

    @Override // l.C13261
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6910 mo32740() {
        throw null;
    }

    public C13636(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.f44989 = comparator;
        this.f44990 = new Object[4];
        this.f44991 = new Object[4];
    }

    @Override // l.C13261
    /* JADX INFO: renamed from: ۙ */
    public final C13261 mo32741(Object obj, Object obj2) {
        int i = this.f44036 + 1;
        Object[] objArr = this.f44990;
        if (i > objArr.length) {
            int iM34968 = AbstractC14528.m34968(objArr.length, i);
            this.f44990 = Arrays.copyOf(this.f44990, iM34968);
            this.f44991 = Arrays.copyOf(this.f44991, iM34968);
        }
        C20296.m45807(obj, obj2);
        Object[] objArr2 = this.f44990;
        int i2 = this.f44036;
        objArr2[i2] = obj;
        this.f44991[i2] = obj2;
        this.f44036 = i2 + 1;
        return this;
    }

    @Override // l.C13261
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC6910 mo32742() {
        int i = this.f44036;
        Comparator comparator = this.f44989;
        if (i == 0) {
            return C2345.m7127(comparator);
        }
        if (i == 1) {
            Object obj = this.f44990[0];
            C13638.requireNonNull(obj);
            Object obj2 = this.f44991[0];
            C13638.requireNonNull(obj2);
            AbstractC22433 abstractC22433Of = AbstractC22433.of(obj);
            comparator.getClass();
            return new C2345(new C7098(abstractC22433Of, comparator), AbstractC22433.of(obj2), null);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f44990, i);
        Arrays.sort(objArrCopyOf, comparator);
        int i2 = this.f44036;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < this.f44036; i3++) {
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (comparator.compare(objArrCopyOf[i4], objArrCopyOf[i3]) == 0) {
                    throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i4] + " and " + objArrCopyOf[i3]);
                }
            }
            Object obj3 = this.f44990[i3];
            C13638.requireNonNull(obj3);
            int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, comparator);
            Object obj4 = this.f44991[i3];
            C13638.requireNonNull(obj4);
            objArr[iBinarySearch] = obj4;
        }
        return new C2345(new C7098(AbstractC22433.m49802(objArrCopyOf.length, objArrCopyOf), comparator), AbstractC22433.m49802(i2, objArr), null);
    }
}
