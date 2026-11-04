package l;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۜۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B8P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6933 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8424 f22940;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f22941 = new AtomicBoolean(false);

    public C6933(InterfaceC8424 interfaceC8424) {
        this.f22940 = interfaceC8424;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22486 m19216(Object... objArr) {
        Constructor constructorMo8291;
        synchronized (this.f22941) {
            try {
                if (!this.f22941.get()) {
                    try {
                        constructorMo8291 = this.f22940.mo8291();
                    } catch (ClassNotFoundException unused) {
                        this.f22941.set(true);
                        constructorMo8291 = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorMo8291 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorMo8291 == null) {
            return null;
        }
        try {
            return (InterfaceC22486) constructorMo8291.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
