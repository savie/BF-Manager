package l;

import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ۨۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12289 implements BiConsumer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC16018 f39503;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17771 f39504;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14526 f39505;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f39506;

    public /* synthetic */ C12289(C17771 c17771, String str, C14526 c14526, RunnableC16018 runnableC16018) {
        this.f39504 = c17771;
        this.f39506 = str;
        this.f39505 = c14526;
        this.f39503 = runnableC16018;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C23501.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        C17510 c17510 = (C17510) obj;
        Boolean bool = (Boolean) obj2;
        boolean zBooleanValue = bool.booleanValue();
        String str = this.f39506;
        if (zBooleanValue) {
            C17771 c17771 = this.f39504;
            c17771.m41594(str);
            c17771.m41603();
        }
        this.f39505.m35042(str, c17510, bool.booleanValue());
        this.f39503.run();
    }
}
