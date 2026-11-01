package l;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۡ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8741 extends Closeable {
    InterfaceC19324 poll();

    InterfaceC19324 poll(long j, TimeUnit timeUnit);

    InterfaceC19324 take();
}
