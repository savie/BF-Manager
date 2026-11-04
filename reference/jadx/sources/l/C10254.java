package l;

/* JADX INFO: renamed from: l.ۢܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10254 extends C4866 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9508 f32749;

    @Override // l.C4866, java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable initCause(Throwable th) {
        initCause(th);
        return this;
    }

    @Override // l.C4866, java.lang.Throwable
    public final /* bridge */ /* synthetic */ C4866 initCause(Throwable th) {
        initCause(th);
        return this;
    }

    public C10254(String str, int i, int i2) {
        super(str);
        C9508 c9508 = new C9508();
        this.f32749 = c9508;
        c9508.m24890(i);
        c9508.m24886(i2);
        c9508.m24895(i);
        c9508.m24889(i2);
    }

    public C10254(String str, C9508 c9508) {
        super(str);
        this.f32749 = c9508;
    }

    public C10254(String str, C19205 c19205) {
        super(str);
        C9508 c9508 = new C9508();
        this.f32749 = c9508;
        c9508.m24894(c19205);
        c9508.m24887(c19205);
    }

    public C10254(String str, AbstractC22891 abstractC22891) {
        this(str, abstractC22891.m51626(), abstractC22891.m51625());
    }

    public C10254(String str, C5737 c5737) {
        this(str, c5737.m16799(), c5737.m16797());
    }

    @Override // l.C4866, java.lang.Throwable
    public final String toString() {
        return super.toString() + " " + this.f32749;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9508 m26443() {
        return this.f32749;
    }

    @Override // java.lang.Throwable
    public final synchronized void initCause(Throwable th) {
        super.initCause(th);
    }
}
