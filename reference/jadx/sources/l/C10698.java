package l;

import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes3.dex */
public final class C10698 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final BufferedReader f36508;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17047 f36509;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f36510 = -2;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f36511 = -2;

    public C10698(BufferedReader bufferedReader, C17047 c17047) {
        this.f36508 = bufferedReader;
        this.f36509 = c17047;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m26905() throws IOException {
        int iM26904 = m26904();
        if (iM26904 == -1) {
            return -1;
        }
        char c = (char) iM26904;
        if (Character.isHighSurrogate(c)) {
            int iM26905 = m26904();
            if (iM26905 != -1) {
                char c2 = (char) iM26905;
                if (Character.isLowSurrogate(c2)) {
                    return Character.toCodePoint(c, c2);
                }
            }
            this.f36511 = iM26905;
        }
        return iM26904;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26904() throws IOException {
        int i = this.f36511;
        if (i != -2) {
            this.f36511 = -2;
            return i;
        }
        int i2 = this.f36510;
        BufferedReader bufferedReader = this.f36508;
        if (i2 != -2) {
            this.f36510 = -2;
        } else {
            i2 = bufferedReader.read();
        }
        if (i2 == -1) {
            return -1;
        }
        C17047 c17047 = this.f36509;
        if (i2 == 13) {
            int i3 = this.f36510;
            if (i3 != -2) {
                this.f36510 = -2;
            } else {
                i3 = bufferedReader.read();
            }
            if (i3 != 10) {
                if (c17047 != null) {
                    c17047.m39829("\r");
                }
                this.f36510 = i3;
                return 10;
            }
            if (c17047 != null) {
                c17047.m39829("\r\n");
                return 10;
            }
        } else {
            if (i2 != 10) {
                return i2;
            }
            if (c17047 != null) {
                c17047.m39829("\n");
            }
        }
        return 10;
    }
}
