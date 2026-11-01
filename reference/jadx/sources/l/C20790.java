package l;

import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20790 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67615;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67616;

    public /* synthetic */ C20790(int i, Object obj) {
        this.f67615 = i;
        this.f67616 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        int i = this.f67615;
        Object obj2 = this.f67616;
        switch (i) {
            case 0:
                C1635 c1635 = ((C14441) obj2).f47341.f31850;
                EnumC14337 enumC14337 = EnumC14337.HEADER;
                c1635.getClass();
                c1635.f6554.f43679 = (C15187) obj;
                break;
            default:
                ((ArrayList) obj2).add((InterfaceC4705) obj);
                break;
        }
    }
}
