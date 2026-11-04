package l;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֨۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1208 extends Closeable {
    InterfaceC10156 poll();

    InterfaceC10156 poll(long j, TimeUnit timeUnit);

    InterfaceC10156 take();
}
