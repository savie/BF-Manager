package l;

/* JADX INFO: renamed from: l.ᩴۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7CB */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC19644 {
    ERROR("err."),
    WARNING("warn."),
    INFO("info.");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f63280;

    EnumC19644(String str) {
        this.f63280 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m45288() {
        return name().substring(0, 1) + name().substring(1).toLowerCase();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String m45289() {
        return name().length() > 5 ? name().substring(0, 4) : name();
    }
}
