package l;

import android.text.TextUtils;
import net.sf.sevenzipjbinding.IOutCreateArchive7z;
import net.sf.sevenzipjbinding.SevenZip;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ܿ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C17628 {
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41007(C20451 c20451, InterfaceC16923 interfaceC16923) throws Throwable {
        C7861 c7861;
        C16218 c21156;
        String strMo17108 = interfaceC16923.mo17108();
        IOutCreateArchive7z iOutCreateArchive7z = null;
        c7861Mo17107 = null;
        C7861 c7861Mo17107 = null;
        iOutCreateArchive7z = null;
        try {
            if (!C21240.m47723()) {
                throw new SevenZipException(C21240.m47722());
            }
            IOutCreateArchive7z iOutCreateArchive7zM52889 = SevenZip.m52889();
            try {
                iOutCreateArchive7zM52889.setLevel(c20451.f66378);
                iOutCreateArchive7zM52889.setHeaderEncryption(c20451.f66379);
                iOutCreateArchive7zM52889.setThreadCount(-1);
                c7861Mo17107 = interfaceC16923.mo17107();
                if (TextUtils.isEmpty(strMo17108)) {
                    c21156 = new C16218(interfaceC16923);
                } else {
                    c21156 = new C21156(interfaceC16923, strMo17108);
                }
                iOutCreateArchive7zM52889.createArchive(c7861Mo17107, c20451.f66380, c21156);
                C19431.m44468(iOutCreateArchive7zM52889);
                C19431.m44468(c7861Mo17107);
            } catch (SevenZipException e) {
                e = e;
                c7861 = c7861Mo17107;
                iOutCreateArchive7z = iOutCreateArchive7zM52889;
                try {
                    if (!interfaceC16923.mo2357()) {
                        throw e;
                    }
                    if (iOutCreateArchive7z != null) {
                        C19431.m44468(iOutCreateArchive7z);
                    }
                    if (C6009.m16315(c7861)) {
                        C19431.m44468(c7861);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (iOutCreateArchive7z != null) {
                        C19431.m44468(iOutCreateArchive7z);
                    }
                    if (C6009.m16315(c7861)) {
                        C19431.m44468(c7861);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c7861 = c7861Mo17107;
                iOutCreateArchive7z = iOutCreateArchive7zM52889;
                if (iOutCreateArchive7z != null) {
                    C19431.m44468(iOutCreateArchive7z);
                }
                if (C6009.m16315(c7861)) {
                    C19431.m44468(c7861);
                }
                throw th;
            }
        } catch (SevenZipException e2) {
            e = e2;
            c7861 = null;
        } catch (Throwable th3) {
            th = th3;
            c7861 = null;
        }
    }
}
