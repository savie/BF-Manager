package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6UO */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6982 implements Consumer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f23483;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23484;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23485;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23486;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23487;

    public /* synthetic */ C6982(int i, int i2, CharSequence charSequence, int i3, int i4) {
        this.f23485 = i;
        this.f23487 = i2;
        this.f23483 = charSequence;
        this.f23486 = i3;
        this.f23484 = i4;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((C15450) obj).m36971(this.f23485, this.f23487, this.f23483, this.f23486, this.f23484);
    }
}
