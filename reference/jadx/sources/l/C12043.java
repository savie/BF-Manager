package l;

import java.util.concurrent.atomic.AtomicBoolean;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ۨ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class C12043 implements InterfaceC3600 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f40307;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21920 f40308;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15571 f40309;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7353 f40310;

    public C12043(C21920 c21920, C15571 c15571, AtomicBoolean atomicBoolean, C7353 c7353) {
        this.f40308 = c21920;
        this.f40309 = c15571;
        this.f40307 = atomicBoolean;
        this.f40310 = c7353;
    }

    @Override // l.InterfaceC3600
    /* JADX INFO: renamed from: ۙ */
    public final void mo10687(IInArchive iInArchive) {
        try {
            this.f40308.m48731(iInArchive, this.f40309);
        } catch (Throwable th) {
            C19431.m44468(iInArchive);
            throw th;
        }
    }

    @Override // l.InterfaceC3600
    /* JADX INFO: renamed from: ۨ */
    public final void mo10688() {
        this.f40307.set(true);
    }

    @Override // l.InterfaceC3600
    /* JADX INFO: renamed from: ۙ */
    public final void mo10686(AbstractC20745 abstractC20745) {
        this.f40309.m37208(abstractC20745);
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f40310.getAsBoolean();
    }
}
