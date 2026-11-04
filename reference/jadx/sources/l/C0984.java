package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C0984 extends AbstractC9186 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f3577;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final CharSequence f3578;

    public C0984(InterfaceC21646 interfaceC21646, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, ArrayList arrayList2) {
        super(arrayList, arrayList2, interfaceC21646);
        this.f3578 = charSequence;
        this.f3577 = charSequence2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m3860(CharSequence charSequence, List list, int i, int i2, boolean z) {
        InterfaceC6205 interfaceC6205;
        InterfaceC6205 interfaceC6206;
        int i3 = 0;
        while (i3 < i2) {
            if (z) {
                int i4 = i + i3;
                interfaceC6205 = (InterfaceC6205) list.get(i4);
                interfaceC6206 = (InterfaceC6205) list.get(i4 + 1);
            } else {
                int i5 = i - i3;
                interfaceC6205 = (InterfaceC6205) list.get(i5 - 1);
                interfaceC6206 = (InterfaceC6205) list.get(i5);
            }
            i3++;
            if (m3861(charSequence, interfaceC6205, interfaceC6206)) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3861(CharSequence charSequence, InterfaceC6205 interfaceC6205, InterfaceC6205 interfaceC6206) {
        if ((interfaceC6205 instanceof C3967) || (interfaceC6206 instanceof C3967)) {
            return true;
        }
        int iMo12746 = interfaceC6206.mo12746();
        for (int iMo12745 = interfaceC6205.mo12745(); iMo12745 < iMo12746; iMo12745++) {
            if (C7569.m20684(charSequence.charAt(iMo12745))) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC9186
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo3862(EnumC19563 enumC19563, int i, int i2, C22547 c22547, C22547 c22548) {
        List list = (List) enumC19563.m45142((Object) this.f29790, (Object) this.f29792);
        C17359.requireNonNull(list);
        CharSequence charSequence = (CharSequence) enumC19563.m45142(this.f3578, this.f3577);
        C17359.requireNonNull(charSequence);
        int iM45149 = enumC19563.m45149(c22548.f72892, c22548.f72894);
        int i3 = iM45149 - 1;
        if (!m3861(charSequence, (InterfaceC6205) list.get(i3), (InterfaceC6205) list.get(iM45149))) {
            int iM3860 = m3860(charSequence, list, iM45149, i, true);
            if (iM3860 > 0) {
                return iM3860;
            }
            int iM3861 = m3860(charSequence, list, i3, i2, false);
            if (iM3861 > 0) {
                return -iM3861;
            }
        }
        return 0;
    }
}
