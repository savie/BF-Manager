package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۟ۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7777 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25585;

    public /* synthetic */ C7777(int i) {
        this.f25585 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f25585) {
            case 0:
                return ((AbstractC22044) obj).m49874().compareToIgnoreCase(((AbstractC22044) obj2).m49874());
            default:
                return Integer.compare(((InterfaceC5903) obj).mo3870(), ((InterfaceC5903) obj2).mo3870());
        }
    }
}
