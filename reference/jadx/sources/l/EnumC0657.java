package l;

/* JADX INFO: renamed from: l.֡᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YL */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0657 {
    IN_FILE(".filename"),
    ADDITIONAL_IN_FILE(".filename.additional"),
    IN_FILES(".plural"),
    ADDITIONAL_IN_FILES(".plural.additional");


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f2793;

    EnumC0657(String str) {
        this.f2793 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m2986(String str) {
        StringBuilder sbM23356 = C9023.m23356(str);
        sbM23356.append(this.f2793);
        return sbM23356.toString();
    }
}
