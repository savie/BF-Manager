package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۡܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77D */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8984 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30757;

    public /* synthetic */ C8984(int i) {
        this.f30757 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f30757) {
            case 0:
                return C6161.f21016.compare(((C2072) obj).f7667, ((C2072) obj2).f7667);
            default:
                return ((AbstractC20745) obj).getName().compareToIgnoreCase(((AbstractC20745) obj2).getName());
        }
    }
}
