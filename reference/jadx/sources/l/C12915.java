package l;

import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1IX */
/* JADX INFO: loaded from: classes4.dex */
public final class C12915 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f41288;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f41289;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f41290;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Exception f41291;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f41292;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f41293;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f41294;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f41295;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f41296;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8614 f41297;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f41298;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List f41299;

    public C12915(C8614 c8614) {
        String strM23192;
        this.f41297 = c8614;
        this.f41293 = c8614.m23166();
        this.f41288 = c8614.m23204();
        try {
            strM23192 = c8614.m23192();
        } catch (Exception e) {
            this.f41291 = e;
            strM23192 = null;
        }
        this.f41292 = strM23192;
        this.f41290 = c8614.m23222();
        this.f41295 = c8614.m23217();
        List<InterfaceC2386> listM23208 = c8614.m23208();
        boolean z = false;
        if (listM23208.isEmpty() && c8614.f28139.m50945()) {
            listM23208 = Collections.singletonList(c8614.m23211());
            this.f41299 = listM23208;
            this.f41298 = false;
        } else {
            this.f41299 = listM23208;
            this.f41298 = c8614.f28158.m36475();
        }
        this.f41289 = c8614.m23202();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (InterfaceC2386 interfaceC2386 : listM23208) {
            if (interfaceC2386.mo8090()) {
                i++;
            } else if (interfaceC2386.isDirectory()) {
                i2++;
            } else {
                i3++;
            }
        }
        this.f41294 = i > 0 && i2 == 0 && i3 == 0;
        if (i == 0 && i2 > 0 && i3 == 0) {
            z = true;
        }
        this.f41296 = z;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Main m31979() {
        return this.f41297.m23233();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8614 m31974() {
        return this.f41297.m23236();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m31988() {
        return this.f41297.m23197();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC7364 m31987() {
        return this.f41297.m23213();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m31968() {
        return this.f41298;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m31986(String str) {
        return this.f41297.m23228(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31970(String str) {
        this.f41297.m23174(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31969() {
        this.f41297.m23209();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31971(ArrayList arrayList) {
        this.f41297.m23176((Collection) arrayList);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m31975(String str) {
        this.f41297.m23230(str);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m31973() {
        this.f41297.m23216();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C8614 m31983() {
        return this.f41297;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m31978() {
        return this.f41293;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m31967() {
        return this.f41288;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m31976() {
        String str = this.f41292;
        if (str != null) {
            return str;
        }
        throw new UnsupportedOperationException(this.f41291);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m31972() {
        return this.f41290;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m31980() {
        return this.f41295;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m31982() {
        return this.f41299;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m31977() {
        return this.f41294;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m31984() {
        return this.f41296;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m31985() {
        return this.f41289;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m31981() {
        return this.f41299.size();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 m31989() {
        List list = this.f41299;
        if (list.size() != 1) {
            throw new IllegalStateException("Selected item size != 1");
        }
        return (InterfaceC2386) list.get(0);
    }
}
