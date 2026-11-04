package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤ۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6BW */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10711 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34009;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34010;

    public /* synthetic */ C10711(int i, Object obj) {
        this.f34009 = i;
        this.f34010 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f34009) {
            case 0:
                ((C19684) obj).m45374((C21943) this.f34010);
                break;
            case 1:
                C1930.m6630((C1930) this.f34010, (C17973) obj);
                break;
            default:
                ((C20180) this.f34010).f64812 = ((Boolean) obj).booleanValue();
                break;
        }
    }
}
