package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.۫֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y20N */
/* JADX INFO: loaded from: classes4.dex */
public final class C12047 implements InterfaceC9907 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6037 f40317;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3555 f40318;

    @Override // l.InterfaceC13911
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InputStream mo10545() {
        return C4737.m13105(this);
    }

    public C12047(C6037 c6037, C3555 c3555) {
        this.f40317 = c6037;
        this.f40318 = c3555;
    }

    @Override // l.InterfaceC9907
    /* JADX INFO: renamed from: ܰ */
    public final C6037 mo25096() {
        return this.f40317;
    }

    @Override // l.InterfaceC13911
    public final InputStream getInputStream() {
        return this.f40318.getInputStream();
    }

    @Override // l.InterfaceC13911
    public final long length() {
        return this.f40318.length();
    }
}
