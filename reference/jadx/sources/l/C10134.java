package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10134 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34628;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34629;

    public /* synthetic */ C10134(int i, Object obj) {
        this.f34628 = i;
        this.f34629 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f34628) {
            case 0:
                C5900.m16147((C5900) this.f34629, (InterfaceC2557) obj);
                break;
            default:
                C19003 c19003 = (C19003) this.f34629;
                try {
                    ((Closeable) obj).close();
                } catch (IOException e) {
                    c19003.m43723(e);
                }
                break;
        }
    }
}
