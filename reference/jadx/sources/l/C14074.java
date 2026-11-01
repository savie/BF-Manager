package l;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: l.ܰ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14074 implements BasicFileAttributeView {
    public final /* synthetic */ InterfaceC11957 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC11957 interfaceC11957 = this.a;
        if (obj instanceof C14074) {
            obj = ((C14074) obj).a;
        }
        return interfaceC11957.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C5606.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.a.a(AbstractC1726.m(fileTime), AbstractC1726.m(fileTime2), AbstractC1726.m(fileTime3));
    }
}
