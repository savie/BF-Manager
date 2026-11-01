package l;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2962 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f11091;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f11092;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File[] f11093;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long[] f11094;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final File[] f11095;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13598 f11096;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9314 f11097;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f11098;

    public C2962(C13598 c13598, String str) {
        this.f11096 = c13598;
        this.f11092 = str;
        int i = c13598.f44840;
        File file = c13598.f44854;
        this.f11094 = new long[i];
        this.f11093 = new File[i];
        this.f11095 = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.f11093[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f11095[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4424 m8784() {
        C13598 c13598 = this.f11096;
        int i = c13598.f44840;
        if (!Thread.holdsLock(c13598)) {
            throw new AssertionError();
        }
        InterfaceC10008[] interfaceC10008Arr = new InterfaceC10008[i];
        for (int i2 = 0; i2 < c13598.f44840; i2++) {
            try {
                interfaceC10008Arr[i2] = c13598.f44855.mo7707(this.f11093[i2]);
            } catch (FileNotFoundException unused) {
                for (int i3 = 0; i3 < i; i3++) {
                    InterfaceC10008 interfaceC10008 = interfaceC10008Arr[i3];
                    if (interfaceC10008 == null) {
                        break;
                    }
                    C0140.m1231(interfaceC10008);
                }
                try {
                    c13598.m33231(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new C4424(c13598, this.f11092, this.f11091, interfaceC10008Arr);
    }
}
