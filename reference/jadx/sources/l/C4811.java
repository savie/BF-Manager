package l;

/* JADX INFO: renamed from: l.ۙᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4811 extends C4987 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C11868 f16903;

    @Override // l.C4987, java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable initCause(Throwable th) {
        initCause(th);
        return this;
    }

    @Override // l.C4987, java.lang.Throwable
    public final /* bridge */ /* synthetic */ C4987 initCause(Throwable th) {
        initCause(th);
        return this;
    }

    public C4811(String str, int i, int i2) {
        super(str);
        C11868 c11868 = new C11868();
        this.f16903 = c11868;
        c11868.m29588(i);
        c11868.m29581(i2);
        c11868.m29579(i);
        c11868.m29586(i2);
    }

    public C4811(String str, C3504 c3504) {
        super(str);
        C11868 c11868 = new C11868();
        this.f16903 = c11868;
        c11868.m29587(c3504);
        c11868.m29582(c3504);
    }

    public C4811(String str, C11868 c11868) {
        super(str);
        this.f16903 = c11868;
    }

    public C4811(String str, AbstractC23157 abstractC23157) {
        this(str, abstractC23157.m51155(), abstractC23157.m51159());
    }

    public C4811(String str, C18923 c18923) {
        this(str, c18923.m43583(), c18923.m43585());
    }

    @Override // l.C4987, java.lang.Throwable
    public final String toString() {
        return super.toString() + " " + this.f16903;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11868 m13367() {
        return this.f16903;
    }

    @Override // java.lang.Throwable
    public final synchronized void initCause(Throwable th) {
        super.initCause(th);
    }
}
