package l;

/* JADX INFO: renamed from: l.۬ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13591 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f43169;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f43170;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f43171;

    public C13591(String str) {
        this.f43171 = str;
    }

    public C13591(String str, String str2) {
        this.f43171 = str;
        this.f43169 = str2;
        this.f43170 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m33319() {
        return this.f43170 ? this.f43169 : this.f43171;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33318(String str) {
        if (this.f43171.equals(str)) {
            this.f43169 = null;
            this.f43170 = false;
            return false;
        }
        this.f43169 = str;
        this.f43170 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33317() {
        return this.f43171;
    }
}
