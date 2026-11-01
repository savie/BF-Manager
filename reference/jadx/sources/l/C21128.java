package l;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21128 implements InterfaceC12269 {
    public final /* synthetic */ PosixFileAttributes a;

    public /* synthetic */ C21128(PosixFileAttributes posixFileAttributes) {
        this.a = posixFileAttributes;
    }

    @Override // l.InterfaceC20735
    public final /* synthetic */ C16502 creationTime() {
        return AbstractC1726.m(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.a;
        if (obj instanceof C21128) {
            obj = ((C21128) obj).a;
        }
        return posixFileAttributes.equals(obj);
    }

    @Override // l.InterfaceC20735
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    @Override // l.InterfaceC12269
    public final /* synthetic */ C10546 group() {
        return C10546.a(this.a.group());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC20735
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // l.InterfaceC20735
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // l.InterfaceC20735
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // l.InterfaceC20735
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // l.InterfaceC20735
    public final /* synthetic */ C16502 lastAccessTime() {
        return AbstractC1726.m(this.a.lastAccessTime());
    }

    @Override // l.InterfaceC20735
    public final /* synthetic */ C16502 lastModifiedTime() {
        return AbstractC1726.m(this.a.lastModifiedTime());
    }

    @Override // l.InterfaceC12269
    public final /* synthetic */ InterfaceC14386 owner() {
        return C0666.a(this.a.owner());
    }

    @Override // l.InterfaceC12269
    public final /* synthetic */ Set permissions() {
        return AbstractC1726.v(this.a.permissions());
    }

    @Override // l.InterfaceC20735
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
