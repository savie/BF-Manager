package l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S403 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC4550(EnumC21704.RELEASE_6)
public class C6788 extends AbstractC9024 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m18928(List list, Object obj) {
        Iterator it = list.iterator();
        Set setM30271 = null;
        while (it.hasNext()) {
            setM30271 = ((C12095) this).m30271((InterfaceC12753) it.next(), (Set) obj);
        }
        return setM30271;
    }

    @Override // l.AbstractC9024
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo18929(C19986 c19986, Object obj) {
        return m18928(c19986.mo9561(), obj);
    }
}
