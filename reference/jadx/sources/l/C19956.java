package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9F8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19956 extends AbstractC22194 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f64158;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f64159;

    public C19956() {
        super(EnumC11005.SMB2_PREAUTH_INTEGRITY_CAPABILITIES);
        this.f64159 = new ArrayList();
    }

    public C19956(byte[] bArr, List list) {
        super(EnumC11005.SMB2_PREAUTH_INTEGRITY_CAPABILITIES);
        this.f64159 = list;
        this.f64158 = (byte[]) bArr.clone();
    }

    @Override // l.AbstractC22194
    /* JADX INFO: renamed from: ᩸ */
    public final int mo19897(C7453 c7453) {
        List list = this.f64159;
        if (list == null) {
            throw new IllegalStateException("There should be at least 1 hash algorithm provided");
        }
        if (this.f64158 == null) {
            throw new IllegalStateException("A salt should be provided");
        }
        c7453.m56023(list.size());
        c7453.m56023(this.f64158.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c7453.m56023((int) ((EnumC5018) it.next()).getValue());
        }
        byte[] bArr = this.f64158;
        c7453.m56007(bArr.length, bArr);
        return (list.size() * 2) + 4 + this.f64158.length;
    }

    @Override // l.AbstractC22194
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19896(C7453 c7453) throws C2013 {
        int iM56017 = c7453.m56017();
        int iM56018 = c7453.m56017();
        for (int i = 0; i < iM56017; i++) {
            int iM56019 = c7453.m56017();
            EnumC5018 enumC5018 = (EnumC5018) C10961.m27793(iM56019, EnumC5018.class, null);
            if (enumC5018 == null) {
                throw new IllegalStateException(String.format("Unknown SMB3HashAlgorithm with value '%d'", Integer.valueOf(iM56019)));
            }
            this.f64159.add(enumC5018);
        }
        byte[] bArr = new byte[iM56018];
        c7453.m56024(iM56018, bArr);
        this.f64158 = bArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m45881() {
        return this.f64159;
    }
}
