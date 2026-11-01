package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩸᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21857 extends AbstractC10569 implements InterfaceC12601 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Comparator f70930 = new C23269();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f70931;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2370 f70932;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f70933;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7040 f70934;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m48639() {
        return this.f70933;
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC1332 mo8524() {
        return this.f70932;
    }

    @Override // l.AbstractC10569
    public final String getName() {
        return this.f70932.getName();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f70932.m7222();
    }

    public final String toString() {
        return this.f70932.getName();
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۚ */
    public final String mo8523() {
        return this.f70931;
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ܰ */
    public final C9158 mo8528() {
        return this.f70934.f23653;
    }

    public final C7040 getType() {
        return this.f70934;
    }

    public C21857(C2370 c2370, C9158 c9158, C7040 c7040, int i) {
        super(0);
        this.f36173 = c7040;
        this.f70933 = i;
        this.f70932 = c2370;
        this.f70934 = c7040;
        this.f70931 = c7040.mo8523() + '.' + c2370.getName();
        c9158.f31130.m4887(this);
    }

    public C21857(C7040 c7040, Integer num) {
        super(0);
        String str = "UNKNOWN_ENUM_VALUE_" + c7040.getName() + "_" + num;
        C11544 c11544NewBuilder = C2370.newBuilder();
        c11544NewBuilder.m28724(str);
        c11544NewBuilder.m28723(num.intValue());
        C2370 c2370BuildPartial = c11544NewBuilder.buildPartial();
        if (c2370BuildPartial.isInitialized()) {
            this.f36173 = c7040;
            this.f70933 = -1;
            this.f70932 = c2370BuildPartial;
            this.f70934 = c7040;
            this.f70931 = c7040.mo8523() + '.' + c2370BuildPartial.getName();
            return;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c2370BuildPartial);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48638(C21857 c21857) {
        c21857.m26727(c21857.f70932.m7220().m3732());
    }
}
