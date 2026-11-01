package l;

import bin.mt.plus.Features;

/* JADX INFO: renamed from: l.ۗۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 713E */
/* JADX INFO: loaded from: classes2.dex */
public final class C3056 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f11514;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f11515;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f11516;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f11517;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f11518;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f11519;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f11520;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f11521;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f11522;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f11523;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f11524;

    public C3056(AbstractC20745 abstractC20745, String str) {
        this.f11517 = abstractC20745;
        this.f11521 = str;
        this.f11515 = abstractC20745.mo33974();
        this.f11516 = abstractC20745.mo33964();
        this.f11519 = abstractC20745.mo33991();
        this.f11518 = abstractC20745.m46723();
        this.f11523 = abstractC20745.mo33968();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9157() {
        AbstractC20745 abstractC20745 = this.f11517;
        try {
            if (abstractC20745.mo33979()) {
                C5574 c5574M33984 = abstractC20745.mo33969().m33984();
                this.f11514 = c5574M33984.m15389();
                this.f11524 = Features.m56(c5574M33984.m15399());
                this.f11522 = Features.m56(c5574M33984.m15392());
                this.f11520 = true;
                return;
            }
            if (abstractC20745 instanceof C17589) {
                C12651 c12651M40901 = ((C17589) abstractC20745).m40901();
                this.f11514 = c12651M40901.m31444();
                this.f11524 = Features.m56(c12651M40901.m31447());
                this.f11522 = Features.m56(c12651M40901.m31443());
                this.f11520 = true;
                return;
            }
            if (abstractC20745.mo46709()) {
                return;
            }
            C5574 c5574M951 = C0055.m951(abstractC20745.mo33986());
            this.f11514 = c5574M951.m15389();
            this.f11524 = Features.m56(c5574M951.m15399());
            this.f11522 = Features.m56(c5574M951.m15392());
            this.f11520 = true;
        } catch (Exception unused) {
        }
    }
}
