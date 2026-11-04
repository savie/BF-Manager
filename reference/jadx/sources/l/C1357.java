package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.֨ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C1357 extends AbstractC4823 implements InterfaceC5547 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Comparator f4838 = new C19256();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f4839;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C24456 f4840;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f4841;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8069 f4842;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m5001() {
        return this.f4839;
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21013 mo5000() {
        return this.f4840;
    }

    @Override // l.AbstractC4823
    public final String getName() {
        return this.f4840.getName();
    }

    @Override // l.InterfaceC5547
    public final int getNumber() {
        return this.f4840.m54705();
    }

    public final String toString() {
        return this.f4840.getName();
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String mo5002() {
        return this.f4841;
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14034 mo5003() {
        return this.f4842.f26702;
    }

    public final C8069 getType() {
        return this.f4842;
    }

    public C1357(C24456 c24456, C14034 c14034, C8069 c8069, int i) {
        super(0);
        this.f16869 = c8069;
        this.f4839 = i;
        this.f4840 = c24456;
        this.f4842 = c8069;
        this.f4841 = c8069.mo5002() + '.' + c24456.getName();
        c14034.f44472.m48903(this);
    }

    public C1357(C8069 c8069, Integer num) {
        super(0);
        String str = "UNKNOWN_ENUM_VALUE_" + c8069.getName() + "_" + num;
        C6556 c6556NewBuilder = C24456.newBuilder();
        c6556NewBuilder.m18463(str);
        c6556NewBuilder.m18462(num.intValue());
        C24456 c24456BuildPartial = c6556NewBuilder.buildPartial();
        if (c24456BuildPartial.isInitialized()) {
            this.f16869 = c8069;
            this.f4839 = -1;
            this.f4840 = c24456BuildPartial;
            this.f4842 = c8069;
            this.f4841 = c8069.mo5002() + '.' + c24456BuildPartial.getName();
            return;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c24456BuildPartial);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4999(C1357 c1357) {
        c1357.m14855(c1357.f4840.m54704().m48839());
    }
}
