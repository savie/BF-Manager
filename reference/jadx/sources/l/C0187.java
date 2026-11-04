package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.֡ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B784 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0187 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1286;

    public /* synthetic */ C0187(int i) {
        this.f1286 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1286) {
            case 0:
                return ((String) obj).compareTo((String) obj2);
            case 1:
                return ((InterfaceC2731) obj).mo9074().compareTo(((InterfaceC2731) obj2).mo9074());
            default:
                return -Long.compare(((C8002) obj).getSize(), ((C8002) obj2).getSize());
        }
    }
}
