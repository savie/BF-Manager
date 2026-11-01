package l;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: renamed from: l.ۢ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V82C */
/* JADX INFO: loaded from: classes3.dex */
public final class C9263 extends AbstractC7186 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20592 f31488 = new C1500();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7186 f31489;

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) {
        this.f31489.mo1572(c1145, (Timestamp) obj);
    }

    public C9263(AbstractC7186 abstractC7186) {
        this.f31489 = abstractC7186;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) {
        Date date = (Date) this.f31489.mo1571(c5379);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }
}
