package l;

import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩷۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: S97P */
/* JADX INFO: loaded from: classes.dex */
public final class C21929 extends AbstractC7629 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C21929 f70802 = new C21929();

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20835(C6178 c6178) {
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ᩷ */
    public final String mo20842() {
        return "trash";
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20837(boolean z) {
        if (z) {
            C19632.m45278();
        }
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo20829(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386) {
        return interfaceC2386.mo8093().mo4290();
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2386 mo20831(String str) {
        C4775 c4775M49624 = m49624(str);
        if (c4775M49624 == null) {
            return null;
        }
        boolean zEndsWith = str.endsWith("/");
        C6838 c6838 = new C6838(c4775M49624.m14737(), C11293.m28556(str));
        if (c6838.isDirectory() != zEndsWith) {
            return null;
        }
        return c6838;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20833(MessageDigest messageDigest) {
        messageDigest.update("trash".getBytes());
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20830(String str, boolean z) {
        String strM20187 = AbstractC7364.m20187(str);
        int i = 0;
        if (str.equals("/") || str.isEmpty()) {
            List listM45280 = C19632.m45280();
            ArrayList arrayList = new ArrayList(listM45280.size());
            int size = listM45280.size();
            while (i < size) {
                arrayList.add(new C6838((C22616) listM45280.get(i)));
                i++;
            }
            return arrayList;
        }
        C4775 c4775M49624 = m49624(str);
        if (c4775M49624 == null) {
            return new ArrayList();
        }
        List listMo4299 = c4775M49624.m14737().mo4299(true);
        ArrayList arrayList2 = new ArrayList(listMo4299.size());
        int size2 = listMo4299.size();
        while (i < size2) {
            arrayList2.add(new C6838((AbstractC22044) listMo4299.get(i), strM20187));
            i++;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C4775 m49624(String str) {
        boolean zStartsWith = str.startsWith("/");
        int iIndexOf = str.indexOf(47, zStartsWith ? 1 : 0);
        if (iIndexOf == -1) {
            return null;
        }
        return new C4775(str.substring(zStartsWith ? 1 : 0, iIndexOf), str.substring(iIndexOf));
    }
}
