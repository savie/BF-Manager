package l;

import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.᩺ܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23117 implements BiConsumer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18883 f75084;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9160 f75085;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC1243 f75086;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f75087;

    public /* synthetic */ C23117(C9160 c9160, String str, C18883 c18883, RunnableC1243 runnableC1243) {
        this.f75085 = c9160;
        this.f75087 = str;
        this.f75084 = c18883;
        this.f75086 = runnableC1243;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C2866.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        C22411 c22411 = (C22411) obj;
        Boolean bool = (Boolean) obj2;
        boolean zBooleanValue = bool.booleanValue();
        String str = this.f75087;
        if (zBooleanValue) {
            C9160 c9160 = this.f75085;
            c9160.m23507(str);
            c9160.m23519();
        }
        this.f75084.m43557(str, c22411, bool.booleanValue());
        this.f75086.run();
    }
}
