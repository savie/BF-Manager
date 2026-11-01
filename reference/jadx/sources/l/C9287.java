package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes3.dex */
public final class C9287 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2935 f31547;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f31548;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f31549;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f31550;

    public C9287(C2935 c2935, AbstractC20745 abstractC20745, String str) {
        this.f31547 = c2935;
        this.f31549 = abstractC20745;
        this.f31550 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OutputStream m23829(int i, int i2) {
        String strM8757 = C2935.m8757(i, i2, this.f31550);
        this.f31547.mo41554(strM8757);
        AbstractC20745 abstractC20745M46706 = this.f31549.m46706(strM8757);
        this.f31548 = abstractC20745M46706;
        return abstractC20745M46706.mo33976(false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23831() {
        AbstractC20745 abstractC20745 = this.f31548;
        if (abstractC20745 != null) {
            this.f31547.f11024.add(abstractC20745.getName());
            this.f31548 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23830() {
        AbstractC20745 abstractC20745 = this.f31548;
        if (abstractC20745 != null) {
            abstractC20745.mo24647();
            this.f31548 = null;
        }
    }
}
