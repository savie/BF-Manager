package l;

/* JADX INFO: renamed from: l.᩸ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C9FX */
/* JADX INFO: loaded from: classes4.dex */
public final class C21731 extends RuntimeException {
    public C21731(Exception exc, String str, Object... objArr) {
        super(String.format(str, objArr), exc);
    }

    public C21731(String str, Object... objArr) {
        super(String.format(str, objArr));
    }
}
