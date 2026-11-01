package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܳܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 89HS */
/* JADX INFO: loaded from: classes5.dex */
public final class C14594 extends C11771 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f47752;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public List f47753;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Set f47754;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Set f47755;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public UUID f47756;

    public C14594(EnumSet enumSet, UUID uuid, boolean z, EnumSet enumSet2, byte[] bArr) {
        List list;
        ArrayList arrayList;
        super(36, EnumC20508.UNKNOWN, EnumC2162.SMB2_NEGOTIATE, 0L, 0L);
        this.f47755 = enumSet;
        this.f47756 = uuid;
        this.f47752 = z;
        this.f47754 = enumSet2;
        if (enumSet.contains(EnumC20508.SMB_3_1_1)) {
            arrayList = new ArrayList();
            arrayList.add(new C15633(bArr, Arrays.asList(EnumC8949.SHA_512)));
            if (enumSet2.contains(EnumC24036.SMB2_GLOBAL_CAP_ENCRYPTION)) {
                list = arrayList;
                arrayList.add(new C19160(Arrays.asList(EnumC19532.AES_256_GCM, EnumC19532.AES_256_CCM, EnumC19532.AES_128_GCM, EnumC19532.AES_128_CCM)));
                list = arrayList;
            }
        } else {
            list = Collections.EMPTY_LIST;
        }
        list = arrayList;
        this.f47753 = list;
    }

    @Override // l.C11771
    /* JADX INFO: renamed from: ۖ */
    public final void mo3384(C19240 c19240) {
        int i;
        int i2 = this.f39515;
        c19240.m27396(i2);
        Set set = this.f47755;
        c19240.m27396(set.size());
        c19240.m27396(this.f47752 ? 2 : 1);
        c19240.m44194(2);
        if (EnumC20508.m46304(set)) {
            c19240.m27398(C20799.m46781(this.f47754));
        } else {
            c19240.m44195();
        }
        UUID uuid = this.f47756;
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long mostSignificantBits = uuid.getMostSignificantBits();
        c19240.m27398(mostSignificantBits >>> 32);
        c19240.m27396((int) ((mostSignificantBits >>> 16) & 65535));
        c19240.m27396((int) (mostSignificantBits & 65535));
        AbstractC1748.f6871.mo5791(c19240, leastSignificantBits);
        boolean zContains = set.contains(EnumC20508.SMB_3_1_1);
        List list = this.f47753;
        if (zContains) {
            c19240.m27398((set.size() * 2) + i2 + 64 + (8 - (((set.size() * 2) + i2) % 8)));
            c19240.m27396(list.size());
            c19240.m44196();
        } else {
            c19240.m44194(8);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c19240.m27396(((EnumC20508) it.next()).getValue());
        }
        int size = ((set.size() * 2) + i2) % 8;
        if (size > 0) {
            c19240.m44194(8 - size);
        }
        if (set.contains(EnumC20508.SMB_3_1_1)) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iM25247 = ((AbstractC9988) list.get(i3)).m25247(c19240);
                if (i3 < list.size() - 1 && (i = iM25247 % 8) != 0) {
                    c19240.m44194(8 - i);
                }
            }
        }
    }
}
