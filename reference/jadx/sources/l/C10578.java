package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10578 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36190;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36191;

    public /* synthetic */ C10578(int i, Object obj) {
        this.f36190 = i;
        this.f36191 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f36190) {
            case 0:
                ((ViewOnClickListenerC3520) this.f36191).f12882.m42648().mo23642((String) obj);
                break;
            default:
                ((StringBuilder) this.f36191).append((String) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
