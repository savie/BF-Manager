package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 86DX */
/* JADX INFO: loaded from: classes.dex */
public final class C25160 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12479 f81350;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f81351;

    public C25160(C12479 c12479) {
        this.f81350 = c12479;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25160 m56073() {
        C25160 c25160 = new C25160(this.f81350.m30987());
        c25160.f81351 = this.f81351;
        return c25160;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56079(int i) {
        this.f81350.m30995(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m56076() {
        C12479 c12479 = this.f81350;
        c12479.m30991(0);
        return c12479.m31000();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m56077() {
        C12479 c12479 = this.f81350;
        c12479.m30991(12);
        return c12479.m30990();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56075(Consumer consumer) {
        C13225 c13225M30064;
        C12479 c12479 = this.f81350;
        C11975 c11975 = new C11975(this, c12479.m30987());
        c12479.m30991(12);
        int iM30990 = c12479.m30990();
        for (int iM30048 = 0; iM30048 < iM30990; iM30048 += c11975.m30048()) {
            c12479.m31005();
            int iM31000 = c12479.m31000();
            C13225 c13225M32771 = C13225.m32771(iM31000);
            c11975.m30059(iM30048);
            c11975.m30051(c13225M32771);
            c11975.m30058(iM31000);
            c11975.m30050((InterfaceC11017) null);
            c11975.m30052(false);
            if (c13225M32771 != null) {
                AbstractC15462 abstractC15462M32776 = c13225M32771.m32776();
                c11975.m30057(abstractC15462M32776.m37024());
                c11975.m30063(abstractC15462M32776.m37023());
            } else {
                c11975.m30057(0);
                c11975.m30063(1);
            }
            consumer.accept(c11975);
            if (!c11975.m30056() && (c13225M30064 = c11975.m30064()) != null) {
                c13225M30064.m32776().mo9837(c11975, c11975.m30062().f81350);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56072(C11975 c11975) {
        c11975.m30064().m32776().mo3186(c11975, c11975.m30060(), c11975.m30062().f81350);
        c11975.m30052(true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19310 m56078() {
        C12479 c12479 = this.f81350;
        c12479.m30991(8);
        int iM30990 = c12479.m30990();
        if (iM30990 == 0) {
            return null;
        }
        if (iM30990 < 0 || iM30990 > c12479.m30984()) {
            throw new C10088("Invalid debug info offset");
        }
        int iM56076 = m56076();
        C4276 c4276 = new C4276(c12479, iM56076, m56077());
        c4276.m13631(iM56076, c12479.m31008(this.f81351));
        return c4276.m13630(iM30990);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m56080() {
        int iM31436;
        C12479 c12479 = this.f81350;
        c12479.m30991(6);
        if (c12479.m31000() == 0) {
            iM31436 = -1;
        } else {
            int iM56077 = m56077();
            iM31436 = C12669.m31436(iM56077, 2, 16, iM56077 % 2 == 1 ? 2 : 0);
        }
        if (iM31436 == -1) {
            return Collections.EMPTY_LIST;
        }
        c12479.m30991(6);
        int iM31000 = c12479.m31000();
        C12479 c12479M30987 = c12479.m30987();
        c12479.m30991((iM31000 * 8) + iM31436);
        int iM31005 = c12479.m31005();
        int iM50647 = C22463.m50647(c12479);
        HashMap map = new HashMap(iM50647);
        for (int i = 0; i < iM50647; i++) {
            int iM31006 = c12479.m31005() - iM31005;
            int iM31011 = c12479.m31011();
            int iAbs = Math.abs(iM31011);
            int[] iArr = new int[iAbs];
            String[] strArr = new String[iAbs];
            for (int i2 = 0; i2 < iAbs; i2++) {
                strArr[i2] = c12479M30987.m30997(C22463.m50647(c12479));
                iArr[i2] = C22463.m50647(c12479);
            }
            map.put(Integer.valueOf(iM31006), new C8123(iM31011 <= 0 ? C22463.m50647(c12479) : -1, strArr, iArr));
        }
        c12479.m30991(iM31436);
        ArrayList arrayList = new ArrayList(iM31000);
        for (int i3 = 0; i3 < iM31000; i3++) {
            int iM30990 = c12479.m30990();
            int iM31001 = c12479.m31000();
            int iM31002 = c12479.m31000();
            InterfaceC19112 interfaceC19112 = (InterfaceC19112) map.get(Integer.valueOf(iM31002));
            if (interfaceC19112 == null) {
                throw new C13817(C13645.m33382(iM31002, "Catch handler not found by byte offset: "));
            }
            arrayList.add(new C8868(iM30990, (iM31001 + iM30990) - 1, interfaceC19112));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56074(int i) {
        this.f81351 = i;
    }
}
