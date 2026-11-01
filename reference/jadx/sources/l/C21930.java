package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;

/* JADX INFO: renamed from: l.᩹֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: W2ZW */
/* JADX INFO: loaded from: classes5.dex */
public class C21930 implements InterfaceC2173 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC11347 f71135;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final URI f71136;

    @Override // l.InterfaceC3458
    public final boolean delete() {
        return false;
    }

    @Override // l.InterfaceC3458
    /* JADX INFO: renamed from: ۖ */
    public final long mo10163() {
        return 0L;
    }

    public C21930(URI uri, EnumC11347 enumC11347) {
        C13638.requireNonNull(uri);
        C13638.requireNonNull(enumC11347);
        if (uri.getPath() == null) {
            throw new IllegalArgumentException("URI must have a path: " + uri);
        }
        this.f71136 = uri;
        this.f71135 = enumC11347;
    }

    @Override // l.InterfaceC3458
    public final String getName() {
        return this.f71136.getPath();
    }

    @Override // l.InterfaceC3458
    public final URI toUri() {
        return this.f71136;
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
    /* JADX INFO: renamed from: ۨ */
    public final Writer mo10166() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC2173
    /* JADX INFO: renamed from: ۙ */
    public final EnumC11347 mo6760() {
        return this.f71135;
    }

    @Override // l.InterfaceC2173
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6761(String str, EnumC11347 enumC11347) {
        StringBuilder sbM23356 = C9023.m23356(str);
        sbM23356.append(enumC11347.f38286);
        String string = sbM23356.toString();
        if (!enumC11347.equals(this.f71135)) {
            return false;
        }
        URI uri = this.f71136;
        return string.equals(uri.getPath()) || uri.getPath().endsWith("/".concat(string));
    }

    public final String toString() {
        return getClass().getName() + "[" + this.f71136 + "]";
    }
}
