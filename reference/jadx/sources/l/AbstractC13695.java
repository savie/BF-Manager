package l;

/* JADX INFO: renamed from: l.۬۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13695 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object[] f43441;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f43442;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f43443;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC22229 f43444;

    public AbstractC13695(EnumC22229 enumC22229, String str, String str2, Object[] objArr) {
        this.f43444 = enumC22229;
        this.f43442 = str;
        this.f43443 = str2;
        this.f43441 = objArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33485() {
        return this.f43442 + "." + this.f43444.f71617 + "." + this.f43443;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC13695 m33484(EnumC22229 enumC22229, String str, String str2, Object... objArr) {
        int iOrdinal = enumC22229.ordinal();
        if (iOrdinal == 0) {
            return new C15515(str, str2, objArr);
        }
        if (iOrdinal == 1) {
            return new C5821(str, str2, objArr);
        }
        if (iOrdinal == 2) {
            return new C25213(str, str2, objArr);
        }
        if (iOrdinal == 3) {
            return new C11040(str, str2, objArr);
        }
        C11972.m30024("Wrong diagnostic type: " + enumC22229);
        throw null;
    }
}
