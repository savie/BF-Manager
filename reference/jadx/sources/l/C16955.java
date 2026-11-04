package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8JQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16955 extends AbstractC19939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f55393;

    public C16955(ArrayList arrayList) {
        this.f55393 = C4681.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16955 m39936(C21287 c21287) {
        int iM48493 = c21287.m48493();
        ArrayList arrayList = new ArrayList(iM48493);
        for (int i = 0; i < iM48493; i++) {
            arrayList.add(C25161.m56081(c21287));
        }
        return new C16955(arrayList);
    }
}
