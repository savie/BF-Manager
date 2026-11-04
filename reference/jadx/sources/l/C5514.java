package l;

/* JADX INFO: renamed from: l.ۚ۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6FG */
/* JADX INFO: loaded from: classes2.dex */
public final class C5514 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15867 f19191;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21943 f19192;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21943 f19193;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC24906 f19194;

    public C5514(C21943 c21943, C21943 c21944, EnumC24906 enumC24906) {
        this(c21943, c21944, enumC24906, C15867.empty());
    }

    public C5514(C21943 c21943, C21943 c21944, EnumC24906 enumC24906, C15867 c15867) {
        this.f19193 = c21943;
        this.f19192 = c21944;
        this.f19191 = c15867;
        this.f19194 = enumC24906;
        if (m16418() && c15867.isEmpty()) {
            throw new C8597("Attempted to add a null exception handler as an edge of \"" + enumC24906.toString() + "\" type");
        }
        if (m16420() && c15867.isPresent()) {
            throw new C8597("Attempted to add an exception handler as an edge of \"" + enumC24906.toString() + "\" type");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TryEdge: [");
        sb.append(this.f19194);
        sb.append(' ');
        sb.append(this.f19193.toString());
        sb.append(" -> ");
        sb.append(this.f19192.toString());
        sb.append("] - Handler: ");
        C15867 c15867 = this.f19191;
        if (c15867.isEmpty()) {
            sb.append("None");
        } else {
            sb.append(((C19684) c15867.get()).toString());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5514)) {
            return false;
        }
        C5514 c5514 = (C5514) obj;
        return this.f19193.equals(c5514.f19193) && this.f19192.equals(c5514.f19192) && this.f19191.equals(c5514.f19191) && this.f19194.equals(c5514.f19194);
    }

    public final int hashCode() {
        return C17359.hash(this.f19193, this.f19192, this.f19194, this.f19191);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21943 m16419() {
        return this.f19192;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m16418() {
        return this.f19194 == EnumC24906.HANDLER;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m16420() {
        return !m16418();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19684 m16417() {
        if (!m16418()) {
            throw new C8597("Attempted to get the exception handler of a non-handler edge type");
        }
        C15867 c15867 = this.f19191;
        if (c15867.isEmpty()) {
            throw new C8597("Attempted to get the exception handler of a handler edge type, however none was present");
        }
        return (C19684) c15867.get();
    }
}
