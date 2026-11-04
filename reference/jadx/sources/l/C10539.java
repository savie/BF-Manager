package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۤ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X785 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10539 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33516;

    public /* synthetic */ C10539(int i) {
        this.f33516 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f33516) {
            case 0:
                return Integer.compare(((C4574) obj).f16278, ((C4574) obj2).f16278);
            default:
                return ((String) ((C2310) obj).f7473).compareTo((String) ((C2310) obj2).f7473);
        }
    }
}
