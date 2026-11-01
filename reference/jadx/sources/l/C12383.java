package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12383 implements InterfaceC0737 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f41391;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f41392;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41393;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f41394;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f41395;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f41396;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f41397;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f41398;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6094 f41399;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f41400;

    public C12383(int i, String str, boolean z, boolean z2, boolean z3, C6094 c6094, long j, String str2, boolean z4, Predicate predicate) {
        this.f41393 = i;
        this.f41394 = str;
        this.f41391 = z;
        this.f41395 = z2;
        this.f41397 = z3;
        this.f41399 = c6094;
        this.f41396 = j;
        this.f41400 = str2;
        this.f41398 = z4;
        this.f41392 = predicate;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [l.ܽۨۜ] */
    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7794 mo3200() {
        final C10972 c10972 = new C10972();
        boolean z = this.f41395;
        boolean z2 = this.f41391;
        String str = this.f41394;
        int i = this.f41393;
        if (i == 0) {
            final C21199 c21199M31636 = C12733.m31636(str, z2, z);
            return new InterfaceC7794() { // from class: l.ۡۨۜ
                @Override // l.InterfaceC7794
                public final List accept(Object obj) {
                    C10972 c10973 = c10972;
                    C21199 c21199 = c21199M31636;
                    InterfaceC9354 interfaceC9354 = (InterfaceC9354) obj;
                    try {
                        C2093 c2093 = c10973.get();
                        if (!interfaceC9354.mo24001(c2093)) {
                            return null;
                        }
                        C14795 c14795M6635 = c2093.m6635();
                        C6222 c6222 = c21199.get();
                        c6222.m17276reset((CharSequence) c14795M6635);
                        ArrayList<C11009> arrayList = new ArrayList();
                        C23709.m52202(c6222, c14795M6635, 0, 500, arrayList);
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (C11009 c11009 : arrayList) {
                            C8500 c8500 = new C8500(0);
                            int i2 = c11009.f37441;
                            c8500.f29470 = i2;
                            int i3 = c11009.f37440;
                            c8500.f29473 = i3;
                            c8500.m22225(i2, i3, c14795M6635);
                            arrayList2.add(c8500);
                        }
                        return arrayList2;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        }
        final boolean z3 = this.f41397;
        if (i == 1) {
            C14690 c14690M31638 = C12733.m31638(str, z2, z);
            final C21199 c21199 = new C21199(c14690M31638);
            String strPattern = c14690M31638.pattern();
            final boolean z4 = z3 || strPattern.contains("/");
            final boolean z5 = z3 || strPattern.contains("\\.");
            final Map mapM16552 = this.f41399.m16552();
            final C7443 c7443 = new C7443();
            final ?? r7 = new ThreadLocal() { // from class: l.ܽۨۜ
                @Override // java.lang.ThreadLocal
                public final Object initialValue() {
                    c7443.getClass();
                    return new C18134();
                }
            };
            final boolean z6 = this.f41397;
            return new InterfaceC7794() { // from class: l.᩷ۨۜ
                @Override // l.InterfaceC7794
                public final List accept(Object obj) {
                    C16616 c16616 = r7;
                    Map map = mapM16552;
                    C21199 c211910 = c21199;
                    boolean z7 = z6;
                    boolean z8 = z4;
                    boolean z9 = z5;
                    InterfaceC9354 interfaceC9354 = (InterfaceC9354) obj;
                    try {
                        C18134 c18134 = (C18134) c16616.get();
                        C13638.requireNonNull(c18134);
                        String strMo24004 = interfaceC9354.mo24004();
                        String str2 = (String) map.get(strMo24004);
                        if (str2 == null) {
                            c18134.m42209(strMo24004);
                        } else if ("".equals(str2)) {
                            C7807 c7807Mo24002 = interfaceC9354.mo24002();
                            if (c7807Mo24002 == null || !c18134.m42214(c7807Mo24002.getType())) {
                                return null;
                            }
                        } else {
                            c18134.m42209(str2);
                        }
                        if (C23672.m52130(c18134, c211910.get(), z7, z8, z9)) {
                            return Collections.EMPTY_LIST;
                        }
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i == 2) {
            final C21199 c21199M31637 = C12733.m31636(str, z2, z);
            return new InterfaceC7794() { // from class: l.᩶ۨۜ
                @Override // l.InterfaceC7794
                public final List accept(Object obj) {
                    C21199 c211910 = c21199M31637;
                    try {
                        return C23672.m52118(((InterfaceC9354) obj).mo24002(), c211910.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i == 3) {
            final C21199 c21199M31638 = C12733.m31636(str, z2, z);
            return new InterfaceC7794() { // from class: l.ܺۨۜ
                @Override // l.InterfaceC7794
                public final List accept(Object obj) {
                    C21199 c211910 = c21199M31638;
                    try {
                        return C23672.m52132(((InterfaceC9354) obj).mo24002(), c211910.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i == 4) {
            final C21199 c21199M31639 = C12733.m31636(str, z2, z);
            return new InterfaceC7794() { // from class: l.ۤۨۜ
                @Override // l.InterfaceC7794
                public final List accept(Object obj) {
                    C21199 c211910 = c21199M31639;
                    try {
                        return C23672.m52131(((InterfaceC9354) obj).mo24002(), c211910.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i != 5) {
            return null;
        }
        final long j = this.f41396;
        return new InterfaceC7794() { // from class: l.֡ۨۜ
            @Override // l.InterfaceC7794
            public final List accept(Object obj) {
                try {
                    return C23672.m52117(((InterfaceC9354) obj).mo24002(), j);
                } catch (Exception unused) {
                    return null;
                }
            }
        };
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final void mo3202(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f41399.m16539(concurrentLinkedQueue, this.f41400, this.f41398, this.f41392);
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final C10617 mo3201(ArrayList arrayList) {
        return new C10617(this.f41400, this.f41394, arrayList);
    }
}
