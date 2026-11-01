package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13924 implements InterfaceC15690 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C2633 f45854;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashMap f45855 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f45856;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f45857;

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ۙ */
    public final void mo7690(InterfaceC6599 interfaceC6599) {
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC8011 mo7684(int i, int i2) {
        InterfaceC8011 c7928;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f45855;
        InterfaceC8011 interfaceC8011 = (InterfaceC8011) map.get(numValueOf);
        if (interfaceC8011 != null) {
            return interfaceC8011;
        }
        if (i2 == 2) {
            C2633 c2633 = new C2633();
            this.f45856++;
            this.f45854 = c2633;
            c7928 = c2633;
        } else {
            c7928 = new C7928();
        }
        map.put(Integer.valueOf(i), c7928);
        return c7928;
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ᩹ */
    public final void mo7696() {
        this.f45857 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33761() {
        C2633 c2633;
        return this.f45857 && this.f45856 == 1 && (c2633 = this.f45854) != null && c2633.f10265 && this.f45854.f10263 != -9223372036854775807L && this.f45854.f10266;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m33762() {
        C2633 c2633 = this.f45854;
        if (c2633 == null) {
            return -9223372036854775807L;
        }
        return c2633.f10263;
    }
}
