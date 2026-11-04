package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ۘۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G851 */
/* JADX INFO: loaded from: classes3.dex */
public class C3969 implements InterfaceC16075 {
    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }

    @Override // l.InterfaceC16075
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17567 mo1459(C24522 c24522, C6446 c6446) {
        if (c6446.m18232() == Date.class) {
            return new C18139(AbstractC21123.f67477, 2, 2);
        }
        return null;
    }
}
