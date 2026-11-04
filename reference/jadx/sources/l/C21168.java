package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩶۟᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes5.dex */
public final class C21168 extends C0285 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48279(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        m48276(0, i, i2, objArr, objArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48276(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        C15243.m36590(objArr, "<this>");
        C15243.m36590(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48277(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        C15243.m36590(iArr, "<this>");
        C15243.m36590(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object[] m48278(int i, int i2, Object[] objArr) {
        C15243.m36590(objArr, "<this>");
        int length = objArr.length;
        if (i2 > length) {
            throw new IndexOutOfBoundsException(C0703.m3016("toIndex (", i2, ") is greater than size (", ").", length));
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        C15243.m36591(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m48275(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C22242.f71645;
        }
        if (length == 1) {
            return C7743.m21087(objArr[0]);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        C15243.m36591(objArrCopyOf, "copyOf(...)");
        List listAsList = Arrays.asList(objArrCopyOf);
        C15243.m36591(listAsList, "asList(...)");
        return listAsList;
    }
}
