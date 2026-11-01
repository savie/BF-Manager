package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۧۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6J0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10791 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36755;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f36755) {
            case 0:
                return Integer.compare(((C0206) obj).mo26942(), ((C0206) obj2).mo26942());
            default:
                AbstractC20745 abstractC20745 = (AbstractC20745) obj;
                AbstractC20745 abstractC20746 = (AbstractC20745) obj2;
                boolean zMo33974 = abstractC20745.mo33974();
                if (zMo33974 == abstractC20746.mo33974()) {
                    return abstractC20745.getName().compareToIgnoreCase(abstractC20746.getName());
                }
                return zMo33974 ? -1 : 1;
        }
    }
}
