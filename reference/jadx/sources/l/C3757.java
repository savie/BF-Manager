package l;

/* JADX INFO: renamed from: l.ۘۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBIO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3757 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f13610;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f13611;

    public C3757(int i) {
        this.f13611 = i;
        this.f13610 = "Attributes incorrectly present on end tag";
    }

    public C3757(int i, String str, Object... objArr) {
        this.f13610 = String.format(str, objArr);
        this.f13611 = i;
    }

    public final String toString() {
        return this.f13611 + ": " + this.f13610;
    }
}
