package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26GL */
/* JADX INFO: loaded from: classes.dex */
public final class C22394 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f72497;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f72498;

    public C22394(AbstractC17567 abstractC17567, AbstractC17567 abstractC17568) {
        this.f72497 = abstractC17567;
        this.f72498 = abstractC17568;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        C19003 c19003 = (C19003) obj;
        c21362.m48600();
        c21362.m48589("date");
        this.f72497.mo3723(c21362, c19003.e());
        c21362.m48589("time");
        this.f72498.mo3723(c21362, c19003.toLocalTime());
        c21362.m48597();
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        c4208.m13456();
        C7816 c7816 = null;
        C10052 c10052 = null;
        while (c4208.m13438() != EnumC14648.END_OBJECT) {
            String strM13437 = c4208.m13437();
            strM13437.getClass();
            if (strM13437.equals("date")) {
                c7816 = (C7816) this.f72497.mo3722(c4208);
            } else if (strM13437.equals("time")) {
                c10052 = (C10052) this.f72498.mo3722(c4208);
            } else {
                c4208.m13445();
            }
        }
        c4208.m13447();
        C13443.m33075(c7816, "date", c4208);
        C13443.m33075(c10052, "time", c4208);
        return C19003.of(c7816, c10052);
    }
}
