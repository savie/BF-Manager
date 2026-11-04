package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14932 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21646 m35916(int[] iArr, int[] iArr2, C15087 c15087) {
        c15087.m36345();
        try {
            return m35915(new C17916(C15833.m37785(iArr, iArr2), iArr.length, iArr2.length));
        } catch (C23293 unused) {
            throw new C22392();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21646 m35914(List list, List list2, C15087 c15087) {
        Object[] array = list.toArray();
        Object[] array2 = list2.toArray();
        c15087.m36345();
        try {
            return m35915(new C17916(C15833.m37787(array, array2), array.length, array2.length));
        } catch (C23293 unused) {
            throw new C22392();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3746 m35911(int i, int i2, List list) {
        return new C0763(new C19408(i, i2, list));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3746 m35912(ArrayList arrayList, int i, int i2) {
        return new C19408(i, i2, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21646 m35915(InterfaceC3746 interfaceC3746) {
        return interfaceC3746 instanceof InterfaceC21646 ? (InterfaceC21646) interfaceC3746 : new C18662(interfaceC3746);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3746 m35913(InterfaceC21646 interfaceC21646, int i, int i2, int i3, int i4) {
        return new C1509(interfaceC21646, i, i2, i3, i4);
    }
}
