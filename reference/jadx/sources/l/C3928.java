package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8KG */
/* JADX INFO: loaded from: classes3.dex */
public final class C3928 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f13410;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f13411;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f13412;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC24066 f13413;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f13414;

    public C3928(InterfaceC13433 interfaceC13433, int i, InterfaceC24066 interfaceC24066) {
        C20782.m47565(i > 0);
        this.f13412 = interfaceC13433;
        this.f13411 = i;
        this.f13413 = interfaceC24066;
        this.f13414 = new byte[1];
        this.f13410 = i;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f13410;
        InterfaceC13433 interfaceC13433 = this.f13412;
        if (i3 == 0) {
            byte[] bArr2 = this.f13414;
            int i4 = 0;
            if (interfaceC13433.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = interfaceC13433.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        ((C24569) this.f13413).m54877(new C21287(bArr3, i5));
                    }
                }
                this.f13410 = this.f13411;
            }
            return -1;
        }
        int i8 = interfaceC13433.read(bArr, i, Math.min(this.f13410, i2));
        if (i8 != -1) {
            this.f13410 -= i8;
        }
        return i8;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        return this.f13412.mo8327();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        return this.f13412.mo10893();
    }

    @Override // l.InterfaceC13433
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        interfaceC4639.getClass();
        this.f13412.mo10894(interfaceC4639);
    }
}
