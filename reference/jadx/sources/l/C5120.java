package l;

/* JADX INFO: renamed from: l.ۙ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28SI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5120 extends Exception {
    public C5120(C13565 c13565) {
        this("Unhandled input format:", c13565);
    }

    public C5120(String str, C13565 c13565) {
        super(str + " " + c13565);
    }
}
