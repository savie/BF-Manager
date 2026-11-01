package l;

import java.io.File;

/* JADX INFO: renamed from: l.ۖ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A14A */
/* JADX INFO: loaded from: classes3.dex */
public class C2772 extends C14042 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final File f10600;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f10601;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f10602;

    @Override // l.C14042, l.AbstractC20745
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo8449() {
        if (!C19812.m45045().mo43869()) {
            throw C5595.f19203;
        }
        return super.mo8449();
    }

    @Override // l.C14042, l.AbstractC20745
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean mo8447() {
        if (!C19812.m45045().mo43869()) {
            throw C5595.f19203;
        }
        return super.mo8447();
    }

    @Override // l.C14042, l.AbstractC20745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3810 mo8444(InterfaceC12984 interfaceC12984) {
        if (!C19812.m45045().mo43869()) {
            throw C5595.f19203;
        }
        return super.mo8444(interfaceC12984);
    }

    public C2772(File file, File file2, String str, String str2) {
        super(file2, false);
        this.f10600 = file;
        this.f10602 = str;
        this.f10601 = str2;
    }

    @Override // l.C14042, l.InterfaceC16034
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11946 mo8445() {
        return new C11946(this.f10600, this.f46169, this.f10602, this.f10601, null);
    }

    @Override // l.C14042, l.AbstractC20745
    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo8448() {
        if (C19812.m45045().mo43869()) {
            return true;
        }
        throw C5595.f19203;
    }

    @Override // l.C14042
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 mo8446(C5574 c5574) {
        String strM15398 = c5574.m15398();
        File file = new File(this.f10600, strM15398);
        File file2 = new File(this.f46169, strM15398);
        String strM5622 = C1694.m5622(new StringBuilder(), this.f10602, "/", strM15398);
        C11946 c11946 = new C11946(file, file2, strM5622, this.f10601, c5574);
        C13465.m32966(strM5622, "relativePath");
        String str = this.f10601;
        C13465.m32966(str, "treePrimaryPath");
        return new C17196(file, strM5622, str, c11946, null);
    }

    @Override // l.C14042
    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public final C7817 mo8443() {
        if (!C19812.m45045().mo43869()) {
            throw C5595.f19203;
        }
        C7817 c7817Mo8443 = super.mo8443();
        if (c7817Mo8443.m20571()) {
            return c7817Mo8443;
        }
        throw C5595.f19203;
    }
}
