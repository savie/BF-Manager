package l;

import android.text.TextUtils;
import net.sf.sevenzipjbinding.IOutCreateArchive7z;
import net.sf.sevenzipjbinding.SevenZip;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.֡ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C0505 {
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2472(C4234 c4234, InterfaceC21388 interfaceC21388) throws Throwable {
        C8919 c8919;
        C24372 c6472;
        String strMo2401 = interfaceC21388.mo2401();
        IOutCreateArchive7z iOutCreateArchive7z = null;
        c8919Mo2400 = null;
        C8919 c8919Mo2400 = null;
        iOutCreateArchive7z = null;
        try {
            if (!C25053.m55879()) {
                throw new SevenZipException(C25053.m55880());
            }
            IOutCreateArchive7z iOutCreateArchive7zM56788 = SevenZip.m56788();
            try {
                iOutCreateArchive7zM56788.setLevel(c4234.f15449);
                iOutCreateArchive7zM56788.setHeaderEncryption(c4234.f15448);
                iOutCreateArchive7zM56788.setThreadCount(-1);
                c8919Mo2400 = interfaceC21388.mo2400();
                if (TextUtils.isEmpty(strMo2401)) {
                    c6472 = new C24372(interfaceC21388);
                } else {
                    c6472 = new C6472(interfaceC21388, strMo2401);
                }
                iOutCreateArchive7zM56788.createArchive(c8919Mo2400, c4234.f15450, c6472);
                C20244.m46520(iOutCreateArchive7zM56788);
                C20244.m46520(c8919Mo2400);
            } catch (SevenZipException e) {
                e = e;
                c8919 = c8919Mo2400;
                iOutCreateArchive7z = iOutCreateArchive7zM56788;
                try {
                    if (!interfaceC21388.mo924()) {
                        throw e;
                    }
                    if (iOutCreateArchive7z != null) {
                        C20244.m46520(iOutCreateArchive7z);
                    }
                    if (C1402.m5130(c8919)) {
                        C20244.m46520(c8919);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (iOutCreateArchive7z != null) {
                        C20244.m46520(iOutCreateArchive7z);
                    }
                    if (C1402.m5130(c8919)) {
                        C20244.m46520(c8919);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c8919 = c8919Mo2400;
                iOutCreateArchive7z = iOutCreateArchive7zM56788;
                if (iOutCreateArchive7z != null) {
                    C20244.m46520(iOutCreateArchive7z);
                }
                if (C1402.m5130(c8919)) {
                    C20244.m46520(c8919);
                }
                throw th;
            }
        } catch (SevenZipException e2) {
            e = e2;
            c8919 = null;
        } catch (Throwable th3) {
            th = th3;
            c8919 = null;
        }
    }
}
