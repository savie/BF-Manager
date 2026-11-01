package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4IA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19878 extends AbstractC23142 implements InterfaceC5766 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16350 f63727;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12117 f63728;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f63729;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f63730;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f63731;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f63732;

    public C19878(String str, C16350 c16350, String str2, C12117 c12117, ArrayList arrayList) {
        int i;
        this.f63731 = str;
        this.f63727 = C16350.m38521(c16350);
        this.f63730 = str2;
        this.f63728 = C12117.m30157(c12117);
        this.f63729 = C0909.m3627(arrayList);
        if (str != null && str.startsWith("call_site_")) {
            try {
                i = Integer.parseInt(str.substring(10));
            } catch (NumberFormatException unused) {
                i = -1;
            }
        } else {
            i = -1;
        }
        this.f63732 = i;
    }

    @Override // l.InterfaceC18029
    public final String getName() {
        return this.f63731;
    }

    @Override // l.InterfaceC18029
    public final int getIndex() {
        return this.f63732;
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC8152 mo19719() {
        return this.f63727;
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ܶ */
    public final String mo19722() {
        return this.f63730;
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC19441 mo19721() {
        return this.f63728;
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ۜ */
    public final List mo19720() {
        return this.f63729;
    }
}
