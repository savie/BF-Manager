package l;

import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۘ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66S6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4138 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11771(InterfaceC3800 interfaceC3800) {
        return C5212.exists(interfaceC3800, EnumC22146.NOFOLLOW_LINKS);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14393 m11769(InterfaceC3800 interfaceC3800, String str, C13312 c13312, InterfaceC5614 interfaceC5614) throws Throwable {
        InterfaceC3800 interfaceC3800M28083 = C11153.m28083(str, interfaceC3800);
        m11770(interfaceC5614);
        boolean z = true;
        boolean z2 = m11771(interfaceC3800.resolve(str.concat(".dat"))) || m11771(interfaceC3800.resolve(str.concat(".tat"))) || m11771(interfaceC3800.resolve(str.concat(".lit")));
        if (!m11771(interfaceC3800M28083.resolve("migration.id")) || (m11771(interfaceC3800M28083.resolve("app-adopted")) && !z2)) {
            z = false;
        }
        if (!m11771(interfaceC3800M28083) || z) {
            C11153 c11153M28075 = C11153.m28075(interfaceC3800, str, c13312.f44188);
            try {
                m11770(interfaceC5614);
                C6961.m18713(interfaceC3800M28083, c11153M28075.f37819.f61199.m21760());
                c11153M28075.m28085();
                c11153M28075.close();
            } catch (Throwable th) {
                try {
                    c11153M28075.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        m11770(interfaceC5614);
        C14393 c14393M34630 = C14393.m34630(interfaceC3800M28083, c13312.f44188, c13312.f44189, c13312.f44190, 8388608, interfaceC5614, str);
        try {
            C6961.m18713(interfaceC3800M28083, c14393M34630.f47156.f37855.f77154.m21760());
            m11770(interfaceC5614);
            return c14393M34630;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c14393M34630.m34643().m30027();
            } catch (Throwable th3) {
                e.addSuppressed(th3);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11770(InterfaceC5614 interfaceC5614) {
        if (interfaceC5614.mo2357()) {
            throw new CancellationException("Session startup is canceled");
        }
    }
}
