package l;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ۘ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes2.dex */
public final class C3622 implements InterfaceC0737 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22674 f13304;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f13305;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f13306;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8229 f13307;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f13308;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13309;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f13310;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f13311;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f13312;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f13313;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13314;

    public C3622(int i, String str, boolean z, boolean z2, C22674 c22674, int i2, boolean z3, C8229 c8229, String str2, boolean z4, Set set) {
        this.f13309 = i;
        this.f13312 = str;
        this.f13311 = z;
        this.f13308 = z2;
        this.f13304 = c22674;
        this.f13314 = i2;
        this.f13310 = z3;
        this.f13307 = c8229;
        this.f13313 = str2;
        this.f13306 = z4;
        this.f13305 = set;
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7794 mo3200() {
        boolean z = this.f13308;
        boolean z2 = this.f13311;
        String str = this.f13312;
        int i = this.f13309;
        if (i == 0) {
            return new C18280(9, C12733.m31636(str, z2, z));
        }
        final int i2 = this.f13314;
        final C22674 c22674 = this.f13304;
        if (i == 1) {
            return new InterfaceC7794() { // from class: l.ۚ֫ۘ
                @Override // l.InterfaceC7794
                public final List accept(Object obj) {
                    InterfaceC9974 interfaceC9974 = (InterfaceC9974) obj;
                    List<C0787> listM50206 = c22674.m50206(interfaceC9974.getPath());
                    String strMo25238 = interfaceC9974.mo25238();
                    if (listM50206 == null || strMo25238 == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C0787 c0787 : listM50206) {
                        if (c0787.f3371 == 0 && c0787.f3370 == i2) {
                            C8500 c8500 = new C8500(0);
                            int i3 = c0787.f3369;
                            c8500.f29470 = i3;
                            int i4 = c0787.f3367;
                            c8500.f29473 = i4;
                            c8500.m22225(i3, i4, (CharSequence) strMo25238);
                            arrayList.add(c8500);
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
            final C21199 c21199M31636 = C12733.m31636(str, z2, z);
            final boolean z3 = this.f13310;
            return new InterfaceC7794() { // from class: l.᩹֫ۘ
                @Override // l.InterfaceC7794
                public final List accept(Object obj) {
                    InterfaceC9974 interfaceC9974 = (InterfaceC9974) obj;
                    List<C0787> listM50206 = c22674.m50206(interfaceC9974.getPath());
                    String strMo25238 = interfaceC9974.mo25238();
                    if (listM50206 == null || strMo25238 == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C0787 c0787 : listM50206) {
                        int i3 = c0787.f3371;
                        int i4 = c0787.f3367;
                        int i5 = c0787.f3369;
                        if (i3 == 1) {
                            C6222 c6222 = c21199M31636.get();
                            c6222.m17276reset((CharSequence) c0787.f3366);
                            if (z3) {
                                if (c6222.matches()) {
                                    C8500 c8500 = new C8500(0);
                                    c8500.f29470 = i5;
                                    c8500.f29473 = i4;
                                    c8500.m22225(i5, i4, (CharSequence) strMo25238);
                                    arrayList.add(c8500);
                                }
                            } else if (C23709.m52203(c6222)) {
                                C8500 c8501 = new C8500(0);
                                C6928 c6928 = new C6928();
                                try {
                                    c6928.m18585(strMo25238.substring(i5, i4));
                                    c8501.f29470 = c6928.m18584(c6222.start()) + i5;
                                    c8501.f29473 = c6928.m18584(c6222.end()) + i5;
                                } catch (Exception unused) {
                                    c8501.f29470 = i5;
                                    c8501.f29473 = i4;
                                }
                                c8501.m22225(c8501.f29470, c8501.f29473, (CharSequence) strMo25238);
                                arrayList.add(c8501);
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
            return new InterfaceC7794() { // from class: l.֨֫ۘ
                @Override // l.InterfaceC7794
                public final List accept(Object obj) {
                    InterfaceC9974 interfaceC9974 = (InterfaceC9974) obj;
                    List<C0787> listM50206 = c22674.m50206(interfaceC9974.getPath());
                    String strMo25238 = interfaceC9974.mo25238();
                    if (listM50206 == null || strMo25238 == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C0787 c0787 : listM50206) {
                        if (c0787.f3371 == 2 && c0787.f3370 == i2) {
                            C8500 c8500 = new C8500(0);
                            int i3 = c0787.f3369;
                            c8500.f29470 = i3;
                            int i4 = c0787.f3367;
                            c8500.f29473 = i4;
                            c8500.m22225(i3, i4, (CharSequence) strMo25238);
                            arrayList.add(c8500);
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
        return new InterfaceC7794() { // from class: l.۬֫ۘ
            @Override // l.InterfaceC7794
            public final List accept(Object obj) {
                InterfaceC9974 interfaceC9974 = (InterfaceC9974) obj;
                List<C0787> listM50206 = c22674.m50206(interfaceC9974.getPath());
                String strMo25238 = interfaceC9974.mo25238();
                if (listM50206 == null || strMo25238 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (C0787 c0787 : listM50206) {
                    if (c0787.f3371 == 3 && c0787.f3370 == i2) {
                        C8500 c8500 = new C8500(0);
                        int i3 = c0787.f3369;
                        c8500.f29470 = i3;
                        int i4 = c0787.f3367;
                        c8500.f29473 = i4;
                        c8500.m22225(i3, i4, (CharSequence) strMo25238);
                        arrayList.add(c8500);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
        };
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final void mo3202(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f13307.m21579(concurrentLinkedQueue, this.f13313, this.f13306, this.f13305);
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final C10617 mo3201(ArrayList arrayList) {
        return new C10617(this.f13313, this.f13312, arrayList);
    }
}
