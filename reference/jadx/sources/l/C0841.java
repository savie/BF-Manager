package l;

/* JADX INFO: renamed from: l.֨ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0841 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f3483;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f3484;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f3485;

    public C0841(String str) {
        this.f3485 = str;
    }

    public C0841(String str, String str2) {
        this.f3485 = str;
        this.f3483 = str2;
        this.f3484 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m3454() {
        return this.f3484 ? this.f3483 : this.f3485;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3453(String str) {
        if (this.f3485.equals(str)) {
            this.f3483 = null;
            this.f3484 = false;
            return false;
        }
        this.f3483 = str;
        this.f3484 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m3452() {
        return this.f3485;
    }
}
