package l;

import java.io.IOException;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۤܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10400 implements WatchService {
    public final /* synthetic */ InterfaceC8741 a;

    public /* synthetic */ C10400(InterfaceC8741 interfaceC8741) {
        this.a = interfaceC8741;
    }

    public static /* synthetic */ WatchService b(InterfaceC8741 interfaceC8741) {
        if (interfaceC8741 == null) {
            return null;
        }
        return interfaceC8741 instanceof C19572 ? ((C19572) interfaceC8741).a : new C10400(interfaceC8741);
    }

    @Override // java.nio.file.WatchService, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8741 interfaceC8741 = this.a;
        if (obj instanceof C10400) {
            obj = ((C10400) obj).a;
        }
        return interfaceC8741.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll() {
        return C18866.a(this.a.poll());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll(long j, TimeUnit timeUnit) {
        return C18866.a(this.a.poll(j, timeUnit));
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey take() {
        return C18866.a(this.a.take());
    }
}
