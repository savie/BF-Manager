package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20230 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65647;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65648;

    public /* synthetic */ C20230(int i, Object obj) {
        this.f65647 = i;
        this.f65648 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f65647) {
            case 0:
                ((AbstractC23903) this.f65648).m52695((C21825) obj);
                break;
            default:
                C0329 c0329 = (C0329) this.f65648;
                c0329.getClass();
                ((AbstractC20042) obj).mo1802(c0329);
                break;
        }
    }
}
