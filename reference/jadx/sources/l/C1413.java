package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1413 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13409 m4945(int[] iArr, int[] iArr2, C16936 c16936) {
        c16936.m39631();
        try {
            return m4944(new C1621(C2118.m6665(iArr, iArr2), iArr.length, iArr2.length));
        } catch (C9881 unused) {
            throw new C20672();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13409 m4943(List list, List list2, C16936 c16936) {
        Object[] array = list.toArray();
        Object[] array2 = list2.toArray();
        c16936.m39631();
        try {
            return m4944(new C1621(C2118.m6667(array, array2), array.length, array2.length));
        } catch (C9881 unused) {
            throw new C20672();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4941 m4940(int i, int i2, List list) {
        return new C7058(new C15526(i, i2, list));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4941 m4941(ArrayList arrayList, int i, int i2) {
        return new C15526(i, i2, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13409 m4944(InterfaceC4941 interfaceC4941) {
        return interfaceC4941 instanceof InterfaceC13409 ? (InterfaceC13409) interfaceC4941 : new C4235(interfaceC4941);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4941 m4942(InterfaceC13409 interfaceC13409, int i, int i2, int i3, int i4) {
        return new C18347(interfaceC13409, i, i2, i3, i4);
    }
}
