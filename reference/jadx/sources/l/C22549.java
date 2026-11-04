package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes.dex */
public class C22549 extends AbstractC17567 {
    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c21362.m48598();
        } else {
            c21362.m48602(number.toString());
        }
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        return Long.valueOf(c4208.m13452());
    }
}
