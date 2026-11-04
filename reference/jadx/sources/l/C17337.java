package l;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: l.ܽۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17337 implements BasicFileAttributeView {
    public final /* synthetic */ InterfaceC15845 a;

    public /* synthetic */ C17337(InterfaceC15845 interfaceC15845) {
        this.a = interfaceC15845;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC15845 interfaceC15845 = this.a;
        if (obj instanceof C17337) {
            obj = ((C17337) obj).a;
        }
        return interfaceC15845.equals(obj);
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
        return C3167.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.a.a(AbstractC1758.m(fileTime), AbstractC1758.m(fileTime2), AbstractC1758.m(fileTime3));
    }
}
