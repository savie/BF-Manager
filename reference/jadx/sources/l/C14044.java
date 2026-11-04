package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۬ᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14044 implements InterfaceC0621 {
    public final InterfaceC0621 a;
    public final int b;
    public final char c;

    @Override // l.InterfaceC0621
    public final int j(C25102 c25102, CharSequence charSequence, int i) {
        boolean z = c25102.c;
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == charSequence.length()) {
            return ~i;
        }
        int length = this.b + i;
        if (length > charSequence.length()) {
            if (z) {
                return ~i;
            }
            length = charSequence.length();
        }
        int i2 = i;
        while (i2 < length && c25102.a(charSequence.charAt(i2), this.c)) {
            i2++;
        }
        int iJ = this.a.j(c25102, charSequence.subSequence(0, length), i2);
        return (iJ == length || !z) ? iJ : ~(i + i2);
    }

    public C14044(InterfaceC0621 interfaceC0621, int i, char c) {
        this.a = interfaceC0621;
        this.b = i;
        this.c = c;
    }

    @Override // l.InterfaceC0621
    public final boolean i(C16150 c16150, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.i(c16150, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new C21241("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    public final String toString() {
        String str;
        char c = this.c;
        if (c == ' ') {
            str = MotionUtils.EASING_TYPE_FORMAT_END;
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + this.a + "," + this.b + str;
    }
}
