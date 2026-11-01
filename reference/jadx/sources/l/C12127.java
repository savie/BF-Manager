package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: R6KO */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12127 implements Consumer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18559 f40602;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f40603;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22357 f40604;

    public /* synthetic */ C12127(boolean[] zArr, C22357 c22357, C18559 c18559) {
        this.f40603 = zArr;
        this.f40604 = c22357;
        this.f40602 = c18559;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f40603[0] = true;
        this.f40604.setText("/" + this.f40602.m42974((String) obj));
    }
}
