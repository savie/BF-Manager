package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۬ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13263 implements Comparable, Serializable {
    public static final /* synthetic */ int e = 0;
    public static final long serialVersionUID = -6946044323557704546L;
    public final long a;
    public final C1952 b;
    public final C2678 c;
    public final C2678 d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((C13263) obj).a);
    }

    public C13263(C1952 c1952, C2678 c2678, C2678 c2679) {
        c1952.getClass();
        this.a = AbstractC1726.j(c1952, c2678);
        this.b = c1952;
        this.c = c2678;
        this.d = c2679;
    }

    public C13263(long j, C2678 c2678, C2678 c2679) {
        this.a = j;
        this.b = C1952.Z(j, 0, c2678);
        this.c = c2678;
        this.d = c2679;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1267((byte) 2, this);
    }

    public final boolean l() {
        return this.d.b > this.c.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13263) {
            C13263 c13263 = (C13263) obj;
            if (this.a == c13263.a && this.c.equals(c13263.c) && this.d.equals(c13263.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() ^ this.c.b) ^ Integer.rotateLeft(this.d.b, 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(l() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.b);
        sb.append(this.c);
        sb.append(" to ");
        sb.append(this.d);
        sb.append(']');
        return sb.toString();
    }
}
