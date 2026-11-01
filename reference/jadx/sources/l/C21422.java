package l;

import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1IX */
/* JADX INFO: loaded from: classes4.dex */
public final class C21422 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f69636;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f69637;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f69638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f69639;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f69640;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f69641;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Exception f69642;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f69643;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11545 f69644;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String f69645;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f69646;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final List f69647;

    public C21422(C11545 c11545) {
        String strM28801;
        this.f69644 = c11545;
        this.f69636 = c11545.m28798();
        this.f69638 = c11545.m28799();
        try {
            strM28801 = c11545.m28801();
        } catch (Exception e) {
            this.f69642 = e;
            strM28801 = null;
        }
        this.f69641 = strM28801;
        this.f69643 = c11545.m28826();
        this.f69645 = c11545.m28759();
        List<InterfaceC2557> listM28819 = c11545.m28819();
        boolean z = false;
        if (listM28819.isEmpty() && c11545.f38811.m17913()) {
            listM28819 = Collections.singletonList(c11545.m28822());
            this.f69647 = listM28819;
            this.f69637 = false;
        } else {
            this.f69647 = listM28819;
            this.f69637 = c11545.f38808.m36132();
        }
        this.f69639 = c11545.m28795();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (InterfaceC2557 interfaceC2557 : listM28819) {
            if (interfaceC2557.mo7985()) {
                i++;
            } else if (interfaceC2557.isDirectory()) {
                i2++;
            } else {
                i3++;
            }
        }
        this.f69646 = i > 0 && i2 == 0 && i3 == 0;
        if (i == 0 && i2 > 0 && i3 == 0) {
            z = true;
        }
        this.f69640 = z;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Main m47980() {
        return this.f69644.m28824();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11545 m47970() {
        return this.f69644.m28833();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m47977() {
        return this.f69644.m28794();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC11462 m47960() {
        return this.f69644.m28817();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m47967() {
        return this.f69637;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m47974(String str) {
        return this.f69644.m28814(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47963(String str) {
        this.f69644.m28775(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47962() {
        this.f69644.m28831();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47964(ArrayList arrayList) {
        this.f69644.m28777((Collection) arrayList);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m47971(String str) {
        this.f69644.m28763(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m47969() {
        this.f69644.m28830();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11545 m47965() {
        return this.f69644;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m47959() {
        return this.f69636;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m47961() {
        return this.f69638;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m47966() {
        String str = this.f69641;
        if (str != null) {
            return str;
        }
        throw new UnsupportedOperationException(this.f69642);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m47972() {
        return this.f69643;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m47976() {
        return this.f69645;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m47979() {
        return this.f69647;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m47968() {
        return this.f69646;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m47978() {
        return this.f69640;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m47973() {
        return this.f69639;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m47975() {
        return this.f69647.size();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 m47981() {
        List list = this.f69647;
        if (list.size() != 1) {
            throw new IllegalStateException("Selected item size != 1");
        }
        return (InterfaceC2557) list.get(0);
    }
}
