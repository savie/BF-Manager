package l;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;

/* JADX INFO: renamed from: l.ۖۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2421 implements InterfaceC15845, InterfaceC18829 {
    public final /* synthetic */ PosixFileAttributeView a;

    public /* synthetic */ C2421(PosixFileAttributeView posixFileAttributeView) {
        this.a = posixFileAttributeView;
    }

    @Override // l.InterfaceC15845
    public final /* synthetic */ void a(C21813 c21813, C21813 c21814, C21813 c21815) throws IOException {
        this.a.setTimes(AbstractC1758.o(c21813), AbstractC1758.o(c21814), AbstractC1758.o(c21815));
    }

    @Override // l.InterfaceC18829
    public final /* synthetic */ void b(InterfaceC5405 interfaceC5405) throws IOException {
        this.a.setOwner(C15099.a(interfaceC5405));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof C2421) {
            obj = ((C2421) obj).a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // l.InterfaceC18829
    public final /* synthetic */ InterfaceC5405 getOwner() {
        return C5162.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC1676
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // l.InterfaceC15845
    public final /* synthetic */ InterfaceC8665 readAttributes() {
        return C23305.a(this.a.readAttributes());
    }
}
