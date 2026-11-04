package l;

/* JADX INFO: renamed from: l.᩷ܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29JK */
/* JADX INFO: loaded from: classes.dex */
public final class C22172 extends C12082 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f71396;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC23906 f71397;

    public C22172(C18684 c18684, String str) {
        super(str);
        this.f71396 = c18684.m43472();
        this.f71397 = c18684.m43462();
    }

    public C22172(long j, EnumC23906 enumC23906, String str, Exception exc) {
        super(str, exc);
        this.f71396 = j;
        this.f71397 = enumC23906;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        long j = this.f71396;
        return String.format("%s (0x%08x): %s", EnumC20243.m46515(j).name(), Long.valueOf(j), super.getMessage());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m50141() {
        return this.f71396;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC23906 m50140() {
        return this.f71397;
    }
}
