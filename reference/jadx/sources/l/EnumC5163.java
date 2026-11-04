package l;

/* JADX INFO: renamed from: l.ۙ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5163 {
    NORMAL("var.might.already.be.assigned", false),
    SPECULATIVE_LOOP("var.might.be.assigned.in.loop", true);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f18009;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f18010;

    EnumC5163(String str, boolean z) {
        this.f18009 = str;
        this.f18010 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m15582() {
        return this.f18010;
    }
}
