package l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.᩶ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9LQ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21437 implements IntFunction {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68391;

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f68391) {
            case 0:
                return String.format("#%08x", Integer.valueOf(i));
            default:
                return String.format("#%d", Integer.valueOf(i));
        }
    }
}
