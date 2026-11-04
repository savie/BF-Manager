package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;

/* JADX INFO: renamed from: l.۠ܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5U2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8704 extends AbstractC17589 implements InterfaceC23754, InterfaceC16613 {
    public static final long serialVersionUID = 912559;

    @Override // l.InterfaceC23754
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC8704 mo23396();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9449 m23395() {
        return new C9449(4);
    }

    @Override // l.AbstractC17589, java.util.Map
    public final Collection values() {
        return mo23396().keySet();
    }

    @Override // l.AbstractC17589, java.util.Map
    public final AbstractC4911 values() {
        return mo23396().keySet();
    }

    @Override // l.AbstractC17589
    public Object writeReplace() {
        return new C2738(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
