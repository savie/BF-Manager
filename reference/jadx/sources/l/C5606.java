package l;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: l.ۚ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5606 implements BasicFileAttributes {
    public final /* synthetic */ InterfaceC20735 a;

    public /* synthetic */ C5606(InterfaceC20735 interfaceC20735) {
        this.a = interfaceC20735;
    }

    public static /* synthetic */ BasicFileAttributes a(InterfaceC20735 interfaceC20735) {
        if (interfaceC20735 == null) {
            return null;
        }
        if (interfaceC20735 instanceof C2783) {
            return ((C2783) interfaceC20735).a;
        }
        if (interfaceC20735 instanceof C13368) {
            return ((C13368) interfaceC20735).a;
        }
        if (!(interfaceC20735 instanceof InterfaceC12269)) {
            return new C5606(interfaceC20735);
        }
        InterfaceC12269 interfaceC12269 = (InterfaceC12269) interfaceC20735;
        return interfaceC12269 instanceof C21128 ? ((C21128) interfaceC12269).a : new C16190(interfaceC12269);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC1726.o(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC20735 interfaceC20735 = this.a;
        if (obj instanceof C5606) {
            obj = ((C5606) obj).a;
        }
        return interfaceC20735.equals(obj);
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
        return AbstractC1726.o(this.a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC1726.o(this.a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
