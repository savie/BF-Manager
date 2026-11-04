package l;

/* JADX INFO: renamed from: l.ܰۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QBIO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14392 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f45347;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f45348;

    public C14392(int i) {
        this.f45348 = i;
        this.f45347 = "Attributes incorrectly present on end tag";
    }

    public C14392(int i, String str, Object... objArr) {
        this.f45347 = String.format(str, objArr);
        this.f45348 = i;
    }

    public final String toString() {
        return this.f45348 + ": " + this.f45347;
    }
}
