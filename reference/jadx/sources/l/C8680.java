package l;

/* JADX INFO: renamed from: l.ۡۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W66M */
/* JADX INFO: loaded from: classes3.dex */
public class C8680 extends RuntimeException {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f29883;

    public C8680(String str) {
        this.f29883 = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.f29883;
        if (str != null) {
            return str;
        }
        return null;
    }
}
