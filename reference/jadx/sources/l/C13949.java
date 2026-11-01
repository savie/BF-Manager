package l;

/* JADX INFO: renamed from: l.ܰܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13949 implements InterfaceC22415 {
    public final char a;

    public C13949(char c) {
        this.a = c;
    }

    @Override // l.InterfaceC22415
    public final boolean l(C11126 c11126, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    @Override // l.InterfaceC22415
    public final int m(C12537 c12537, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c = this.a;
        return (cCharAt == c || (!c12537.b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c)))) ? i + 1 : ~i;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
