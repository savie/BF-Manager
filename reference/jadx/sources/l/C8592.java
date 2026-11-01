package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C8592 extends AbstractC7179 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f29696;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17721 f29697;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f29698;

    public C8592(InterfaceC6432 interfaceC6432, InterfaceC17721 interfaceC17721, ArrayList arrayList) throws C12731 {
        super((AbstractC22702) interfaceC6432);
        this.f29696 = new ArrayList();
        this.f23977 = interfaceC17721.mo19107();
        this.f29697 = interfaceC17721;
        this.f23974 = interfaceC17721.mo19106();
        this.f23976 = interfaceC17721.getPackageName();
        this.f29698 = new ArrayList(interfaceC17721.mo7944());
        HashSet hashSet = new HashSet();
        for (InterfaceC19133 c10003 : interfaceC17721.mo19112()) {
            ArrayList arrayListM22370 = m22370(arrayList, c10003.mo26942());
            ArrayList arrayList2 = this.f29696;
            if (hashSet.add(Integer.valueOf(c10003.mo26942())) && !arrayListM22370.isEmpty()) {
                c10003 = new C10003(this, c10003, c10003.mo26942(), arrayListM22370);
            }
            arrayList2.add(c10003);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17763 c17763 = (C17763) it.next();
            int i = (c17763.f56352 >>> 16) & 255;
            if (i == 0) {
                throw C12731.m31630("RESOURCE_PATCH_CORRUPT", "Resource patch type ID is invalid.");
            }
            if (hashSet.add(Integer.valueOf(i))) {
                while (this.f29698.size() < i) {
                    this.f29698.add("?" + (this.f29698.size() + 1));
                }
                this.f29698.set(i - 1, c17763.f56345);
                this.f29696.add(new C10003(this, null, i, m22370(arrayList, i)));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22370(ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17763 c17763 = (C17763) it.next();
            if (((c17763.f56352 >>> 16) & 255) == i) {
                arrayList2.add(c17763);
            }
        }
        return arrayList2;
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۫ */
    public final int mo7941() {
        return this.f29696.size();
    }

    @Override // l.InterfaceC17721
    public final InterfaceC19133 getType(int i) {
        return (InterfaceC19133) this.f29696.get(i);
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۬ܰ */
    public final List mo7944() {
        return this.f29698;
    }

    @Override // l.AbstractC7179, l.InterfaceC17721
    /* JADX INFO: renamed from: ᩸ܰ */
    public final Iterable mo19112() {
        return this.f29696;
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۟ۙ */
    public final int mo7939() {
        return this.f29697.mo7939();
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC22661 mo7947(int i) {
        return this.f29697.mo7947(i);
    }

    @Override // l.AbstractC7179, l.InterfaceC17721
    /* JADX INFO: renamed from: ۟ܰ */
    public final Iterable mo19108() {
        return this.f29697.mo19108();
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ᩵ */
    public final int mo7946() {
        return this.f29697.mo7946();
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC14900 mo7945(int i) {
        return this.f29697.mo7945(i);
    }

    @Override // l.AbstractC7179, l.InterfaceC17721
    /* JADX INFO: renamed from: ᩵ۙ */
    public final Iterable mo19110() {
        return this.f29697.mo19110();
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۤۙ */
    public final int mo7940() {
        return this.f29697.mo7940();
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC18427 mo7943(int i) {
        return this.f29697.mo7943(i);
    }

    @Override // l.AbstractC7179, l.InterfaceC17721
    /* JADX INFO: renamed from: ᩶ */
    public final Iterable mo19111() {
        return this.f29697.mo19111();
    }
}
