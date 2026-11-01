package l;

/* JADX INFO: renamed from: l.ܽ۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16493 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumC17198 f52996;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object[] f52997;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f52998;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f52999;

    public AbstractC16493(EnumC17198 enumC17198, String str, String str2, Object[] objArr) {
        this.f52996 = enumC17198;
        this.f52998 = str;
        this.f52999 = str2;
        this.f52997 = objArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m38768() {
        return this.f52998 + "." + this.f52996.f54839 + "." + this.f52999;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC16493 m38767(EnumC17198 enumC17198, String str, String str2, Object... objArr) {
        int iOrdinal = enumC17198.ordinal();
        if (iOrdinal == 0) {
            return new C14377(str, str2, objArr);
        }
        if (iOrdinal == 1) {
            return new C9438(str, str2, objArr);
        }
        if (iOrdinal == 2) {
            return new C14065(str, str2, objArr);
        }
        if (iOrdinal == 3) {
            return new C5909(str, str2, objArr);
        }
        C6171.m17174("Wrong diagnostic type: " + enumC17198);
        throw null;
    }
}
