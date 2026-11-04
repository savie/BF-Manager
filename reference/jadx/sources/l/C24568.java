package l;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.᩺᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P6HD */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24568 implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        C18959 c18959M39118;
        C6041 c6041 = (C6041) obj;
        if (c6041 == null || (c18959M39118 = c6041.m39118()) == null) {
            return -1;
        }
        return c18959M39118.getOffset();
    }
}
