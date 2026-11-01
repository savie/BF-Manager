package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H5II */
/* JADX INFO: loaded from: classes4.dex */
public final class C15341 extends C17916 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f49949;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ArrayList f49950;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36722(AbstractC23102 abstractC23102) {
        this.f49949.add(abstractC23102);
    }

    @Override // l.C17916
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo36723(int i, C14388 c14388) {
        m36722(new C4050(c14388));
    }

    @Override // l.C17916
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36718(int i, String str) {
        if (this.f49950 == null) {
            this.f49950 = new ArrayList();
        }
        while (this.f49950.size() <= i) {
            this.f49950.add(null);
        }
        this.f49950.set(i, str);
    }

    @Override // l.C17916
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo36724(int i, C14388 c14388) {
        C1228 c1228 = new C1228(c14388);
        c1228.f5391 = i;
        m36722(c1228);
    }

    @Override // l.C17916
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36720(int i, C14388 c14388, String str, String str2, String str3) {
        m36722(new C6873(c14388));
    }

    @Override // l.C17916
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36719(int i, C14388 c14388) {
        m36722(new C5462(c14388));
    }

    @Override // l.C17916
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo36725(C14388 c14388) {
        m36722(new C13224(c14388));
    }

    @Override // l.C17916
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36721(C14388 c14388) {
        m36722(new C22396(c14388));
    }
}
