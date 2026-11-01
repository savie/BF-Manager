package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩷᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21151 extends AbstractC10569 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C2806 f68884;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f68885;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f68886;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C19741[] f68887;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f68888;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9158 f68889;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C18141 f68890;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m47590(C21151 c21151) {
        int i = c21151.f68888;
        c21151.f68888 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m47595() {
        return this.f68886;
    }

    @Override // l.AbstractC10569
    public final String getName() {
        return this.f68890.getName();
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ܰ */
    public final C9158 mo8528() {
        return this.f68889;
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۚ */
    public final String mo8523() {
        return this.f68885;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C2806 m47593() {
        return this.f68884;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m47594() {
        return this.f68888;
    }

    public final List getFields() {
        return C0561.unmodifiableList(Arrays.asList(this.f68887));
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC1332 mo8524() {
        return this.f68890;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m47592() {
        C19741[] c19741Arr = this.f68887;
        return c19741Arr.length == 1 && c19741Arr[0].f63433;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m47587(C21151 c21151) {
        c21151.m26727(c21151.f68890.m42231().m44649());
    }

    public C21151(C18141 c18141, C9158 c9158, C2806 c2806, int i) {
        super(0);
        this.f36173 = c2806;
        this.f68890 = c18141;
        this.f68885 = C20446.m46243(c9158, c2806, c18141.getName());
        this.f68889 = c9158;
        this.f68886 = i;
        this.f68884 = c2806;
        this.f68888 = 0;
    }
}
