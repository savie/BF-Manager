package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0497 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f2185;

    public C0497(ArrayList arrayList) {
        this.f2185 = C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0497 m2374(C2460 c2460) {
        c2460.m7532();
        boolean z = (c2460.m7516() & 128) != 0;
        ArrayList arrayList = new ArrayList();
        if (!z) {
            int iM7516 = c2460.m7516();
            boolean z2 = (iM7516 & 64) != 0;
            boolean z3 = (iM7516 & 32) != 0;
            if (z2) {
                c2460.m7532();
            }
            if (!z2) {
                int iM7517 = c2460.m7516();
                arrayList = new ArrayList(iM7517);
                for (int i = 0; i < iM7517; i++) {
                    c2460.m7516();
                    c2460.m7532();
                    arrayList.add(new C20254());
                }
            }
            if (z3) {
                c2460.m7516();
                c2460.m7532();
            }
            c2460.m7519();
            c2460.m7516();
            c2460.m7516();
        }
        return new C0497(arrayList);
    }
}
