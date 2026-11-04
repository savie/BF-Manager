package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩹᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes.dex */
public final class C23865 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f77263;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f77264;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f77265;

    public C23865(ArrayList arrayList, int i, int i2) {
        this.f77264 = i;
        this.f77263 = i2;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            C17359.requireNonNull(obj);
            arrayList2.add(obj);
        }
        this.f77265 = C4681.unmodifiableList(arrayList2);
    }
}
