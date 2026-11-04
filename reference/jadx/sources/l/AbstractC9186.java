package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f29790;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21646 f29791;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f29792;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f29793 = new ArrayList();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo3862(EnumC19563 enumC19563, int i, int i2, C22547 c22547, C22547 c22548);

    public AbstractC9186(List list, List list2, InterfaceC21646 interfaceC21646) {
        this.f29790 = list;
        this.f29792 = list2;
        this.f29791 = interfaceC21646;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC21646 m24309() {
        Iterator it = this.f29791.mo3131().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f29793;
            if (zHasNext) {
                arrayList.add((C22547) it.next());
                m24308();
            } else {
                return C14932.m35915(C14932.m35911(this.f29790.size(), this.f29792.size(), arrayList));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m24308() {
        List list;
        int i;
        List list2;
        int i2;
        int i3;
        AbstractC9186 abstractC9186 = this;
        ArrayList arrayList = abstractC9186.f29793;
        if (arrayList.size() < 2) {
            return;
        }
        C22547 c22547 = (C22547) j$$ExternalSyntheticOutline0.m(arrayList, 2);
        C22547 c22548 = (C22547) j$$ExternalSyntheticOutline0.m(arrayList, 1);
        int i4 = c22547.f72891;
        int i5 = c22547.f72894;
        int i6 = c22547.f72892;
        int i7 = c22547.f72893;
        int i8 = c22548.f72892;
        int i9 = c22548.f72893;
        int i10 = c22548.f72891;
        int i11 = c22548.f72894;
        if (i4 == i8 || i7 == i11) {
            int i12 = i4 - i6;
            int i13 = i10 - i8;
            int i14 = i4 + i13;
            int i15 = i7 + i13;
            int i16 = i7;
            int i17 = i4;
            while (true) {
                list = abstractC9186.f29792;
                i = i9;
                list2 = abstractC9186.f29790;
                if (i17 >= i14 || i16 >= i15) {
                    break;
                }
                int i18 = i14;
                if (!C17359.equals(list2.get(i17), list.get(i16))) {
                    break;
                }
                i17++;
                i16++;
                abstractC9186 = this;
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
                if (!C17359.equals(list2.get(i22 - 1), list.get(i11 - 1))) {
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
                arrayList.add(new C22547(i6, i4 + i13, i5, i15));
                m24308();
                return;
            }
            if (i23 == i12) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(new C22547(i2, i10, i3, i));
                m24308();
                return;
            }
            int iMo3862 = mo3862(EnumC19563.m45138(i4 == i8), i19, i23, c22547, c22548);
            if (iMo3862 != 0) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(new C22547(i6, i4 + iMo3862, i5, i16 + iMo3862));
                arrayList.add(new C22547(i8 + iMo3862, i10, i11 + iMo3862, i));
            }
        }
    }
}
