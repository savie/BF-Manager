package l;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: renamed from: l.۠۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8KK */
/* JADX INFO: loaded from: classes4.dex */
public final class C8650 implements InterfaceC16363 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC22486 f28243;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1603 f28244;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9169 f28245;

    public C8650(InterfaceC1603 interfaceC1603) {
        this.f28244 = interfaceC1603;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23293(InterfaceC13433 interfaceC13433, Uri uri, Map map, long j, long j2, InterfaceC12789 interfaceC12789) throws C20510 {
        C9169 c9169 = new C9169(interfaceC13433, j, j2);
        this.f28245 = c9169;
        if (this.f28243 != null) {
            return;
        }
        InterfaceC22486[] interfaceC22486ArrMo5617 = this.f28244.mo5617(uri, map);
        C22811 c22811M6616 = AbstractC1928.m6616(interfaceC22486ArrMo5617.length);
        if (interfaceC22486ArrMo5617.length == 1) {
            this.f28243 = interfaceC22486ArrMo5617[0];
        } else {
            for (InterfaceC22486 interfaceC22486 : interfaceC22486ArrMo5617) {
                try {
                    if (interfaceC22486.mo2294(c9169)) {
                        this.f28243 = interfaceC22486;
                        c9169.mo10076();
                        break;
                    } else {
                        c22811M6616.m19806(interfaceC22486.mo2297());
                        boolean z = this.f28243 != null || c9169.getPosition() == j;
                        C20782.m47568(z);
                        c9169.mo10076();
                    }
                } catch (EOFException unused) {
                    if (this.f28243 != null || c9169.getPosition() == j) {
                    }
                } catch (Throwable th) {
                    C20782.m47568(this.f28243 != null || c9169.getPosition() == j);
                    c9169.mo10076();
                    throw th;
                }
                C20782.m47568(z);
                c9169.mo10076();
            }
            if (this.f28243 == null) {
                String str = "None of the available extractors (" + C17349.m40726(", ").m40728((Iterable) C4583.m14373(AbstractC1928.m6615(interfaceC22486ArrMo5617), new C3769())) + ") could read the stream.";
                uri.getClass();
                throw new C20510(str, c22811M6616.m51441());
            }
        }
        this.f28243.mo2293(interfaceC12789);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23294() {
        InterfaceC22486 interfaceC22486 = this.f28243;
        if (interfaceC22486 != null) {
            interfaceC22486.mo2291();
            this.f28243 = null;
        }
        this.f28245 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23291() {
        InterfaceC22486 interfaceC22486 = this.f28243;
        if (interfaceC22486 == null) {
            return;
        }
        InterfaceC22486 interfaceC22486Mo2296 = interfaceC22486.mo2296();
        if (interfaceC22486Mo2296 instanceof C8006) {
            ((C8006) interfaceC22486Mo2296).m21866();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m23295() {
        C9169 c9169 = this.f28245;
        if (c9169 != null) {
            return c9169.getPosition();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23292(long j, long j2) {
        InterfaceC22486 interfaceC22486 = this.f28243;
        interfaceC22486.getClass();
        interfaceC22486.mo2292(j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23290(C18756 c18756) {
        InterfaceC22486 interfaceC22486 = this.f28243;
        interfaceC22486.getClass();
        C9169 c9169 = this.f28245;
        c9169.getClass();
        return interfaceC22486.mo2289(c9169, c18756);
    }
}
