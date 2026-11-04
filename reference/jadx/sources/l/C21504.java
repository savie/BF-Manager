package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C21504 implements InterfaceC0621 {
    public final InterfaceC0621[] a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C21504(List list, boolean z) {
        ArrayList arrayList = (ArrayList) list;
        this((InterfaceC0621[]) arrayList.toArray(new InterfaceC0621[arrayList.size()]), z);
    }

    public C21504(InterfaceC0621[] interfaceC0621Arr, boolean z) {
        this.a = interfaceC0621Arr;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[DONT_GENERATE] */
    @Override // l.InterfaceC0621
    public final boolean i(C16150 c16150, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            c16150.c++;
        }
        try {
            for (InterfaceC0621 interfaceC0621 : this.a) {
                if (!interfaceC0621.i(c16150, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            return true;
        } finally {
            if (z) {
                c16150.c--;
            }
        }
    }

    @Override // l.InterfaceC0621
    public final int j(C25102 c25102, CharSequence charSequence, int i) {
        boolean z = this.b;
        InterfaceC0621[] interfaceC0621Arr = this.a;
        int i2 = 0;
        if (z) {
            ArrayList arrayList = c25102.d;
            C14790 c14790C = c25102.c();
            c14790C.getClass();
            C14790 c14790 = new C14790();
            ((HashMap) c14790.a).putAll(c14790C.a);
            c14790.b = c14790C.b;
            c14790.c = c14790C.c;
            c14790.d = c14790C.d;
            arrayList.add(c14790);
            int length = interfaceC0621Arr.length;
            int iJ = i;
            while (i2 < length) {
                iJ = interfaceC0621Arr[i2].j(c25102, charSequence, iJ);
                if (iJ < 0) {
                    ArrayList arrayList2 = c25102.d;
                    arrayList2.remove(arrayList2.size() - 1);
                    return i;
                }
                i2++;
            }
            ArrayList arrayList3 = c25102.d;
            arrayList3.remove(arrayList3.size() - 2);
            return iJ;
        }
        int length2 = interfaceC0621Arr.length;
        while (i2 < length2) {
            i = interfaceC0621Arr[i2].j(c25102, charSequence, i);
            if (i < 0) {
                return i;
            }
            i2++;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC0621[] interfaceC0621Arr = this.a;
        if (interfaceC0621Arr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : MotionUtils.EASING_TYPE_FORMAT_START);
            for (InterfaceC0621 interfaceC0621 : interfaceC0621Arr) {
                sb.append(interfaceC0621);
            }
            sb.append(z ? "]" : MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return sb.toString();
    }
}
