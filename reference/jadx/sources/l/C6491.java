package l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7D9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6491 extends C12925 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f21889;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public StringBuilder f21890;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC3668 f21891;

    @Override // l.C12925
    /* JADX INFO: renamed from: ۨ */
    public final int mo7125() {
        int iOrdinal = this.f21891.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return this.f21890.toString().getBytes(StandardCharsets.UTF_8).length;
        }
        if (iOrdinal != 2) {
            throw new IncompatibleClassChangeError();
        }
        return this.f21889.size();
    }

    @Override // l.C12925, l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        super.mo2341(interfaceC19275);
        int iOrdinal = this.f21891.ordinal();
        if (iOrdinal == 0) {
            ((C23509) interfaceC19275).m51764();
            return;
        }
        if (iOrdinal == 1) {
            ((C23509) interfaceC19275).m51769(this.f21890.toString());
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        ArrayList arrayList = this.f21889;
        int i = C1115.f5034;
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i2 = 0; i2 < size; i2++) {
            bArr[i2] = ((Byte) arrayList.get(i2)).byteValue();
        }
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.getClass();
        c23509.m51766(size, bArr);
    }
}
