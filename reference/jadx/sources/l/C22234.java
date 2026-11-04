package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩷ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5C6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22234 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC22044 abstractC22044 = (AbstractC22044) obj;
        AbstractC22044 abstractC22045 = (AbstractC22044) obj2;
        boolean zMo4281 = abstractC22044.mo4281();
        if (zMo4281 == abstractC22045.mo4281()) {
            return abstractC22044.getName().compareToIgnoreCase(abstractC22045.getName());
        }
        return zMo4281 ? -1 : 1;
    }
}
