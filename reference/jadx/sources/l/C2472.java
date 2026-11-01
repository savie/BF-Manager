package l;

import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: l.ۖۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2472 extends FileLock {
    public final FileLock a;

    public C2472(FileLock fileLock, C11646 c11646) {
        super(c11646, fileLock.position(), fileLock.size(), fileLock.isShared());
        this.a = fileLock;
    }

    @Override // java.nio.channels.FileLock
    public final boolean isValid() {
        return this.a.isValid();
    }

    @Override // java.nio.channels.FileLock
    public final void release() throws IOException {
        this.a.release();
    }
}
