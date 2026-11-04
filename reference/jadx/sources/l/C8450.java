package l;

/* JADX INFO: renamed from: l.۠ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8450 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f27622 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f27624 = 4;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f27623 = "WARN";

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22635() {
        this.f27622 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22634(Integer num) {
        this.f27624 = num.intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m22633() {
        if (this.f27622) {
            return "\t";
        }
        String strConcat = "";
        for (int i = 0; i < this.f27624; i++) {
            strConcat = strConcat.concat(" ");
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m22636() {
        return this.f27623;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m22637() {
        this.f27623 = "FAIL";
    }
}
