package l;

import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6BW */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21900 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70744;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70745;

    public /* synthetic */ C21900(int i, Object obj) {
        this.f70744 = i;
        this.f70745 = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f70744) {
            case 0:
                ((ArrayList) this.f70745).add((C21943) obj);
                break;
            default:
                C12876.m31913((C12876) this.f70745, (C24927) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
