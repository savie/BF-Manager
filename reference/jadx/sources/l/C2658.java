package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2658 implements InterfaceC22415 {
    public final InterfaceC22415[] a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2658(List list, boolean z) {
        ArrayList arrayList = (ArrayList) list;
        this((InterfaceC22415[]) arrayList.toArray(new InterfaceC22415[arrayList.size()]), z);
    }

    public C2658(InterfaceC22415[] interfaceC22415Arr, boolean z) {
        this.a = interfaceC22415Arr;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[DONT_GENERATE] */
    @Override // l.InterfaceC22415
    public final boolean l(C11126 c11126, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            c11126.c++;
        }
        try {
            for (InterfaceC22415 interfaceC22415 : this.a) {
                if (!interfaceC22415.l(c11126, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            return true;
        } finally {
            if (z) {
                c11126.c--;
            }
        }
    }

    @Override // l.InterfaceC22415
    public final int m(C12537 c12537, CharSequence charSequence, int i) {
        boolean z = this.b;
        InterfaceC22415[] interfaceC22415Arr = this.a;
        int i2 = 0;
        if (z) {
            ArrayList arrayList = c12537.d;
            C11832 c11832C = c12537.c();
            c11832C.getClass();
            C11832 c11832 = new C11832();
            ((HashMap) c11832.a).putAll(c11832C.a);
            c11832.b = c11832C.b;
            c11832.c = c11832C.c;
            c11832.d = c11832C.d;
            arrayList.add(c11832);
            int length = interfaceC22415Arr.length;
            int iM = i;
            while (i2 < length) {
                iM = interfaceC22415Arr[i2].m(c12537, charSequence, iM);
                if (iM < 0) {
                    ArrayList arrayList2 = c12537.d;
                    arrayList2.remove(arrayList2.size() - 1);
                    return i;
                }
                i2++;
            }
            ArrayList arrayList3 = c12537.d;
            arrayList3.remove(arrayList3.size() - 2);
            return iM;
        }
        int length2 = interfaceC22415Arr.length;
        while (i2 < length2) {
            i = interfaceC22415Arr[i2].m(c12537, charSequence, i);
            if (i < 0) {
                return i;
            }
            i2++;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC22415[] interfaceC22415Arr = this.a;
        if (interfaceC22415Arr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : MotionUtils.EASING_TYPE_FORMAT_START);
            for (InterfaceC22415 interfaceC22415 : interfaceC22415Arr) {
                sb.append(interfaceC22415);
            }
            sb.append(z ? "]" : MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return sb.toString();
    }
}
