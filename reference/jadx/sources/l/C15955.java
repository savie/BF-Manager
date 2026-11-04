package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7NJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15955 extends AbstractC23415 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C15955 f51795;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f51796;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f51797;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f51798;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15648 f51799;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f51800;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f51801;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f51802;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f51803;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f51804;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Map f51805;

    static {
        List list = Collections.EMPTY_LIST;
        f51795 = new C15955("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public C15955(String str, List list, List list2, List list3, List list4, List list5, List list6, C15648 c15648, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((C17447) list2.get(i)).f56744;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m38068(arrayList, list3);
        m38068(arrayList, list4);
        m38068(arrayList, list5);
        m38068(arrayList, list6);
        this.f51800 = C4681.unmodifiableList(arrayList);
        this.f51801 = C4681.unmodifiableList(list2);
        this.f51802 = C4681.unmodifiableList(list3);
        this.f51804 = C4681.unmodifiableList(list4);
        this.f51798 = C4681.unmodifiableList(list5);
        this.f51803 = C4681.unmodifiableList(list6);
        this.f51799 = c15648;
        this.f51797 = list7 != null ? C4681.unmodifiableList(list7) : null;
        this.f51805 = C4681.unmodifiableMap(map);
        this.f51796 = C4681.unmodifiableList(list8);
    }

    @Override // l.AbstractC23415
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo38069(List list) {
        ArrayList arrayListM38067 = m38067(0, this.f51801, list);
        List list2 = Collections.EMPTY_LIST;
        return new C15955(this.f75794, this.f75795, arrayListM38067, list2, m38067(1, this.f51804, list), m38067(2, this.f51798, list), list2, this.f51799, this.f51797, this.f75796, this.f51805, this.f51796);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38068(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C16701) list.get(i)).f53952;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m38067(int i, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                C12820 c12820 = (C12820) list2.get(i3);
                if (c12820.f41059 == i && c12820.f41060 == i2) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }
}
