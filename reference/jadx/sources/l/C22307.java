package l;

import java.io.File;

/* JADX INFO: renamed from: l.᩷᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A14A */
/* JADX INFO: loaded from: classes.dex */
public class C22307 extends C7302 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final File f72217;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f72218;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f72219;

    @Override // l.C7302, l.AbstractC22044
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo4302() {
        if (!C4013.m12986().mo29537()) {
            throw C11118.f35063;
        }
        return super.mo4302();
    }

    @Override // l.C7302, l.AbstractC22044
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo4303() {
        if (!C4013.m12986().mo29537()) {
            throw C11118.f35063;
        }
        return super.mo4303();
    }

    @Override // l.C7302, l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18555 mo2938(InterfaceC21539 interfaceC21539) {
        if (!C4013.m12986().mo29537()) {
            throw C11118.f35063;
        }
        return super.mo2938(interfaceC21539);
    }

    public C22307(File file, File file2, String str, String str2) {
        super(file2, false);
        this.f72217 = file;
        this.f72219 = str;
        this.f72218 = str2;
    }

    @Override // l.C7302, l.InterfaceC6557
    /* JADX INFO: renamed from: ۙ */
    public C5153 mo15565() {
        return new C5153(this.f72217, this.f24039, this.f72219, this.f72218, null);
    }

    @Override // l.C7302, l.AbstractC22044
    /* JADX INFO: renamed from: ۛ᩷ */
    public final boolean mo2945() {
        if (C4013.m12986().mo29537()) {
            return true;
        }
        throw C11118.f35063;
    }

    @Override // l.C7302
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22044 mo19979(C21694 c21694) {
        String strM49238 = c21694.m49238();
        File file = new File(this.f72217, strM49238);
        File file2 = new File(this.f24039, strM49238);
        String strM31438 = C12669.m31438(new StringBuilder(), this.f72219, "/", strM49238);
        C5153 c5153 = new C5153(file, file2, strM31438, this.f72218, c21694);
        C15243.m36590(strM31438, "relativePath");
        String str = this.f72218;
        C15243.m36590(str, "treePrimaryPath");
        return new C18379(file, strM31438, str, c5153, null);
    }

    @Override // l.C7302
    /* JADX INFO: renamed from: ܿ᩷ */
    public final C15945 mo19986() {
        if (!C4013.m12986().mo29537()) {
            throw C11118.f35063;
        }
        C15945 c15945Mo19986 = super.mo19986();
        if (c15945Mo19986.m38042()) {
            return c15945Mo19986;
        }
        throw C11118.f35063;
    }
}
