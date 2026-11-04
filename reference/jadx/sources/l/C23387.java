package l;

import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: l.᩹ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23387 extends FileLock {
    public final FileLock a;

    public C23387(FileLock fileLock, C15927 c15927) {
        super(c15927, fileLock.position(), fileLock.size(), fileLock.isShared());
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
