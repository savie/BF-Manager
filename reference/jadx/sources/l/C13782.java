package l;

import java.util.LinkedHashSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13782 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43730;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43731;

    public /* synthetic */ C13782(int i, Object obj) {
        this.f43730 = i;
        this.f43731 = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f43730) {
            case 0:
                ((C10377) this.f43731).m29569((C14769) obj);
                break;
            case 1:
                ((LinkedHashSet) this.f43731).add((Integer) obj);
                break;
            default:
                C4430.m14087((C2551) this.f43731, (C17973) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
