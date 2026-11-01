package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S9GP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20238 extends C11771 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Set f65665;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC14864 f65666;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Set f65667;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C11748 f65668;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Set f65669;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC7808 f65670;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Set f65671;

    public C20238(EnumC20508 enumC20508, long j, long j2, EnumC14864 enumC14864, Set set, Set set2, Set set3, EnumC7808 enumC7808, Set set4, C11748 c11748) {
        super(57, enumC20508, EnumC2162.SMB2_CREATE, j, j2);
        this.f65666 = enumC14864 != null ? enumC14864 : EnumC14864.Identification;
        this.f65667 = set;
        this.f65669 = set2 == null ? EnumSet.noneOf(EnumC4611.class) : set2;
        this.f65671 = set3 == null ? EnumSet.noneOf(EnumC13182.class) : set3;
        this.f65670 = enumC7808 != null ? enumC7808 : EnumC7808.FILE_OPEN_IF;
        this.f65665 = set4 == null ? EnumSet.noneOf(EnumC21213.class) : set4;
        this.f65668 = c11748;
    }

    @Override // l.C11771
    /* JADX INFO: renamed from: ۖ */
    public final void mo3384(C19240 c19240) {
        byte[] bArrM28401;
        int i = this.f39515;
        c19240.m27396(i);
        c19240.m27381((byte) 0);
        c19240.m27381((byte) 0);
        c19240.m27398(this.f65666.getValue());
        c19240.m44194(8);
        c19240.m44194(8);
        c19240.m27398(C20799.m46781(this.f65667));
        c19240.m27398(C20799.m46781(this.f65669));
        c19240.m27398(C20799.m46781(this.f65671));
        c19240.m27398(this.f65670.getValue());
        c19240.m27398(C20799.m46781(this.f65665));
        int i2 = i + 63;
        String strM29358 = this.f65668.m29358();
        if (strM29358 == null || strM29358.trim().length() == 0) {
            c19240.m27396(i2);
            c19240.m27396(0);
            bArrM28401 = new byte[1];
        } else {
            bArrM28401 = C11336.m28401(strM29358);
            c19240.m27396(i2);
            c19240.m27396(bArrM28401.length);
        }
        c19240.m27398(0L);
        c19240.m27398(0L);
        c19240.m27383(bArrM28401.length, bArrM28401);
    }
}
