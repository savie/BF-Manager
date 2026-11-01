package l;

import java.io.File;
import java.net.URI;

/* JADX INFO: renamed from: l.۟֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: C7KL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7113 extends AbstractC14875 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8525 f23805;

    @Override // l.InterfaceC3800
    public final InterfaceC3800 toRealPath(EnumC22146[] enumC22146Arr) {
        return super.toAbsolutePath();
    }

    public C7113(C8525 c8525, String str) {
        super(str);
        C13638.requireNonNull(c8525);
        this.f23805 = c8525;
    }

    @Override // l.InterfaceC3800
    public final AbstractC3178 getFileSystem() {
        return this.f23805;
    }

    @Override // l.InterfaceC3800
    public final C8525 getFileSystem() {
        return this.f23805;
    }

    @Override // l.AbstractC14875
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7113 mo19001(String str) {
        return new C7113(this.f23805, str);
    }

    @Override // l.InterfaceC3800
    public final URI toUri() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC3800
    public final File toFile() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC3800, l.InterfaceC16750
    public final InterfaceC19324 register(InterfaceC8741 interfaceC8741, InterfaceC18618[] interfaceC18618Arr, InterfaceC8035[] interfaceC8035Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC3800, l.InterfaceC16750
    public final InterfaceC19324 register(InterfaceC8741 interfaceC8741, InterfaceC18618[] interfaceC18618Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC3800
    public final String toString() {
        return this.f48629;
    }
}
