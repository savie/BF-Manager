package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes5.dex */
public final class C20375 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f65342 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence f65343;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC21646 f65344;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f65345;

    public C20375(InterfaceC21646 interfaceC21646, CharSequence charSequence, CharSequence charSequence2) {
        this.f65344 = interfaceC21646;
        this.f65343 = charSequence;
        this.f65345 = charSequence2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3746 m46791() {
        Iterator itMo3129 = this.f65344.mo3127().f53297.mo3129();
        while (true) {
            boolean zHasNext = itMo3129.hasNext();
            ArrayList arrayList = this.f65342;
            CharSequence charSequence = this.f65345;
            CharSequence charSequence2 = this.f65343;
            if (zHasNext) {
                C22547 c22547 = (C22547) itMo3129.next();
                int i = c22547.f72892;
                int i2 = c22547.f72894;
                int i3 = c22547.f72893;
                int i4 = c22547.f72891;
                int i5 = i4;
                for (int i6 = i3; i < i5 && i2 < i6; i6--) {
                    int i7 = i5 - 1;
                    if (charSequence2.charAt(i7) != charSequence.charAt(i6 - 1) || !C7569.m20684(charSequence2.charAt(i7))) {
                        break;
                    }
                    i5--;
                }
                int i8 = i4 - i5;
                int i9 = i4 - i8;
                int i10 = i3 - i8;
                int iM33069 = C13441.m33069(charSequence2, charSequence, c22547.f72892, c22547.f72894, i9, i10);
                C22547 c22548 = new C22547(c22547.f72892 + iM33069, i9, i2 + iM33069, i10);
                if (!c22548.m50782()) {
                    arrayList.add(c22548);
                }
            } else {
                return C14932.m35912(arrayList, charSequence2.length(), charSequence.length());
            }
        }
    }
}
