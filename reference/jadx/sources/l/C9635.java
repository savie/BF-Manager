package l;

import java.io.IOException;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۡ᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9635 implements WatchService {
    public final /* synthetic */ InterfaceC1208 a;

    public /* synthetic */ C9635(InterfaceC1208 interfaceC1208) {
        this.a = interfaceC1208;
    }

    public static /* synthetic */ WatchService b(InterfaceC1208 interfaceC1208) {
        if (interfaceC1208 == null) {
            return null;
        }
        return interfaceC1208 instanceof C10381 ? ((C10381) interfaceC1208).a : new C9635(interfaceC1208);
    }

    @Override // java.nio.file.WatchService, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1208 interfaceC1208 = this.a;
        if (obj instanceof C9635) {
            obj = ((C9635) obj).a;
        }
        return interfaceC1208.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll() {
        return C8145.a(this.a.poll());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll(long j, TimeUnit timeUnit) {
        return C8145.a(this.a.poll(j, timeUnit));
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey take() {
        return C8145.a(this.a.take());
    }
}
