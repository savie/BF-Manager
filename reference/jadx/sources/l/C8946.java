package l;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.۠᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8946 implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        AbstractC14166 abstractC14166 = (AbstractC14166) obj;
        int iOrdinal = abstractC14166.mo19837().ordinal();
        if (iOrdinal == 0) {
            return abstractC14166.mo19836().getPosition();
        }
        if (iOrdinal == 1) {
            return C3881.m12509((InterfaceC19637) abstractC14166.mo23411());
        }
        throw new AssertionError();
    }
}
