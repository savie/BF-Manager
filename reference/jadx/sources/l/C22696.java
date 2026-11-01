package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩺ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97UL */
/* JADX INFO: loaded from: classes.dex */
public final class C22696 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C0459 f73931 = new C0459();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C8387 f73933 = C8387.m22018(new C6467[16]);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f73934 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f73932 = new HashMap();

    static {
        for (int i = 0; i < 128; i++) {
            if ((48 > i || i > 57) && ((65 > i || i > 90) && ((97 > i || i > 122) && i != 36 && i != 95 && i != 45))) {
                f73931.mo2291((char) i);
            }
        }
        for (int i2 = 0; i2 < 78; i2++) {
            f73931.mo2291("（）［］｛｝〈〉《》「」『』【】〔〕〖〗〘〙「」『』“”‘’。！？，、；：…—－·～｜＼／＊＃＆％＠＋－＝＜＞� \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a\u200b\u200c\u200d\u2028\u2029 \u205f\u3000\ufeff".charAt(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50265(CharSequence charSequence) {
        C8387 c8387 = this.f73933;
        c8387.clear();
        HashSet hashSet = this.f73934;
        hashSet.clear();
        HashMap map = this.f73932;
        map.clear();
        c8387.addAll(m50259(0, charSequence.length(), charSequence));
        InterfaceC13722 interfaceC13722ListIterator = c8387.listIterator(0);
        while (interfaceC13722ListIterator.hasNext()) {
            C6467 c6467 = (C6467) interfaceC13722ListIterator.next();
            ((C3644) C9735.computeIfAbsent(map, c6467, new C12818())).f13367++;
            if (c6467.m17669()) {
                hashSet.add(c6467);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50264(int i, int i2, int i3, CharSequence charSequence) {
        int iMin;
        int i4;
        int i5;
        int iM50261 = m50261(i, charSequence);
        int iM50257 = m50257(i + i3, charSequence);
        int i6 = i + i2;
        C8387 c8387 = this.f73933;
        C6467[] c6467Arr = (C6467[]) c8387.m22019();
        int size = c8387.size();
        int i7 = 0;
        int i8 = 0;
        int i9 = size;
        while (i8 < i9) {
            int iM9602 = C3184.m9602(i9, i8, 2, i8);
            if (c6467Arr[iM9602].f21838 < iM50261) {
                i8 = iM9602 + 1;
            } else {
                i9 = iM9602;
            }
        }
        if (i8 >= size) {
            i8 = -(size + 1);
        } else if (c6467Arr[i8].f21838 > i6) {
            i8 = -(i8 + 1);
        }
        HashSet<C6467> hashSet = new HashSet();
        HashMap map = this.f73932;
        if (i8 >= 0) {
            C6467[] c6467Arr2 = (C6467[]) c8387.m22019();
            int size2 = c8387.size();
            int i10 = i8;
            while (i10 < size2) {
                C6467 c6467 = c6467Arr2[i10];
                C6467[] c6467Arr3 = c6467Arr2;
                if (c6467.f21838 > i6) {
                    break;
                }
                int i11 = i7 + 1;
                if (c6467.m17669()) {
                    hashSet.add(c6467);
                }
                C3644 c3644 = (C3644) map.get(c6467);
                if (c3644 != null) {
                    i4 = i6;
                    int i12 = c3644.f13367;
                    i5 = i11;
                    if (i12 <= 1) {
                        map.remove(c6467);
                    } else {
                        c3644.f13367 = i12 - 1;
                    }
                } else {
                    i4 = i6;
                    i5 = i11;
                }
                i10++;
                c6467Arr2 = c6467Arr3;
                i6 = i4;
                i7 = i5;
            }
            if (i7 > 0) {
                c8387.mo12692(i8, i7 + i8);
            }
        }
        if (i8 < 0) {
            i8 = (-i8) - 1;
        }
        if (i2 != i3) {
            int i13 = i3 - i2;
            C6467[] c6467Arr4 = (C6467[]) c8387.m22019();
            int size3 = c8387.size();
            for (int i14 = i8; i14 < size3; i14++) {
                c6467Arr4[i14].m17668(i13);
            }
        }
        int length = charSequence.length();
        HashSet hashSet2 = this.f73934;
        if (iM50261 < length && iM50261 < (iMin = Math.min(iM50257, charSequence.length()))) {
            ArrayList<C6467> arrayListM50259 = m50259(iM50261, iMin, charSequence);
            c8387.addAll(i8, arrayListM50259);
            for (C6467 c6468 : arrayListM50259) {
                C3644 c3645 = (C3644) C9735.computeIfAbsent(map, c6468, new C12818());
                int i15 = c3645.f13367 + 1;
                c3645.f13367 = i15;
                if (c6468.m17669() && i15 == 1 && !hashSet.remove(c6468)) {
                    hashSet2.add(c6468);
                }
            }
        }
        for (C6467 c6469 : hashSet) {
            if (!map.containsKey(c6469)) {
                hashSet2.remove(c6469);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m50260(int i, CharSequence charSequence) {
        int iM50261 = m50261(i, charSequence);
        return i - iM50261 > 100 ? "" : charSequence.subSequence(iM50261, i).toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m50256(int i, CharSequence charSequence) {
        int iM50257 = m50257(i, charSequence);
        return iM50257 - i > 100 ? "" : charSequence.subSequence(i, iM50257).toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50258(InterfaceC2916 interfaceC2916, int i) {
        return m50257(i, interfaceC2916);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m50261(int i, CharSequence charSequence) {
        if (i <= 0) {
            return 0;
        }
        do {
            i--;
            if (i < 0) {
                return 0;
            }
        } while (!f73931.mo2286(charSequence.charAt(i)));
        return i + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50257(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return charSequence.length();
        }
        while (i < charSequence.length()) {
            if (f73931.mo2286(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m50259(int i, int i2, CharSequence charSequence) {
        C0459 c0459;
        ArrayList arrayList = new ArrayList(Math.max(1, (i2 - i) / 5));
        if (charSequence != null && i < i2) {
            while (i < i2) {
                while (true) {
                    c0459 = f73931;
                    if (i >= i2 || !c0459.mo2286(charSequence.charAt(i))) {
                        break;
                    }
                    i++;
                }
                if (i >= i2) {
                    break;
                }
                int i3 = i;
                while (i3 < i2 && !c0459.mo2286(charSequence.charAt(i3))) {
                    i3++;
                }
                arrayList.add(new C6467(charSequence.subSequence(i, i3).toString(), i, i3));
                i = i3;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5046 m50263() {
        return C9030.parallelStream(this.f73934);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50262(C6467 c6467) {
        C3644 c3644 = (C3644) this.f73932.get(c6467);
        if (c3644 != null) {
            return c3644.f13367;
        }
        return 0;
    }
}
