package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.᩵۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97LV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20431 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f65442;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final BufferedReader f65443;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f65444;

    public C20431(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f65442 = arrayDeque;
        this.f65443 = bufferedReader;
    }

    @EnsuresNonNullIf(expression = {"next"}, result = true)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46857() throws IOException {
        String strTrim;
        if (this.f65444 == null) {
            ArrayDeque arrayDeque = this.f65442;
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f65444 = str;
                return true;
            }
            do {
                String line = this.f65443.readLine();
                this.f65444 = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f65444 = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m46858() {
        if (m46857()) {
            String str = this.f65444;
            this.f65444 = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
