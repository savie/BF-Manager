package l;

/* JADX INFO: renamed from: l.ܺ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7CB */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15934 {
    ERROR("err."),
    WARNING("warn."),
    INFO("info.");


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f51622;

    EnumC15934(String str) {
        this.f51622 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m37892() {
        return name().substring(0, 1) + name().substring(1).toLowerCase();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String m37893() {
        return name().length() > 5 ? name().substring(0, 4) : name();
    }
}
