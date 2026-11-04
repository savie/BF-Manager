package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻ܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C25102 {
    public final C23742 a;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList d;
    public ArrayList e;

    public C25102(C23742 c23742) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.a = c23742;
        arrayList.add(new C14790());
    }

    public final boolean a(char c, char c2) {
        if (this.b) {
            return c == c2;
        }
        return b(c, c2);
    }

    public final boolean g(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 <= charSequence.length() && i2 + i3 <= charSequence2.length()) {
            if (this.b) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (charSequence.charAt(i + i4) == charSequence2.charAt(i2 + i4)) {
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                char cCharAt = charSequence.charAt(i + i5);
                char cCharAt2 = charSequence2.charAt(i2 + i5);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    public final C14790 c() {
        ArrayList arrayList = this.d;
        return (C14790) arrayList.get(arrayList.size() - 1);
    }

    public final Long d(EnumC8692 enumC8692) {
        return (Long) ((HashMap) c().a).get(enumC8692);
    }

    public final int f(InterfaceC16831 interfaceC16831, long j, int i, int i2) {
        C17359.requireNonNull(interfaceC16831, "field");
        Long l2 = (Long) ((HashMap) c().a).put(interfaceC16831, Long.valueOf(j));
        return (l2 == null || l2.longValue() == j) ? i2 : ~i;
    }

    public final void e(AbstractC22338 abstractC22338) {
        C17359.requireNonNull(abstractC22338, "zone");
        c().b = abstractC22338;
    }

    public final String toString() {
        return c().toString();
    }
}
