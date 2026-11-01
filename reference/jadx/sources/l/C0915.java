package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes2.dex */
public final class C0915 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CharSequence f3664;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f3665 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence f3666;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4941 f3667;

    public C0915(InterfaceC4941 interfaceC4941, CharSequence charSequence, CharSequence charSequence2) {
        this.f3667 = interfaceC4941;
        this.f3666 = charSequence;
        this.f3664 = charSequence2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4941 m3636() {
        Iterator itMo11890 = this.f3667.mo11886().f31762.mo11890();
        while (true) {
            boolean zHasNext = itMo11890.hasNext();
            ArrayList arrayList = this.f3665;
            CharSequence charSequence = this.f3664;
            CharSequence charSequence2 = this.f3666;
            if (zHasNext) {
                C20464 c20464 = (C20464) itMo11890.next();
                int iM30312 = c20464.f66401;
                int iM30313 = c20464.f66399;
                int iM30308 = c20464.f66400;
                int iM30309 = c20464.f66402;
                if (C3737.m10947(iM30312, charSequence2)) {
                    iM30312 = C12206.m30312(iM30312, iM30308, charSequence2);
                }
                if (C3737.m10947(iM30308 - 1, charSequence2)) {
                    iM30308 = C12206.m30308(iM30312, iM30308, charSequence2);
                }
                if (C3737.m10947(iM30313, charSequence)) {
                    iM30313 = C12206.m30312(iM30313, iM30309, charSequence);
                }
                if (C3737.m10947(iM30309 - 1, charSequence)) {
                    iM30309 = C12206.m30308(iM30313, iM30309, charSequence);
                }
                C20464 c20465 = new C20464(iM30312, iM30308, iM30313, iM30309);
                if (!c20465.m46276() && !C7266.m19396(charSequence2.subSequence(iM30312, iM30308), charSequence.subSequence(iM30313, iM30309), EnumC8678.DEFAULT)) {
                    arrayList.add(c20465);
                }
            } else {
                return C1413.m4941(arrayList, charSequence2.length(), charSequence.length());
            }
        }
    }
}
