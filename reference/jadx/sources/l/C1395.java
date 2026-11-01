package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.֨᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1395 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Set f5798;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f5797 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f5796 = true;

    public C1395(C9158[] c9158Arr) {
        this.f5798 = Collections.newSetFromMap(new IdentityHashMap(c9158Arr.length));
        for (C9158 c9158 : c9158Arr) {
            this.f5798.add(c9158);
            m4883(c9158);
        }
        for (C9158 c9159 : this.f5798) {
            try {
                m4886(c9159, c9159.m23482());
            } catch (C13391 e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4883(C9158 c9158) {
        for (C9158 c9159 : c9158.m23489()) {
            if (this.f5798.add(c9159)) {
                m4883(c9159);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if ((r0 instanceof l.C16213) != false) goto L23;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC10569 m4885(java.lang.String r4, l.EnumC22563 r5) {
        /*
            r3 = this;
            java.util.HashMap r0 = r3.f5797
            java.lang.Object r0 = r0.get(r4)
            l.ۤ᩸᩸ r0 = (l.AbstractC10569) r0
            if (r0 == 0) goto L30
            l.᩹᩸᩸ r1 = l.EnumC22563.ALL_SYMBOLS
            if (r5 == r1) goto L2f
            l.᩹᩸᩸ r1 = l.EnumC22563.TYPES_ONLY
            if (r5 != r1) goto L1b
            boolean r1 = r0 instanceof l.C2806
            if (r1 != 0) goto L1a
            boolean r1 = r0 instanceof l.C7040
            if (r1 == 0) goto L1b
        L1a:
            return r0
        L1b:
            l.᩹᩸᩸ r1 = l.EnumC22563.AGGREGATES_ONLY
            if (r5 != r1) goto L30
            boolean r1 = r0 instanceof l.C2806
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof l.C7040
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof l.C5629
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof l.C16213
            if (r1 == 0) goto L30
        L2f:
            return r0
        L30:
            java.util.Set r0 = r3.f5798
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            l.ۡ᩸᩸ r1 = (l.C9158) r1
            l.֨᩸᩸ r1 = l.C9158.m23476(r1)
            java.util.HashMap r1 = r1.f5797
            java.lang.Object r1 = r1.get(r4)
            l.ۤ᩸᩸ r1 = (l.AbstractC10569) r1
            if (r1 == 0) goto L36
            l.᩹᩸᩸ r2 = l.EnumC22563.ALL_SYMBOLS
            if (r5 == r2) goto L75
            l.᩹᩸᩸ r2 = l.EnumC22563.TYPES_ONLY
            if (r5 != r2) goto L61
            boolean r2 = r1 instanceof l.C2806
            if (r2 != 0) goto L60
            boolean r2 = r1 instanceof l.C7040
            if (r2 == 0) goto L61
        L60:
            return r1
        L61:
            l.᩹᩸᩸ r2 = l.EnumC22563.AGGREGATES_ONLY
            if (r5 != r2) goto L36
            boolean r2 = r1 instanceof l.C2806
            if (r2 != 0) goto L75
            boolean r2 = r1 instanceof l.C7040
            if (r2 != 0) goto L75
            boolean r2 = r1 instanceof l.C5629
            if (r2 != 0) goto L75
            boolean r2 = r1 instanceof l.C16213
            if (r2 == 0) goto L36
        L75:
            return r1
        L76:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1395.m4885(java.lang.String, l.᩹᩸᩸):l.ۤ᩸᩸");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10569 m4884(String str, AbstractC10569 abstractC10569, EnumC22563 enumC22563) {
        AbstractC10569 abstractC10569M4885;
        String string;
        int i = 0;
        if (str.startsWith(".")) {
            string = str.substring(1);
            abstractC10569M4885 = m4885(string, enumC22563);
        } else {
            int iIndexOf = str.indexOf(46);
            String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
            StringBuilder sb = new StringBuilder(abstractC10569.mo8523());
            while (true) {
                int iLastIndexOf = sb.lastIndexOf(".");
                if (iLastIndexOf == -1) {
                    abstractC10569M4885 = m4885(str, enumC22563);
                    string = str;
                    break;
                }
                int i2 = iLastIndexOf + 1;
                sb.setLength(i2);
                sb.append(strSubstring);
                AbstractC10569 abstractC10569M4886 = m4885(sb.toString(), EnumC22563.AGGREGATES_ONLY);
                if (abstractC10569M4886 != null) {
                    if (iIndexOf != -1) {
                        sb.setLength(i2);
                        sb.append(str);
                        abstractC10569M4885 = m4885(sb.toString(), enumC22563);
                    } else {
                        abstractC10569M4885 = abstractC10569M4886;
                    }
                    string = sb.toString();
                    break;
                }
                sb.setLength(iLastIndexOf);
            }
        }
        if (abstractC10569M4885 != null) {
            return abstractC10569M4885;
        }
        if (!this.f5796 || enumC22563 != EnumC22563.TYPES_ONLY) {
            throw new C13391(abstractC10569, C16523.m38890("\"", str, "\" is not defined."), i);
        }
        C20446.f66284.warning("The descriptor for message type \"" + str + "\" cannot be found and a placeholder is created for it");
        C2806 c2806 = new C2806(string);
        this.f5798.add(c2806.mo8528());
        return c2806;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4886(C9158 c9158, String str) {
        String strSubstring;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            strSubstring = str;
        } else {
            m4886(c9158, str.substring(0, iLastIndexOf));
            strSubstring = str.substring(iLastIndexOf + 1);
        }
        C5629 c5629 = new C5629(strSubstring, str, c9158);
        HashMap map = this.f5797;
        AbstractC10569 abstractC10569 = (AbstractC10569) map.put(str, c5629);
        if (abstractC10569 != null) {
            map.put(str, abstractC10569);
            if (abstractC10569 instanceof C5629) {
                return;
            }
            StringBuilder sbM30914 = C12441.m30914("\"", strSubstring, "\" is already defined (as something other than a package) in file \"");
            sbM30914.append(abstractC10569.mo8528().getName());
            sbM30914.append("\".");
            throw new C13391(c9158, sbM30914.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4887(AbstractC10569 abstractC10569) {
        String name = abstractC10569.getName();
        int i = 0;
        if (name.length() == 0) {
            throw new C13391(abstractC10569, "Missing name.", i);
        }
        for (int i2 = 0; i2 < name.length(); i2++) {
            char cCharAt = name.charAt(i2);
            if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i2 <= 0))) {
                throw new C13391(abstractC10569, C16523.m38890("\"", name, "\" is not a valid identifier."), i);
            }
        }
        String strMo8523 = abstractC10569.mo8523();
        HashMap map = this.f5797;
        AbstractC10569 abstractC105610 = (AbstractC10569) map.put(strMo8523, abstractC10569);
        if (abstractC105610 != null) {
            map.put(strMo8523, abstractC105610);
            if (abstractC10569.mo8528() != abstractC105610.mo8528()) {
                StringBuilder sbM30914 = C12441.m30914("\"", strMo8523, "\" is already defined in file \"");
                sbM30914.append(abstractC105610.mo8528().getName());
                sbM30914.append("\".");
                throw new C13391(abstractC10569, sbM30914.toString(), i);
            }
            int iLastIndexOf = strMo8523.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                throw new C13391(abstractC10569, C16523.m38890("\"", strMo8523, "\" is already defined."), i);
            }
            throw new C13391(abstractC10569, "\"" + strMo8523.substring(iLastIndexOf + 1) + "\" is already defined in \"" + strMo8523.substring(0, iLastIndexOf) + "\".", i);
        }
    }
}
