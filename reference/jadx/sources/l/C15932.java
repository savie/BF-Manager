package l;

import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶ۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6IN */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15932 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51745;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51746;

    public /* synthetic */ C15932(int i, Object obj) {
        this.f51745 = i;
        this.f51746 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f51745) {
            case 0:
                ((Map) obj).putAll(((C3254) this.f51746).f10590);
                break;
            case 1:
                ((C24927) obj).m31138((String) this.f51746);
                break;
            default:
                ((EnumC7687) obj).mo20952((C7312) this.f51746);
                break;
        }
    }
}
