package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9F8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15633 extends AbstractC9988 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f50828;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f50829;

    public C15633() {
        super(EnumC7165.SMB2_PREAUTH_INTEGRITY_CAPABILITIES);
        this.f50829 = new ArrayList();
    }

    public C15633(byte[] bArr, List list) {
        super(EnumC7165.SMB2_PREAUTH_INTEGRITY_CAPABILITIES);
        this.f50829 = list;
        this.f50828 = (byte[]) bArr.clone();
    }

    @Override // l.AbstractC9988
    /* JADX INFO: renamed from: ۖ */
    public final int mo20768(C19240 c19240) {
        List list = this.f50829;
        if (list == null) {
            throw new IllegalStateException("There should be at least 1 hash algorithm provided");
        }
        if (this.f50828 == null) {
            throw new IllegalStateException("A salt should be provided");
        }
        c19240.m27396(list.size());
        c19240.m27396(this.f50828.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c19240.m27396((int) ((EnumC8949) it.next()).getValue());
        }
        byte[] bArr = this.f50828;
        c19240.m27383(bArr.length, bArr);
        return (list.size() * 2) + 4 + this.f50828.length;
    }

    @Override // l.AbstractC9988
    /* JADX INFO: renamed from: ܰ */
    public final void mo20770(C19240 c19240) throws C17271 {
        int iM27375 = c19240.m27375();
        int iM27376 = c19240.m27375();
        for (int i = 0; i < iM27375; i++) {
            int iM27377 = c19240.m27375();
            EnumC8949 enumC8949 = (EnumC8949) C20799.m46783(iM27377, EnumC8949.class, null);
            if (enumC8949 == null) {
                throw new IllegalStateException(String.format("Unknown SMB3HashAlgorithm with value '%d'", Integer.valueOf(iM27377)));
            }
            this.f50829.add(enumC8949);
        }
        byte[] bArr = new byte[iM27376];
        c19240.m27397(iM27376, bArr);
        this.f50828 = bArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m37313() {
        return this.f50829;
    }
}
