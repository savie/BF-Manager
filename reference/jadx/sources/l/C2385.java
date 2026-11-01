package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۖ۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes2.dex */
public final class C2385 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f8414;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11559 f8415;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1263 f8416;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 f8417;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Uri f8418;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11601 f8419;

    public C2385(Uri uri, C11601 c11601, InterfaceC20723 interfaceC20723, C11559 c11559, C1263 c1263, boolean z) {
        this.f8418 = uri;
        this.f8419 = c11601;
        this.f8417 = interfaceC20723;
        this.f8415 = c11559;
        this.f8416 = c1263;
        this.f8414 = z;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2385 m7249(InterfaceC2557 interfaceC2557, AbstractC9677 abstractC9677) throws Throwable {
        C1263 c1263;
        InterfaceC20723 c1057;
        boolean z = abstractC9677 instanceof AbstractC12233;
        if (!z && !(abstractC9677 instanceof C21611)) {
            throw new C3796("HLS thumbnails require a local or network visitor");
        }
        C11601 c11601 = null;
        C1263 c1263M11626 = z ? C4085.m11626(C16737.m39277()) : null;
        try {
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{interfaceC2557}[0];
            C13638.requireNonNull(obj);
            arrayList.add(obj);
            C2427 c2427 = new C2427(0, C0561.unmodifiableList(arrayList));
            C11601 c11602 = new C11601(null, abstractC9677, c2427, EnumC13718.HLS_DIRECT, c1263M11626);
            try {
                Uri uri = c2427.mo7413().f45157.f48029;
                String string = c1263M11626 == null ? UUID.randomUUID().toString() : c1263M11626.m4586();
                if (z) {
                    c11601 = c11602;
                    c1263 = c1263M11626;
                    try {
                        c1057 = new C1057(c1263M11626, c11602, new C23802(c11602, c1263M11626), C4085.m11624(), EnumC11642.f39117, new C6433(), null);
                    } catch (Error e) {
                        e = e;
                        if (c11601 != null) {
                            c11601.m28927();
                            c11601.m28928();
                        }
                        if (c1263 != null) {
                            c1263.close();
                        }
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        if (c11601 != null) {
                            c11601.m28927();
                            c11601.m28928();
                        }
                        if (c1263 != null) {
                            c1263.close();
                        }
                        throw e;
                    }
                } else {
                    c11601 = c11602;
                    c1263 = c1263M11626;
                    c1057 = c11601;
                }
                return new C2385(uri, c11601, c1057, new C11559(c11601, abstractC9677, string), c1263, z);
            } catch (Error | RuntimeException e3) {
                e = e3;
                c11601 = c11602;
                c1263 = c1263M11626;
                if (c11601 != null) {
                    c11601.m28927();
                    c11601.m28928();
                }
                if (c1263 != null) {
                    c1263.close();
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
    public final InterfaceC20723 m7250() {
        C1263 c1263;
        boolean z = this.f8414;
        C11601 c11601 = this.f8419;
        return (!z || (c1263 = this.f8416) == null || c1263.m4583() == null) ? c11601 : new C6763(c1263, new C22536(c11601), c11601, new C7997());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C1263 c1263 = this.f8416;
        try {
            C11601 c11601 = this.f8419;
            c11601.m28927();
            c11601.m28928();
        } finally {
            if (c1263 != null) {
                c1263.close();
            }
        }
    }
}
