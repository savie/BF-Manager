package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26GL */
/* JADX INFO: loaded from: classes.dex */
public final class C23140 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f75020;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f75021;

    public C23140(AbstractC17567 abstractC17567, AbstractC17567 abstractC17568) {
        this.f75020 = abstractC17567;
        this.f75021 = abstractC17568;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        C9306 c9306 = (C9306) obj;
        c21362.m48600();
        c21362.m48589("dateTime");
        this.f75020.mo3723(c21362, c9306.toLocalDateTime());
        c21362.m48589("offset");
        this.f75021.mo3723(c21362, c9306.getOffset());
        c21362.m48597();
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        c4208.m13456();
        C19003 c19003 = null;
        C11149 c11149 = null;
        while (c4208.m13438() != EnumC14648.END_OBJECT) {
            String strM13437 = c4208.m13437();
            strM13437.getClass();
            if (strM13437.equals("offset")) {
                c11149 = (C11149) this.f75021.mo3722(c4208);
            } else if (strM13437.equals("dateTime")) {
                c19003 = (C19003) this.f75020.mo3722(c4208);
            } else {
                c4208.m13445();
            }
        }
        c4208.m13447();
        C13443.m33075(c19003, "dateTime", c4208);
        C13443.m33075(c11149, "offset", c4208);
        return C9306.of(c19003, c11149);
    }
}
