package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9188 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f29963;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f29964;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f29965;

    public C9188(AbstractC17567 abstractC17567, AbstractC17567 abstractC17568, AbstractC17567 abstractC17569) {
        this.f29963 = abstractC17567;
        this.f29964 = abstractC17568;
        this.f29965 = abstractC17569;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        C23084 c23084 = (C23084) obj;
        if (c23084 == null) {
            c21362.m48598();
            return;
        }
        c21362.m48600();
        c21362.m48589("dateTime");
        this.f29963.mo3723(c21362, c23084.q());
        c21362.m48589("offset");
        this.f29964.mo3723(c21362, c23084.getOffset());
        c21362.m48589("zone");
        this.f29965.mo3723(c21362, c23084.getZone());
        c21362.m48597();
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        c4208.m13456();
        C19003 c19003 = null;
        C11149 c11149 = null;
        AbstractC22338 abstractC22338 = null;
        while (c4208.m13438() != EnumC14648.END_OBJECT) {
            String strM13437 = c4208.m13437();
            strM13437.getClass();
            switch (strM13437) {
                case "offset":
                    c11149 = (C11149) this.f29964.mo3722(c4208);
                    break;
                case "zone":
                    abstractC22338 = (AbstractC22338) this.f29965.mo3722(c4208);
                    break;
                case "dateTime":
                    c19003 = (C19003) this.f29963.mo3722(c4208);
                    break;
                default:
                    c4208.m13445();
                    break;
            }
        }
        c4208.m13447();
        C13443.m33075(c19003, "dateTime", c4208);
        C13443.m33075(c11149, "offset", c4208);
        C13443.m33075(abstractC22338, "zone", c4208);
        return C23084.ofInstant(c19003, c11149, abstractC22338);
    }
}
