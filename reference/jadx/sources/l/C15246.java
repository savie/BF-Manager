package l;

/* JADX INFO: renamed from: l.ܶ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15246 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f49710;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f49711;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f49712;

    public C15246(String str) {
        this.f49712 = str;
    }

    public C15246(String str, String str2) {
        this.f49712 = str;
        this.f49710 = str2;
        this.f49711 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m36517() {
        return this.f49711 ? this.f49710 : this.f49712;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36516(String str) {
        if (this.f49712.equals(str)) {
            this.f49710 = null;
            this.f49711 = false;
            return false;
        }
        this.f49710 = str;
        this.f49711 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m36515() {
        return this.f49712;
    }
}
