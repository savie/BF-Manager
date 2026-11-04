package l;

import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes.dex */
public final class C21446 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4292 f68399;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f68400 = -2;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f68401 = -2;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BufferedReader f68402;

    public C21446(BufferedReader bufferedReader, C4292 c4292) {
        this.f68402 = bufferedReader;
        this.f68399 = c4292;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m48770() throws IOException {
        int iM48769 = m48769();
        if (iM48769 == -1) {
            return -1;
        }
        char c = (char) iM48769;
        if (Character.isHighSurrogate(c)) {
            int iM487610 = m48769();
            if (iM487610 != -1) {
                char c2 = (char) iM487610;
                if (Character.isLowSurrogate(c2)) {
                    return Character.toCodePoint(c, c2);
                }
            }
            this.f68401 = iM487610;
        }
        return iM48769;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48769() throws IOException {
        int i = this.f68401;
        if (i != -2) {
            this.f68401 = -2;
            return i;
        }
        int i2 = this.f68400;
        BufferedReader bufferedReader = this.f68402;
        if (i2 != -2) {
            this.f68400 = -2;
        } else {
            i2 = bufferedReader.read();
        }
        if (i2 == -1) {
            return -1;
        }
        C4292 c4292 = this.f68399;
        if (i2 == 13) {
            int i3 = this.f68400;
            if (i3 != -2) {
                this.f68400 = -2;
            } else {
                i3 = bufferedReader.read();
            }
            if (i3 != 10) {
                if (c4292 != null) {
                    c4292.m13668("\r");
                }
                this.f68400 = i3;
                return 10;
            }
            if (c4292 != null) {
                c4292.m13668("\r\n");
                return 10;
            }
        } else {
            if (i2 != 10) {
                return i2;
            }
            if (c4292 != null) {
                c4292.m13668("\n");
            }
        }
        return 10;
    }
}
