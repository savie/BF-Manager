package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۤܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97UL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10942 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C5135 f34601 = new C5135();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9829 f34603 = C9829.m25601(new C22131[16]);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f34604 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f34602 = new HashMap();

    static {
        for (int i = 0; i < 128; i++) {
            if ((48 > i || i > 57) && ((65 > i || i > 90) && ((97 > i || i > 122) && i != 36 && i != 95 && i != 45))) {
                f34601.mo5933((char) i);
            }
        }
        for (int i2 = 0; i2 < 78; i2++) {
            f34601.mo5933("（）［］｛｝〈〉《》「」『』【】〔〕〖〗〘〙「」『』“”‘’。！？，、；：…—－·～｜＼／＊＃＆％＠＋－＝＜＞� \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a\u200b\u200c\u200d\u2028\u2029 \u205f\u3000\ufeff".charAt(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27765(CharSequence charSequence) {
        C9829 c9829 = this.f34603;
        c9829.clear();
        HashSet hashSet = this.f34604;
        hashSet.clear();
        HashMap map = this.f34602;
        map.clear();
        c9829.addAll(m27758(0, charSequence.length(), charSequence));
        InterfaceC15970 interfaceC15970ListIterator = c9829.listIterator(0);
        while (interfaceC15970ListIterator.hasNext()) {
            C22131 c22131 = (C22131) interfaceC15970ListIterator.next();
            ((C4977) C11392.computeIfAbsent(map, c22131, new C14057())).f17303++;
            if (c22131.m50092()) {
                hashSet.add(c22131);
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
    public final void m27764(int i, int i2, int i3, CharSequence charSequence) {
        int iMin;
        int i4;
        int i5;
        int iM27760 = m27760(i, charSequence);
        int iM27756 = m27756(i + i3, charSequence);
        int i6 = i + i2;
        C9829 c9829 = this.f34603;
        C22131[] c22131Arr = (C22131[]) c9829.m25602();
        int size = c9829.size();
        int i7 = 0;
        int i8 = 0;
        int i9 = size;
        while (i8 < i9) {
            int iM18182 = C6421.m18182(i9, i8, 2, i8);
            if (c22131Arr[iM18182].f71303 < iM27760) {
                i8 = iM18182 + 1;
            } else {
                i9 = iM18182;
            }
        }
        if (i8 >= size) {
            i8 = -(size + 1);
        } else if (c22131Arr[i8].f71303 > i6) {
            i8 = -(i8 + 1);
        }
        HashSet<C22131> hashSet = new HashSet();
        HashMap map = this.f34602;
        if (i8 >= 0) {
            C22131[] c22131Arr2 = (C22131[]) c9829.m25602();
            int size2 = c9829.size();
            int i10 = i8;
            while (i10 < size2) {
                C22131 c22131 = c22131Arr2[i10];
                C22131[] c22131Arr3 = c22131Arr2;
                if (c22131.f71303 > i6) {
                    break;
                }
                int i11 = i7 + 1;
                if (c22131.m50092()) {
                    hashSet.add(c22131);
                }
                C4977 c4977 = (C4977) map.get(c22131);
                if (c4977 != null) {
                    i4 = i6;
                    int i12 = c4977.f17303;
                    i5 = i11;
                    if (i12 <= 1) {
                        map.remove(c22131);
                    } else {
                        c4977.f17303 = i12 - 1;
                    }
                } else {
                    i4 = i6;
                    i5 = i11;
                }
                i10++;
                c22131Arr2 = c22131Arr3;
                i6 = i4;
                i7 = i5;
            }
            if (i7 > 0) {
                c9829.mo25604(i8, i7 + i8);
            }
        }
        if (i8 < 0) {
            i8 = (-i8) - 1;
        }
        if (i2 != i3) {
            int i13 = i3 - i2;
            C22131[] c22131Arr4 = (C22131[]) c9829.m25602();
            int size3 = c9829.size();
            for (int i14 = i8; i14 < size3; i14++) {
                c22131Arr4[i14].m50091(i13);
            }
        }
        int length = charSequence.length();
        HashSet hashSet2 = this.f34604;
        if (iM27760 < length && iM27760 < (iMin = Math.min(iM27756, charSequence.length()))) {
            ArrayList<C22131> arrayListM27758 = m27758(iM27760, iMin, charSequence);
            c9829.addAll(i8, arrayListM27758);
            for (C22131 c22132 : arrayListM27758) {
                C4977 c4978 = (C4977) C11392.computeIfAbsent(map, c22132, new C14057());
                int i15 = c4978.f17303 + 1;
                c4978.f17303 = i15;
                if (c22132.m50092() && i15 == 1 && !hashSet.remove(c22132)) {
                    hashSet2.add(c22132);
                }
            }
        }
        for (C22131 c22133 : hashSet) {
            if (!map.containsKey(c22133)) {
                hashSet2.remove(c22133);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m27759(int i, CharSequence charSequence) {
        int iM27760 = m27760(i, charSequence);
        return i - iM27760 > 100 ? "" : charSequence.subSequence(iM27760, i).toString();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m27761(int i, CharSequence charSequence) {
        int iM27756 = m27756(i, charSequence);
        return iM27756 - i > 100 ? "" : charSequence.subSequence(i, iM27756).toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27757(InterfaceC19106 interfaceC19106, int i) {
        return m27756(i, interfaceC19106);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m27760(int i, CharSequence charSequence) {
        if (i <= 0) {
            return 0;
        }
        do {
            i--;
            if (i < 0) {
                return 0;
            }
        } while (!f34601.mo5936(charSequence.charAt(i)));
        return i + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27756(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return charSequence.length();
        }
        while (i < charSequence.length()) {
            if (f34601.mo5936(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m27758(int i, int i2, CharSequence charSequence) {
        C5135 c5135;
        ArrayList arrayList = new ArrayList(Math.max(1, (i2 - i) / 5));
        if (charSequence != null && i < i2) {
            while (i < i2) {
                while (true) {
                    c5135 = f34601;
                    if (i >= i2 || !c5135.mo5936(charSequence.charAt(i))) {
                        break;
                    }
                    i++;
                }
                if (i >= i2) {
                    break;
                }
                int i3 = i;
                while (i3 < i2 && !c5135.mo5936(charSequence.charAt(i3))) {
                    i3++;
                }
                arrayList.add(new C22131(charSequence.subSequence(i, i3).toString(), i, i3));
                i = i3;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20670 m27763() {
        return C1170.parallelStream(this.f34604);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27762(C22131 c22131) {
        C4977 c4977 = (C4977) this.f34602.get(c22131);
        if (c4977 != null) {
            return c4977.f17303;
        }
        return 0;
    }
}
