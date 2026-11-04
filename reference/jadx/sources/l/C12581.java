package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12581 implements InterfaceC16047 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40384;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f40385;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f40386;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f40387;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f40388;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f40389;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f40390;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f40391;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20283 f40392;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f40393;

    public C12581(int i, String str, boolean z, boolean z2, boolean z3, C20283 c20283, long j, String str2, boolean z4, Predicate predicate) {
        this.f40384 = i;
        this.f40385 = str;
        this.f40389 = z;
        this.f40391 = z2;
        this.f40387 = z3;
        this.f40392 = c20283;
        this.f40388 = j;
        this.f40390 = str2;
        this.f40386 = z4;
        this.f40393 = predicate;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [l.᩵᩵ۧ] */
    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11572 mo7395() {
        final C4378 c4378 = new C4378();
        boolean z = this.f40391;
        boolean z2 = this.f40389;
        String str = this.f40385;
        int i = this.f40384;
        if (i == 0) {
            final C24999 c24999M11068 = C3369.m11068(str, z2, z);
            return new InterfaceC11572() { // from class: l.ۧ᩵ۧ
                @Override // l.InterfaceC11572
                public final List accept(Object obj) {
                    C4378 c4379 = c4378;
                    C24999 c24999 = c24999M11068;
                    InterfaceC14906 interfaceC14906 = (InterfaceC14906) obj;
                    try {
                        C0560 c0560 = c4379.get();
                        if (!interfaceC14906.mo10205(c0560)) {
                            return null;
                        }
                        C18459 c18459M2566 = c0560.m2566();
                        C4245 c4245 = c24999.get();
                        c4245.m13568reset((CharSequence) c18459M2566);
                        ArrayList<C0222> arrayList = new ArrayList();
                        C7680.m20919(c4245, c18459M2566, 0, 500, arrayList);
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (C0222 c0222 : arrayList) {
                            C15301 c15301 = new C15301(0);
                            int i2 = c0222.f1433;
                            c15301.f50019 = i2;
                            int i3 = c0222.f1432;
                            c15301.f50022 = i3;
                            c15301.m36738(i2, i3, c18459M2566);
                            arrayList2.add(c15301);
                        }
                        return arrayList2;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        }
        final boolean z3 = this.f40387;
        if (i == 1) {
            C18415 c18415M11070 = C3369.m11070(str, z2, z);
            final C24999 c24999 = new C24999(c18415M11070);
            String strPattern = c18415M11070.pattern();
            final boolean z4 = z3 || strPattern.contains("/");
            final boolean z5 = z3 || strPattern.contains("\\.");
            final Map mapM46598 = this.f40392.m46598();
            final C17056 c17056 = new C17056(0);
            final ?? r7 = new ThreadLocal() { // from class: l.᩵᩵ۧ
                @Override // java.lang.ThreadLocal
                public final Object initialValue() {
                    c17056.getClass();
                    return new C13216();
                }
            };
            final boolean z6 = this.f40387;
            return new InterfaceC11572() { // from class: l.ܽ᩵ۧ
                @Override // l.InterfaceC11572
                public final List accept(Object obj) {
                    C20786 c20786 = r7;
                    Map map = mapM46598;
                    C24999 c249910 = c24999;
                    boolean z7 = z6;
                    boolean z8 = z4;
                    boolean z9 = z5;
                    InterfaceC14906 interfaceC14906 = (InterfaceC14906) obj;
                    try {
                        C13216 c13216 = (C13216) c20786.get();
                        C17359.requireNonNull(c13216);
                        String strMo10208 = interfaceC14906.mo10208();
                        String str2 = (String) map.get(strMo10208);
                        if (str2 == null) {
                            c13216.m32749(strMo10208);
                        } else if ("".equals(str2)) {
                            C22737 c22737Mo10207 = interfaceC14906.mo10207();
                            if (c22737Mo10207 == null || !c13216.m32745(c22737Mo10207.getType())) {
                                return null;
                            }
                        } else {
                            c13216.m32749(str2);
                        }
                        if (C14818.m35685(c13216, c249910.get(), z7, z8, z9)) {
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
            final C24999 c24999M11069 = C3369.m11068(str, z2, z);
            return new InterfaceC11572() { // from class: l.᩹᩵ۧ
                @Override // l.InterfaceC11572
                public final List accept(Object obj) {
                    C24999 c249910 = c24999M11069;
                    try {
                        return C14818.m35676(((InterfaceC14906) obj).mo10207(), c249910.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i == 3) {
            final C24999 c24999M110610 = C3369.m11068(str, z2, z);
            return new InterfaceC11572() { // from class: l.ܶ᩵ۧ
                @Override // l.InterfaceC11572
                public final List accept(Object obj) {
                    C24999 c249910 = c24999M110610;
                    try {
                        return C14818.m35690(((InterfaceC14906) obj).mo10207(), c249910.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i == 4) {
            final C24999 c24999M110611 = C3369.m11068(str, z2, z);
            return new InterfaceC11572() { // from class: l.᩻᩵ۧ
                @Override // l.InterfaceC11572
                public final List accept(Object obj) {
                    C24999 c249910 = c24999M110611;
                    try {
                        return C14818.m35689(((InterfaceC14906) obj).mo10207(), c249910.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i != 5) {
            return null;
        }
        final long j = this.f40388;
        return new InterfaceC11572() { // from class: l.ۗ᩵ۧ
            @Override // l.InterfaceC11572
            public final List accept(Object obj) {
                try {
                    return C14818.m35675(((InterfaceC14906) obj).mo10207(), j);
                } catch (Exception unused) {
                    return null;
                }
            }
        };
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final void mo7396(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f40392.m46582(concurrentLinkedQueue, this.f40390, this.f40386, this.f40393);
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final C1878 mo7394(ArrayList arrayList) {
        return new C1878(this.f40390, this.f40385, arrayList);
    }
}
