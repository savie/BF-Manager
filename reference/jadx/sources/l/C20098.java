package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20098 extends AbstractC11462 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f65279 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C8809 f65280;

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֫ */
    public final void mo13030() {
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۫ */
    public final String mo13039() {
        return "payload";
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13041(String str) {
        return false;
    }

    static {
        C9615.m24522("payload");
        C22669.m50201("payload", "local", new C10220());
    }

    public C20098(String str, int i, long j, long j2) throws C8142 {
        super(i, "/");
        this.f65280 = new C8809(C5553.m15313(str, new String[0]), j, j2);
        m28616(str);
        try {
            mo23741(false);
        } catch (IOException e) {
            C8142 c8142 = new C8142(C16737.m39288(R.string.MT_Protector));
            c8142.initCause((Throwable) e);
            throw c8142;
        }
    }

    public C20098(int i, String str, String str2, int i2, C1752 c1752) {
        super(i, "/");
        C8809 c8809M22927 = C8809.m22927(i2, str, str2);
        this.f65280 = c8809M22927;
        c8809M22927.m22933(c1752);
    }

    public C20098(C17367 c17367) {
        super(c17367);
        this.f65280 = C8809.m22928(c17367);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13032(C11018 c11018) {
        super.mo13032(c11018);
        this.f65280.mo15075(c11018);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܽ */
    public final String mo13043() {
        return "payload.bin" + super.mo13043();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֡ */
    public final AbstractC9677 mo13029() {
        return this.f65280;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final Runnable mo28619(boolean z) {
        C1752 c1752M22932 = this.f65280.m22932(z);
        if (c1752M22932 == null) {
            return null;
        }
        return new RunnableC7397(c1752M22932);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۧ */
    public final List mo13037() {
        ArrayList arrayListMo10263 = this.f65280.mo10263(m28629(), true);
        arrayListMo10263.add(0, C15404.f50208);
        return arrayListMo10263;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC4674 mo28620(C21422 c21422) {
        if (this.f65280.m22936() && c21422.m47970().m28814("local")) {
            return new C12296(true);
        }
        return C22669.m50200(c21422);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC4674 mo13044() {
        return new C17234(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۠ */
    public final AbstractC4674 mo28630() {
        return C10903.m27335();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC4674 mo28641() {
        return C12314.m30573();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo28624(C11545 c11545, InterfaceC2557 interfaceC2557) {
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩹ */
    public final C6086 mo13045() {
        return new C6086("payload.bin", this.f65280.m22934(), C0690.f2894);
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final String m45464() {
        return this.f65280.m22937();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo13031() {
        return this.f65280.m22930();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo13036() {
        return this.f65280.m22935();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰۙ */
    public final boolean mo13042() {
        return !this.f65280.m22936();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13034(C11545 c11545, C11545 c11546) {
        AbstractC20745 abstractC20745M22931 = this.f65280.m22931();
        if (abstractC20745M22931 != null) {
            c11546.m28763(abstractC20745M22931.getName());
            c11546.m28812(abstractC20745M22931.m46737(), true);
        }
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۨ */
    public final void mo13038(C11545 c11545) {
        m28623(c11545);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13033(C11545 c11545, List list, Runnable runnable) {
        new C15865(this, c11545, list, runnable).m10243();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC20745 mo13040(InterfaceC2557 interfaceC2557) {
        AbstractC20745 abstractC20745M46690 = this.f38587.m46690(C16845.m39503(m28629()) + "/" + interfaceC2557.getName());
        abstractC20745M46690.mo33978();
        return abstractC20745M46690;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩻ */
    public final List mo13046() {
        return Arrays.asList(AbstractC11462.f38579, AbstractC11462.f38575, AbstractC11462.f38578, AbstractC11462.f38580, AbstractC11462.m28613(), AbstractC11462.m28610(R.string.MT_Protector, true));
    }
}
