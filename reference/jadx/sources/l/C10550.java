package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۤ᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B7EO */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10550 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C7727 c7727 = (C7727) obj;
        C7727 c7728 = (C7727) obj2;
        if (c7727.m20375() != c7728.m20375()) {
            return c7727.m20375() ? -1 : 1;
        }
        return c7727.m20373().compareTo(c7728.m20373());
    }
}
