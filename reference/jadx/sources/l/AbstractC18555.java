package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18555 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59033 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f59034;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13409 f59035;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f59036;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo41439(EnumC0707 enumC0707, int i, int i2, C20464 c20464, C20464 c20465);

    public AbstractC18555(List list, List list2, InterfaceC13409 interfaceC13409) {
        this.f59034 = list;
        this.f59036 = list2;
        this.f59035 = interfaceC13409;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC13409 m42950() {
        Iterator it = this.f59035.mo11889().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f59033;
            if (zHasNext) {
                arrayList.add((C20464) it.next());
                m42949();
            } else {
                return C1413.m4944(C1413.m4940(this.f59034.size(), this.f59036.size(), arrayList));
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m42949() {
        List list;
        int i;
        List list2;
        int i2;
        int i3;
        AbstractC18555 abstractC18555 = this;
        ArrayList arrayList = abstractC18555.f59033;
        if (arrayList.size() < 2) {
            return;
        }
        C20464 c20464 = (C20464) C19084.m43861(arrayList, 2);
        C20464 c20465 = (C20464) C19084.m43861(arrayList, 1);
        int i4 = c20464.f66400;
        int i5 = c20464.f66399;
        int i6 = c20464.f66401;
        int i7 = c20464.f66402;
        int i8 = c20465.f66401;
        int i9 = c20465.f66402;
        int i10 = c20465.f66400;
        int i11 = c20465.f66399;
        if (i4 == i8 || i7 == i11) {
            int i12 = i4 - i6;
            int i13 = i10 - i8;
            int i14 = i4 + i13;
            int i15 = i7 + i13;
            int i16 = i7;
            int i17 = i4;
            while (true) {
                list = abstractC18555.f59036;
                i = i9;
                list2 = abstractC18555.f59034;
                if (i17 >= i14 || i16 >= i15) {
                    break;
                }
                int i18 = i14;
                if (!C13638.equals(list2.get(i17), list.get(i16))) {
                    break;
                }
                i17++;
                i16++;
                abstractC18555 = this;
                i9 = i;
                i14 = i18;
            }
            int i19 = i17 - i4;
            int i20 = i8 - i12;
            int i21 = i11 - i12;
            int i22 = i8;
            while (true) {
                if (i20 >= i22 || i21 >= i11) {
                    i2 = i20;
                    i3 = i21;
                    break;
                }
                i2 = i20;
                i3 = i21;
                if (!C13638.equals(list2.get(i22 - 1), list.get(i11 - 1))) {
                    break;
                }
                i22--;
                i11--;
                i20 = i2;
                i21 = i3;
            }
            int i23 = i8 - i22;
            if (i19 == 0 && i23 == 0) {
                return;
            }
            if (i19 == i13) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(new C20464(i6, i4 + i13, i5, i15));
                m42949();
                return;
            }
            if (i23 == i12) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(new C20464(i2, i10, i3, i));
                m42949();
                return;
            }
            int iMo41439 = mo41439(EnumC0707.m3106(i4 == i8), i19, i23, c20464, c20465);
            if (iMo41439 != 0) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(new C20464(i6, i4 + iMo41439, i5, i16 + iMo41439));
                arrayList.add(new C20464(i8 + iMo41439, i10, i11 + iMo41439, i));
            }
        }
    }
}
