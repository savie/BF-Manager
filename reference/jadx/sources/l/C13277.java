package l;

/* JADX INFO: renamed from: l.۫ᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96DS */
/* JADX INFO: loaded from: classes4.dex */
public final class C13277 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f42409;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f42410;

    public C13277(int i, int i2) {
        this.f42410 = i;
        this.f42409 = i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m32824() {
        return this.f42410;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32823() {
        return this.f42409;
    }

    public final int hashCode() {
        return (this.f42409 * 31) + this.f42410;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13277.class != obj.getClass()) {
            return false;
        }
        C13277 c13277 = (C13277) obj;
        return this.f42409 == c13277.f42409 && this.f42410 == c13277.f42410;
    }

    public final String toString() {
        return "JUMP: " + C8314.m22396(this.f42410) + " -> " + C8314.m22396(this.f42409);
    }
}
