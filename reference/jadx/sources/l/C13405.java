package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۬᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1ES */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13405 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C15606 c15606 = (C15606) obj;
        C15606 c15607 = (C15606) obj2;
        int iCompare = Integer.compare(c15606.f50741, c15607.f50741);
        return iCompare != 0 ? iCompare : Integer.compare(c15607.f50739, c15606.f50739);
    }
}
