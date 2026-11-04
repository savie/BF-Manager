package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11720 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37923;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f37924;

    public /* synthetic */ C11720(int i, Object obj) {
        this.f37923 = i;
        this.f37924 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f37923) {
            case 0:
                C18499 c18499 = (C18499) this.f37924;
                try {
                    ((Closeable) obj).close();
                } catch (IOException e) {
                    c18499.m43089(e);
                }
                break;
            default:
                String str = (String) this.f37924;
                InterfaceC6238 interfaceC6238 = (AbstractC16481) obj;
                if (interfaceC6238 instanceof InterfaceC3057) {
                    ((InterfaceC3057) interfaceC6238).setName(str);
                }
                break;
        }
    }
}
