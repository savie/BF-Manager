package l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.ۙۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4424 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC10008[] f15737;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f15738;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13598 f15739;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f15740;

    public C4424(C13598 c13598, String str, long j, InterfaceC10008[] interfaceC10008Arr) {
        this.f15739 = c13598;
        this.f15738 = str;
        this.f15740 = j;
        this.f15737 = interfaceC10008Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9314 m12356() {
        String str = this.f15738;
        return this.f15739.m33228(this.f15740, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10008 m12357(int i) {
        return this.f15737[i];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InterfaceC10008 interfaceC10008 : this.f15737) {
            C0140.m1231(interfaceC10008);
        }
    }
}
