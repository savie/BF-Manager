package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7HQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6237 extends IOException {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f21165;

    public C6237(AbstractC20745 abstractC20745, IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f21165 = abstractC20745;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17292(AbstractC20745 abstractC20745, IOException iOException) {
        String message;
        if (((abstractC20745 instanceof C14705) || (abstractC20745 instanceof C17196)) && (message = iOException.getMessage()) != null) {
            if (message.contains("Permission denied") || message.contains("EACCES")) {
                throw new C6237(abstractC20745, iOException);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m17293() {
        return this.f21165;
    }
}
