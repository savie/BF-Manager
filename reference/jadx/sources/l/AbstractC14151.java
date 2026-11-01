package l;

/* JADX INFO: renamed from: l.ܰ᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14151 implements InterfaceC8818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13174 f46450;

    /* JADX INFO: renamed from: ܰ */
    public abstract C21825 mo9607(C10229 c10229, EnumC8112 enumC8112, AbstractC16579 abstractC16579, boolean z);

    public AbstractC14151(C13174 c13174) {
        this.f46450 = c13174;
    }

    @Override // l.InterfaceC8818
    /* JADX INFO: renamed from: ۙ */
    public final void mo22946(C10229 c10229) {
        c10229.f34911.addFirst(new C1178(this.f46450, c10229));
    }

    @Override // l.InterfaceC8818
    /* JADX INFO: renamed from: ۙ */
    public final void mo22947(C10229 c10229, EnumC8112 enumC8112, AbstractC16579 abstractC16579, boolean z) {
        if (c10229.m26018()) {
            return;
        }
        c10229.f34911.addAll(mo9607(c10229, enumC8112, abstractC16579, z));
    }
}
