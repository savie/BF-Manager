package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.֫ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1991 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C11685 c11685 = (C11685) obj;
        C11685 c11686 = (C11685) obj2;
        int size = c11686.f37847.size() - c11685.f37847.size();
        return size == 0 ? c11686.f37845.size() - c11685.f37845.size() : size;
    }
}
