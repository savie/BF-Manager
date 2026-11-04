package l;

import java.nio.file.FileStore;
import java.nio.file.attribute.FileStoreAttributeView;

/* JADX INFO: renamed from: l.۫᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13365 extends FileStore {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ AbstractC11648 a;

    public /* synthetic */ C13365(AbstractC11648 abstractC11648) {
        this.a = abstractC11648;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC11648 abstractC11648 = this.a;
        if (obj instanceof C13365) {
            obj = ((C13365) obj).a;
        }
        return abstractC11648.equals(obj);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ Object getAttribute(String str) {
        return this.a.a(str);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getBlockSize() {
        return this.a.b();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ FileStoreAttributeView getFileStoreAttributeView(Class cls) {
        C9878 c9878C = this.a.c(cls);
        if (c9878C == null) {
            return null;
        }
        return c9878C.a;
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getTotalSpace() {
        return this.a.d();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUnallocatedSpace() {
        return this.a.e();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUsableSpace() {
        return this.a.getUsableSpace();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.f();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String name() {
        return this.a.g();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(Class cls) {
        return this.a.h(AbstractC1758.q(cls));
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(String str) {
        return this.a.i(str);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String type() {
        return this.a.j();
    }
}
