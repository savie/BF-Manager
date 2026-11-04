package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes4.dex */
public final class C14407 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45403 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence f45404;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC3746 f45405;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f45406;

    public C14407(InterfaceC3746 interfaceC3746, CharSequence charSequence, CharSequence charSequence2) {
        this.f45405 = interfaceC3746;
        this.f45404 = charSequence;
        this.f45406 = charSequence2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3746 m34847() {
        Iterator itMo3129 = this.f45405.mo3127().f53297.mo3129();
        while (true) {
            boolean zHasNext = itMo3129.hasNext();
            ArrayList arrayList = this.f45403;
            CharSequence charSequence = this.f45406;
            CharSequence charSequence2 = this.f45404;
            if (zHasNext) {
                C22547 c22547 = (C22547) itMo3129.next();
                int iM33072 = c22547.f72892;
                int iM33073 = c22547.f72894;
                int iM33068 = c22547.f72891;
                int iM33069 = c22547.f72893;
                if (C18137.m42252(iM33072, charSequence2)) {
                    iM33072 = C13441.m33072(iM33072, iM33068, charSequence2);
                }
                if (C18137.m42252(iM33068 - 1, charSequence2)) {
                    iM33068 = C13441.m33068(iM33072, iM33068, charSequence2);
                }
                if (C18137.m42252(iM33073, charSequence)) {
                    iM33073 = C13441.m33072(iM33073, iM33069, charSequence);
                }
                if (C18137.m42252(iM33069 - 1, charSequence)) {
                    iM33069 = C13441.m33068(iM33073, iM33069, charSequence);
                }
                C22547 c22548 = new C22547(iM33072, iM33068, iM33073, iM33069);
                if (!c22548.m50782() && !C5238.m15738(charSequence2.subSequence(iM33072, iM33068), charSequence.subSequence(iM33073, iM33069), EnumC6950.DEFAULT)) {
                    arrayList.add(c22548);
                }
            } else {
                return C14932.m35912(arrayList, charSequence2.length(), charSequence.length());
            }
        }
    }
}
