package l;

/* JADX INFO: renamed from: l.ۡ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9FX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9382 extends RuntimeException {
    public C9382(Exception exc, String str, Object... objArr) {
        super(String.format(str, objArr), exc);
    }

    public C9382(String str, Object... objArr) {
        super(String.format(str, objArr));
    }
}
