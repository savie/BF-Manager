package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20156 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f64754;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f64755;

    public C20156(AbstractC17567 abstractC17567, AbstractC17567 abstractC17568) {
        this.f64754 = abstractC17567;
        this.f64755 = abstractC17568;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        C2595 c2595 = (C2595) obj;
        c21362.m48600();
        c21362.m48589("time");
        this.f64754.mo3723(c21362, c2595.toLocalTime());
        c21362.m48589("offset");
        this.f64755.mo3723(c21362, c2595.getOffset());
        c21362.m48597();
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        c4208.m13456();
        C10052 c10052 = null;
        C11149 c11149 = null;
        while (c4208.m13438() != EnumC14648.END_OBJECT) {
            String strM13437 = c4208.m13437();
            strM13437.getClass();
            if (strM13437.equals("offset")) {
                c11149 = (C11149) this.f64755.mo3722(c4208);
            } else if (strM13437.equals("time")) {
                c10052 = (C10052) this.f64754.mo3722(c4208);
            } else {
                c4208.m13445();
            }
        }
        c4208.m13447();
        C13443.m33075(c10052, "time", c4208);
        C13443.m33075(c11149, "offset", c4208);
        return C2595.of(c10052, c11149);
    }
}
