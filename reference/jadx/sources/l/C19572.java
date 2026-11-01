package l;

import java.io.IOException;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩵ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19572 implements InterfaceC8741 {
    public final /* synthetic */ WatchService a;

    public /* synthetic */ C19572(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ InterfaceC8741 b(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return watchService instanceof C10400 ? ((C10400) watchService).a : new C19572(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof C19572) {
            obj = ((C19572) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC8741
    public final /* synthetic */ InterfaceC19324 poll() {
        return C21688.a(this.a.poll());
    }

    @Override // l.InterfaceC8741
    public final /* synthetic */ InterfaceC19324 poll(long j, TimeUnit timeUnit) {
        return C21688.a(this.a.poll(j, timeUnit));
    }

    @Override // l.InterfaceC8741
    public final /* synthetic */ InterfaceC19324 take() {
        return C21688.a(this.a.take());
    }
}
