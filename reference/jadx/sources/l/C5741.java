package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۛ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7NJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5741 extends AbstractC10681 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C5741 f19525;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C7648 f19526;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f19527;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List f19528;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f19529;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f19530;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List f19531;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List f19532;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f19533;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f19534;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Map f19535;

    static {
        List list = Collections.EMPTY_LIST;
        f19525 = new C5741("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public C5741(String str, List list, List list2, List list3, List list4, List list5, List list6, C7648 c7648, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((C17030) list2.get(i)).f54408;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m15797(list3, arrayList);
        m15797(list4, arrayList);
        m15797(list5, arrayList);
        m15797(list6, arrayList);
        this.f19534 = C0561.unmodifiableList(arrayList);
        this.f19532 = C0561.unmodifiableList(list2);
        this.f19533 = C0561.unmodifiableList(list3);
        this.f19527 = C0561.unmodifiableList(list4);
        this.f19530 = C0561.unmodifiableList(list5);
        this.f19529 = C0561.unmodifiableList(list6);
        this.f19526 = c7648;
        this.f19531 = list7 != null ? C0561.unmodifiableList(list7) : null;
        this.f19535 = C0561.unmodifiableMap(map);
        this.f19528 = C0561.unmodifiableList(list8);
    }

    @Override // l.AbstractC10681
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo15798(List list) {
        ArrayList arrayListM15796 = m15796(this.f19532, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new C5741(this.f36441, this.f36442, arrayListM15796, list2, m15796(this.f19527, 1, list), m15796(this.f19530, 2, list), list2, this.f19526, this.f19531, this.f36443, this.f19535, this.f19528);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15797(List list, ArrayList arrayList) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C12092) list.get(i)).f40457;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m15796(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                C20744 c20744 = (C20744) list2.get(i3);
                if (c20744.f67493 == i && c20744.f67492 == i2) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }
}
