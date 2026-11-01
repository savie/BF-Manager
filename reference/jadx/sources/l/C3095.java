package l;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

/* JADX INFO: renamed from: l.ۗ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3095 implements InterfaceC11957 {
    public final /* synthetic */ BasicFileAttributeView a;

    @Override // l.InterfaceC11957
    public final /* synthetic */ void a(C16502 c16502, C16502 c16503, C16502 c16504) throws IOException {
        this.a.setTimes(AbstractC1726.o(c16502), AbstractC1726.o(c16503), AbstractC1726.o(c16504));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof C3095) {
            obj = ((C3095) obj).a;
        }
        return basicFileAttributeView.equals(obj);
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
