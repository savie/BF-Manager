package l;

import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ۙ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B7IH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4964 extends AbstractC1436 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC9427 f17324;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21898 f17325;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15549 f17326;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public UnaryOperator f17327;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21898 m13762() {
        return this.f17325;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final UnaryOperator m13765() {
        return this.f17327;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15549 m13764() {
        return this.f17326;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9427 m13761() {
        return this.f17324;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13763(InterfaceC9427 interfaceC9427) {
        this.f17324 = interfaceC9427;
    }

    public AbstractC4964() {
        int i = C12021.f40264;
        this.f17324 = C3075.m9255();
        EnumC11563 enumC11563 = EnumC11563.TERMINATE;
        EnumC11563 enumC11564 = EnumC11563.CONTINUE;
        this.f17326 = new C15549(0);
        this.f17325 = C21898.f71027;
        this.f17327 = C19801.identity();
    }
}
