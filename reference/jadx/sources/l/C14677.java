package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14677 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashMap f47981;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f47982;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC2557 interfaceC2557 = (InterfaceC2557) obj;
        InterfaceC2557 interfaceC2558 = (InterfaceC2557) obj2;
        if (interfaceC2557 == interfaceC2558) {
            return 0;
        }
        int iMo7968 = interfaceC2557.mo7968();
        int iMo7969 = interfaceC2558.mo7968();
        if (iMo7968 != iMo7969) {
            if (iMo7968 < iMo7969) {
                return -1000000000;
            }
            return BasicLabelFormatter.BILLION;
        }
        String name = interfaceC2557.getName();
        HashMap map = this.f47981;
        int iCompareTo = ((C11149) map.get(name)).compareTo((C11149) map.get(interfaceC2558.getName()));
        return this.f47982 ? -iCompareTo : iCompareTo;
    }

    public C14677(HashMap map, boolean z) {
        this.f47981 = map;
        this.f47982 = z;
    }
}
