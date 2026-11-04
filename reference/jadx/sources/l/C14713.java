package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܰܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7HC */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14713 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48074;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f48074) {
            case 0:
                return Long.compare(((C8002) obj2).getSize(), ((C8002) obj).getSize());
            default:
                return ((String) obj2).length() - ((String) obj).length();
        }
    }
}
