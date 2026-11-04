package l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7D9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10201 extends C14618 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumC19152 f32628;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public StringBuilder f32629;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f32630;

    @Override // l.C14618
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1603() {
        int iOrdinal = this.f32628.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return this.f32629.toString().getBytes(StandardCharsets.UTF_8).length;
        }
        if (iOrdinal != 2) {
            throw new IncompatibleClassChangeError();
        }
        return this.f32630.size();
    }

    @Override // l.C14618, l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        super.mo1599(interfaceC9397);
        int iOrdinal = this.f32628.ordinal();
        if (iOrdinal == 0) {
            ((C11388) interfaceC9397).m28734();
            return;
        }
        if (iOrdinal == 1) {
            ((C11388) interfaceC9397).m28739(this.f32629.toString());
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        ArrayList arrayList = this.f32630;
        int i = C7754.f25519;
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i2 = 0; i2 < size; i2++) {
            bArr[i2] = ((Byte) arrayList.get(i2)).byteValue();
        }
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.getClass();
        c11388.m28736(size, bArr);
    }
}
