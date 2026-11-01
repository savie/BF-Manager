package l;

/* JADX INFO: renamed from: l.ܺۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56OY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15746 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C15746 f51050;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC20684 f51051;

    static {
        new C15746(EnumC20684.PRESERVE_TEXT);
        f51050 = new C15746(EnumC20684.READABLE);
    }

    public C15746(EnumC20684 enumC20684) {
        if (enumC20684 == null) {
            throw new NullPointerException("whitespacePolicy");
        }
        this.f51051 = enumC20684;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC20684 m37487() {
        return this.f51051;
    }
}
