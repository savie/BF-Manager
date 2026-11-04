package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܶܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89HS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16204 extends C24652 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f52594;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Set f52595;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f52596;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public UUID f52597;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Set f52598;

    public C16204(EnumSet enumSet, UUID uuid, boolean z, EnumSet enumSet2, byte[] bArr) {
        List list;
        ArrayList arrayList;
        super(36, EnumC15700.UNKNOWN, EnumC23906.SMB2_NEGOTIATE, 0L, 0L);
        this.f52595 = enumSet;
        this.f52597 = uuid;
        this.f52596 = z;
        this.f52598 = enumSet2;
        if (enumSet.contains(EnumC15700.SMB_3_1_1)) {
            arrayList = new ArrayList();
            arrayList.add(new C19956(bArr, Arrays.asList(EnumC5018.SHA_512)));
            if (enumSet2.contains(EnumC17938.SMB2_GLOBAL_CAP_ENCRYPTION)) {
                list = arrayList;
                arrayList.add(new C13966(Arrays.asList(EnumC14208.AES_256_GCM, EnumC14208.AES_256_CCM, EnumC14208.AES_128_GCM, EnumC14208.AES_128_CCM)));
                list = arrayList;
            }
        } else {
            list = Collections.EMPTY_LIST;
        }
        list = arrayList;
        this.f52594 = list;
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7006(C7453 c7453) {
        int i;
        int i2 = this.f79801;
        c7453.m56023(i2);
        Set set = this.f52595;
        c7453.m56023(set.size());
        c7453.m56023(this.f52596 ? 2 : 1);
        c7453.m20459(2);
        if (EnumC15700.m37474(set)) {
            c7453.m56025(C10961.m27791(this.f52598));
        } else {
            c7453.m20460();
        }
        UUID uuid = this.f52597;
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long mostSignificantBits = uuid.getMostSignificantBits();
        c7453.m56025(mostSignificantBits >>> 32);
        c7453.m56023((int) ((mostSignificantBits >>> 16) & 65535));
        c7453.m56023((int) (mostSignificantBits & 65535));
        AbstractC16182.f52520.mo38408(c7453, leastSignificantBits);
        boolean zContains = set.contains(EnumC15700.SMB_3_1_1);
        List list = this.f52594;
        if (zContains) {
            c7453.m56025((set.size() * 2) + i2 + 64 + (8 - (((set.size() * 2) + i2) % 8)));
            c7453.m56023(list.size());
            c7453.m20461();
        } else {
            c7453.m20459(8);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c7453.m56023(((EnumC15700) it.next()).getValue());
        }
        int size = ((set.size() * 2) + i2) % 8;
        if (size > 0) {
            c7453.m20459(8 - size);
        }
        if (set.contains(EnumC15700.SMB_3_1_1)) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iM50204 = ((AbstractC22194) list.get(i3)).m50204(c7453);
                if (i3 < list.size() - 1 && (i = iM50204 % 8) != 0) {
                    c7453.m20459(8 - i);
                }
            }
        }
    }
}
