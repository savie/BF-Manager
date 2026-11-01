package l;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֫᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57Q8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2092 implements InterfaceC7032 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C16576 f7725 = new C16576();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC7032[] f7726 = new InterfaceC7032[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4831 f7727;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC7032[] f7728 = f7726;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2092 m6631(C12343 c12343) {
        C2092 c2092 = (C2092) c12343.m30656(f7725);
        return c2092 == null ? new C2092(c12343) : c2092;
    }

    public C2092(C12343 c12343) {
        c12343.m30659(f7725, this);
        if (((C16205) c12343.m30655(C16205.class)) == null) {
            new HashMap();
        }
        this.f7727 = C4831.m13414(c12343);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6633() {
        return this.f7728 == f7726;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m6634(C4209 c4209) {
        C4831 c4831 = this.f7727;
        InterfaceC3398 interfaceC3398M13415 = c4831.m13415(c4831.f16986);
        try {
            for (InterfaceC7032 interfaceC7032 : this.f7728) {
                ((C2092) interfaceC7032).m6634(c4209);
            }
            c4831.m13415(interfaceC3398M13415);
        } catch (Throwable th) {
            c4831.m13415(interfaceC3398M13415);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6632(C4209 c4209) {
        C4831 c4831 = this.f7727;
        InterfaceC3398 interfaceC3398M13415 = c4831.m13415(c4831.f16986);
        try {
            for (InterfaceC7032 interfaceC7032 : this.f7728) {
                ((C2092) interfaceC7032).m6632(c4209);
            }
            c4831.m13415(interfaceC3398M13415);
        } catch (Throwable th) {
            c4831.m13415(interfaceC3398M13415);
            throw th;
        }
    }

    public final String toString() {
        return Arrays.toString(this.f7728);
    }
}
