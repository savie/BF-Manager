package l;

import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ۡ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B6V */
/* JADX INFO: loaded from: classes3.dex */
public final class C9221 extends AbstractC11462 implements InterfaceC0544 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12770 f31340;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12748 f31341;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f31342;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11835 f31343;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21920 f31344;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0774 f31345;

    @Override // l.InterfaceC0544
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2552(C11545 c11545, View view, C11835 c11835, InterfaceC2661 interfaceC2661) {
        C20301.m45814(this, c11545, c11835, interfaceC2661);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m23739(IInArchive iInArchive) {
        this.f31344.m48740(iInArchive);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۫ */
    public final String mo13039() {
        return "archive";
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰۙ */
    public final boolean mo13042() {
        return true;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized IInArchive m23742() {
        return this.f31344.m48745();
    }

    static {
        C9615.m24522("archive");
        C22669.m50201("archive", "local", new C18392());
    }

    public C9221(int i, IInArchive iInArchive, String str, ArrayList arrayList) throws C8142 {
        super(i, "/");
        this.f31343 = new C11835("archive", null);
        this.f31345 = new C0774(this);
        this.f31340 = new C12770(this);
        C21920 c21920 = new C21920(str, arrayList);
        this.f31344 = c21920;
        this.f31342 = c21920.m48747().getName();
        m28616(str);
        try {
            c21920.m48736(iInArchive);
            if (c21920.mo24621()) {
                this.f31341 = new C12748(c21920);
            }
        } catch (IOException e) {
            C8142 c8142 = new C8142(C16737.m39288(R.string.MT_Protector));
            c8142.initCause((Throwable) e);
            throw c8142;
        }
    }

    public C9221(C17367 c17367) {
        super(c17367);
        this.f31343 = new C11835("archive", null);
        this.f31345 = new C0774(this);
        this.f31340 = new C12770(this);
        C21920 c21920M48732 = C21920.m48732(c17367);
        this.f31344 = c21920M48732;
        this.f31342 = c21920M48732.m48747().getName();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13032(C11018 c11018) {
        super.mo13032(c11018);
        this.f31344.mo15075(c11018);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23738(AbstractC20745 abstractC20745) {
        this.f31344.m48735(abstractC20745);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܽ */
    public final String mo13043() {
        return this.f31342 + super.mo13043();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֡ */
    public final AbstractC9677 mo13029() {
        return this.f31344;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC13848 mo23624() {
        if (this.f31344.mo24621()) {
            return this.f31341;
        }
        return C6024.m16344();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo23741(boolean z) {
        C21920 c21920 = this.f31344;
        c21920.mo10267(z);
        if (c21920.mo24621()) {
            C12748 c12748 = this.f31341;
            if (c12748 != null) {
                c12748.m31687();
            }
            this.f31341 = new C12748(c21920);
        }
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۧ */
    public final List mo13037() {
        C21920 c21920 = this.f31344;
        if (c21920.m48733() == null) {
            mo23741(false);
        }
        ArrayList arrayListMo10263 = c21920.mo10263(m28629(), true);
        arrayListMo10263.add(0, C15404.f50208);
        return arrayListMo10263;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC4674 mo13044() {
        return new C10632(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩹ */
    public final C6086 mo13045() {
        return new C6086(this.f31342, this.f31344.m48739(), C0690.f2894);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo13031() {
        return this.f31344.m48746();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo13036() {
        return this.f31344.m48744();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13034(C11545 c11545, C11545 c11546) {
        c11546.m28763(this.f31342);
        c11546.m28812(this.f31344.m48747().m46737(), true);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13041(String str) {
        C18334 entry = this.f31344.getEntry(str.substring(1));
        return (entry == null || entry.m42574()) ? false : true;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۨ */
    public final void mo13038(C11545 c11545) {
        m28623(c11545);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֫ */
    public final void mo13030() {
        C12748 c12748 = this.f31341;
        if (c12748 != null) {
            c12748.m31687();
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final String m23740() {
        return this.f31344.m48739();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩻ */
    public final List mo13046() {
        return Arrays.asList(AbstractC11462.f38579, this.f31345, this.f31340, AbstractC11462.f38575, AbstractC11462.f38578, new C7374(), AbstractC11462.f38580, m28633(), AbstractC11462.m28613(), AbstractC11462.m28610(R.string.MT_Protector, true));
    }

    @Override // l.InterfaceC0544
    /* JADX INFO: renamed from: ۙ */
    public final void mo2553(C11835 c11835) {
        this.f31343 = c11835;
    }

    @Override // l.InterfaceC0544
    /* JADX INFO: renamed from: ۙ */
    public final C11835 mo2551() {
        return this.f31343;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC20745 mo13040(InterfaceC2557 interfaceC2557) {
        AbstractC20745 abstractC20745M46690 = C5553.m15313(this.f38587.mo33986(), C16845.m39503(m28629())).m46690(interfaceC2557.getName());
        abstractC20745M46690.mo33978();
        return abstractC20745M46690;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13033(C11545 c11545, List list, Runnable runnable) {
        new C19804(this, c11545, list, runnable).m10243();
    }
}
