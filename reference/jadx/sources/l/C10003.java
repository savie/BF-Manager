package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C10003 extends AbstractC10708 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f34173;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19133 f34174;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34175;

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۜۙ */
    public final void mo1531() {
    }

    public C10003(InterfaceC17721 interfaceC17721, InterfaceC19133 interfaceC19133, int i, ArrayList arrayList) throws C12731 {
        super((AbstractC7179) interfaceC17721, i);
        this.f34175 = new ArrayList();
        this.f34174 = interfaceC19133;
        this.f34173 = interfaceC19133 == null ? 0 : interfaceC19133.mo1519();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17763 c17763 = (C17763) it.next();
            String typeName = getTypeName();
            String str = c17763.f56345;
            String str2 = c17763.f56351;
            if (!typeName.equals(str)) {
                throw C12731.m31630("RESOURCE_PATCH_CORRUPT", "Resource patch type name differs.");
            }
            int i2 = c17763.f56352 & 65535;
            String str3 = (String) map.put(Integer.valueOf(i2), str2);
            if (str3 != null && !str3.equals(str2)) {
                throw C12731.m31630("RESOURCE_PATCH_CORRUPT", "Resource patch entry names differ.");
            }
            if (interfaceC19133 != null) {
                for (InterfaceC12783 interfaceC12783 : interfaceC19133.mo25271()) {
                    if (interfaceC12783.mo31756(i2) && !str2.equals(interfaceC12783.mo31752(i2))) {
                        throw C12731.m31630("RESOURCE_PATCH_CORRUPT", "Resource patch entry name differs from existing variants.");
                    }
                }
            }
            this.f34173 = Math.max(this.f34173, i2 + 1);
        }
        HashSet hashSet = new HashSet();
        if (interfaceC19133 != null) {
            for (InterfaceC12783 c19175 : interfaceC19133.mo25271()) {
                String strM47741 = C21291.m47741(c19175);
                ArrayList arrayListM25269 = m25269(strM47741, arrayList);
                ArrayList arrayList2 = this.f34175;
                if (hashSet.add(strM47741) && !arrayListM25269.isEmpty()) {
                    c19175 = new C19175(this, c19175, strM47741, arrayListM25269);
                }
                arrayList2.add(c19175);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C17763 c17764 = (C17763) it2.next();
            if (hashSet.add(c17764.f56348)) {
                ArrayList arrayList3 = this.f34175;
                String str4 = c17764.f56348;
                arrayList3.add(new C19175(this, null, str4, m25269(str4, arrayList)));
            }
        }
    }

    @Override // l.AbstractC10708, l.InterfaceC19133
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo25272(int i) {
        InterfaceC19133 interfaceC19133 = this.f34174;
        return interfaceC19133 != null && interfaceC19133.mo25272(i);
    }

    @Override // l.AbstractC10708, l.InterfaceC19133
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo25270(int i) {
        InterfaceC19133 interfaceC19133 = this.f34174;
        if (interfaceC19133 == null) {
            return 0;
        }
        return interfaceC19133.mo25270(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m25269(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17763 c17763 = (C17763) it.next();
            if (c17763.f56348.equals(str)) {
                arrayList2.add(c17763);
            }
        }
        return arrayList2;
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۘ */
    public final int mo1519() {
        return this.f34173;
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۬ۙ */
    public final int mo1536() {
        return this.f34175.size();
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC12783 mo1530(int i) {
        return (InterfaceC12783) this.f34175.get(i);
    }

    @Override // l.AbstractC10708, l.InterfaceC19133
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Iterable mo25271() {
        return this.f34175;
    }
}
