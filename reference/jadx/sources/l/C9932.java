package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۢۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C9932 extends AbstractC9186 {
    @Override // l.AbstractC9186
    /* JADX INFO: renamed from: ۙ */
    public final int mo3862(EnumC19563 enumC19563, int i, int i2, C22547 c22547, C22547 c22548) {
        Integer numM25764 = m25764(enumC19563, i, i2, c22548, 0);
        if (numM25764 != null) {
            return numM25764.intValue();
        }
        Integer numM25765 = m25765(enumC19563, i, i2, c22547, c22548, 0);
        if (numM25765 != null) {
            return numM25765.intValue();
        }
        Integer numM25766 = m25764(enumC19563, i, i2, c22548, 3);
        if (numM25766 != null) {
            return numM25766.intValue();
        }
        Integer numM25767 = m25765(enumC19563, i, i2, c22547, c22548, 3);
        if (numM25767 != null) {
            return numM25767.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Integer m25764(EnumC19563 enumC19563, int i, int i2, C22547 c22547, int i3) {
        List list = (List) enumC19563.m45142((Object) this.f29790, (Object) this.f29792);
        C17359.requireNonNull(list);
        int iM45149 = enumC19563.m45149(c22547.f72892, c22547.f72894);
        int i4 = i + 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            }
            if (((C17391) list.get(iM45149 + i5)).m40851() <= i3) {
                break;
            }
            i5++;
        }
        int i6 = iM45149 - 1;
        int i7 = i2 + 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                i8 = -1;
                break;
            }
            if (((C17391) list.get(i6 - i8)).m40851() <= i3) {
                break;
            }
            i8++;
        }
        if (i5 == -1 && i8 == -1) {
            return null;
        }
        if (i5 == 0 || i8 == 0) {
            return 0;
        }
        if (i5 == -1) {
            i5 = -i8;
        }
        return Integer.valueOf(i5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Integer m25765(EnumC19563 enumC19563, int i, int i2, C22547 c22547, C22547 c22548, int i3) {
        EnumC19563 enumC19563M45156 = enumC19563.m45156();
        List list = (List) enumC19563M45156.m45142((Object) this.f29790, (Object) this.f29792);
        C17359.requireNonNull(list);
        int iM45149 = enumC19563M45156.m45149(c22547.f72891, c22547.f72893);
        int iM451410 = enumC19563M45156.m45149(c22548.f72892, c22548.f72894);
        int i4 = i + 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            }
            if (((C17391) list.get(iM45149 + i5)).m40851() <= i3) {
                break;
            }
            i5++;
        }
        int i6 = iM451410 - 1;
        int i7 = i2 + 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                i8 = -1;
                break;
            }
            if (((C17391) list.get(i6 - i8)).m40851() <= i3) {
                break;
            }
            i8++;
        }
        if (i5 == -1 && i8 == -1) {
            return null;
        }
        if (i5 == 0 || i8 == 0) {
            return 0;
        }
        if (i5 == -1) {
            i5 = -i8;
        }
        return Integer.valueOf(i5);
    }
}
