package l;

/* JADX INFO: renamed from: l.ܳۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 56OY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15140 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C15140 f49391;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC19616 f49392;

    static {
        new C15140(EnumC19616.PRESERVE_TEXT);
        f49391 = new C15140(EnumC19616.READABLE);
    }

    public C15140(EnumC19616 enumC19616) {
        if (enumC19616 == null) {
            throw new NullPointerException("whitespacePolicy");
        }
        this.f49392 = enumC19616;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC19616 m36414() {
        return this.f49392;
    }
}
