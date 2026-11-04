package l;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

/* JADX INFO: renamed from: l.᩹ۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23305 implements InterfaceC8665 {
    public final /* synthetic */ BasicFileAttributes a;

    public /* synthetic */ C23305(BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ InterfaceC8665 a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof C3167) {
            return ((C3167) basicFileAttributes).a;
        }
        if (basicFileAttributes instanceof DosFileAttributes) {
            return new C6151((DosFileAttributes) basicFileAttributes);
        }
        if (!(basicFileAttributes instanceof PosixFileAttributes)) {
            return new C23305(basicFileAttributes);
        }
        PosixFileAttributes posixFileAttributes = (PosixFileAttributes) basicFileAttributes;
        return posixFileAttributes instanceof C6896 ? ((C6896) posixFileAttributes).a : new C8387(posixFileAttributes);
    }

    @Override // l.InterfaceC8665
    public final /* synthetic */ C21813 creationTime() {
        return AbstractC1758.m(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof C23305) {
            obj = ((C23305) obj).a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // l.InterfaceC8665
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC8665
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // l.InterfaceC8665
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // l.InterfaceC8665
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // l.InterfaceC8665
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // l.InterfaceC8665
    public final /* synthetic */ C21813 lastAccessTime() {
        return AbstractC1758.m(this.a.lastAccessTime());
    }

    @Override // l.InterfaceC8665
    public final /* synthetic */ C21813 lastModifiedTime() {
        return AbstractC1758.m(this.a.lastModifiedTime());
    }

    @Override // l.InterfaceC8665
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
