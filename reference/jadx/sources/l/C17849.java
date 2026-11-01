package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C17849 extends AbstractC18555 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final CharSequence f56536;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CharSequence f56537;

    public C17849(InterfaceC13409 interfaceC13409, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, ArrayList arrayList2) {
        super(arrayList, arrayList2, interfaceC13409);
        this.f56536 = charSequence;
        this.f56537 = charSequence2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41437(CharSequence charSequence, List list, int i, int i2, boolean z) {
        InterfaceC2326 interfaceC2326;
        InterfaceC2326 interfaceC2327;
        int i3 = 0;
        while (i3 < i2) {
            if (z) {
                int i4 = i + i3;
                interfaceC2326 = (InterfaceC2326) list.get(i4);
                interfaceC2327 = (InterfaceC2326) list.get(i4 + 1);
            } else {
                int i5 = i - i3;
                interfaceC2326 = (InterfaceC2326) list.get(i5 - 1);
                interfaceC2327 = (InterfaceC2326) list.get(i5);
            }
            i3++;
            if (m41438(charSequence, interfaceC2326, interfaceC2327)) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41438(CharSequence charSequence, InterfaceC2326 interfaceC2326, InterfaceC2326 interfaceC2327) {
        if ((interfaceC2326 instanceof C22083) || (interfaceC2327 instanceof C22083)) {
            return true;
        }
        int iMo7062 = interfaceC2327.mo7062();
        for (int iMo7061 = interfaceC2326.mo7061(); iMo7061 < iMo7062; iMo7061++) {
            if (C13571.m33170(charSequence.charAt(iMo7061))) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo41439(EnumC0707 enumC0707, int i, int i2, C20464 c20464, C20464 c20465) {
        List list = (List) enumC0707.m3110((Object) this.f59034, (Object) this.f59036);
        C13638.requireNonNull(list);
        CharSequence charSequence = (CharSequence) enumC0707.m3110(this.f56536, this.f56537);
        C13638.requireNonNull(charSequence);
        int iM3117 = enumC0707.m3117(c20465.f66401, c20465.f66399);
        int i3 = iM3117 - 1;
        if (!m41438(charSequence, (InterfaceC2326) list.get(i3), (InterfaceC2326) list.get(iM3117))) {
            int iM41437 = m41437(charSequence, list, iM3117, i, true);
            if (iM41437 > 0) {
                return iM41437;
            }
            int iM41438 = m41437(charSequence, list, i3, i2, false);
            if (iM41438 > 0) {
                return -iM41438;
            }
        }
        return 0;
    }
}
