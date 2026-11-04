package l;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 474R */
/* JADX INFO: loaded from: classes2.dex */
public final class C4770 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24908 f16740;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6044 f16741;

    public C4770(C24908 c24908, C6044 c6044) {
        this.f16740 = c24908;
        this.f16741 = c6044;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4770 m14735(C16281 c16281, final Uri uri, InterfaceC15670 interfaceC15670, C5516 c5516) {
        C24908 c24908M52615;
        boolean zM36558;
        try {
            c24908M52615 = C23416.m52615(c16281, uri, interfaceC15670, null);
            try {
                final String strM55490 = c24908M52615.m55490();
                if (strM55490 == null) {
                    c24908M52615.close();
                    return null;
                }
                long jM55492 = c24908M52615.m55492();
                C8367 c8367M38629 = c16281.m38629();
                if (jM55492 <= 0 && c8367M38629 != null) {
                    jM55492 = C18063.m42087(c8367M38629.mo22517(strM55490));
                }
                boolean z = jM55492 > 0 && c8367M38629 != null && c8367M38629.m22524(strM55490, 0L, jM55492);
                Boolean boolM55491 = c24908M52615.m55491();
                if (jM55492 <= 0) {
                    C15210 c15210M16428 = c5516.m16428(uri, interfaceC15670);
                    jM55492 = c15210M16428.m36557();
                    z = jM55492 > 0 && c8367M38629 != null && c8367M38629.m22524(strM55490, 0L, jM55492);
                    zM36558 = c15210M16428.m36558();
                } else if (z) {
                    zM36558 = true;
                } else if (boolM55491 != null) {
                    zM36558 = boolM55491.booleanValue();
                } else {
                    try {
                        zM36558 = c5516.m16428(uri, interfaceC15670).m36558();
                    } catch (IOException unused) {
                        zM36558 = false;
                    }
                }
                final long j = jM55492;
                if ((z || zM36558) && j > 0 && j != -1) {
                    final C17115 c17115 = new C17115(c16281, new C20845(c16281, interfaceC15670, new C11398(6, strM55490)), strM55490, zM36558 && !z);
                    return new C4770(c24908M52615, C6044.m17538(strM55490, new InterfaceC3806() { // from class: l.۬ۖۚ
                        @Override // l.InterfaceC3806
                        /* JADX INFO: renamed from: ۙ */
                        public final InterfaceC1278 mo10127() {
                            return new C8889(c17115, uri, strM55490, j);
                        }
                    }, C6044.m17541(uri.getPath())));
                }
                c24908M52615.close();
                return null;
            } catch (IOException | RuntimeException unused2) {
                if (c24908M52615 != null) {
                    c24908M52615.close();
                }
            }
        } catch (IOException | RuntimeException unused3) {
            c24908M52615 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6044 m14736() {
        return this.f16741;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f16740.close();
    }
}
