package l;

/* JADX INFO: renamed from: l.ۤܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 29JK */
/* JADX INFO: loaded from: classes3.dex */
public final class C10360 extends C13865 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f35508;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC2162 f35509;

    public C10360(C1186 c1186, String str) {
        super(str);
        this.f35508 = c1186.m4349();
        this.f35509 = c1186.m4325();
    }

    public C10360(long j, EnumC2162 enumC2162, String str, Exception exc) {
        super(str, exc);
        this.f35508 = j;
        this.f35509 = enumC2162;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        long j = this.f35508;
        return String.format("%s (0x%08x): %s", EnumC3055.m9149(j).name(), Long.valueOf(j), super.getMessage());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m26258() {
        return this.f35508;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC2162 m26257() {
        return this.f35509;
    }
}
