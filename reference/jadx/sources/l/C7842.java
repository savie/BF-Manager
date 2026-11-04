package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.۟ۧۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2623 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7842 extends AbstractC18155 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AbstractC13347 f26128 = new C0384();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14948 f26129;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f26130;

    public C7842(String str, InterfaceC14948 interfaceC14948) {
        this.f26130 = str;
        this.f26129 = interfaceC14948;
    }

    public C7842(String str, InterfaceC16791 interfaceC16791) {
        this.f26130 = str;
        this.f26129 = C18678.m43430(interfaceC16791);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8639 m21366(Collection collection) {
        return f26128.m32928((Iterable) collection);
    }

    @Override // l.InterfaceC19073
    public final String getName() {
        return this.f26130;
    }

    @Override // l.InterfaceC19073
    public final InterfaceC16791 getValue() {
        return this.f26129;
    }
}
