package l;

import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S97P */
/* JADX INFO: loaded from: classes4.dex */
public final class C14619 extends AbstractC9677 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C14619 f47827 = new C14619();

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15075(C11018 c11018) {
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۨ */
    public final String mo15077() {
        return "trash";
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo10267(boolean z) {
        if (z) {
            C20370.m46022();
        }
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo15073(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557) {
        return interfaceC2557.mo7989().mo33970();
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2557 mo10264(String str) {
        C23791 c23791M35096 = m35096(str);
        if (c23791M35096 == null) {
            return null;
        }
        boolean zEndsWith = str.endsWith("/");
        C6151 c6151 = new C6151(c23791M35096.m52327(), C6730.m18172(str));
        if (c6151.isDirectory() != zEndsWith) {
            return null;
        }
        return c6151;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15074(MessageDigest messageDigest) {
        messageDigest.update("trash".getBytes());
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo10263(String str, boolean z) {
        String strM28608 = AbstractC11462.m28608(str);
        int i = 0;
        if (str.equals("/") || str.isEmpty()) {
            List listM46013 = C20370.m46013();
            ArrayList arrayList = new ArrayList(listM46013.size());
            int size = listM46013.size();
            while (i < size) {
                arrayList.add(new C6151((C16137) listM46013.get(i)));
                i++;
            }
            return arrayList;
        }
        C23791 c23791M35096 = m35096(str);
        if (c23791M35096 == null) {
            return new ArrayList();
        }
        List listMo33983 = c23791M35096.m52327().mo33983(true);
        ArrayList arrayList2 = new ArrayList(listMo33983.size());
        int size2 = listMo33983.size();
        while (i < size2) {
            arrayList2.add(new C6151((AbstractC20745) listMo33983.get(i), strM28608));
            i++;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C23791 m35096(String str) {
        boolean zStartsWith = str.startsWith("/");
        int iIndexOf = str.indexOf(47, zStartsWith ? 1 : 0);
        if (iIndexOf == -1) {
            return null;
        }
        return new C23791(str.substring(zStartsWith ? 1 : 0, iIndexOf), str.substring(iIndexOf));
    }
}
