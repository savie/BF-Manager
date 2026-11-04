package l;

/* JADX INFO: renamed from: l.۬ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YL */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC14023 {
    IN_FILE(".filename"),
    ADDITIONAL_IN_FILE(".filename.additional"),
    IN_FILES(".plural"),
    ADDITIONAL_IN_FILES(".plural.additional");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f44429;

    EnumC14023(String str) {
        this.f44429 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m34151(String str) {
        StringBuilder sbM27333 = C10732.m27333(str);
        sbM27333.append(this.f44429);
        return sbM27333.toString();
    }
}
