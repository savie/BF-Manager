package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7HQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2148 extends IOException {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f7089;

    public C2148(AbstractC22044 abstractC22044, IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f7089 = abstractC22044;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7413(AbstractC22044 abstractC22044, IOException iOException) {
        String message;
        if (((abstractC22044 instanceof C17063) || (abstractC22044 instanceof C18379)) && (message = iOException.getMessage()) != null) {
            if (message.contains("Permission denied") || message.contains("EACCES")) {
                throw new C2148(abstractC22044, iOException);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m7414() {
        return this.f7089;
    }
}
