package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: O8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4715 extends AbstractC11462 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f16630;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C14865 f16631;

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13030() {
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String mo13039() {
        return "compress";
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo13041(String str) {
        return true;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo13042() {
        return true;
    }

    static {
        C9615.m24522("compress");
        C22669.m50201("compress", "local", new C2163());
    }

    public C4715(int i, String str) throws C8142 {
        super(i, "/");
        C14865 c14865 = new C14865(str);
        this.f16631 = c14865;
        this.f16630 = c14865.m35542().getName();
        m28616(str);
        try {
            mo23741(false);
        } catch (IOException e) {
            C8142 c8142 = new C8142(C16737.m39288(R.string.MT_Protector));
            c8142.initCause((Throwable) e);
            throw c8142;
        }
    }

    public C4715(C17367 c17367) {
        super(c17367);
        C14865 c14865 = new C14865(c17367.m40458());
        this.f16631 = c14865;
        this.f16630 = c14865.m35542().getName();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13032(C11018 c11018) {
        super.mo13032(c11018);
        this.f16631.mo15075(c11018);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo13043() {
        return this.f16630 + super.mo13043();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 mo13029() {
        return this.f16631;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List mo13037() {
        C14865 c14865 = this.f16631;
        if (c14865.m35543() == null) {
            mo23741(false);
        }
        ArrayList arrayListMo10263 = c14865.mo10263(m28629(), true);
        arrayListMo10263.add(0, C15404.f50208);
        return arrayListMo10263;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC4674 mo13044() {
        return new C17686(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6086 mo13045() {
        return new C6086(this.f16630, this.f16631.m35545(), C0690.f2894);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean mo13031() {
        return this.f16631.m35541();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean mo13036() {
        return this.f16631.m35544();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13034(C11545 c11545, C11545 c11546) {
        c11546.m28763(this.f16630);
        c11546.m28812(this.f16631.m35542().m46737(), true);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo13038(C11545 c11545) {
        m28623(c11545);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 mo13040(InterfaceC2557 interfaceC2557) {
        AbstractC20745 abstractC20745M46690 = C5553.m15313(this.f38587.mo33986(), C16845.m39503(m28629())).m46690(interfaceC2557.getName());
        abstractC20745M46690.mo33978();
        return abstractC20745M46690;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13033(C11545 c11545, List list, Runnable runnable) {
        new C3574(this, c11545, list, runnable).m10243();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final String m13035() {
        return this.f16631.m35545();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List mo13046() {
        return Arrays.asList(AbstractC11462.f38579, AbstractC11462.f38575, AbstractC11462.f38578, new C7374(), AbstractC11462.f38580, AbstractC11462.m28613(), AbstractC11462.m28610(R.string.MT_Protector, true));
    }
}
