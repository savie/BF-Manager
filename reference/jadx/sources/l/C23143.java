package l;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9IP */
/* JADX INFO: loaded from: classes.dex */
public final class C23143 extends FilterInputStream implements Iterable, InterfaceC20818 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f75137 = C13488.m32997(C23143.class);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C9927 f75138;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C23143(C8326 c8326, InputStream inputStream) {
        super(inputStream);
        this.f75138 = c8326;
    }

    public C23143(C9927 c9927, byte[] bArr) {
        super(new ByteArrayInputStream(bArr));
        this.f75138 = c9927;
    }

    public final AbstractC9032 readObject() {
        C9927 c9927 = this.f75138;
        try {
            c9927.getClass();
            AbstractC14676 abstractC14676M25132 = C9927.m25132(this);
            InterfaceC4314 interfaceC4314 = f75137;
            interfaceC4314.mo12129(abstractC14676M25132, "Read ASN.1 tag {}");
            int iM25126 = C9927.m25126(this);
            interfaceC4314.mo12129(Integer.valueOf(iM25126), "Read ASN.1 object length: {}");
            AbstractC9032 abstractC9032Mo1600 = abstractC14676M25132.mo2657(c9927).mo1600(abstractC14676M25132, C9927.m25130(iM25126, this));
            interfaceC4314.mo12126(abstractC9032Mo1600, "Read ASN.1 object: {}");
            return abstractC9032Mo1600;
        } catch (C21731 e) {
            throw e;
        } catch (Exception e2) {
            throw new C21731(e2, "Cannot parse ASN.1 object from stream", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m51136(int i) {
        this.f75138.getClass();
        return C9927.m25130(i, this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6914(this);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC14676 m51135() {
        this.f75138.getClass();
        return C9927.m25132(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m51137() {
        this.f75138.getClass();
        return C9927.m25126(this);
    }
}
