package l;

import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C20298 implements InterfaceC22415 {
    public static volatile Map.Entry c;
    public static volatile Map.Entry d;
    public final C22935 a;
    public final String b;

    public C19593 a(C12537 c12537) {
        Map.Entry simpleImmutableEntry;
        Set<String> set = C18201.d;
        int size = set.size();
        Map.Entry entry = c12537.b ? c : d;
        if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
            synchronized (this) {
                simpleImmutableEntry = c12537.b ? c : d;
                if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                    Integer numValueOf = Integer.valueOf(size);
                    C19593 c19593 = c12537.b ? new C19593("", null, null) : new C8304("", null, null);
                    for (String str : set) {
                        c19593.a(str, str);
                    }
                    simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, c19593);
                    if (c12537.b) {
                        c = simpleImmutableEntry;
                    } else {
                        d = simpleImmutableEntry;
                    }
                }
            }
            entry = simpleImmutableEntry;
        }
        return (C19593) entry.getValue();
    }

    public C20298(C22935 c22935, String str) {
        this.a = c22935;
        this.b = str;
    }

    @Override // l.InterfaceC22415
    public boolean l(C11126 c11126, StringBuilder sb) {
        AbstractC9114 abstractC9114 = (AbstractC9114) c11126.b(this.a);
        if (abstractC9114 == null) {
            return false;
        }
        sb.append(abstractC9114.k());
        return true;
    }

    @Override // l.InterfaceC22415
    public final int m(C12537 c12537, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(c12537, charSequence, i, i, C18181.e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char cCharAt2 = charSequence.charAt(i + 1);
            if (c12537.a(cCharAt, 'U') && c12537.a(cCharAt2, 'T')) {
                int i4 = i + 3;
                if (length >= i4 && c12537.a(charSequence.charAt(i3), 'C')) {
                    return b(c12537, charSequence, i, i4, C18181.f);
                }
                return b(c12537, charSequence, i, i3, C18181.f);
            }
            if (c12537.a(cCharAt, 'G') && length >= (i2 = i + 3) && c12537.a(cCharAt2, 'M') && c12537.a(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length >= i5 && c12537.a(charSequence.charAt(i2), '0')) {
                    c12537.e(AbstractC9114.X("GMT0", true));
                    return i5;
                }
                return b(c12537, charSequence, i, i2, C18181.f);
            }
        }
        C19593 c19593A = a(c12537);
        ParsePosition parsePosition = new ParsePosition(i);
        String strC = c19593A.c(charSequence, parsePosition);
        if (strC == null) {
            if (!c12537.a(cCharAt, 'Z')) {
                return ~i;
            }
            c12537.e(C2678.f);
            return i + 1;
        }
        c12537.e(AbstractC9114.X(strC, true));
        return parsePosition.getIndex();
    }

    public static int b(C12537 c12537, CharSequence charSequence, int i, int i2, C18181 c18181) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            c12537.e(AbstractC9114.X(upperCase, true));
            return i2;
        }
        if (charSequence.charAt(i2) != '0' && !c12537.a(charSequence.charAt(i2), 'Z')) {
            C12537 c12538 = new C12537(c12537.a);
            c12538.b = c12537.b;
            c12538.c = c12537.c;
            int iM = c18181.m(c12538, charSequence, i2);
            try {
                if (iM < 0) {
                    if (c18181 == C18181.e) {
                        return ~i;
                    }
                    c12537.e(AbstractC9114.X(upperCase, true));
                    return i2;
                }
                c12537.e(AbstractC9114.Y(upperCase, C2678.e0((int) c12538.d(EnumC18762.OFFSET_SECONDS).longValue())));
                return iM;
            } catch (C15464 unused) {
                return ~i;
            }
        }
        c12537.e(AbstractC9114.X(upperCase, true));
        return i2;
    }

    public final String toString() {
        return this.b;
    }
}
