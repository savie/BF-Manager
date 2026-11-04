package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖ᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2932 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f9596;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f9597;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC2386 interfaceC2386 = (InterfaceC2386) obj;
        InterfaceC2386 interfaceC2387 = (InterfaceC2386) obj2;
        if (interfaceC2386 == interfaceC2387) {
            return 0;
        }
        int iMo8115 = interfaceC2386.mo8115();
        int iMo8116 = interfaceC2387.mo8115();
        if (iMo8115 != iMo8116) {
            if (iMo8115 < iMo8116) {
                return -1000000000;
            }
            return BasicLabelFormatter.BILLION;
        }
        String name = interfaceC2386.getName();
        HashMap map = this.f9596;
        int iCompareTo = ((C1441) map.get(name)).compareTo((C1441) map.get(interfaceC2387.getName()));
        return this.f9597 ? -iCompareTo : iCompareTo;
    }

    public C2932(HashMap map, boolean z) {
        this.f9596 = map;
        this.f9597 = z;
    }
}
