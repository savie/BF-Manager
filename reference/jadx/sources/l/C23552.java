package l;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩹۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes.dex */
public final class C23552 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File[] f76077;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20568 f76078;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final File[] f76079;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f76080;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f76081;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long[] f76082;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C16092 f76083;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f76084;

    public C23552(C20568 c20568, String str) {
        this.f76078 = c20568;
        this.f76084 = str;
        int i = c20568.f65878;
        File file = c20568.f65868;
        this.f76082 = new long[i];
        this.f76077 = new File[i];
        this.f76079 = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.f76077[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f76079[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3414 m52755() {
        C20568 c20568 = this.f76078;
        int i = c20568.f65878;
        if (!Thread.holdsLock(c20568)) {
            throw new AssertionError();
        }
        InterfaceC13810[] interfaceC13810Arr = new InterfaceC13810[i];
        for (int i2 = 0; i2 < c20568.f65878; i2++) {
            try {
                interfaceC13810Arr[i2] = c20568.f65883.mo17581(this.f76077[i2]);
            } catch (FileNotFoundException unused) {
                for (int i3 = 0; i3 < i; i3++) {
                    InterfaceC13810 interfaceC13810 = interfaceC13810Arr[i3];
                    if (interfaceC13810 == null) {
                        break;
                    }
                    C19822.m45601(interfaceC13810);
                }
                try {
                    c20568.m47158(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new C3414(c20568, this.f76084, this.f76080, interfaceC13810Arr);
    }
}
