package l;

import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12945 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41497;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41498;

    public /* synthetic */ C12945(int i, Object obj) {
        this.f41497 = i;
        this.f41498 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f41497) {
            case 0:
                ((ArrayList) this.f41498).add((AbstractC11781) obj);
                break;
            case 1:
                C22865 c22865 = (C22865) this.f41498;
                c22865.getClass();
                ((AbstractC2705) obj).mo2284(c22865);
                break;
            default:
                ((AbstractC11781) this.f41498).m29569((C14769) obj);
                break;
        }
    }
}
