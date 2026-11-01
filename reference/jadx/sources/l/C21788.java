package l;

import java.io.FileNotFoundException;

/* JADX INFO: renamed from: l.᩸᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 77UM */
/* JADX INFO: loaded from: classes4.dex */
public final class C21788 extends FileNotFoundException {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48547(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof C21788) {
                return true;
            }
        }
        return false;
    }
}
