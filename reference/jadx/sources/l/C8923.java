package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۠᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91US */
/* JADX INFO: loaded from: classes4.dex */
public final class C8923 extends AbstractC21976 implements InterfaceC5656, InterfaceC11621 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12966 f29114;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f29115;

    public C8923(C24367 c24367) {
        C12966 c12966 = new C12966();
        this.f29114 = c12966;
        this.f29115 = new HashMap();
        c24367.m54474(new C2957(this));
        c12966.mo14692(c24367.m54473());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    @Override // l.AbstractC21976, l.InterfaceC5656
    /* JADX INFO: renamed from: ۙ */
    public final void mo9647(C21383 c21383) {
        String strSubstring;
        String string;
        String strSubstring2;
        if (m23832(c21383) == null) {
            C21383 c21383M48621 = c21383.m48621();
            C12966 c12966 = this.f29114;
            if (c21383M48621 != null) {
                mo9647(c21383M48621);
                strSubstring = c21383M48621.mo13501() + "$";
                String strM13516 = c21383.m13516();
                int iLastIndexOf = strM13516.lastIndexOf(36);
                if (iLastIndexOf != -1) {
                    strSubstring2 = strM13516.substring(iLastIndexOf + 1);
                    if (!strSubstring2.matches("[0-9]+")) {
                        strSubstring2 = null;
                    }
                } else {
                    strSubstring2 = null;
                }
                if (strSubstring2 != null) {
                    String strM34972 = C14483.m34972(strSubstring, strSubstring2);
                    int iHashCode = strM34972.hashCode();
                    if (!c12966.contains(iHashCode)) {
                        c12966.add(iHashCode);
                        c21383.mo13503((Object) strM34972);
                        return;
                    }
                }
            } else {
                String strM13517 = c21383.m13516();
                int iLastIndexOf2 = strM13517.lastIndexOf(47);
                strSubstring = iLastIndexOf2 == -1 ? "" : strM13517.substring(0, iLastIndexOf2 + 1);
            }
            HashMap map = this.f29115;
            AbstractC20769 abstractC20769M47518 = (AbstractC20769) map.get(strSubstring);
            if (abstractC20769M47518 == null) {
                abstractC20769M47518 = AbstractC20769.m47518();
                map.put(strSubstring, abstractC20769M47518);
            }
            do {
                StringBuilder sbM27333 = C10732.m27333(strSubstring);
                sbM27333.append(abstractC20769M47518.mo22086());
                string = sbM27333.toString();
            } while (c12966.contains(string.hashCode()));
            c12966.add(string.hashCode());
            c21383.mo13503((Object) string);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m23832(C21383 c21383) {
        Object objMo13501 = c21383.mo13501();
        if (objMo13501 instanceof String) {
            return (String) objMo13501;
        }
        return null;
    }
}
