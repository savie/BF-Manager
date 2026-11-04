package l;

/* JADX INFO: renamed from: l.᩵ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5RL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20331 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23315 f65231;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f65232;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3177 f65233;

    public C20331(int i, C23315 c23315) {
        this.f65232 = i;
        this.f65231 = c23315;
    }

    public C20331(int i, C3177 c3177) {
        this.f65232 = i;
        this.f65233 = c3177;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20331.class == obj.getClass()) {
            C20331 c20331 = (C20331) obj;
            C3177 c3177 = c20331.f65233;
            C23315 c23315 = c20331.f65231;
            if (this.f65232 != c20331.f65232) {
                return false;
            }
            C23315 c23316 = this.f65231;
            if (c23316 == null ? c23315 != null : !c23316.equals(c23315)) {
                return false;
            }
            C3177 c3178 = this.f65233;
            if (c3178 != null) {
                return c3178.equals(c3177);
            }
            if (c3177 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f65232 * 31;
        C23315 c23315 = this.f65231;
        int iHashCode = (i + (c23315 != null ? c23315.hashCode() : 0)) * 31;
        C3177 c3177 = this.f65233;
        return iHashCode + (c3177 != null ? c3177.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m46708() {
        return this.f65232;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23315 m46707() {
        return this.f65231;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3177 m46709() {
        return this.f65233;
    }
}
