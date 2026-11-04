package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۤۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C10788 extends AbstractC4823 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f34242;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f34243;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C7323[] f34244;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C9231 f34245;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f34246;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C24478 f34247;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14034 f34248;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m27496(C10788 c10788) {
        int i = c10788.f34242;
        c10788.f34242 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m27501() {
        return this.f34243;
    }

    @Override // l.AbstractC4823
    public final String getName() {
        return this.f34245.getName();
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩸ */
    public final C14034 mo5003() {
        return this.f34248;
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩴ */
    public final String mo5002() {
        return this.f34246;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C24478 m27500() {
        return this.f34247;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m27502() {
        return this.f34242;
    }

    public final List getFields() {
        return C4681.unmodifiableList(Arrays.asList(this.f34244));
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21013 mo5000() {
        return this.f34245;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m27499() {
        C7323[] c7323Arr = this.f34244;
        return c7323Arr.length == 1 && c7323Arr[0].f24125;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m27498(C10788 c10788) {
        c10788.m14855(c10788.f34245.m24421().m19316());
    }

    public C10788(C9231 c9231, C14034 c14034, C24478 c24478, int i) {
        super(0);
        this.f16869 = c24478;
        this.f34245 = c9231;
        this.f34246 = C19739.m45480(c14034, c24478, c9231.getName());
        this.f34248 = c14034;
        this.f34243 = i;
        this.f34247 = c24478;
        this.f34242 = 0;
    }
}
