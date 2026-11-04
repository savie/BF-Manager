package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6UO */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3576 implements Consumer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12243;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12244;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12245;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f12246;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12247;

    public /* synthetic */ C3576(int i, int i2, CharSequence charSequence, int i3, int i4) {
        this.f12245 = i;
        this.f12247 = i2;
        this.f12246 = charSequence;
        this.f12243 = i3;
        this.f12244 = i4;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((C12525) obj).m31114(this.f12245, this.f12247, this.f12246, this.f12243, this.f12244);
    }
}
