package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܺ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O7HC */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15635 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50834;

    public /* synthetic */ C15635(int i) {
        this.f50834 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f50834) {
            case 0:
                return Long.compare(((C12107) obj2).getSize(), ((C12107) obj).getSize());
            default:
                C16466 c16466 = (C16466) obj;
                C16466 c16467 = (C16466) obj2;
                int i = C18934.f61253;
                boolean zStartsWith = c16466.m38728().startsWith("_");
                if (zStartsWith == c16467.m38728().startsWith("_")) {
                    return Integer.compare(c16466.m38729(), c16467.m38729());
                }
                return zStartsWith ? 1 : -1;
        }
    }
}
