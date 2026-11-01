package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes3.dex */
public final class C13617 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CharSequence f44933;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f44934 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence f44935;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13409 f44936;

    public C13617(InterfaceC13409 interfaceC13409, CharSequence charSequence, CharSequence charSequence2) {
        this.f44936 = interfaceC13409;
        this.f44935 = charSequence;
        this.f44933 = charSequence2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4941 m33298() {
        Iterator itMo11890 = this.f44936.mo11886().f31762.mo11890();
        while (true) {
            boolean zHasNext = itMo11890.hasNext();
            ArrayList arrayList = this.f44934;
            CharSequence charSequence = this.f44933;
            CharSequence charSequence2 = this.f44935;
            if (zHasNext) {
                C20464 c20464 = (C20464) itMo11890.next();
                int i = c20464.f66401;
                int i2 = c20464.f66399;
                int i3 = c20464.f66402;
                int i4 = c20464.f66400;
                int i5 = i4;
                for (int i6 = i3; i < i5 && i2 < i6; i6--) {
                    int i7 = i5 - 1;
                    if (charSequence2.charAt(i7) != charSequence.charAt(i6 - 1) || !C13571.m33170(charSequence2.charAt(i7))) {
                        break;
                    }
                    i5--;
                }
                int i8 = i4 - i5;
                int i9 = i4 - i8;
                int i10 = i3 - i8;
                int iM30309 = C12206.m30309(charSequence2, charSequence, c20464.f66401, c20464.f66399, i9, i10);
                C20464 c20465 = new C20464(c20464.f66401 + iM30309, i9, i2 + iM30309, i10);
                if (!c20465.m46276()) {
                    arrayList.add(c20465);
                }
            } else {
                return C1413.m4941(arrayList, charSequence2.length(), charSequence.length());
            }
        }
    }
}
