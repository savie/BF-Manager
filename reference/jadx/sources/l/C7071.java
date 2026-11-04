package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7071 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23291;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23292;

    public /* synthetic */ C7071(int i, Object obj) {
        this.f23291 = i;
        this.f23292 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f23291) {
            case 0:
                ((C10377) this.f23292).m29599((C14769) obj);
                break;
            default:
                C4965 c4965 = (C4965) this.f23292;
                c4965.getClass();
                ((AbstractC2705) obj).mo2284(c4965);
                break;
        }
    }
}
