package l;

import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23085 extends AbstractC11462 implements InterfaceC0544 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75010 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f75011 = new HashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12770 f75012;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C11835 f75013;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f75014;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f75015;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5445 f75016;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0774 f75017;

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۫ */
    public final String mo13039() {
        return "tar";
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰۙ */
    public final boolean mo13042() {
        return true;
    }

    static {
        C9615.m24522("tar");
        C22669.m50201("tar", "local", new C22379());
    }

    public C23085(int i, String str, String str2) throws C8142 {
        super(i, "/");
        this.f75013 = new C11835("tar", null);
        this.f75017 = new C0774(this);
        this.f75012 = new C12770(this);
        this.f75014 = new C6856(this);
        C5445 c5445 = new C5445(str, str2);
        this.f75016 = c5445;
        String str3 = (String) f75011.get(str);
        if (str3 != null && !str3.isEmpty()) {
            c5445.m15072(str3);
        }
        this.f75015 = c5445.m15083().getName();
        m28616(str2);
        try {
            mo23741(false);
        } catch (IOException e) {
            C8142 c8142 = new C8142(C16737.m39288(R.string.MT_Protector));
            c8142.initCause((Throwable) e);
            throw c8142;
        }
    }

    public C23085(C17367 c17367) {
        super(c17367);
        this.f75013 = new C11835("tar", null);
        this.f75017 = new C0774(this);
        this.f75012 = new C12770(this);
        this.f75014 = new C6856(this);
        C5445 c5445M15068 = C5445.m15068(c17367);
        this.f75016 = c5445M15068;
        this.f75015 = c5445M15068.m15083().getName();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13032(C11018 c11018) {
        super.mo13032(c11018);
        this.f75016.mo15075(c11018);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܽ */
    public final String mo13043() {
        return this.f75015 + super.mo13043();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֡ */
    public final AbstractC9677 mo13029() {
        return this.f75016;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۧ */
    public final List mo13037() {
        C5445 c5445 = this.f75016;
        if (c5445.m15071() == null) {
            mo23741(false);
        }
        ArrayList arrayListMo10263 = c5445.mo10263(m28629(), true);
        arrayListMo10263.add(0, C15404.f50208);
        return arrayListMo10263;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC4674 mo13044() {
        return new C16880(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC13848 mo23624() {
        return C23936.m52769();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩹ */
    public final C6086 mo13045() {
        return new C6086(this.f75015, this.f75016.m15079(), C0690.f2894);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo13031() {
        return this.f75016.m15082();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo13036() {
        return this.f75016.m15081();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13034(C11545 c11545, C11545 c11546) {
        c11546.m28763(this.f75015);
        c11546.m28812(this.f75016.m15083().m46737(), true);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13041(String str) {
        C10049 entry = this.f75016.getEntry(str.substring(1));
        return (entry == null || entry.m25430()) ? false : true;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۨ */
    public final void mo13038(C11545 c11545) {
        m28623(c11545);
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
        new C13207(this, c11545, list, runnable).m10243();
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final String m51086() {
        return this.f75016.m15080();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֫ */
    public final void mo13030() {
        C5445 c5445 = this.f75016;
        if (c5445.m15079().equals(c5445.m15080()) || !c5445.m15080().endsWith("._tar")) {
            return;
        }
        c5445.m15076().mo24647();
        C21094.m47530();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final String m51085() {
        return this.f75016.m15079();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩻ */
    public final List mo13046() {
        return Arrays.asList(AbstractC11462.f38579, this.f75017, this.f75012, AbstractC11462.f38575, AbstractC11462.f38578, new C7374(), AbstractC11462.f38580, this.f75014, m28633(), AbstractC11462.m28613(), AbstractC11462.m28610(R.string.MT_Protector, true));
    }

    @Override // l.InterfaceC0544
    /* JADX INFO: renamed from: ۙ */
    public final void mo2553(C11835 c11835) {
        this.f75013 = c11835;
    }

    @Override // l.InterfaceC0544
    /* JADX INFO: renamed from: ۙ */
    public final C11835 mo2551() {
        return this.f75013;
    }

    @Override // l.InterfaceC0544
    /* JADX INFO: renamed from: ۙ */
    public final void mo2552(C11545 c11545, View view, C11835 c11835, InterfaceC2661 interfaceC2661) {
        new C22418(c11545, this).m49733(c11835.f39735, new RunnableC14912(2, interfaceC2661));
    }
}
