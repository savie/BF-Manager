package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes.dex */
public final class C23041 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f74854;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15218 f74855;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18745 f74856;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f74857;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2516 f74858;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC18745 f74859;

    public C23041(C2516 c2516, InterfaceC18745 interfaceC18745, InterfaceC18745 interfaceC18746, C15218 c15218, boolean z, long j) {
        this.f74858 = c2516;
        this.f74859 = interfaceC18745;
        this.f74856 = interfaceC18746;
        this.f74855 = c15218;
        this.f74854 = z;
        this.f74857 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m50976() {
        return this.f74855.m36426();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50977(DataOutputStream dataOutputStream) {
        C15218 c15218 = this.f74855;
        c15218.m36424();
        C2516.m7738(dataOutputStream, this.f74859, c15218, this.f74854);
        c15218.m36424();
        C2516.m7743(this.f74858, this);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.f74855.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.f74856.close();
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
