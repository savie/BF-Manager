package l;

/* JADX INFO: renamed from: l.ۘۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8QH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3652 implements InterfaceC6475 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11164 f13387 = new C11164();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m10760(C7648 c7648) {
        String str = c7648.f25265;
        return this.f13387.mo4660(c7648) || C13638.equals(str, "application/cea-608") || C13638.equals(str, "application/x-mp4-cea-608") || C13638.equals(str, "application/cea-708");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3401 m10759(C7648 c7648) {
        String str = c7648.f25265;
        int i = c7648.f25247;
        if (str != null) {
            switch (str) {
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new C8363(str, i);
                case "application/cea-708":
                    return new C21062(i, c7648.f25268);
            }
        }
        C11164 c11164 = this.f13387;
        if (!c11164.mo4660(c7648)) {
            throw new IllegalArgumentException(C0252.m1693("Attempted to create decoder for unsupported MIME type: ", str));
        }
        InterfaceC6951 interfaceC6951Mo4661 = c11164.mo4661(c7648);
        return new C21998(interfaceC6951Mo4661.getClass().getSimpleName().concat("Decoder"), interfaceC6951Mo4661);
    }
}
