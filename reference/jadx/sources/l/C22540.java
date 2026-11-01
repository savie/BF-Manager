package l;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/* JADX INFO: renamed from: l.᩹᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C22540 implements InterfaceC15797 {
    public final /* synthetic */ DosFileAttributeView a;

    @Override // l.InterfaceC11957
    public final /* synthetic */ void a(C16502 c16502, C16502 c16503, C16502 c16504) throws IOException {
        this.a.setTimes(AbstractC1726.o(c16502), AbstractC1726.o(c16503), AbstractC1726.o(c16504));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof C22540) {
            obj = ((C22540) obj).a;
        }
        return dosFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC1684
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // l.InterfaceC15797, l.InterfaceC11957
    public final /* synthetic */ C13368 readAttributes() throws IOException {
        DosFileAttributes attributes = this.a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return new C13368(attributes);
    }

    @Override // l.InterfaceC11957
    public final /* synthetic */ InterfaceC20735 readAttributes() {
        return C2783.a(this.a.readAttributes());
    }

    @Override // l.InterfaceC15797
    public final /* synthetic */ void setArchive(boolean z) throws IOException {
        this.a.setArchive(z);
    }

    @Override // l.InterfaceC15797
    public final /* synthetic */ void setHidden(boolean z) throws IOException {
        this.a.setHidden(z);
    }

    @Override // l.InterfaceC15797
    public final /* synthetic */ void setReadOnly(boolean z) throws IOException {
        this.a.setReadOnly(z);
    }

    @Override // l.InterfaceC15797
    public final /* synthetic */ void setSystem(boolean z) throws IOException {
        this.a.setSystem(z);
    }
}
