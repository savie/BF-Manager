package l;

/* JADX INFO: renamed from: l.۫ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OB7X */
/* JADX INFO: loaded from: classes4.dex */
public final class C12807 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC19520 f41038;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC15044 f41039;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C12807 f41037 = new C12807(EnumC19520.none, null);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C12807 f41036 = new C12807(EnumC19520.xMidYMid, EnumC15044.meet);

    static {
        EnumC19520 enumC19520 = EnumC19520.none;
        EnumC19520 enumC19521 = EnumC19520.none;
        EnumC19520 enumC19522 = EnumC19520.none;
        EnumC19520 enumC19523 = EnumC19520.none;
        EnumC15044 enumC15044 = EnumC15044.meet;
    }

    public C12807(EnumC19520 enumC19520, EnumC15044 enumC15044) {
        this.f41038 = enumC19520;
        this.f41039 = enumC15044;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC19520 m31770() {
        return this.f41038;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC15044 m31771() {
        return this.f41039;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12807.class != obj.getClass()) {
            return false;
        }
        C12807 c12807 = (C12807) obj;
        return this.f41038 == c12807.f41038 && this.f41039 == c12807.f41039;
    }

    public final String toString() {
        return this.f41038 + " " + this.f41039;
    }
}
