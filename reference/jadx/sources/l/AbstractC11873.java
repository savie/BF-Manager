package l;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11873 {
    public static final C3249 a;

    static {
        EnumC22559 enumC22559 = EnumC22559.OWNER_READ;
        EnumC22559 enumC225510 = EnumC22559.OWNER_WRITE;
        HashSet hashSet = new HashSet(EnumSet.of(enumC22559, enumC225510));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((EnumC22559) it.next()).getClass();
        }
        a = new C3249(4, hashSet);
        HashSet hashSet2 = new HashSet(EnumSet.of(enumC22559, enumC225510, EnumC22559.OWNER_EXECUTE));
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            ((EnumC22559) it2.next()).getClass();
        }
        new C3249(4, hashSet2);
    }
}
