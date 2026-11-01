package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۫ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12539 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C17477 c17477 = (C17477) obj;
        C17477 c17478 = (C17477) obj2;
        int size = c17478.f55614.size() - c17477.f55614.size();
        return size == 0 ? c17478.f55612.size() - c17477.f55612.size() : size;
    }
}
