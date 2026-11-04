package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C14053 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f44504;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C4908 f44505;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22808 f44506;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f44507;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19143 f44508;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC22808 f44509;

    public C14053(C19143 c19143, InterfaceC22808 interfaceC22808, InterfaceC22808 interfaceC22809, C4908 c4908, boolean z, long j) {
        this.f44508 = c19143;
        this.f44509 = interfaceC22808;
        this.f44506 = interfaceC22809;
        this.f44505 = c4908;
        this.f44507 = z;
        this.f44504 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m34223() {
        return this.f44505.m15063();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34224(DataOutputStream dataOutputStream) throws IOException {
        C4908 c4908 = this.f44505;
        c4908.m15065();
        C19143.m44300(dataOutputStream, this.f44509, c4908, this.f44507);
        c4908.m15065();
        C19143.m44310(this.f44508, this);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.f44505.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.f44506.close();
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            } else {
                e.addSuppressed(e2);
            }
        }
        if (e != null) {
            throw e;
        }
    }
}
