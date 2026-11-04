package l;

/* JADX INFO: renamed from: l.۬ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13984 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f44334;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f44335;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f44336;

    public C13984(String str) {
        this.f44336 = str;
    }

    public C13984(String str, String str2) {
        this.f44336 = str;
        this.f44334 = str2;
        this.f44335 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m34072() {
        return this.f44335 ? this.f44334 : this.f44336;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34071(String str) {
        if (this.f44336.equals(str)) {
            this.f44334 = null;
            this.f44335 = false;
            return false;
        }
        this.f44334 = str;
        this.f44335 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m34070() {
        return this.f44336;
    }
}
