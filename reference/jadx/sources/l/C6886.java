package l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۜۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public final class C6886 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f22846;

    public C6886(AbstractC17567 abstractC17567) {
        this.f22846 = abstractC17567;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) {
        this.f22846.mo3723(c21362, Long.valueOf(((AtomicLong) obj).get()));
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) {
        return new AtomicLong(((Number) this.f22846.mo3722(c4208)).longValue());
    }
}
