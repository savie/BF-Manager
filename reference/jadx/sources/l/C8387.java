package l;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8387 implements InterfaceC10624 {
    public final /* synthetic */ PosixFileAttributes a;

    public /* synthetic */ C8387(PosixFileAttributes posixFileAttributes) {
        this.a = posixFileAttributes;
    }

    @Override // l.InterfaceC8665
    public final /* synthetic */ C21813 creationTime() {
        return AbstractC1758.m(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.a;
        if (obj instanceof C8387) {
            obj = ((C8387) obj).a;
        }
        return posixFileAttributes.equals(obj);
    }

    @Override // l.InterfaceC8665
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    @Override // l.InterfaceC10624
    public final /* synthetic */ C9132 group() {
        return C9132.a(this.a.group());
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

    @Override // l.InterfaceC10624
    public final /* synthetic */ InterfaceC5405 owner() {
        return C5162.a(this.a.owner());
    }

    @Override // l.InterfaceC10624
    public final /* synthetic */ Set permissions() {
        return AbstractC1758.v(this.a.permissions());
    }

    @Override // l.InterfaceC8665
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
