package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸ܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X770 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21622 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C13614 f70128;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70129;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f70130 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1139 f70131;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14952 f70132;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21956 f70133;

    public C21622(C18094 c18094, C21956 c21956, C14952 c14952, C1139 c1139) {
        String str;
        this.f70133 = c21956;
        this.f70132 = c14952;
        this.f70131 = c1139;
        this.f70128 = c1139.f5119.m28688();
        c18094.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = c14952.m35885(c21956, c1139.f5124).iterator();
        while (it.hasNext()) {
            String str2 = ((C9878) it.next()).f33725;
            if (str2.startsWith("lib/") && str2.endsWith(".so") && ((str = c1139.f5118) == null || str2.startsWith(str))) {
                arrayList.add(str2);
            }
        }
        this.f70129 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48337(final String str) {
        C9030.removeIf(this.f70130.keySet(), new Predicate() { // from class: l.ܶܰ۬
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((String) obj).startsWith(str + '\n');
            }
        });
    }
}
