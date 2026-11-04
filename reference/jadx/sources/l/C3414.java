package l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.ۗ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3414 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20568 f11081;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f11082;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13810[] f11083;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f11084;

    public C3414(C20568 c20568, String str, long j, InterfaceC13810[] interfaceC13810Arr) {
        this.f11081 = c20568;
        this.f11082 = str;
        this.f11084 = j;
        this.f11083 = interfaceC13810Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16092 m11165() {
        String str = this.f11082;
        return this.f11081.m47154(this.f11084, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13810 m11164(int i) {
        return this.f11083[i];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InterfaceC13810 interfaceC13810 : this.f11083) {
            C19822.m45601(interfaceC13810);
        }
    }
}
