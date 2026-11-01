package l;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9840 {
    public static final C5295 a;

    static {
        EnumC17207 enumC17207 = EnumC17207.OWNER_READ;
        EnumC17207 enumC17208 = EnumC17207.OWNER_WRITE;
        HashSet hashSet = new HashSet(EnumSet.of(enumC17207, enumC17208));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((EnumC17207) it.next()).getClass();
        }
        a = new C5295(4, hashSet);
        HashSet hashSet2 = new HashSet(EnumSet.of(enumC17207, enumC17208, EnumC17207.OWNER_EXECUTE));
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            ((EnumC17207) it2.next()).getClass();
        }
        new C5295(4, hashSet2);
    }
}
