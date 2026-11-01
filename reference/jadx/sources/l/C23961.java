package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes.dex */
public final class C23961 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f77695;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f77696;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f77697;

    public C23961(ArrayList arrayList, int i, int i2) {
        this.f77696 = i;
        this.f77695 = i2;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            C13638.requireNonNull(obj);
            arrayList2.add(obj);
        }
        this.f77697 = C0561.unmodifiableList(arrayList2);
    }
}
