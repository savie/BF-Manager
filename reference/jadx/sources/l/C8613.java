package l;

/* JADX INFO: renamed from: l.ۡۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C8613 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f29733;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f29734;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19196 f29735;

    public C8613(String str, String str2, InterfaceC19196 interfaceC19196) {
        if (str2.isEmpty() || str2.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
        if (!str2.endsWith("/")) {
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
        this.f29733 = str;
        this.f29734 = str2;
        this.f29735 = interfaceC19196;
    }
}
