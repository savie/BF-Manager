package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XAQ1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13495 extends AbstractC11729 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f44596;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC11729[] f44597;

    public C13495(C7495 c7495) {
        this(new AbstractC11729[]{c7495.f24961}, new int[]{c7495.f24960});
    }

    @Override // l.AbstractC11729
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo10719() {
        return this.f44596[0] == Integer.MAX_VALUE;
    }

    @Override // l.AbstractC11729
    /* JADX INFO: renamed from: ۨ */
    public final int mo10717() {
        return this.f44596.length;
    }

    @Override // l.AbstractC11729
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11729 mo10716(int i) {
        return this.f44597[i];
    }

    @Override // l.AbstractC11729
    /* JADX INFO: renamed from: ܰ */
    public final int mo10718(int i) {
        return this.f44596[i];
    }

    @Override // l.AbstractC11729
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13495)) {
            return false;
        }
        if (this.f39421 != ((AbstractC11729) obj).f39421) {
            return false;
        }
        C13495 c13495 = (C13495) obj;
        return Arrays.equals(this.f44596, c13495.f44596) && Arrays.equals(this.f44597, c13495.f44597);
    }

    public final String toString() {
        if (mo10719()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            int[] iArr = this.f44596;
            if (i < iArr.length) {
                if (i > 0) {
                    sb.append(", ");
                }
                int i2 = iArr[i];
                if (i2 == Integer.MAX_VALUE) {
                    sb.append("$");
                } else {
                    sb.append(i2);
                    AbstractC11729[] abstractC11729Arr = this.f44597;
                    if (abstractC11729Arr[i] != null) {
                        sb.append(' ');
                        sb.append(abstractC11729Arr[i].toString());
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
    public C13495(AbstractC11729[] abstractC11729Arr, int[] iArr) {
        int iM13217 = 1;
        for (AbstractC11729 abstractC11729 : abstractC11729Arr) {
            iM13217 = C4758.m13214(iM13217, abstractC11729);
        }
        for (int i : iArr) {
            iM13217 = C4758.m13217(iM13217, i);
        }
        super(C4758.m13213(iM13217, abstractC11729Arr.length * 2));
        this.f44597 = abstractC11729Arr;
        this.f44596 = iArr;
    }
}
