package l;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.᩸ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes.dex */
public final class C22914 implements InterfaceC16047 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f74465;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11967 f74466;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f74467;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f74468;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74469;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15454 f74470;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f74471;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f74472;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f74473;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f74474;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74475;

    public C22914(int i, String str, boolean z, boolean z2, C15454 c15454, int i2, boolean z3, C11967 c11967, String str2, boolean z4, Set set) {
        this.f74469 = i;
        this.f74473 = str;
        this.f74467 = z;
        this.f74472 = z2;
        this.f74470 = c15454;
        this.f74475 = i2;
        this.f74468 = z3;
        this.f74466 = c11967;
        this.f74471 = str2;
        this.f74465 = z4;
        this.f74474 = set;
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11572 mo7395() {
        boolean z = this.f74472;
        boolean z2 = this.f74467;
        String str = this.f74473;
        int i = this.f74469;
        if (i == 0) {
            return new C10350(5, C3369.m11068(str, z2, z));
        }
        final int i2 = this.f74475;
        final C15454 c15454 = this.f74470;
        if (i == 1) {
            return new InterfaceC11572() { // from class: l.۬᩻ۧ
                @Override // l.InterfaceC11572
                public final List accept(Object obj) {
                    InterfaceC16200 interfaceC16200 = (InterfaceC16200) obj;
                    List<C9442> listM37007 = c15454.m37007(interfaceC16200.getPath());
                    String strMo7710 = interfaceC16200.mo7710();
                    if (listM37007 == null || strMo7710 == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C9442 c9442 : listM37007) {
                        if (c9442.f30619 == 0 && c9442.f30621 == i2) {
                            C15301 c15301 = new C15301(0);
                            int i3 = c9442.f30618;
                            c15301.f50019 = i3;
                            int i4 = c9442.f30617;
                            c15301.f50022 = i4;
                            c15301.m36738(i3, i4, (CharSequence) strMo7710);
                            arrayList.add(c15301);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return arrayList;
                }
            };
        }
        if (i == 2) {
            final C24999 c24999M11068 = C3369.m11068(str, z2, z);
            final boolean z3 = this.f74468;
            return new InterfaceC11572() { // from class: l.ۙܺۧ
                @Override // l.InterfaceC11572
                public final List accept(Object obj) {
                    InterfaceC16200 interfaceC16200 = (InterfaceC16200) obj;
                    List<C9442> listM37007 = c15454.m37007(interfaceC16200.getPath());
                    String strMo7710 = interfaceC16200.mo7710();
                    if (listM37007 == null || strMo7710 == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C9442 c9442 : listM37007) {
                        int i3 = c9442.f30619;
                        int i4 = c9442.f30617;
                        int i5 = c9442.f30618;
                        if (i3 == 1) {
                            C4245 c4245 = c24999M11068.get();
                            c4245.m13568reset((CharSequence) c9442.f30622);
                            if (z3) {
                                if (c4245.matches()) {
                                    C15301 c15301 = new C15301(0);
                                    c15301.f50019 = i5;
                                    c15301.f50022 = i4;
                                    c15301.m36738(i5, i4, (CharSequence) strMo7710);
                                    arrayList.add(c15301);
                                }
                            } else if (C7680.m20920(c4245)) {
                                C15301 c15302 = new C15301(0);
                                C10956 c10956 = new C10956();
                                try {
                                    c10956.m27790(strMo7710.substring(i5, i4));
                                    c15302.f50019 = c10956.m27789(c4245.start()) + i5;
                                    c15302.f50022 = c10956.m27789(c4245.end()) + i5;
                                } catch (Exception unused) {
                                    c15302.f50019 = i5;
                                    c15302.f50022 = i4;
                                }
                                c15302.m36738(c15302.f50019, c15302.f50022, (CharSequence) strMo7710);
                                arrayList.add(c15302);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return arrayList;
                }
            };
        }
        if (i == 3) {
            return new InterfaceC11572() { // from class: l.᩷ܺۧ
                @Override // l.InterfaceC11572
                public final List accept(Object obj) {
                    InterfaceC16200 interfaceC16200 = (InterfaceC16200) obj;
                    List<C9442> listM37007 = c15454.m37007(interfaceC16200.getPath());
                    String strMo7710 = interfaceC16200.mo7710();
                    if (listM37007 == null || strMo7710 == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C9442 c9442 : listM37007) {
                        if (c9442.f30619 == 2 && c9442.f30621 == i2) {
                            C15301 c15301 = new C15301(0);
                            int i3 = c9442.f30618;
                            c15301.f50019 = i3;
                            int i4 = c9442.f30617;
                            c15301.f50022 = i4;
                            c15301.m36738(i3, i4, (CharSequence) strMo7710);
                            arrayList.add(c15301);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return arrayList;
                }
            };
        }
        if (i != 4) {
            return null;
        }
        return new InterfaceC11572() { // from class: l.ۤܺۧ
            @Override // l.InterfaceC11572
            public final List accept(Object obj) {
                InterfaceC16200 interfaceC16200 = (InterfaceC16200) obj;
                List<C9442> listM37007 = c15454.m37007(interfaceC16200.getPath());
                String strMo7710 = interfaceC16200.mo7710();
                if (listM37007 == null || strMo7710 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (C9442 c9442 : listM37007) {
                    if (c9442.f30619 == 3 && c9442.f30621 == i2) {
                        C15301 c15301 = new C15301(0);
                        int i3 = c9442.f30618;
                        c15301.f50019 = i3;
                        int i4 = c9442.f30617;
                        c15301.f50022 = i4;
                        c15301.m36738(i3, i4, (CharSequence) strMo7710);
                        arrayList.add(c15301);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
        };
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final void mo7396(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f74466.m29976(concurrentLinkedQueue, this.f74471, this.f74465, this.f74474);
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final C1878 mo7394(ArrayList arrayList) {
        return new C1878(this.f74471, this.f74473, arrayList);
    }
}
