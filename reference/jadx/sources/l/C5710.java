package l;

import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C5710 implements InterfaceC0621 {
    public static volatile Map.Entry c;
    public static volatile Map.Entry d;
    public final C14435 a;
    public final String b;

    public C22118 a(C25102 c25102) {
        Map.Entry simpleImmutableEntry;
        Set<String> set = C0424.d;
        int size = set.size();
        Map.Entry entry = c25102.b ? c : d;
        if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
            synchronized (this) {
                simpleImmutableEntry = c25102.b ? c : d;
                if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                    Integer numValueOf = Integer.valueOf(size);
                    C22118 c22118 = c25102.b ? new C22118("", null, null) : new C4964("", null, null);
                    for (String str : set) {
                        c22118.a(str, str);
                    }
                    simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, c22118);
                    if (c25102.b) {
                        c = simpleImmutableEntry;
                    } else {
                        d = simpleImmutableEntry;
                    }
                }
            }
            entry = simpleImmutableEntry;
        }
        return (C22118) entry.getValue();
    }

    public C5710(C14435 c14435, String str) {
        this.a = c14435;
        this.b = str;
    }

    @Override // l.InterfaceC0621
    public boolean i(C16150 c16150, StringBuilder sb) {
        AbstractC22338 abstractC22338 = (AbstractC22338) c16150.b(this.a);
        if (abstractC22338 == null) {
            return false;
        }
        sb.append(abstractC22338.getId());
        return true;
    }

    @Override // l.InterfaceC0621
    public final int j(C25102 c25102, CharSequence charSequence, int i) {
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
            return b(c25102, charSequence, i, i, C7333.e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char cCharAt2 = charSequence.charAt(i + 1);
            if (c25102.a(cCharAt, 'U') && c25102.a(cCharAt2, 'T')) {
                int i4 = i + 3;
                if (length >= i4 && c25102.a(charSequence.charAt(i3), 'C')) {
                    return b(c25102, charSequence, i, i4, C7333.f);
                }
                return b(c25102, charSequence, i, i3, C7333.f);
            }
            if (c25102.a(cCharAt, 'G') && length >= (i2 = i + 3) && c25102.a(cCharAt2, 'M') && c25102.a(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length >= i5 && c25102.a(charSequence.charAt(i2), '0')) {
                    c25102.e(AbstractC22338.of("GMT0"));
                    return i5;
                }
                return b(c25102, charSequence, i, i2, C7333.f);
            }
        }
        C22118 c22118A = a(c25102);
        ParsePosition parsePosition = new ParsePosition(i);
        String strC = c22118A.c(charSequence, parsePosition);
        if (strC == null) {
            if (!c25102.a(cCharAt, 'Z')) {
                return ~i;
            }
            c25102.e(C11149.f);
            return i + 1;
        }
        c25102.e(AbstractC22338.of(strC));
        return parsePosition.getIndex();
    }

    public static int b(C25102 c25102, CharSequence charSequence, int i, int i2, C7333 c7333) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            c25102.e(AbstractC22338.of(upperCase));
            return i2;
        }
        if (charSequence.charAt(i2) != '0' && !c25102.a(charSequence.charAt(i2), 'Z')) {
            C25102 c25103 = new C25102(c25102.a);
            c25103.b = c25102.b;
            c25103.c = c25102.c;
            int iJ = c7333.j(c25103, charSequence, i2);
            try {
                if (iJ < 0) {
                    if (c7333 == C7333.e) {
                        return ~i;
                    }
                    c25102.e(AbstractC22338.of(upperCase));
                    return i2;
                }
                c25102.e(AbstractC22338.U(upperCase, C11149.ofTotalSeconds((int) c25103.d(EnumC8692.OFFSET_SECONDS).longValue())));
                return iJ;
            } catch (C21241 unused) {
                return ~i;
            }
        }
        c25102.e(AbstractC22338.of(upperCase));
        return i2;
    }

    public final String toString() {
        return this.b;
    }
}
