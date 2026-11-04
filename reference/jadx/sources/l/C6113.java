package l;

/* JADX INFO: renamed from: l.ۛۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1EG */
/* JADX INFO: loaded from: classes3.dex */
public final class C6113 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f20857;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public StringBuilder f20859 = new StringBuilder();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f20858 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17639(String str, String str2) {
        if (this.f20858) {
            StringBuilder sb = this.f20859;
            if (sb.length() > 5000) {
                this.f20858 = false;
                sb.append("\n......");
                return;
            }
            if (!str.equals(this.f20857)) {
                this.f20857 = str;
                if (sb.length() > 0) {
                    sb.append("\n\n");
                }
                sb.append(">> ");
                sb.append(str);
            }
            sb.append('\n');
            sb.append(str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17640() {
        return this.f20859.length() > 0;
    }

    public final String toString() {
        return this.f20859.toString();
    }
}
