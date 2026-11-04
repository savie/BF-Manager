package l;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: l.ۗۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3167 implements BasicFileAttributes {
    public final /* synthetic */ InterfaceC8665 a;

    public /* synthetic */ C3167(InterfaceC8665 interfaceC8665) {
        this.a = interfaceC8665;
    }

    public static /* synthetic */ BasicFileAttributes a(InterfaceC8665 interfaceC8665) {
        if (interfaceC8665 == null) {
            return null;
        }
        if (interfaceC8665 instanceof C23305) {
            return ((C23305) interfaceC8665).a;
        }
        if (interfaceC8665 instanceof C6151) {
            return ((C6151) interfaceC8665).a;
        }
        if (!(interfaceC8665 instanceof InterfaceC10624)) {
            return new C3167(interfaceC8665);
        }
        InterfaceC10624 interfaceC10624 = (InterfaceC10624) interfaceC8665;
        return interfaceC10624 instanceof C8387 ? ((C8387) interfaceC10624).a : new C6896(interfaceC10624);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC1758.o(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8665 interfaceC8665 = this.a;
        if (obj instanceof C3167) {
            obj = ((C3167) obj).a;
        }
        return interfaceC8665.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return AbstractC1758.o(this.a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC1758.o(this.a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
