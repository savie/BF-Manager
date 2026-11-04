package l;

/* JADX INFO: renamed from: l.ۤ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7QW */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10903 {
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


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f34525;

    EnumC10903(int i) {
        this.f34525 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m27669(EnumC10903 enumC10903) {
        return this.f34525 > enumC10903.f34525;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10903 m27667(EnumC10903 enumC10903, EnumC10903 enumC10904) {
        return enumC10903.f34525 > enumC10904.f34525 ? enumC10903 : enumC10904;
    }
}
