package l;

/* JADX INFO: renamed from: l.ۤ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10734 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double f34085;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f34086;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f34087;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f34088;

    public C10734(String str, double d) {
        this.f34087 = str;
        this.f34088 = 2;
        this.f34085 = d;
        this.f34086 = null;
    }

    public C10734(int i, String str, String str2) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        C20782.m47568(z);
        this.f34087 = str;
        this.f34088 = i;
        this.f34086 = str2;
        this.f34085 = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10734)) {
            return false;
        }
        C10734 c10734 = (C10734) obj;
        return this.f34088 == c10734.f34088 && Double.compare(this.f34085, c10734.f34085) == 0 && C17359.equals(this.f34087, c10734.f34087) && C17359.equals(this.f34086, c10734.f34086);
    }

    public final int hashCode() {
        return C17359.hash(this.f34087, Integer.valueOf(this.f34088), Double.valueOf(this.f34085), this.f34086);
    }
}
