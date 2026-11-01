package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: l.۟۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7485 implements InterfaceC2173 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 f24933;

    @Override // l.InterfaceC2173
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6761(String str, EnumC11347 enumC11347) {
        return true;
    }

    public C7485(AbstractC11242 abstractC11242) {
        this.f24933 = abstractC11242;
    }

    @Override // l.InterfaceC3458
    public final URI toUri() {
        AbstractC11242 abstractC11242 = this.f24933;
        try {
            return new URI(null, abstractC11242.toString(), null);
        } catch (URISyntaxException e) {
            throw new C0699(abstractC11242.toString(), e);
        }
    }

    @Override // l.InterfaceC3458
    public final String getName() {
        return this.f24933.toString();
    }

    @Override // l.InterfaceC2173
    /* JADX INFO: renamed from: ۙ */
    public final EnumC11347 mo6760() {
        return AbstractC3729.m10910(this.f24933.toString());
    }

    @Override // l.InterfaceC3458
    /* JADX INFO: renamed from: ܰ */
    public final InputStream mo10167() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC3458
    /* JADX INFO: renamed from: ۚ */
    public final OutputStream mo10165() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC3458
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo10164(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC3458
    /* JADX INFO: renamed from: ۨ */
    public final Writer mo10166() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC3458
    /* JADX INFO: renamed from: ۖ */
    public final long mo10163() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC3458
    public final boolean delete() {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7485) && this.f24933.equals(((C7485) obj).f24933);
    }

    public final int hashCode() {
        return this.f24933.hashCode();
    }
}
