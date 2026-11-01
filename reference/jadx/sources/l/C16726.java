package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܽܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8JQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16726 extends AbstractC8965 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f53561;

    public C16726(ArrayList arrayList) {
        this.f53561 = C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16726 m39214(C2460 c2460) {
        int iM7516 = c2460.m7516();
        ArrayList arrayList = new ArrayList(iM7516);
        for (int i = 0; i < iM7516; i++) {
            arrayList.add(C0497.m2374(c2460));
        }
        return new C16726(arrayList);
    }
}
