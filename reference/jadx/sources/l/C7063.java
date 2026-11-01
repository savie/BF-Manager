package l;

/* JADX INFO: renamed from: l.ۜ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIU */
/* JADX INFO: loaded from: classes2.dex */
public final class C7063 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23716 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f23717 = 4;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18932() {
        this.f23716 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18931(Integer num) {
        this.f23717 = num.intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m18930() {
        if (this.f23716) {
            return "\t";
        }
        String strConcat = "";
        for (int i = 0; i < this.f23717; i++) {
            strConcat = strConcat.concat(" ");
        }
        return strConcat;
    }
}
