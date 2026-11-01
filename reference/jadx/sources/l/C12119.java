package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۫ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261X */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12119 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40581;

    public /* synthetic */ C12119(int i) {
        this.f40581 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f40581) {
            case 0:
                return ((InterfaceC12783) obj).mo31757().compareTo(((InterfaceC12783) obj2).mo31757());
            case 1:
                return ((AbstractC20745) obj).m46718().compareToIgnoreCase(((AbstractC20745) obj2).m46718());
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (str.equalsIgnoreCase(str2)) {
                    return 0;
                }
                if (str.equalsIgnoreCase("type-info")) {
                    return -1;
                }
                if (str2.equalsIgnoreCase("type-info")) {
                    return 1;
                }
                return str.compareToIgnoreCase(str2);
        }
    }
}
