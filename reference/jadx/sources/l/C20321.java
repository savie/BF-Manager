package l;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/* JADX INFO: renamed from: l.᩵ۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20321 implements InterfaceC7174 {
    public final /* synthetic */ DosFileAttributeView a;

    public /* synthetic */ C20321(DosFileAttributeView dosFileAttributeView) {
        this.a = dosFileAttributeView;
    }

    @Override // l.InterfaceC15845
    public final /* synthetic */ void a(C21813 c21813, C21813 c21814, C21813 c21815) throws IOException {
        this.a.setTimes(AbstractC1758.o(c21813), AbstractC1758.o(c21814), AbstractC1758.o(c21815));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof C20321) {
            obj = ((C20321) obj).a;
        }
        return dosFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC1676
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // l.InterfaceC7174, l.InterfaceC15845
    public final /* synthetic */ C6151 readAttributes() throws IOException {
        DosFileAttributes attributes = this.a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return new C6151(attributes);
    }

    @Override // l.InterfaceC15845
    public final /* synthetic */ InterfaceC8665 readAttributes() {
        return C23305.a(this.a.readAttributes());
    }

    @Override // l.InterfaceC7174
    public final /* synthetic */ void setArchive(boolean z) throws IOException {
        this.a.setArchive(z);
    }

    @Override // l.InterfaceC7174
    public final /* synthetic */ void setHidden(boolean z) throws IOException {
        this.a.setHidden(z);
    }

    @Override // l.InterfaceC7174
    public final /* synthetic */ void setReadOnly(boolean z) throws IOException {
        this.a.setReadOnly(z);
    }

    @Override // l.InterfaceC7174
    public final /* synthetic */ void setSystem(boolean z) throws IOException {
        this.a.setSystem(z);
    }
}
