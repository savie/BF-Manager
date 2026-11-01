package l;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.ۨܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11751 implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        AbstractC5400 abstractC5400 = (AbstractC5400) obj;
        int iOrdinal = abstractC5400.mo14963().ordinal();
        if (iOrdinal == 0) {
            return abstractC5400.mo7052().getPosition();
        }
        if (iOrdinal == 1) {
            return C12457.m30932((InterfaceC17428) abstractC5400.mo7051());
        }
        throw new AssertionError();
    }
}
