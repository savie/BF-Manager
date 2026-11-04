package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C18819 extends AbstractC17567 {
    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        c21362.m48587((Boolean) obj);
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        EnumC14648 enumC14648M13438 = c4208.m13438();
        if (enumC14648M13438 == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        if (enumC14648M13438 == EnumC14648.STRING) {
            return Boolean.valueOf(Boolean.parseBoolean(c4208.m13453()));
        }
        return Boolean.valueOf(c4208.m13440());
    }
}
