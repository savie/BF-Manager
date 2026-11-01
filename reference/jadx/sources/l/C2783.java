package l;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

/* JADX INFO: renamed from: l.ۖ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2783 implements InterfaceC20735 {
    public final /* synthetic */ BasicFileAttributes a;

    public /* synthetic */ C2783(BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ InterfaceC20735 a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof C5606) {
            return ((C5606) basicFileAttributes).a;
        }
        if (basicFileAttributes instanceof DosFileAttributes) {
            return new C13368((DosFileAttributes) basicFileAttributes);
        }
        if (!(basicFileAttributes instanceof PosixFileAttributes)) {
            return new C2783(basicFileAttributes);
        }
        PosixFileAttributes posixFileAttributes = (PosixFileAttributes) basicFileAttributes;
        return posixFileAttributes instanceof C16190 ? ((C16190) posixFileAttributes).a : new C21128(posixFileAttributes);
    }

    @Override // l.InterfaceC20735
    public final /* synthetic */ C16502 creationTime() {
        return AbstractC1726.m(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof C2783) {
            obj = ((C2783) obj).a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // l.InterfaceC20735
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
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

    @Override // l.InterfaceC20735
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
