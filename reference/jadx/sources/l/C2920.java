package l;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public class C2920 extends AbstractC22970 implements InterfaceC23196 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC24928 f9542;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14769 f9543;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C24550 f9544;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final EnumSet f9545;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C14769 f9546;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C14769 f9547;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC24928 f9548;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC24928 f9549;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C14106 f9550;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C14769 f9551;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumSet f9552;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public HashSet f9553;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public Map f9554;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC14852 f9555;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public AbstractC19728 f9556;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C14769 f9557;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C14769 f9558;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC24928 f9559;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public C14769 f9560;

    @Override // l.AbstractC11781, l.InterfaceC13564
    /* JADX INFO: renamed from: ܶ */
    public final int mo2973() {
        return 19;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final C24550 mo9564() {
        return null;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9560() {
        return (this.f38071 & 18014398509481984L) != 0;
    }

    @Override // l.InterfaceC23196, l.InterfaceC6042
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 mo9562() {
        return this.f38072;
    }

    public C2920(AbstractC19728 abstractC19728) {
        super(EnumC13603.f43214, 0L, abstractC19728, null, null);
        this.f9547 = C14769.m35543();
        this.f9555 = InterfaceC14852.f48554;
        this.f9552 = EnumSet.noneOf(EnumC1429.class);
        this.f9545 = EnumSet.noneOf(EnumC9631.class);
        C11972.m30021(abstractC19728);
        this.f38067 = new C3053(this, C14458.f45498);
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 mo9563() {
        return C21901.m49594(this.f38072);
    }

    @Override // l.AbstractC22970, l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 mo9563() {
        return C21901.m49594(this.f38072);
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9557() {
        return this.f38072.isEmpty() && this.f38069 == null;
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC5296 mo9558() {
        return EnumC5296.MODULE;
    }

    @Override // l.AbstractC11781
    public String toString() {
        AbstractC19728 abstractC19728 = this.f38072;
        if (abstractC19728 == null) {
            return "<unknown>";
        }
        return abstractC19728.isEmpty() ? "<unnamed>" : String.valueOf(this.f38072);
    }

    @Override // l.InterfaceC12753
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7871(AbstractC9024 abstractC9024, Object obj) {
        return abstractC9024.mo22364(this, obj);
    }

    @Override // l.AbstractC22970, l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ܽ */
    public final C14769 mo9561() {
        C14769 c14769M35543 = C14769.m35543();
        for (AbstractC11781 abstractC11781 : this.f9547) {
            if (abstractC11781.mo29571().mo7476(new C20548(5))) {
                c14769M35543 = c14769M35543.m35552(abstractC11781);
            }
        }
        return c14769M35543;
    }
}
