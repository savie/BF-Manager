package l;

import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶ֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6HJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15713 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51036;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51037;

    public /* synthetic */ C15713(int i, Object obj) {
        this.f51036 = i;
        this.f51037 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f51036) {
            case 0:
                C11984.m30090((boolean[]) this.f51037, (InterfaceC23435) obj);
                break;
            case 1:
                ((ArrayList) this.f51037).add((C6004) obj);
                break;
            default:
                C7005.m19326((InterfaceC13673) this.f51037, (C2551) obj);
                break;
        }
    }
}
