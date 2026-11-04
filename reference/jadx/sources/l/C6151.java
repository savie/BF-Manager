package l;

import java.nio.file.attribute.DosFileAttributes;

/* JADX INFO: renamed from: l.ۛۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6151 implements InterfaceC8665 {
    public final /* synthetic */ DosFileAttributes a;

    @Override // l.InterfaceC8665
    public final /* synthetic */ C21813 creationTime() {
        return AbstractC1758.m(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributes dosFileAttributes = this.a;
        if (obj instanceof C6151) {
            obj = ((C6151) obj).a;
        }
        return dosFileAttributes.equals(obj);
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
