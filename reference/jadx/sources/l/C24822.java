package l;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.᩻ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R78M */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24822 implements ToIntFunction {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f80301;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f80301) {
            case 0:
                int iM37838 = C15870.m37838((String) obj);
                if (iM37838 == 0) {
                    return Integer.MAX_VALUE;
                }
                return iM37838;
            default:
                return ((C17973) obj).m41936();
        }
    }
}
