package l;

import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ۙ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4306 implements InterfaceC9868 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21920 f15480;

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ֨ۙ */
    public /* synthetic */ boolean mo10347() {
        return true;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۧ */
    public /* synthetic */ void mo11188() {
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ boolean mo10350(int i) {
        return true;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ܰۙ */
    public final /* synthetic */ void mo11191() {
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ void mo11195(int i) {
    }

    public AbstractC4306(C21920 c21920) {
        this.f15480 = c21920;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۬ */
    public final String mo11189() {
        return this.f15480.m48739();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۖۙ */
    public final IInArchive mo11185() {
        return this.f15480.m48745();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ܰ */
    public final void mo11190(IInArchive iInArchive) {
        this.f15480.m48740(iInArchive);
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ܺ */
    public final String mo11192() {
        return C11088.m27967(mo11189());
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۙ */
    public final void mo11187(String str) {
        C11088.m27975(mo11189(), str);
    }
}
