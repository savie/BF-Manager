package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6PP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5867 extends AbstractC1415 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Set f20022;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f20023;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f20024;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f20025;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C12218 f20026;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f20027;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f20028;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final HashMap f20029;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f20030;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1072 f20031;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16077(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n' || c == '\f';
    }

    static {
        Object[] objArr = {"script", "style", "title", "textarea", "xmp", "iframe", "noembed", "noframes", "noscript", "plaintext"};
        HashSet hashSet = new HashSet(10);
        for (int i = 0; i < 10; i++) {
            Object obj = objArr[i];
            C13638.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        f20022 = C0561.unmodifiableSet(hashSet);
    }

    public AbstractC5867(C3894 c3894) {
        super(c3894);
        this.f20026 = new C12218();
        this.f20029 = new HashMap();
        CharSequence charSequenceM11330 = c3894.m11330();
        this.f20031 = charSequenceM11330 instanceof C1072 ? (C1072) charSequenceM11330 : null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m16081() {
        return this.f20023;
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
    @Override // l.AbstractC1415, l.InterfaceC10589
    public final InterfaceC19761 nextToken() {
        C3894.m11326();
        if (this.f20023) {
            return m4954();
        }
        if (this.f20028 != null) {
            InterfaceC1623 interfaceC1623 = this.f5842;
            if (interfaceC1623.mo11332(1) != -1) {
                int iIndex = interfaceC1623.index();
                CharSequence charSequenceM11330 = ((C3894) interfaceC1623).m11330();
                int length = (this.f20028.equals("plaintext") ? charSequenceM11330.length() : m16079(this.f20028, charSequenceM11330, iIndex)) - iIndex;
                this.f20028 = null;
                if (length > 0) {
                    C9386 c9386 = new C9386(this.f5853, 1, 0, iIndex, (iIndex + length) - 1);
                    c9386.m24077(getLine());
                    c9386.m24078(mo4948());
                    for (int i = 0; i < length; i++) {
                        ((C17727) m43804()).m41272(interfaceC1623);
                    }
                    return c9386;
                }
            }
        }
        InterfaceC19761 interfaceC19761NextToken = super.nextToken();
        C1072 c1072 = this.f20031;
        if (c1072 == null || interfaceC19761NextToken.getType() != 14 || this.f20030 != null || !c1072.m4048(interfaceC19761NextToken.mo22508(), interfaceC19761NextToken.mo22510() + 1)) {
            C12218 c12218 = this.f20026;
            if (c1072 != null && !this.f20027 && c1072.m4048(interfaceC19761NextToken.mo22508(), interfaceC19761NextToken.mo22510() + 1)) {
                boolean z = interfaceC19761NextToken.getType() != 19 || this.f20025 == null;
                if (!"annotation-xml".equals(this.f20030)) {
                }
            }
            int type = interfaceC19761NextToken.getType();
            HashMap map = this.f20029;
            if (type == 6 || type == 7) {
                this.f20030 = null;
                this.f20027 = interfaceC19761NextToken.getType() == 6;
                map.clear();
                this.f20025 = null;
                return interfaceC19761NextToken;
            }
            if (type == 10 || type == 11) {
                boolean z2 = interfaceC19761NextToken.getType() == 10;
                String str = this.f20030;
                if (str != null) {
                    if (this.f20027) {
                        c12218.m30330(str);
                    } else if (c12218.m30331(str, map, z2, null).f52898 == 0 && f20022.contains(this.f20030)) {
                        this.f20028 = this.f20030;
                    }
                }
                this.f20030 = null;
                return interfaceC19761NextToken;
            }
            if (type == 14) {
                if (this.f20030 == null) {
                    this.f20030 = m16076(interfaceC19761NextToken.getText());
                    return interfaceC19761NextToken;
                }
                String strM16076 = m16076(interfaceC19761NextToken.getText());
                this.f20025 = strM16076;
                boolean zContainsKey = map.containsKey(strM16076);
                this.f20024 = !zContainsKey;
                if (!zContainsKey) {
                    map.put(this.f20025, "");
                }
            } else if (type == 19 || type == 20) {
                if (this.f20025 != null && this.f20024) {
                    String text = interfaceC19761NextToken.getText();
                    if (interfaceC19761NextToken.getType() == 19 && text.length() >= 2) {
                        text = C20630.m46498(1, 1, text);
                    }
                    map.put(this.f20025, text);
                }
                this.f20025 = null;
                return interfaceC19761NextToken;
            }
            return interfaceC19761NextToken;
        }
        this.f20023 = true;
        return m4954();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m16080() {
        C16451 c16451M30329 = this.f20026.m30329();
        InterfaceC1623 interfaceC1623 = this.f5842;
        if (c16451M30329 == null || c16451M30329.f52898 == 0) {
            while (interfaceC1623.mo11332(1) != -1) {
                int iMo11332 = interfaceC1623.mo11332(1);
                ((C17727) m43804()).m41272(interfaceC1623);
                if (iMo11332 == 62) {
                    break;
                }
            }
            this.f5850 = 2;
            return;
        }
        while (true) {
            int iMin = 0;
            while (interfaceC1623.mo11332(1) != -1) {
                int iMo11333 = interfaceC1623.mo11332(1);
                ((C17727) m43804()).m41272(interfaceC1623);
                if (iMo11333 == 62 && iMin >= 2) {
                    return;
                }
                if (iMo11333 == 93) {
                    iMin = Math.min(2, iMin + 1);
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16075(CharSequence charSequence, String str) {
        return m16079(str, charSequence, 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0066 A[PHI: r2 r3
      0x0066: PHI (r2v2 char) = (r2v1 char), (r2v4 char), (r2v4 char) binds: [B:9:0x001e, B:27:0x0057, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r3v2 int) = (r3v1 int), (r3v4 int), (r3v4 int) binds: [B:9:0x001e, B:27:0x0057, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m16079(String str, CharSequence charSequence, int i) {
        boolean zEquals = str.equals("script");
        String strConcat = "</".concat(str);
        char c = 0;
        int iMin = 0;
        while (i < charSequence.length()) {
            if ((i & 1023) == 0) {
                C3894.m11326();
            }
            if (zEquals) {
                if (c == 0 && C21460.m48082(charSequence, false, i, "<!--", 4)) {
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
                    if (c == 1 && m16078("<script", charSequence, i)) {
                        i += 6;
                        c = 2;
                    } else if (c == 2 && m16078("</script", charSequence, i)) {
                        i += 7;
                        c = 1;
                    } else if (c != 2) {
                        continue;
                    }
                    iMin = 0;
                }
            } else if (c != 2 && m16078(strConcat, charSequence, i)) {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16078(String str, CharSequence charSequence, int i) {
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
        return cCharAt2 == '>' || cCharAt2 == '/' || m16077(cCharAt2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m16076(String str) {
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
