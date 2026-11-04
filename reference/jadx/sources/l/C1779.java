package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K6U1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1779 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6083;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6084;

    public /* synthetic */ C1779(int i, Object obj) {
        this.f6083 = i;
        this.f6084 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f6083) {
            case 0:
                ((C24900) this.f6084).m55477(obj);
                break;
            case 1:
                ((ViewOnClickListenerC19404) this.f6084).f62712.m51317().mo40353((String) obj);
                break;
            default:
                ((C4644) this.f6084).m14490(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
