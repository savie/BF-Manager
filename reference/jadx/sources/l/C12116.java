package l;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: l.ۨۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12116 implements DosFileAttributeView {
    public final /* synthetic */ InterfaceC7174 a;

    public /* synthetic */ C12116(InterfaceC7174 interfaceC7174) {
        this.a = interfaceC7174;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC7174 interfaceC7174 = this.a;
        if (obj instanceof C12116) {
            obj = ((C12116) obj).a;
        }
        return interfaceC7174.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C3167.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ DosFileAttributes readAttributes() {
        C6151 attributes = this.a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes.a;
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setArchive(boolean z) {
        this.a.setArchive(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setHidden(boolean z) {
        this.a.setHidden(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setReadOnly(boolean z) {
        this.a.setReadOnly(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setSystem(boolean z) {
        this.a.setSystem(z);
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.a.a(AbstractC1758.m(fileTime), AbstractC1758.m(fileTime2), AbstractC1758.m(fileTime3));
    }
}
