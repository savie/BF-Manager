package l;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩹ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51WE */
/* JADX INFO: loaded from: classes.dex */
public final class C22256 implements InterfaceC19248 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1088 f72754;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19248 f72755;

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo25491(long j, C1388 c1388) {
        C17836.m41424(this, c1388, j);
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo25493(MessageDigest messageDigest, long j) {
        C17836.m41423(this, messageDigest, j);
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ InterfaceC19248 mo25494() {
        return C17836.m41421(this);
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ܰ */
    public final long mo25495() {
        return size() - mo25490();
    }

    public C22256(C1088 c1088, InterfaceC19248 interfaceC19248) {
        this.f72755 = interfaceC19248;
        this.f72754 = c1088;
    }

    @Override // l.InterfaceC19248
    public final long size() {
        return this.f72755.size();
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ */
    public final long mo25490() {
        return this.f72755.mo25490();
    }

    @Override // l.InterfaceC19248
    public final void reset() {
        this.f72755.reset();
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ */
    public final void mo25492(OutputStream outputStream, long j) {
        this.f72755.mo25492(new C5322(this, outputStream), j);
    }
}
