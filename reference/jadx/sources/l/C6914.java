package l;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۜܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9IP */
/* JADX INFO: loaded from: classes2.dex */
public final class C6914 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23143 f23251;

    public C6914(C23143 c23143) {
        this.f23251 = c23143;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        try {
            return this.f23251.available() > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            return this.f23251.readObject();
        } catch (Exception e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported on ASN.1 InputStream iterator");
    }
}
