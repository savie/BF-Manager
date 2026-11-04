package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۖܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R6IG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2740 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8706 f9102;

    public C2740(C8706 c8706) {
        this.f9102 = c8706;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = C9451.f30647[this.f9102.m23403((AbstractC1566) obj, (AbstractC1566) obj2).ordinal()];
        if (i == 1) {
            return -2;
        }
        if (i == 2 || i == 3) {
            return -1;
        }
        return (i == 4 || i == 5) ? 1 : 0;
    }
}
