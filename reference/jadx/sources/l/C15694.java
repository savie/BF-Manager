package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4IA */
/* JADX INFO: loaded from: classes5.dex */
public final class C15694 extends AbstractC1002 implements InterfaceC25392 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f51010;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C2271 f51011;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f51012;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6000 f51013;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f51014;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f51015;

    public C15694(String str, C6000 c6000, String str2, C2271 c2271, ArrayList arrayList) {
        int i;
        this.f51014 = str;
        this.f51013 = C6000.m17432(c6000);
        this.f51010 = str2;
        this.f51011 = C2271.m7709(c2271);
        this.f51012 = C18678.m43428(arrayList);
        if (str != null && str.startsWith("call_site_")) {
            try {
                i = Integer.parseInt(str.substring(10));
            } catch (NumberFormatException unused) {
                i = -1;
            }
        } else {
            i = -1;
        }
        this.f51015 = i;
    }

    @Override // l.InterfaceC2338
    public final String getName() {
        return this.f51014;
    }

    @Override // l.InterfaceC2338
    public final int getIndex() {
        return this.f51015;
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6813 mo7875() {
        return this.f51013;
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ܺ */
    public final String mo7877() {
        return this.f51010;
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC13524 mo7878() {
        return this.f51011;
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ۧ */
    public final List mo7876() {
        return this.f51012;
    }
}
