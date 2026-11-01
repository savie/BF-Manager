package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ܳ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97LV */
/* JADX INFO: loaded from: classes3.dex */
public final class C14209 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f46594;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final BufferedReader f46595;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f46596;

    public C14209(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f46594 = arrayDeque;
        this.f46595 = bufferedReader;
    }

    @EnsuresNonNullIf(expression = {"next"}, result = true)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34300() throws IOException {
        String strTrim;
        if (this.f46596 == null) {
            ArrayDeque arrayDeque = this.f46594;
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f46596 = str;
                return true;
            }
            do {
                String line = this.f46595.readLine();
                this.f46596 = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f46596 = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m34301() {
        if (m34300()) {
            String str = this.f46596;
            this.f46596 = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
