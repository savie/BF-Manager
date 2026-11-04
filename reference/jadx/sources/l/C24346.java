package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B08 */
/* JADX INFO: loaded from: classes.dex */
public final class C24346 extends AbstractC10108 {
    @Override // l.AbstractC10108
    /* JADX INFO: renamed from: ۙ */
    public final void mo26066(C4208 c4208) throws IOException {
        if (c4208 instanceof C17918) {
            ((C17918) c4208).getClass();
            throw null;
        }
        int iM13446 = c4208.f15364;
        if (iM13446 == 0) {
            iM13446 = c4208.m13446();
        }
        switch (iM13446) {
            case 12:
                c4208.f15364 = 8;
                break;
            case 13:
                c4208.f15364 = 9;
                break;
            case 14:
                c4208.f15364 = 10;
                break;
            default:
                throw c4208.m13434("a name");
        }
        c4208.f15378 = true;
    }
}
