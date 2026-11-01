package l;

/* JADX INFO: renamed from: l.ܰۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9IR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13803 implements InterfaceC11686 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f45557;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f45558;

    public C13803(String str, int i) {
        this.f45557 = str;
        this.f45558 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33551() {
        return this.f45557;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m33552() {
        return this.f45558;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13803.class != obj.getClass()) {
            return false;
        }
        C13803 c13803 = (C13803) obj;
        if (this.f45558 != c13803.f45558) {
            return false;
        }
        return this.f45557.equals(c13803.f45557);
    }

    public final int hashCode() {
        return (this.f45557.hashCode() * 31) + this.f45558;
    }
}
