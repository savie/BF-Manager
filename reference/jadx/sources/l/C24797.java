package l;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

/* JADX INFO: renamed from: l.᩻ۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C24797 implements InterfaceC15845 {
    public final /* synthetic */ BasicFileAttributeView a;

    public /* synthetic */ C24797(BasicFileAttributeView basicFileAttributeView) {
        this.a = basicFileAttributeView;
    }

    @Override // l.InterfaceC15845
    public final /* synthetic */ void a(C21813 c21813, C21813 c21814, C21813 c21815) throws IOException {
        this.a.setTimes(AbstractC1758.o(c21813), AbstractC1758.o(c21814), AbstractC1758.o(c21815));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof C24797) {
            obj = ((C24797) obj).a;
        }
        return basicFileAttributeView.equals(obj);
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
