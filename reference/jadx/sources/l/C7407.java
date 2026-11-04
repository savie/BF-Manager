package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۜ᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7407 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f24410;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f24411;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC2386 interfaceC2386 = (InterfaceC2386) obj;
        InterfaceC2386 interfaceC2387 = (InterfaceC2386) obj2;
        int iCompareTo = 0;
        if (interfaceC2386 == interfaceC2387) {
            return 0;
        }
        if (interfaceC2386.mo8092()) {
            return -1000000000;
        }
        if (interfaceC2387.mo8092() || interfaceC2386.mo8116()) {
            return BasicLabelFormatter.BILLION;
        }
        if (interfaceC2387.mo8116()) {
            return -1000000000;
        }
        if (interfaceC2386.isDirectory()) {
            if (!interfaceC2387.isDirectory()) {
                return -1000000000;
            }
        } else if (interfaceC2387.isDirectory()) {
            return BasicLabelFormatter.BILLION;
        }
        if (!interfaceC2386.isDirectory()) {
            String name = interfaceC2386.getName();
            int i = C14118.f44640;
            int iLastIndexOf = name.lastIndexOf(46);
            String strSubstring = "";
            String strSubstring2 = (iLastIndexOf == -1 || iLastIndexOf == 0) ? "" : name.substring(iLastIndexOf + 1);
            String name2 = interfaceC2387.getName();
            int iLastIndexOf2 = name2.lastIndexOf(46);
            if (iLastIndexOf2 != -1 && iLastIndexOf2 != 0) {
                strSubstring = name2.substring(iLastIndexOf2 + 1);
            }
            iCompareTo = strSubstring2.compareToIgnoreCase(strSubstring);
        }
        if (iCompareTo == 0) {
            String name3 = interfaceC2386.getName();
            HashMap map = this.f24410;
            iCompareTo = ((C1441) map.get(name3)).compareTo((C1441) map.get(interfaceC2387.getName()));
        }
        return this.f24411 ? -iCompareTo : iCompareTo;
    }

    public C7407(HashMap map, boolean z) {
        this.f24410 = map;
        this.f24411 = z;
    }
}
