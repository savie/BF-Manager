package l;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9IP */
/* JADX INFO: loaded from: classes4.dex */
public final class C10128 extends FilterInputStream implements Iterable, InterfaceC8469 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f32415 = C16980.m40037(C10128.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1112 f32416;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C10128(C7146 c7146, InputStream inputStream) {
        super(inputStream);
        this.f32416 = c7146;
    }

    public C10128(C1112 c1112, byte[] bArr) {
        super(new ByteArrayInputStream(bArr));
        this.f32416 = c1112;
    }

    public final AbstractC4691 readObject() {
        C1112 c1112 = this.f32416;
        try {
            c1112.getClass();
            AbstractC15877 abstractC15877M4128 = C1112.m4128(this);
            InterfaceC25186 interfaceC25186 = f32415;
            interfaceC25186.mo13708(abstractC15877M4128, "Read ASN.1 tag {}");
            int iM4124 = C1112.m4124(this);
            interfaceC25186.mo13708(Integer.valueOf(iM4124), "Read ASN.1 object length: {}");
            AbstractC4691 abstractC4691Mo1664 = abstractC15877M4128.mo6071(c1112).mo1664(abstractC15877M4128, C1112.m4127(iM4124, this));
            interfaceC25186.mo13716(abstractC4691Mo1664, "Read ASN.1 object: {}");
            return abstractC4691Mo1664;
        } catch (C9382 e) {
            throw e;
        } catch (Exception e2) {
            throw new C9382(e2, "Cannot parse ASN.1 object from stream", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m26120(int i) {
        this.f32416.getClass();
        return C1112.m4127(i, this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C19079(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC15877 m26121() {
        this.f32416.getClass();
        return C1112.m4128(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m26122() {
        this.f32416.getClass();
        return C1112.m4124(this);
    }
}
