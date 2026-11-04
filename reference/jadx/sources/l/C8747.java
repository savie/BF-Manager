package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۠ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8747 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28450;

    public /* synthetic */ C8747(int i) {
        this.f28450 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare;
        C8002 c8002 = (C8002) obj;
        C8002 c8003 = (C8002) obj2;
        switch (this.f28450) {
            case 0:
                iCompare = Long.compare(c8002.getSize(), c8003.getSize());
                break;
            default:
                int i = C5300.f18661;
                iCompare = Long.compare(c8002.getSize(), c8003.getSize());
                break;
        }
        return -iCompare;
    }
}
