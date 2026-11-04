package l;

import java.io.FileNotFoundException;

/* JADX INFO: renamed from: l.᩷֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77UM */
/* JADX INFO: loaded from: classes.dex */
public final class C21706 extends FileNotFoundException {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49278(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof C21706) {
                return true;
            }
        }
        return false;
    }
}
