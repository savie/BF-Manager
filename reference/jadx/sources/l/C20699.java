package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAQ1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20699 extends AbstractC12450 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC12450[] f66354;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f66355;

    public C20699(C5213 c5213) {
        this(new AbstractC12450[]{c5213.f18392}, new int[]{c5213.f18393});
    }

    @Override // l.AbstractC12450
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo30922() {
        return this.f66355[0] == Integer.MAX_VALUE;
    }

    @Override // l.AbstractC12450
    /* JADX INFO: renamed from: ۤ */
    public final int mo15679() {
        return this.f66355.length;
    }

    @Override // l.AbstractC12450
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12450 mo15678(int i) {
        return this.f66354[i];
    }

    @Override // l.AbstractC12450
    /* JADX INFO: renamed from: ᩷ */
    public final int mo15680(int i) {
        return this.f66355[i];
    }

    @Override // l.AbstractC12450
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20699)) {
            return false;
        }
        if (this.f40013 != ((AbstractC12450) obj).f40013) {
            return false;
        }
        C20699 c20699 = (C20699) obj;
        return Arrays.equals(this.f66355, c20699.f66355) && Arrays.equals(this.f66354, c20699.f66354);
    }

    public final String toString() {
        if (mo30922()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            int[] iArr = this.f66355;
            if (i < iArr.length) {
                if (i > 0) {
                    sb.append(", ");
                }
                int i2 = iArr[i];
                if (i2 == Integer.MAX_VALUE) {
                    sb.append("$");
                } else {
                    sb.append(i2);
                    AbstractC12450[] abstractC12450Arr = this.f66354;
                    if (abstractC12450Arr[i] != null) {
                        sb.append(' ');
                        sb.append(abstractC12450Arr[i].toString());
                    } else {
                        sb.append("null");
                    }
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20699(AbstractC12450[] abstractC12450Arr, int[] iArr) {
        int iM19447 = 1;
        for (AbstractC12450 abstractC12450 : abstractC12450Arr) {
            iM19447 = C7103.m19445(iM19447, abstractC12450);
        }
        for (int i : iArr) {
            iM19447 = C7103.m19447(iM19447, i);
        }
        super(C7103.m19444(iM19447, abstractC12450Arr.length * 2));
        this.f66354 = abstractC12450Arr;
        this.f66355 = iArr;
    }
}
