package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۢܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9738 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashMap f32761;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f32762;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC2557 interfaceC2557 = (InterfaceC2557) obj;
        InterfaceC2557 interfaceC2558 = (InterfaceC2557) obj2;
        int iCompareTo = 0;
        if (interfaceC2557 == interfaceC2558) {
            return 0;
        }
        if (interfaceC2557.mo7969()) {
            return -1000000000;
        }
        if (interfaceC2558.mo7969() || interfaceC2557.mo7991()) {
            return BasicLabelFormatter.BILLION;
        }
        if (interfaceC2558.mo7991()) {
            return -1000000000;
        }
        if (interfaceC2557.isDirectory()) {
            if (!interfaceC2558.isDirectory()) {
                return -1000000000;
            }
        } else if (interfaceC2558.isDirectory()) {
            return BasicLabelFormatter.BILLION;
        }
        if (!interfaceC2557.isDirectory()) {
            String name = interfaceC2557.getName();
            int i = C3386.f12507;
            int iLastIndexOf = name.lastIndexOf(46);
            String strSubstring = "";
            String strSubstring2 = (iLastIndexOf == -1 || iLastIndexOf == 0) ? "" : name.substring(iLastIndexOf + 1);
            String name2 = interfaceC2558.getName();
            int iLastIndexOf2 = name2.lastIndexOf(46);
            if (iLastIndexOf2 != -1 && iLastIndexOf2 != 0) {
                strSubstring = name2.substring(iLastIndexOf2 + 1);
            }
            iCompareTo = strSubstring2.compareToIgnoreCase(strSubstring);
        }
        if (iCompareTo == 0) {
            String name3 = interfaceC2557.getName();
            HashMap map = this.f32761;
            iCompareTo = ((C11149) map.get(name3)).compareTo((C11149) map.get(interfaceC2558.getName()));
        }
        return this.f32762 ? -iCompareTo : iCompareTo;
    }

    public C9738(HashMap map, boolean z) {
        this.f32761 = map;
        this.f32762 = z;
    }
}
