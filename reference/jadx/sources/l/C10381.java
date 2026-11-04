package l;

import java.io.IOException;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۢ᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10381 implements InterfaceC1208 {
    public final /* synthetic */ WatchService a;

    public /* synthetic */ C10381(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ InterfaceC1208 b(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return watchService instanceof C9635 ? ((C9635) watchService).a : new C10381(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof C10381) {
            obj = ((C10381) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC1208
    public final /* synthetic */ InterfaceC10156 poll() {
        return C18586.a(this.a.poll());
    }

    @Override // l.InterfaceC1208
    public final /* synthetic */ InterfaceC10156 poll(long j, TimeUnit timeUnit) {
        return C18586.a(this.a.poll(j, timeUnit));
    }

    @Override // l.InterfaceC1208
    public final /* synthetic */ InterfaceC10156 take() {
        return C18586.a(this.a.take());
    }
}
