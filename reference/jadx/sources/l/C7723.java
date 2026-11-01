package l;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;

/* JADX INFO: renamed from: l.۟᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7723 implements InterfaceC11957, InterfaceC8429 {
    public final /* synthetic */ PosixFileAttributeView a;

    @Override // l.InterfaceC11957
    public final /* synthetic */ void a(C16502 c16502, C16502 c16503, C16502 c16504) throws IOException {
        this.a.setTimes(AbstractC1726.o(c16502), AbstractC1726.o(c16503), AbstractC1726.o(c16504));
    }

    @Override // l.InterfaceC8429
    public final /* synthetic */ void b(InterfaceC14386 interfaceC14386) throws IOException {
        this.a.setOwner(C10858.a(interfaceC14386));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof C7723) {
            obj = ((C7723) obj).a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // l.InterfaceC8429
    public final /* synthetic */ InterfaceC14386 getOwner() {
        return C0666.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC1684
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // l.InterfaceC11957
    public final /* synthetic */ InterfaceC20735 readAttributes() {
        return C2783.a(this.a.readAttributes());
    }
}
