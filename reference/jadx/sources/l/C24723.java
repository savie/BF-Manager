package l;

import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T6GT */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24723 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f80037;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f80038;

    public /* synthetic */ C24723(int i, Object obj) {
        this.f80037 = i;
        this.f80038 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f80037) {
            case 0:
                ((ArrayList) this.f80038).addAll(((C21943) obj).mo1986());
                break;
            default:
                ((C9812) obj).m25581((Consumer) this.f80038);
                break;
        }
    }
}
