package l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܳᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14698 implements IntFunction {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48017;

    public /* synthetic */ C14698(int i) {
        this.f48017 = i;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f48017) {
            case 0:
                return new CharSequence[i];
            default:
                return new InterfaceC7299[i];
        }
    }
}
