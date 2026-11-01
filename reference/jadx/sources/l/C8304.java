package l;

/* JADX INFO: renamed from: l.۠ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8304 extends C19593 {
    @Override // l.C19593
    public final C19593 d(String str, String str2, C19593 c19593) {
        return new C8304(str, str2, c19593);
    }

    @Override // l.C19593
    public final boolean b(char c, char c2) {
        return C12537.b(c, c2);
    }

    @Override // l.C19593
    public final boolean e(CharSequence charSequence, int i, int i2) {
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!C12537.b(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
