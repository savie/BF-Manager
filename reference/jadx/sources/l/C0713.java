package l;

import java.util.List;

/* JADX INFO: renamed from: l.֡᩸ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: F64Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C0713 extends AbstractC19270 implements InterfaceC9904 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC22631 f2632 = EnumC22631.f73340;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f2633;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f2634;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        throw null;
    }

    public C0713(C24975 c24975, int i) {
        super(c24975, f2632, i);
        int iM8721 = c24975.m55818().m8721(i + 2);
        if (iM8721 == 0) {
            this.f2634 = 1;
            this.f2633 = 0;
            return;
        }
        int iMo8725 = c24975.m55818().mo8725(i + 4);
        if (((long) iM8721) * ((long) iMo8725) > 2147483647L) {
            throw new C23044(null, "Invalid array-payload instruction: element width*count overflows", new Object[0]);
        }
        this.f2634 = iM8721;
        this.f2633 = iMo8725;
    }

    @Override // l.InterfaceC9904
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo3032() {
        return this.f2634;
    }

    @Override // l.InterfaceC9904
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List mo3034() {
        int i = this.f62315 + 8;
        int i2 = this.f2634;
        if (i2 == 1) {
            return new C24580(this, i);
        }
        if (i2 == 2) {
            return new C14882(this, i);
        }
        if (i2 == 4) {
            return new C21596(this, i);
        }
        if (i2 == 8) {
            return new C18612(this, i);
        }
        throw new C23044(null, "Invalid element width: %d", Integer.valueOf(i2));
    }

    @Override // l.AbstractC19270, l.InterfaceC23331
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo3033() {
        return (((this.f2634 * this.f2633) + 1) / 2) + 4;
    }
}
