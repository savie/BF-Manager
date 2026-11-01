package l;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܶ۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 474R */
/* JADX INFO: loaded from: classes4.dex */
public final class C15087 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C15793 f49173;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6265 f49174;

    public C15087(C15793 c15793, C6265 c6265) {
        this.f49173 = c15793;
        this.f49174 = c6265;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15087 m36161(C1263 c1263, final Uri uri, InterfaceC20723 interfaceC20723, C10148 c10148) {
        C15793 c15793M30484;
        boolean zM44299;
        try {
            c15793M30484 = C12265.m30484(c1263, uri, interfaceC20723, null);
            try {
                final String strM37558 = c15793M30484.m37558();
                if (strM37558 == null) {
                    c15793M30484.close();
                    return null;
                }
                long jM37559 = c15793M30484.m37559();
                C15327 c15327M4583 = c1263.m4583();
                if (jM37559 <= 0 && c15327M4583 != null) {
                    jM37559 = C17214.m40151(c15327M4583.mo36698(strM37558));
                }
                boolean z = jM37559 > 0 && c15327M4583 != null && c15327M4583.m36710(strM37558, 0L, jM37559);
                Boolean boolM37557 = c15793M30484.m37557();
                if (jM37559 <= 0) {
                    C19320 c19320M25793 = c10148.m25793(uri, interfaceC20723);
                    jM37559 = c19320M25793.m44298();
                    z = jM37559 > 0 && c15327M4583 != null && c15327M4583.m36710(strM37558, 0L, jM37559);
                    zM44299 = c19320M25793.m44299();
                } else if (z) {
                    zM44299 = true;
                } else if (boolM37557 != null) {
                    zM44299 = boolM37557.booleanValue();
                } else {
                    try {
                        zM44299 = c10148.m25793(uri, interfaceC20723).m44299();
                    } catch (IOException unused) {
                        zM44299 = false;
                    }
                }
                final long j = jM37559;
                if ((z || zM44299) && j > 0 && j != -1) {
                    final C5352 c5352 = new C5352(c1263, new C6763(c1263, interfaceC20723, new C13217(strM37558)), strM37558, zM44299 && !z);
                    return new C15087(c15793M30484, C6265.m17334(strM37558, new InterfaceC23905() { // from class: l.᩺۟۬
                        @Override // l.InterfaceC23905
                        /* JADX INFO: renamed from: ۙ */
                        public final InterfaceC3153 mo32704() {
                            return new C16291(c5352, uri, strM37558, j);
                        }
                    }, C6265.m17337(uri.getPath())));
                }
                c15793M30484.close();
                return null;
            } catch (IOException | RuntimeException unused2) {
                if (c15793M30484 != null) {
                    c15793M30484.close();
                }
            }
        } catch (IOException | RuntimeException unused3) {
            c15793M30484 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6265 m36162() {
        return this.f49174;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f49173.close();
    }
}
