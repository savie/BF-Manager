package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۗ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3755 implements InterfaceC24044, InterfaceC18006, InterfaceC4501 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12873;

    public /* synthetic */ C3755(Object obj) {
        this.f12873 = obj;
    }

    @Override // l.InterfaceC18006
    /* JADX INFO: renamed from: ۙ */
    public void mo1736(Object obj) {
        C21400.m48658((C21400) this.f12873, (Object[]) obj);
    }

    @Override // l.InterfaceC4501
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo12193(String str, boolean z) {
        return ((HashSet) this.f12873).contains(str) ? 1 : 2;
    }

    @Override // l.InterfaceC24044
    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo6271(C3906 c3906) {
        C22870 c22870 = (C22870) this.f12873;
        return c22870.m29658().getInt(c22870.m12557(), 12) + " dp";
    }
}
