package l;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۢ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC9457 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32006;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32007;

    public /* synthetic */ CallableC9457(int i, Object obj) {
        this.f32006 = i;
        this.f32007 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f32006) {
            case 0:
                try {
                    InputStream inputStreamMo33970 = ((C17196) this.f32007).mo33970();
                    try {
                        Boolean bool = Boolean.TRUE;
                        inputStreamMo33970.close();
                        return bool;
                    } catch (Throwable th) {
                        try {
                            inputStreamMo33970.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            case 1:
                return Byte.valueOf(C7817.m20522((C7817) this.f32007));
            default:
                C2189.m6797((InterfaceC9868) this.f32007);
                return null;
        }
    }
}
