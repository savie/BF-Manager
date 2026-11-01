package l;

/* JADX INFO: renamed from: l.ۨ᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: OB7X */
/* JADX INFO: loaded from: classes3.dex */
public final class C11913 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C11913 f40001 = new C11913(EnumC4856.none, null);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C11913 f40002 = new C11913(EnumC4856.xMidYMid, EnumC14030.meet);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC4856 f40003;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC14030 f40004;

    static {
        EnumC4856 enumC4856 = EnumC4856.none;
        EnumC4856 enumC4857 = EnumC4856.none;
        EnumC4856 enumC4858 = EnumC4856.none;
        EnumC4856 enumC4859 = EnumC4856.none;
        EnumC14030 enumC14030 = EnumC14030.meet;
    }

    public C11913(EnumC4856 enumC4856, EnumC14030 enumC14030) {
        this.f40003 = enumC4856;
        this.f40004 = enumC14030;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC4856 m29718() {
        return this.f40003;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC14030 m29719() {
        return this.f40004;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11913.class != obj.getClass()) {
            return false;
        }
        C11913 c11913 = (C11913) obj;
        return this.f40003 == c11913.f40003 && this.f40004 == c11913.f40004;
    }

    public final String toString() {
        return this.f40003 + " " + this.f40004;
    }
}
