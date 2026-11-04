package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C19565 extends AbstractC17567 {
    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        Character ch = (Character) obj;
        c21362.m48602(ch == null ? null : String.valueOf(ch));
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        String strM13453 = c4208.m13453();
        int length = strM13453.length();
        if (length != 1) {
            throw new C7367("Expecting single character, got: '" + strM13453 + "' (length " + length + "); at path " + c4208.m13451());
        }
        return Character.valueOf(strM13453.charAt(0));
    }
}
