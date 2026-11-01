package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: SATX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16712 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f53503;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f53504 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f53505;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m39187() {
        if (this.f53504.isEmpty()) {
            return;
        }
        C11018 c11018 = new C11018();
        c11018.mo24508(this.f53504.size());
        Iterator it = this.f53504.iterator();
        while (it.hasNext()) {
            c11018.m27794(((C0483) it.next()).f2162);
        }
        byte[] bArrM27796 = c11018.m27796();
        C2724 c2724M8305 = C2724.m8305(4183);
        c2724M8305.m8319(bArrM27796);
        C1313 c1313M8321 = c2724M8305.m8321();
        if (!c1313M8321.m4686()) {
            throw new C8142(C4820.m13401(c1313M8321, R.string.MT_Protector));
        }
        byte[] bArr = new byte[c1313M8321.m4674()];
        c1313M8321.m4675(bArr);
        C17367 c17367M40440 = C17367.m40440(bArr);
        Iterator it2 = this.f53504.iterator();
        while (it2.hasNext()) {
            C0483 c0483 = (C0483) it2.next();
            if (c17367M40440.m40461()) {
                byte[] bArrM40451 = c17367M40440.m40451();
                byte[] bArrM41968 = C18019.m41968(bArrM40451, bArrM40451.length);
                C16007.m37986(c0483.f2161, bArrM41968);
                this.f53503.m46690(c0483.f2161).m46703(bArrM41968);
            }
            it2.remove();
            this.f53505 -= c0483.f2162.length;
        }
        this.f53504.clear();
        this.f53505 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m39188(byte[] bArr) {
        String strM49424 = C22253.m49424(C22253.m49425().digest(bArr));
        byte[] bArrM37987 = C16007.m37987(strM49424);
        if (bArrM37987 != null) {
            this.f53503.m46690(strM49424).m46704(bArrM37987, 0, bArrM37987.length);
            return;
        }
        if (this.f53505 >= 262144) {
            m39187();
        }
        this.f53504.add(new C0483(bArr, strM49424));
        int length = this.f53505 + bArr.length;
        this.f53505 = length;
        if (length >= 262144) {
            m39187();
        }
    }

    public C16712(AbstractC20745 abstractC20745) throws C8142 {
        if (!C1709.m5692()) {
            throw new C8142(C4820.m13401(new C1313(4), R.string.MT_Protector));
        }
        if (!C1709.m5693()) {
            throw new C8142(C4820.m13401(new C1313(5), R.string.MT_Protector));
        }
        abstractC20745.m46739();
        this.f53503 = abstractC20745;
    }
}
