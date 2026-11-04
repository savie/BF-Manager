package l;

import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46GW */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23567 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76114;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76115;

    public /* synthetic */ C23567(int i, Object obj) {
        this.f76114 = i;
        this.f76115 = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f76114) {
            case 0:
                ((Set) this.f76115).remove((String) obj);
                break;
            case 1:
                ((C24160) this.f76115).mo22644((C24927) obj);
                break;
            default:
                ((C19684) this.f76115).m45363((C21943) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
