package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SATX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8244 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f27113;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f27114 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f27115;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m22158() {
        if (this.f27114.isEmpty()) {
            return;
        }
        C6178 c6178 = new C6178();
        c6178.mo17812(this.f27114.size());
        Iterator it = this.f27114.iterator();
        while (it.hasNext()) {
            c6178.m17806(((C0786) it.next()).f2816);
        }
        byte[] bArrM17798 = c6178.m17798();
        C2592 c2592M8672 = C2592.m8672(4183);
        c2592M8672.m8678(bArrM17798);
        C13778 c13778M8684 = c2592M8672.m8684();
        if (!c13778M8684.m33676()) {
            throw new C3090(C1364.m5010(c13778M8684, R.string.MT_Protector));
        }
        byte[] bArr = new byte[c13778M8684.m33670()];
        c13778M8684.m33671(bArr);
        C20348 c20348M46739 = C20348.m46739(bArr);
        Iterator it2 = this.f27114.iterator();
        while (it2.hasNext()) {
            C0786 c0786 = (C0786) it2.next();
            if (c20348M46739.m46753()) {
                byte[] bArrM46748 = c20348M46739.m46748();
                byte[] bArrM37706 = C15768.m37706(bArrM46748, bArrM46748.length);
                C21669.m49206(c0786.f2815, bArrM37706);
                this.f27113.m49876(c0786.f2815).m49849(bArrM37706);
            }
            it2.remove();
            this.f27115 -= c0786.f2816.length;
        }
        this.f27114.clear();
        this.f27115 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m22159(byte[] bArr) {
        String strM36182 = C15022.m36182(C15022.m36183().digest(bArr));
        byte[] bArrM49207 = C21669.m49207(strM36182);
        if (bArrM49207 != null) {
            this.f27113.m49876(strM36182).m49850(bArrM49207, 0, bArrM49207.length);
            return;
        }
        if (this.f27115 >= 262144) {
            m22158();
        }
        this.f27114.add(new C0786(bArr, strM36182));
        int length = this.f27115 + bArr.length;
        this.f27115 = length;
        if (length >= 262144) {
            m22158();
        }
    }

    public C8244(AbstractC22044 abstractC22044) throws IOException {
        if (!C18978.m44079()) {
            throw new C3090(C1364.m5010(new C13778(4), R.string.MT_Protector));
        }
        if (!C18978.m44078()) {
            throw new C3090(C1364.m5010(new C13778(5), R.string.MT_Protector));
        }
        abstractC22044.m49853();
        this.f27113 = abstractC22044;
    }
}
