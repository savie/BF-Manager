package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩸֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: R7K0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21224 implements InterfaceC20735 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12107 f69139;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16502 f69140;

    @Override // l.InterfaceC20735
    public final Object fileKey() {
        return null;
    }

    @Override // l.InterfaceC20735
    public final boolean isOther() {
        return false;
    }

    @Override // l.InterfaceC20735
    public final boolean isSymbolicLink() {
        return false;
    }

    public C21224(C12107 c12107) {
        this.f69139 = c12107;
        this.f69140 = C16502.from(c12107.getTime(), TimeUnit.MILLISECONDS);
    }

    @Override // l.InterfaceC20735
    public final C16502 lastModifiedTime() {
        return this.f69140;
    }

    @Override // l.InterfaceC20735
    public final C16502 lastAccessTime() {
        return this.f69140;
    }

    @Override // l.InterfaceC20735
    public final C16502 creationTime() {
        return this.f69140;
    }

    @Override // l.InterfaceC20735
    public final boolean isRegularFile() {
        return !this.f69139.isDirectory();
    }

    @Override // l.InterfaceC20735
    public final boolean isDirectory() {
        return this.f69139.isDirectory();
    }

    @Override // l.InterfaceC20735
    public final long size() {
        return this.f69139.getSize();
    }
}
