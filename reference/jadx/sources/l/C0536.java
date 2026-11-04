package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X770 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0536 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f2245;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10671 f2246;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14069 f2247;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f2248 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18282 f2249;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20871 f2250;

    public C0536(C7994 c7994, C14069 c14069, C18282 c18282, C10671 c10671) {
        String str;
        this.f2247 = c14069;
        this.f2249 = c18282;
        this.f2246 = c10671;
        this.f2250 = c10671.f33858.m31435();
        c7994.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = c18282.m42605(c14069, c10671.f33862).iterator();
        while (it.hasNext()) {
            String str2 = ((C19291) it.next()).f62362;
            if (str2.startsWith("lib/") && str2.endsWith(".so") && ((str = c10671.f33871) == null || str2.startsWith(str))) {
                arrayList.add(str2);
            }
        }
        this.f2245 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2507(final String str) {
        C1170.removeIf(this.f2248.keySet(), new Predicate() { // from class: l.ܿܺۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((String) obj).startsWith(str + '\n');
            }
        });
    }
}
