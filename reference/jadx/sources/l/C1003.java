package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.֨ۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y20N */
/* JADX INFO: loaded from: classes3.dex */
public final class C1003 implements InterfaceC7529 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21246 f3613;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18716 f3614;

    @Override // l.InterfaceC0817
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InputStream mo3286() {
        return C9765.m25437(this);
    }

    public C1003(C21246 c21246, C18716 c18716) {
        this.f3613 = c21246;
        this.f3614 = c18716;
    }

    @Override // l.InterfaceC7529
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21246 mo3884() {
        return this.f3613;
    }

    @Override // l.InterfaceC0817
    public final InputStream getInputStream() {
        return this.f3614.getInputStream();
    }

    @Override // l.InterfaceC0817
    public final long length() {
        return this.f3614.length();
    }
}
