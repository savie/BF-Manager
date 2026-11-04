package l;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ᩴۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 51WE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19765 implements InterfaceC17044 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15289 f63610;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC17044 f63611;

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo32878(long j, C13961 c13961) {
        C2129.m7331(this, c13961, j);
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo32880(MessageDigest messageDigest, long j) {
        C2129.m7330(this, messageDigest, j);
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ InterfaceC17044 mo32881() {
        return C2129.m7329(this);
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ᩷ */
    public final long mo32882() {
        return size() - mo32877();
    }

    public C19765(C15289 c15289, InterfaceC17044 interfaceC17044) {
        this.f63611 = interfaceC17044;
        this.f63610 = c15289;
    }

    @Override // l.InterfaceC17044
    public final long size() {
        return this.f63611.size();
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ */
    public final long mo32877() {
        return this.f63611.mo32877();
    }

    @Override // l.InterfaceC17044
    public final void reset() {
        this.f63611.reset();
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ */
    public final void mo32879(OutputStream outputStream, long j) {
        this.f63611.mo32879(new C22749(this, outputStream), j);
    }
}
