package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes3.dex */
public final class C11500 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CharSequence f38674;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f38675 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence f38676;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13409 f38677;

    public C11500(InterfaceC13409 interfaceC13409, CharSequence charSequence, CharSequence charSequence2) {
        this.f38677 = interfaceC13409;
        this.f38676 = charSequence;
        this.f38674 = charSequence2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4941 m28690() {
        Iterator itMo11890 = this.f38677.mo11886().f31762.mo11890();
        while (true) {
            boolean zHasNext = itMo11890.hasNext();
            ArrayList arrayList = this.f38675;
            CharSequence charSequence = this.f38674;
            CharSequence charSequence2 = this.f38676;
            if (zHasNext) {
                C20464 c20464 = (C20464) itMo11890.next();
                int i = c20464.f66401;
                int i2 = c20464.f66399;
                int i3 = c20464.f66400;
                int i4 = c20464.f66402;
                int i5 = i;
                for (int i6 = i2; i5 < i3 && i6 < i4 && charSequence2.charAt(i5) == charSequence.charAt(i6) && C13571.m33170(charSequence2.charAt(i5)); i6++) {
                    i5++;
                }
                int i7 = i5 - i;
                int i8 = i + i7;
                int i9 = i2 + i7;
                int i10 = i3;
                for (int i11 = i4; i8 < i10 && i9 < i11; i11--) {
                    int i12 = i10 - 1;
                    if (charSequence2.charAt(i12) != charSequence.charAt(i11 - 1) || !C13571.m33170(charSequence2.charAt(i12))) {
                        break;
                    }
                    i10--;
                }
                int i13 = i3 - i10;
                int i14 = i3 - i13;
                int i15 = i4 - i13;
                while (i8 < i14 && C13571.m33170(charSequence2.charAt(i8))) {
                    i8++;
                }
                while (i8 < i14 && C13571.m33170(charSequence2.charAt(i14 - 1))) {
                    i14--;
                }
                while (i9 < i15 && C13571.m33170(charSequence.charAt(i9))) {
                    i9++;
                }
                while (i9 < i15 && C13571.m33170(charSequence.charAt(i15 - 1))) {
                    i15--;
                }
                C20464 c20465 = new C20464(i8, i14, i9, i15);
                if (!c20465.m46276() && !C7266.m19396(charSequence2.subSequence(i8, i14), charSequence.subSequence(i9, i15), EnumC8678.IGNORE_WHITESPACES)) {
                    arrayList.add(c20465);
                }
            } else {
                return C1413.m4941(arrayList, charSequence2.length(), charSequence.length());
            }
        }
    }
}
