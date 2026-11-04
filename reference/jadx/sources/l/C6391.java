package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۛ۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6391 implements Comparable, Serializable {
    public static final /* synthetic */ int e = 0;
    public static final long serialVersionUID = -6946044323557704546L;
    public final long a;
    public final C19003 b;
    public final C11149 c;
    public final C11149 d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((C6391) obj).a);
    }

    public C6391(C19003 c19003, C11149 c11149, C11149 c111410) {
        c19003.getClass();
        this.a = AbstractC1758.j(c19003, c11149);
        this.b = c19003;
        this.c = c11149;
        this.d = c111410;
    }

    public C6391(long j, C11149 c11149, C11149 c111410) {
        this.a = j;
        this.b = C19003.U(j, 0, c11149);
        this.c = c11149;
        this.d = c111410;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C12356((byte) 2, this);
    }

    public final boolean i() {
        return this.d.getTotalSeconds() > this.c.getTotalSeconds();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6391) {
            C6391 c6391 = (C6391) obj;
            if (this.a == c6391.a && this.c.equals(c6391.c) && this.d.equals(c6391.d)) {
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
        sb.append(i() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.b);
        sb.append(this.c);
        sb.append(" to ");
        sb.append(this.d);
        sb.append(']');
        return sb.toString();
    }
}
