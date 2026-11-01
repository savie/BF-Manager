package l;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ᩳۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17805 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21333 f56423;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f56424 = new AtomicBoolean(false);

    public C17805(InterfaceC21333 interfaceC21333) {
        this.f56423 = interfaceC21333;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10045 m41382(Object... objArr) {
        Constructor constructorMo22300;
        synchronized (this.f56424) {
            if (!this.f56424.get()) {
                try {
                    constructorMo22300 = this.f56423.mo22300();
                } catch (ClassNotFoundException unused) {
                    this.f56424.set(true);
                    constructorMo22300 = null;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorMo22300 = null;
        }
        if (constructorMo22300 == null) {
            return null;
        }
        try {
            return (InterfaceC10045) constructorMo22300.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
