package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69DQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7255 extends AbstractC22194 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f23911;

    public C7255() {
        super(EnumC11005.SMB2_COMPRESSION_CAPABILITIES);
        this.f23911 = new ArrayList();
    }

    @Override // l.AbstractC22194
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo19897(C7453 c7453) {
        ArrayList arrayList = this.f23911;
        if (arrayList == null) {
            throw new IllegalStateException("Cannot write a null compressionAlgorithms array");
        }
        c7453.m56023(arrayList.size());
        c7453.m20461();
        c7453.m20460();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c7453.m56023((int) ((EnumC3022) it.next()).getValue());
        }
        return (arrayList.size() * 2) + 8;
    }

    @Override // l.AbstractC22194
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo19896(C7453 c7453) throws C2013 {
        int iM56017 = c7453.m56017();
        c7453.m56021(2);
        c7453.m56021(4);
        for (int i = 0; i < iM56017; i++) {
            int iM56018 = c7453.m56017();
            EnumC3022 enumC3022 = (EnumC3022) C10961.m27793(iM56018, EnumC3022.class, null);
            if (enumC3022 == null) {
                throw new IllegalStateException(String.format("Unknown SMB3CompressionAlgorithm with value '%d'", Integer.valueOf(iM56018)));
            }
            this.f23911.add(enumC3022);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m19895() {
        return this.f23911;
    }
}
