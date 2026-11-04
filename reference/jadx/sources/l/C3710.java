package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3710 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12736;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12737;

    public /* synthetic */ C3710(int i, Object obj) {
        this.f12736 = i;
        this.f12737 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f12736) {
            case 0:
                C7439.m20383((C7439) this.f12737, (C7110) obj);
                break;
            default:
                C5663 c5663 = (C5663) obj;
                ((StringBuilder) this.f12737).append("{ " + c5663.f19546 + " " + c5663.f19547 + " " + c5663.f19545 + " }");
                break;
        }
    }
}
