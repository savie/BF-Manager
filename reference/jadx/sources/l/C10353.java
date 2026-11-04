package l;

import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۢ᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 66S6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10353 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26633(InterfaceC24329 interfaceC24329) {
        return C3445.exists(interfaceC24329, EnumC20599.NOFOLLOW_LINKS);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16320 m26631(InterfaceC24329 interfaceC24329, String str, C19304 c19304, InterfaceC7509 interfaceC7509) throws Throwable {
        InterfaceC24329 interfaceC24329M4658 = C1273.m4658(str, interfaceC24329);
        m26632(interfaceC7509);
        boolean z = true;
        boolean z2 = m26633(interfaceC24329.resolve(str.concat(".dat"))) || m26633(interfaceC24329.resolve(str.concat(".tat"))) || m26633(interfaceC24329.resolve(str.concat(".lit")));
        if (!m26633(interfaceC24329M4658.resolve("migration.id")) || (m26633(interfaceC24329M4658.resolve("app-adopted")) && !z2)) {
            z = false;
        }
        if (!m26633(interfaceC24329M4658) || z) {
            C1273 c1273M4649 = C1273.m4649(interfaceC24329, str, c19304.f62382);
            try {
                m26632(interfaceC7509);
                C1405.m5138(interfaceC24329M4658, c1273M4649.f4586.f76710.m11509());
                c1273M4649.m4660();
                c1273M4649.close();
            } catch (Throwable th) {
                try {
                    c1273M4649.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        m26632(interfaceC7509);
        C16320 c16320M38711 = C16320.m38711(interfaceC24329M4658, c19304.f62382, c19304.f62383, c19304.f62384, 8388608, interfaceC7509, str);
        try {
            C1405.m5138(interfaceC24329M4658, c16320M38711.f52984.f63046.f41124.m11509());
            m26632(interfaceC7509);
            return c16320M38711;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c16320M38711.m38744().m52947();
            } catch (Throwable th3) {
                e.addSuppressed(th3);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26632(InterfaceC7509 interfaceC7509) {
        if (interfaceC7509.mo924()) {
            throw new CancellationException("Session startup is canceled");
        }
    }
}
