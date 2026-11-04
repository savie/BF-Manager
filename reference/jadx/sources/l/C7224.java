package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: l.ۜܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7224 implements InterfaceC15976 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 f23823;

    @Override // l.InterfaceC15976
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10886(String str, EnumC17468 enumC17468) {
        return true;
    }

    public C7224(AbstractC19728 abstractC19728) {
        this.f23823 = abstractC19728;
    }

    @Override // l.InterfaceC11501
    public final URI toUri() {
        AbstractC19728 abstractC19728 = this.f23823;
        try {
            return new URI(null, abstractC19728.toString(), null);
        } catch (URISyntaxException e) {
            throw new C10996(abstractC19728.toString(), e);
        }
    }

    @Override // l.InterfaceC11501
    public final String getName() {
        return this.f23823.toString();
    }

    @Override // l.InterfaceC15976
    /* JADX INFO: renamed from: ۙ */
    public final EnumC17468 mo10885() {
        return AbstractC24643.m54974(this.f23823.toString());
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ᩷ */
    public final InputStream mo10889() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ᩴ */
    public final OutputStream mo10888() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo7621(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ۤ */
    public final Writer mo10887() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ᩸ */
    public final long mo10890() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC11501
    public final boolean delete() {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7224) && this.f23823.equals(((C7224) obj).f23823);
    }

    public final int hashCode() {
        return this.f23823.hashCode();
    }
}
