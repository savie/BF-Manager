package l;

import java.util.Date;

/* JADX INFO: renamed from: l.۫ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G851 */
/* JADX INFO: loaded from: classes4.dex */
public class C12209 implements InterfaceC20592 {
    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }

    @Override // l.InterfaceC20592
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7186 mo5183(C6044 c6044, C11730 c11730) {
        if (c11730.m29316() == Date.class) {
            return new C10798(0);
        }
        return null;
    }
}
