package l;

/* JADX INFO: renamed from: l.᩻ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1EG */
/* JADX INFO: loaded from: classes.dex */
public final class C23734 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f76799;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public StringBuilder f76801 = new StringBuilder();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f76800 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52265(String str, String str2) {
        if (this.f76800) {
            StringBuilder sb = this.f76801;
            if (sb.length() > 5000) {
                this.f76800 = false;
                sb.append("\n......");
                return;
            }
            if (!str.equals(this.f76799)) {
                this.f76799 = str;
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
    public final boolean m52266() {
        return this.f76801.length() > 0;
    }

    public final String toString() {
        return this.f76801.toString();
    }
}
