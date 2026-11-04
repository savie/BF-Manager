package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public class C0920 extends AbstractC17567 {
    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c21362.m48598();
        } else {
            c21362.m48601(number.byteValue());
        }
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        try {
            int iM13455 = c4208.m13455();
            if (iM13455 <= 255 && iM13455 >= -128) {
                return Byte.valueOf((byte) iM13455);
            }
            StringBuilder sbM12235 = C3769.m12235(iM13455, "Lossy conversion from ", " to byte; at path ");
            sbM12235.append(c4208.m13451());
            throw new C7367(sbM12235.toString());
        } catch (NumberFormatException e) {
            throw new C7367(e);
        }
    }
}
