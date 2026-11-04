package l;

import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۚܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public class C5816 extends AbstractC11781 implements InterfaceC17974 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object f19996;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f19997;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f19998;

    @Override // l.AbstractC11781, l.InterfaceC13564
    /* JADX INFO: renamed from: ܶ */
    public int mo2973() {
        return 9;
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ۙ */
    public EnumC5296 mo9558() {
        long j = this.f38071;
        if ((8589934592L & j) != 0) {
            if (m16950()) {
                return EnumC5296.EXCEPTION_PARAMETER;
            }
            return EnumC5296.PARAMETER;
        }
        if ((16384 & j) != 0) {
            return EnumC5296.ENUM_CONSTANT;
        }
        EnumC13603 enumC13603 = this.f38069.f38066;
        if (enumC13603 == EnumC13603.f43213 || enumC13603 == EnumC13603.f43208) {
            return EnumC5296.FIELD;
        }
        if (m16956()) {
            return EnumC5296.RESOURCE_VARIABLE;
        }
        if ((j & 576460752303423488L) != 0) {
            return EnumC5296.BINDING_VARIABLE;
        }
        return EnumC5296.LOCAL_VARIABLE;
    }

    @Override // l.InterfaceC12753
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 mo16952() {
        return this.f38067;
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC12753 mo16951() {
        return this.f38069;
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ᩹ */
    public AbstractC19728 mo9563() {
        return this.f38072;
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public /* bridge */ /* synthetic */ C14769 mo16957() {
        return mo16957();
    }

    public C5816(long j, AbstractC19728 abstractC19728, AbstractC22664 abstractC22664, AbstractC11781 abstractC11781) {
        super(EnumC13603.f43205, j, abstractC19728, abstractC22664, abstractC11781);
        this.f19997 = -1;
        this.f19998 = -1;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5816 mo16960(AbstractC11781 abstractC11781) {
        C13273 c13273 = new C13273(this, this.f38071, this.f38072, this.f38067, abstractC11781, abstractC11781);
        c13273.f19997 = this.f19997;
        c13273.f19998 = this.f19998;
        c13273.f19996 = this.f19996;
        return c13273;
    }

    @Override // l.AbstractC11781
    public final String toString() {
        return this.f38072.toString();
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 mo16954(AbstractC22664 abstractC22664, C24705 c24705) {
        return new C5816(this.f38071, this.f38072, c24705.m55126(this, abstractC22664), this.f38069);
    }

    @Override // l.InterfaceC12753
    /* JADX INFO: renamed from: ۙ */
    public Object mo7871(AbstractC9024 abstractC9024, Object obj) {
        return abstractC9024.mo22365(this, obj);
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final Object m16958() {
        return C8257.m22245(m16959(), this.f38067);
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16950() {
        return this.f19996 == EnumC5296.EXCEPTION_PARAMETER;
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16956() {
        return this.f19996 == EnumC5296.RESOURCE_VARIABLE;
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final Object m16959() {
        Object obj = this.f19996;
        if (obj == EnumC5296.EXCEPTION_PARAMETER || obj == EnumC5296.RESOURCE_VARIABLE) {
            return null;
        }
        if (obj instanceof Callable) {
            Callable callable = (Callable) obj;
            this.f19996 = null;
            try {
                this.f19996 = callable.call();
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        }
        return this.f19996;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16955(Object obj) {
        C11972.m30023(this, !(obj instanceof C3168));
        this.f19996 = obj;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo16953(InterfaceC2087 interfaceC2087, Locale locale) {
        return interfaceC2087.mo7177(this, (Object) locale);
    }
}
