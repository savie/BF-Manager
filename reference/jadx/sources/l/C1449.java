package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.֨᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public class C1449 extends C22617 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public EnumSet f5919;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13174 f5920;

    public C1449(C13174 c13174, C10229 c10229, EnumC8112 enumC8112, EnumC8112... enumC8112Arr) {
        this(c13174, c10229, EnumSet.of(enumC8112, enumC8112Arr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1449(C13174 c13174, C10229 c10229, EnumSet enumSet) {
        super(c13174, c10229, c10229.m26017(), EnumC8112.f28428);
        this.f5920 = c13174;
        this.f5919 = enumSet;
    }

    @Override // l.C22617, l.AbstractC16267
    /* JADX INFO: renamed from: ۙ */
    public AbstractC16267 mo4311(C10229 c10229) {
        return new C1449(this.f5920, c10229, this.f5919);
    }

    @Override // l.C22617
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumSet mo5039() {
        return this.f5919;
    }

    @Override // l.C22617
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5040(EnumC8112 enumC8112, EnumC8112 enumC8113) {
        C23549 c23549 = this.f5920.f43858;
        int i = C4977.f17352[enumC8113.ordinal()];
        C10229 c10229 = this.f52428;
        if (i == 1) {
            AbstractC16579 abstractC16579M26017 = c10229.m26017();
            C21825 c21825M26012 = c10229.m26012(enumC8113);
            C14377 c14377 = C14707.f48054;
            throw C13174.m32568(c23549.m51910(new C14377("compiler", "inferred.do.not.conform.to.eq.bounds", abstractC16579M26017, c21825M26012)));
        }
        if (i == 2) {
            AbstractC16579 abstractC16579M26018 = c10229.m26017();
            C21825 c21825M26013 = c10229.m26012(enumC8113);
            C14377 c14378 = C14707.f48054;
            throw C13174.m32568(c23549.m51910(new C14377("compiler", "inferred.do.not.conform.to.lower.bounds", abstractC16579M26018, c21825M26013)));
        }
        if (i != 3) {
            return;
        }
        AbstractC16579 abstractC16579M26019 = c10229.m26017();
        C21825 c21825M26014 = c10229.m26012(enumC8113);
        C14377 c14379 = C14707.f48054;
        throw C13174.m32568(c23549.m51910(new C14377("compiler", "inferred.do.not.conform.to.upper.bounds", abstractC16579M26019, c21825M26014)));
    }
}
