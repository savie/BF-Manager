package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes.dex */
public final class C21494 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Set f68710;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f68709 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f68708 = true;

    public C21494(C14034[] c14034Arr) {
        this.f68710 = Collections.newSetFromMap(new IdentityHashMap(c14034Arr.length));
        for (C14034 c14034 : c14034Arr) {
            this.f68710.add(c14034);
            m48900(c14034);
        }
        for (C14034 c14035 : this.f68710) {
            try {
                m48904(c14035, c14035.m34198());
            } catch (C18510 e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48900(C14034 c14034) {
        for (C14034 c14035 : c14034.m34191()) {
            if (this.f68710.add(c14035)) {
                m48900(c14035);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if ((r0 instanceof l.C22723) != false) goto L23;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC4823 m48902(java.lang.String r4, l.EnumC14780 r5) {
        /*
            r3 = this;
            java.util.HashMap r0 = r3.f68709
            java.lang.Object r0 = r0.get(r4)
            l.ۙۢܽ r0 = (l.AbstractC4823) r0
            if (r0 == 0) goto L30
            l.ܰᩳܽ r1 = l.EnumC14780.ALL_SYMBOLS
            if (r5 == r1) goto L2f
            l.ܰᩳܽ r1 = l.EnumC14780.TYPES_ONLY
            if (r5 != r1) goto L1b
            boolean r1 = r0 instanceof l.C24478
            if (r1 != 0) goto L1a
            boolean r1 = r0 instanceof l.C8069
            if (r1 == 0) goto L1b
        L1a:
            return r0
        L1b:
            l.ܰᩳܽ r1 = l.EnumC14780.AGGREGATES_ONLY
            if (r5 != r1) goto L30
            boolean r1 = r0 instanceof l.C24478
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof l.C8069
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof l.C4340
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof l.C22723
            if (r1 == 0) goto L30
        L2f:
            return r0
        L30:
            java.util.Set r0 = r3.f68710
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            l.۬ᩳܽ r1 = (l.C14034) r1
            l.᩶ᩳܽ r1 = l.C14034.m34189(r1)
            java.util.HashMap r1 = r1.f68709
            java.lang.Object r1 = r1.get(r4)
            l.ۙۢܽ r1 = (l.AbstractC4823) r1
            if (r1 == 0) goto L36
            l.ܰᩳܽ r2 = l.EnumC14780.ALL_SYMBOLS
            if (r5 == r2) goto L75
            l.ܰᩳܽ r2 = l.EnumC14780.TYPES_ONLY
            if (r5 != r2) goto L61
            boolean r2 = r1 instanceof l.C24478
            if (r2 != 0) goto L60
            boolean r2 = r1 instanceof l.C8069
            if (r2 == 0) goto L61
        L60:
            return r1
        L61:
            l.ܰᩳܽ r2 = l.EnumC14780.AGGREGATES_ONLY
            if (r5 != r2) goto L36
            boolean r2 = r1 instanceof l.C24478
            if (r2 != 0) goto L75
            boolean r2 = r1 instanceof l.C8069
            if (r2 != 0) goto L75
            boolean r2 = r1 instanceof l.C4340
            if (r2 != 0) goto L75
            boolean r2 = r1 instanceof l.C22723
            if (r2 == 0) goto L36
        L75:
            return r1
        L76:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21494.m48902(java.lang.String, l.ܰᩳܽ):l.ۙۢܽ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4823 m48901(String str, AbstractC4823 abstractC4823, EnumC14780 enumC14780) {
        AbstractC4823 abstractC4823M48902;
        String string;
        int i = 0;
        if (str.startsWith(".")) {
            string = str.substring(1);
            abstractC4823M48902 = m48902(string, enumC14780);
        } else {
            int iIndexOf = str.indexOf(46);
            String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
            StringBuilder sb = new StringBuilder(abstractC4823.mo5002());
            while (true) {
                int iLastIndexOf = sb.lastIndexOf(".");
                if (iLastIndexOf == -1) {
                    abstractC4823M48902 = m48902(str, enumC14780);
                    string = str;
                    break;
                }
                int i2 = iLastIndexOf + 1;
                sb.setLength(i2);
                sb.append(strSubstring);
                AbstractC4823 abstractC4823M48903 = m48902(sb.toString(), EnumC14780.AGGREGATES_ONLY);
                if (abstractC4823M48903 != null) {
                    if (iIndexOf != -1) {
                        sb.setLength(i2);
                        sb.append(str);
                        abstractC4823M48902 = m48902(sb.toString(), enumC14780);
                    } else {
                        abstractC4823M48902 = abstractC4823M48903;
                    }
                    string = sb.toString();
                    break;
                }
                sb.setLength(iLastIndexOf);
            }
        }
        if (abstractC4823M48902 != null) {
            return abstractC4823M48902;
        }
        if (!this.f68708 || enumC14780 != EnumC14780.TYPES_ONLY) {
            throw new C18510(abstractC4823, C14442.m34865("\"", str, "\" is not defined."), i);
        }
        C19739.f63533.warning("The descriptor for message type \"" + str + "\" cannot be found and a placeholder is created for it");
        C24478 c24478 = new C24478(string);
        this.f68710.add(c24478.mo5003());
        return c24478;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48904(C14034 c14034, String str) {
        String strSubstring;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            strSubstring = str;
        } else {
            m48904(c14034, str.substring(0, iLastIndexOf));
            strSubstring = str.substring(iLastIndexOf + 1);
        }
        C4340 c4340 = new C4340(strSubstring, str, c14034);
        HashMap map = this.f68709;
        AbstractC4823 abstractC4823 = (AbstractC4823) map.put(str, c4340);
        if (abstractC4823 != null) {
            map.put(str, abstractC4823);
            if (abstractC4823 instanceof C4340) {
                return;
            }
            StringBuilder sbM51387 = C22783.m51387("\"", strSubstring, "\" is already defined (as something other than a package) in file \"");
            sbM51387.append(abstractC4823.mo5003().getName());
            sbM51387.append("\".");
            throw new C18510(c14034, sbM51387.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48903(AbstractC4823 abstractC4823) {
        String name = abstractC4823.getName();
        int i = 0;
        if (name.length() == 0) {
            throw new C18510(abstractC4823, "Missing name.", i);
        }
        for (int i2 = 0; i2 < name.length(); i2++) {
            char cCharAt = name.charAt(i2);
            if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i2 <= 0))) {
                throw new C18510(abstractC4823, C14442.m34865("\"", name, "\" is not a valid identifier."), i);
            }
        }
        String strMo5002 = abstractC4823.mo5002();
        HashMap map = this.f68709;
        AbstractC4823 abstractC4824 = (AbstractC4823) map.put(strMo5002, abstractC4823);
        if (abstractC4824 != null) {
            map.put(strMo5002, abstractC4824);
            if (abstractC4823.mo5003() != abstractC4824.mo5003()) {
                StringBuilder sbM51387 = C22783.m51387("\"", strMo5002, "\" is already defined in file \"");
                sbM51387.append(abstractC4824.mo5003().getName());
                sbM51387.append("\".");
                throw new C18510(abstractC4823, sbM51387.toString(), i);
            }
            int iLastIndexOf = strMo5002.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                throw new C18510(abstractC4823, C14442.m34865("\"", strMo5002, "\" is already defined."), i);
            }
            throw new C18510(abstractC4823, "\"" + strMo5002.substring(iLastIndexOf + 1) + "\" is already defined in \"" + strMo5002.substring(0, iLastIndexOf) + "\".", i);
        }
    }
}
