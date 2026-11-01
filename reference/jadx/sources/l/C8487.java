package l;

/* JADX INFO: renamed from: l.۠᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A63D */
/* JADX INFO: loaded from: classes3.dex */
public final class C8487 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        C14277 c14277 = new C14277();
        try {
            C23262 c23262 = (C23262) ((C14277) c15313.m36673()).m34475();
            c14277.m34464((((long) c23262.m51342()) & 255) | ((((long) c23262.m51342()) & 255) << 8) | ((((long) c23262.m51342()) & 255) << 16) | ((((long) c23262.m51342()) & 255) << 24) | ((((long) c23262.m51342()) & 255) << 32) | ((((long) c23262.m51342()) & 255) << 40) | ((((long) c23262.m51342()) & 255) << 48) | ((255 & ((long) c23262.m51342())) << 56));
        } catch (Exception unused) {
            c14277.m34464(0L);
        }
        c15313.m36672(c14277);
    }
}
