package l;

import java.io.File;
import java.net.URI;

/* JADX INFO: renamed from: l.֨ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7KL */
/* JADX INFO: loaded from: classes3.dex */
public final class C1061 extends AbstractC14484 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18960 f3798;

    @Override // l.InterfaceC24329
    public final InterfaceC24329 toRealPath(EnumC20599[] enumC20599Arr) {
        return super.toAbsolutePath();
    }

    public C1061(C18960 c18960, String str) {
        super(str);
        C17359.requireNonNull(c18960);
        this.f3798 = c18960;
    }

    @Override // l.InterfaceC24329
    public final C18960 getFileSystem() {
        return this.f3798;
    }

    @Override // l.InterfaceC24329
    public final AbstractC25075 getFileSystem() {
        return this.f3798;
    }

    @Override // l.AbstractC14484
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1061 mo3995(String str) {
        return new C1061(this.f3798, str);
    }

    @Override // l.InterfaceC24329
    public final URI toUri() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC24329
    public final File toFile() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC24329, l.InterfaceC21987
    public final InterfaceC10156 register(InterfaceC1208 interfaceC1208, InterfaceC7920[] interfaceC7920Arr, InterfaceC19107[] interfaceC19107Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC24329, l.InterfaceC21987
    public final InterfaceC10156 register(InterfaceC1208 interfaceC1208, InterfaceC7920[] interfaceC7920Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC24329
    public final String toString() {
        return this.f45594;
    }
}
