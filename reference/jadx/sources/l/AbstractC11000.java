package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۧ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5U2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11000 extends AbstractC6910 implements InterfaceC21707, InterfaceC4464 {
    public static final long serialVersionUID = 912559;

    @Override // l.InterfaceC21707
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC11000 mo27750();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C17349 m27749() {
        return new C17349(4);
    }

    @Override // l.AbstractC6910, java.util.Map, java.util.SortedMap
    public final Collection values() {
        return mo27750().keySet();
    }

    @Override // l.AbstractC6910, java.util.Map, java.util.SortedMap
    public final AbstractC1826 values() {
        return mo27750().keySet();
    }

    @Override // l.AbstractC6910
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC1826 mo7132() {
        throw new AssertionError("should never be called");
    }

    @Override // l.AbstractC6910
    public Object writeReplace() {
        return new C6060(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
