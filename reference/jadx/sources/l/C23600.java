package l;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: renamed from: l.᩹ܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V82C */
/* JADX INFO: loaded from: classes.dex */
public final class C23600 extends AbstractC17567 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16075 f76612 = new C16140();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17567 f76613;

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) {
        this.f76613.mo3723(c21362, (Timestamp) obj);
    }

    public C23600(AbstractC17567 abstractC17567) {
        this.f76613 = abstractC17567;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) {
        Date date = (Date) this.f76613.mo3722(c4208);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }
}
