package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩳۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes4.dex */
public final class C18766 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f60948;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C7579 f60949;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16281 f60950;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f60951;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Uri f60952;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9771 f60953;

    public C18766(Uri uri, C9771 c9771, InterfaceC15670 interfaceC15670, C7579 c7579, C16281 c16281, boolean z) {
        this.f60952 = uri;
        this.f60953 = c9771;
        this.f60948 = interfaceC15670;
        this.f60949 = c7579;
        this.f60950 = c16281;
        this.f60951 = z;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18766 m43559(InterfaceC2386 interfaceC2386, AbstractC7629 abstractC7629) throws Throwable {
        C16281 c16281;
        InterfaceC15670 c2554;
        boolean z = abstractC7629 instanceof AbstractC18881;
        if (!z && !(abstractC7629 instanceof C11969)) {
            throw new C8324("HLS thumbnails require a local or network visitor");
        }
        C9771 c9771 = null;
        C16281 c16281M11690 = z ? C3603.m11690(C21576.m49084()) : null;
        try {
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{interfaceC2386}[0];
            C17359.requireNonNull(obj);
            arrayList.add(obj);
            C0823 c0823 = new C0823(0, C4681.unmodifiableList(arrayList));
            C9771 c9772 = new C9771(null, abstractC7629, c0823, EnumC18722.HLS_DIRECT, c16281M11690);
            try {
                Uri uri = c0823.mo3301().f48681.f66802;
                String string = c16281M11690 == null ? UUID.randomUUID().toString() : c16281M11690.m38631();
                if (z) {
                    c9771 = c9772;
                    c16281 = c16281M11690;
                    try {
                        c2554 = new C2554(c16281M11690, c9772, new C21812(c9772, c16281M11690), C3603.m11688(), EnumC18962.f61479, new C22780(), null);
                    } catch (Error e) {
                        e = e;
                        if (c9771 != null) {
                            c9771.m25476();
                            c9771.m25474();
                        }
                        if (c16281 != null) {
                            c16281.close();
                        }
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        if (c9771 != null) {
                            c9771.m25476();
                            c9771.m25474();
                        }
                        if (c16281 != null) {
                            c16281.close();
                        }
                        throw e;
                    }
                } else {
                    c9771 = c9772;
                    c16281 = c16281M11690;
                    c2554 = c9771;
                }
                return new C18766(uri, c9771, c2554, new C7579(c9771, abstractC7629, string), c16281, z);
            } catch (Error | RuntimeException e3) {
                e = e3;
                c9771 = c9772;
                c16281 = c16281M11690;
                if (c9771 != null) {
                    c9771.m25476();
                    c9771.m25474();
                }
                if (c16281 != null) {
                    c16281.close();
                }
                throw e;
            }
        } catch (Error e4) {
            e = e4;
        } catch (RuntimeException e5) {
            e = e5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 m43560() {
        C16281 c16281;
        boolean z = this.f60951;
        C9771 c9771 = this.f60953;
        return (!z || (c16281 = this.f60950) == null || c16281.m38629() == null) ? c9771 : new C20845(c16281, new C16484(c9771), c9771, new C22313());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C16281 c16281 = this.f60950;
        try {
            C9771 c9771 = this.f60953;
            c9771.m25476();
            c9771.m25474();
        } finally {
            if (c16281 != null) {
                c16281.close();
            }
        }
    }
}
