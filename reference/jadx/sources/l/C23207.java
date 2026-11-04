package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩹֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes.dex */
public final class C23207 implements InterfaceC15747 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f75189;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Method f75190;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Method f75191;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24478 f75192;

    public C23207(C24478 c24478, String str, Class cls, Class cls2) {
        this.f75192 = c24478;
        this.f75189 = AbstractC9035.m24124(cls, C14442.m34865("get", str, "Case"), new Class[0]);
        this.f75191 = AbstractC9035.m24124(cls2, C14442.m34865("get", str, "Case"), new Class[0]);
        this.f75190 = AbstractC9035.m24124(cls2, C25272.m56409("clear", str), new Class[0]);
    }

    @Override // l.InterfaceC15747
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo1159(AbstractC9035 abstractC9035) {
        return ((InterfaceC5547) AbstractC9035.m24123(this.f75189, abstractC9035, new Object[0])).getNumber() != 0;
    }

    @Override // l.InterfaceC15747
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo1157(AbstractC15001 abstractC15001) {
        return ((InterfaceC5547) AbstractC9035.m24123(this.f75191, abstractC15001, new Object[0])).getNumber() != 0;
    }

    @Override // l.InterfaceC15747
    /* JADX INFO: renamed from: ۙ */
    public final C7323 mo1155(AbstractC9035 abstractC9035) {
        int number = ((InterfaceC5547) AbstractC9035.m24123(this.f75189, abstractC9035, new Object[0])).getNumber();
        if (number > 0) {
            return this.f75192.m54735(number);
        }
        return null;
    }

    @Override // l.InterfaceC15747
    /* JADX INFO: renamed from: ᩷ */
    public final C7323 mo1158(AbstractC15001 abstractC15001) {
        int number = ((InterfaceC5547) AbstractC9035.m24123(this.f75191, abstractC15001, new Object[0])).getNumber();
        if (number > 0) {
            return this.f75192.m54735(number);
        }
        return null;
    }

    @Override // l.InterfaceC15747
    /* JADX INFO: renamed from: ۙ */
    public final void mo1156(AbstractC15001 abstractC15001) {
        AbstractC9035.m24123(this.f75190, abstractC15001, new Object[0]);
    }
}
