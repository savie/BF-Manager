package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 69DQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7871 extends AbstractC9988 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f25900;

    public C7871() {
        super(EnumC7165.SMB2_COMPRESSION_CAPABILITIES);
        this.f25900 = new ArrayList();
    }

    @Override // l.AbstractC9988
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo20768(C19240 c19240) {
        ArrayList arrayList = this.f25900;
        if (arrayList == null) {
            throw new IllegalStateException("Cannot write a null compressionAlgorithms array");
        }
        c19240.m27396(arrayList.size());
        c19240.m44196();
        c19240.m44195();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c19240.m27396((int) ((EnumC18120) it.next()).getValue());
        }
        return (arrayList.size() * 2) + 8;
    }

    @Override // l.AbstractC9988
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo20770(C19240 c19240) throws C17271 {
        int iM27375 = c19240.m27375();
        c19240.m27389(2);
        c19240.m27389(4);
        for (int i = 0; i < iM27375; i++) {
            int iM27376 = c19240.m27375();
            EnumC18120 enumC18120 = (EnumC18120) C20799.m46783(iM27376, EnumC18120.class, null);
            if (enumC18120 == null) {
                throw new IllegalStateException(String.format("Unknown SMB3CompressionAlgorithm with value '%d'", Integer.valueOf(iM27376)));
            }
            this.f25900.add(enumC18120);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList m20769() {
        return this.f25900;
    }
}
