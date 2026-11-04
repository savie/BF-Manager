package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes3.dex */
public final class C12170 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39140 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence f39141;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC21646 f39142;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f39143;

    public C12170(InterfaceC21646 interfaceC21646, CharSequence charSequence, CharSequence charSequence2) {
        this.f39142 = interfaceC21646;
        this.f39141 = charSequence;
        this.f39143 = charSequence2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3746 m30435() {
        Iterator itMo3129 = this.f39142.mo3127().f53297.mo3129();
        while (true) {
            boolean zHasNext = itMo3129.hasNext();
            ArrayList arrayList = this.f39140;
            CharSequence charSequence = this.f39143;
            CharSequence charSequence2 = this.f39141;
            if (zHasNext) {
                C22547 c22547 = (C22547) itMo3129.next();
                int i = c22547.f72892;
                int i2 = c22547.f72894;
                int i3 = c22547.f72891;
                int i4 = c22547.f72893;
                int i5 = i;
                for (int i6 = i2; i5 < i3 && i6 < i4 && charSequence2.charAt(i5) == charSequence.charAt(i6) && C7569.m20684(charSequence2.charAt(i5)); i6++) {
                    i5++;
                }
                int i7 = i5 - i;
                int i8 = i + i7;
                int i9 = i2 + i7;
                int i10 = i3;
                for (int i11 = i4; i8 < i10 && i9 < i11; i11--) {
                    int i12 = i10 - 1;
                    if (charSequence2.charAt(i12) != charSequence.charAt(i11 - 1) || !C7569.m20684(charSequence2.charAt(i12))) {
                        break;
                    }
                    i10--;
                }
                int i13 = i3 - i10;
                int i14 = i3 - i13;
                int i15 = i4 - i13;
                while (i8 < i14 && C7569.m20684(charSequence2.charAt(i8))) {
                    i8++;
                }
                while (i8 < i14 && C7569.m20684(charSequence2.charAt(i14 - 1))) {
                    i14--;
                }
                while (i9 < i15 && C7569.m20684(charSequence.charAt(i9))) {
                    i9++;
                }
                while (i9 < i15 && C7569.m20684(charSequence.charAt(i15 - 1))) {
                    i15--;
                }
                C22547 c22548 = new C22547(i8, i14, i9, i15);
                if (!c22548.m50782() && !C5238.m15738(charSequence2.subSequence(i8, i14), charSequence.subSequence(i9, i15), EnumC6950.IGNORE_WHITESPACES)) {
                    arrayList.add(c22548);
                }
            } else {
                return C14932.m35912(arrayList, charSequence2.length(), charSequence.length());
            }
        }
    }
}
