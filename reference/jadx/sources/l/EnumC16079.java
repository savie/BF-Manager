package l;

/* JADX INFO: renamed from: l.ܺܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7QW */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16079 {
    INIT(0),
    PARSE(1),
    ENTER(2),
    PROCESS(3),
    ATTR(4),
    FLOW(5),
    TRANSTYPES(6),
    TRANSPATTERNS(7),
    UNLAMBDA(8),
    LOWER(9),
    GENERATE(10);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f52006;

    EnumC16079(int i) {
        this.f52006 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m38107(EnumC16079 enumC16079) {
        return this.f52006 > enumC16079.f52006;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16079 m38105(EnumC16079 enumC16079, EnumC16079 enumC160710) {
        return enumC16079.f52006 > enumC160710.f52006 ? enumC16079 : enumC160710;
    }
}
