package l;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.ܰۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13800 implements ToIntFunction {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45553;

    public /* synthetic */ C13800(int i) {
        this.f45553 = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f45553) {
            case 0:
                return ((InterfaceC9961) obj).mo25193();
            default:
                return C3128.m9453((AbstractC8774) obj);
        }
    }
}
