package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6PP */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16632 extends AbstractC14709 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Set f53768;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f53769;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C0225 f53770;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f53771;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11411 f53772;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f53773;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f53774;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final HashMap f53775;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f53776;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f53777;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39351(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n' || c == '\f';
    }

    static {
        Object[] objArr = {"script", "style", "title", "textarea", "xmp", "iframe", "noembed", "noframes", "noscript", "plaintext"};
        HashSet hashSet = new HashSet(10);
        for (int i = 0; i < 10; i++) {
            Object obj = objArr[i];
            C17359.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        f53768 = C4681.unmodifiableSet(hashSet);
    }

    public AbstractC16632(C18870 c18870) {
        super(c18870);
        this.f53772 = new C11411();
        this.f53775 = new HashMap();
        CharSequence charSequenceM43770 = c18870.m43770();
        this.f53770 = charSequenceM43770 instanceof C0225 ? (C0225) charSequenceM43770 : null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m39355() {
        return this.f53774;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC14709, l.InterfaceC13963
    public final InterfaceC8743 nextToken() {
        C18870.m43769();
        if (this.f53774) {
            return m35381();
        }
        if (this.f53773 != null) {
            InterfaceC17693 interfaceC17693 = this.f48057;
            if (interfaceC17693.mo11537(1) != -1) {
                int iIndex = interfaceC17693.index();
                CharSequence charSequenceM43770 = ((C18870) interfaceC17693).m43770();
                int length = (this.f53773.equals("plaintext") ? charSequenceM43770.length() : m39353(this.f53773, charSequenceM43770, iIndex)) - iIndex;
                this.f53773 = null;
                if (length > 0) {
                    C16201 c16201 = new C16201(this.f48065, 1, 0, iIndex, (iIndex + length) - 1);
                    c16201.m38428(getLine());
                    c16201.m38432(mo34037());
                    for (int i = 0; i < length; i++) {
                        ((C1308) m24871()).m4769(interfaceC17693);
                    }
                    return c16201;
                }
            }
        }
        InterfaceC8743 interfaceC8743NextToken = super.nextToken();
        C0225 c0225 = this.f53770;
        if (c0225 == null || interfaceC8743NextToken.getType() != 14 || this.f53776 != null || !c0225.m1698(interfaceC8743NextToken.mo23442(), interfaceC8743NextToken.mo23440() + 1)) {
            C11411 c11411 = this.f53772;
            if (c0225 != null && !this.f53771 && c0225.m1698(interfaceC8743NextToken.mo23442(), interfaceC8743NextToken.mo23440() + 1)) {
                boolean z = interfaceC8743NextToken.getType() != 19 || this.f53769 == null;
                if (!"annotation-xml".equals(this.f53776)) {
                }
            }
            int type = interfaceC8743NextToken.getType();
            HashMap map = this.f53775;
            if (type == 6 || type == 7) {
                this.f53776 = null;
                this.f53771 = interfaceC8743NextToken.getType() == 6;
                map.clear();
                this.f53769 = null;
                return interfaceC8743NextToken;
            }
            if (type == 10 || type == 11) {
                boolean z2 = interfaceC8743NextToken.getType() == 10;
                String str = this.f53776;
                if (str != null) {
                    if (this.f53771) {
                        c11411.m28763(str);
                    } else if (c11411.m28764(str, map, z2, null).f5871 == 0 && f53768.contains(this.f53776)) {
                        this.f53773 = this.f53776;
                    }
                }
                this.f53776 = null;
                return interfaceC8743NextToken;
            }
            if (type == 14) {
                if (this.f53776 == null) {
                    this.f53776 = m39350(interfaceC8743NextToken.getText());
                    return interfaceC8743NextToken;
                }
                String strM39350 = m39350(interfaceC8743NextToken.getText());
                this.f53769 = strM39350;
                boolean zContainsKey = map.containsKey(strM39350);
                this.f53777 = !zContainsKey;
                if (!zContainsKey) {
                    map.put(this.f53769, "");
                }
            } else if (type == 19 || type == 20) {
                if (this.f53769 != null && this.f53777) {
                    String text = interfaceC8743NextToken.getText();
                    if (interfaceC8743NextToken.getType() == 19 && text.length() >= 2) {
                        text = C1402.m5124(1, 1, text);
                    }
                    map.put(this.f53769, text);
                }
                this.f53769 = null;
                return interfaceC8743NextToken;
            }
            return interfaceC8743NextToken;
        }
        this.f53774 = true;
        return m35381();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m39354() {
        C1717 c1717M28762 = this.f53772.m28762();
        InterfaceC17693 interfaceC17693 = this.f48057;
        if (c1717M28762 == null || c1717M28762.f5871 == 0) {
            while (interfaceC17693.mo11537(1) != -1) {
                int iMo11537 = interfaceC17693.mo11537(1);
                ((C1308) m24871()).m4769(interfaceC17693);
                if (iMo11537 == 62) {
                    break;
                }
            }
            this.f48064 = 2;
            return;
        }
        while (true) {
            int iMin = 0;
            while (interfaceC17693.mo11537(1) != -1) {
                int iMo11538 = interfaceC17693.mo11537(1);
                ((C1308) m24871()).m4769(interfaceC17693);
                if (iMo11538 == 62 && iMin >= 2) {
                    return;
                }
                if (iMo11538 == 93) {
                    iMin = Math.min(2, iMin + 1);
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39349(CharSequence charSequence, String str) {
        return m39353(str, charSequence, 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0066 A[PHI: r2 r3
      0x0066: PHI (r2v2 char) = (r2v1 char), (r2v4 char), (r2v4 char) binds: [B:9:0x001e, B:27:0x0057, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r3v2 int) = (r3v1 int), (r3v4 int), (r3v4 int) binds: [B:9:0x001e, B:27:0x0057, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m39353(String str, CharSequence charSequence, int i) {
        boolean zEquals = str.equals("script");
        String strConcat = "</".concat(str);
        char c = 0;
        int iMin = 0;
        while (i < charSequence.length()) {
            if ((i & 1023) == 0) {
                C18870.m43769();
            }
            if (zEquals) {
                if (c == 0 && C18856.m43750(charSequence, false, i, "<!--", 4)) {
                    i += 3;
                    c = 1;
                    iMin = 2;
                } else {
                    if (c != 0) {
                        char cCharAt = charSequence.charAt(i);
                        if (cCharAt == '-') {
                            iMin = Math.min(2, iMin + 1);
                        } else {
                            if (cCharAt == '>' && iMin == 2) {
                                c = 0;
                            }
                            iMin = 0;
                        }
                    }
                    if (c == 1 && m39352("<script", charSequence, i)) {
                        i += 6;
                        c = 2;
                    } else if (c == 2 && m39352("</script", charSequence, i)) {
                        i += 7;
                        c = 1;
                    } else if (c != 2) {
                        continue;
                    }
                    iMin = 0;
                }
            } else if (c != 2 && m39352(strConcat, charSequence, i)) {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39352(String str, CharSequence charSequence, int i) {
        int length = str.length() + i;
        if (length >= charSequence.length()) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = charSequence.charAt(i + i2);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                cCharAt = (char) (cCharAt + ' ');
            }
            if (cCharAt != str.charAt(i2)) {
                return false;
            }
        }
        char cCharAt2 = charSequence.charAt(length);
        return cCharAt2 == '>' || cCharAt2 == '/' || m39351(cCharAt2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39350(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                cCharAt = (char) (cCharAt + ' ');
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
