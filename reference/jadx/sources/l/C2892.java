package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 91US */
/* JADX INFO: loaded from: classes2.dex */
public final class C2892 extends AbstractC21803 implements InterfaceC23145, InterfaceC21733 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f10916;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24014 f10917;

    public C2892(C20178 c20178) {
        super(2);
        C24014 c24014 = new C24014();
        this.f10917 = c24014;
        this.f10916 = new HashMap();
        c20178.m45607(new C9244(this));
        c24014.mo3172(c20178.m45605());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    @Override // l.AbstractC21803, l.InterfaceC23145
    /* JADX INFO: renamed from: ۙ */
    public final void mo4603(C12417 c12417) {
        String strSubstring;
        String string;
        String strSubstring2;
        if (m8699(c12417) == null) {
            C12417 c12417M30866 = c12417.m30866();
            C24014 c24014 = this.f10917;
            if (c12417M30866 != null) {
                mo4603(c12417M30866);
                strSubstring = c12417M30866.mo2192() + "$";
                String strM2211 = c12417.m2211();
                int iLastIndexOf = strM2211.lastIndexOf(36);
                if (iLastIndexOf != -1) {
                    strSubstring2 = strM2211.substring(iLastIndexOf + 1);
                    if (!strSubstring2.matches("[0-9]+")) {
                        strSubstring2 = null;
                    }
                } else {
                    strSubstring2 = null;
                }
                if (strSubstring2 != null) {
                    String strM37076 = C15489.m37076(strSubstring, strSubstring2);
                    int iHashCode = strM37076.hashCode();
                    if (!c24014.contains(iHashCode)) {
                        c24014.add(iHashCode);
                        c12417.mo2194((Object) strM37076);
                        return;
                    }
                }
            } else {
                String strM2212 = c12417.m2211();
                int iLastIndexOf2 = strM2212.lastIndexOf(47);
                strSubstring = iLastIndexOf2 == -1 ? "" : strM2212.substring(0, iLastIndexOf2 + 1);
            }
            HashMap map = this.f10916;
            AbstractC10425 abstractC10425M26322 = (AbstractC10425) map.get(strSubstring);
            if (abstractC10425M26322 == null) {
                abstractC10425M26322 = AbstractC10425.m26322();
                map.put(strSubstring, abstractC10425M26322);
            }
            do {
                StringBuilder sbM23356 = C9023.m23356(strSubstring);
                sbM23356.append(abstractC10425M26322.mo15749());
                string = sbM23356.toString();
            } while (c24014.contains(string.hashCode()));
            c24014.add(string.hashCode());
            c12417.mo2194((Object) string);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m8699(C12417 c12417) {
        Object objMo2192 = c12417.mo2192();
        if (objMo2192 instanceof String) {
            return (String) objMo2192;
        }
        return null;
    }
}
