package l;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: l.᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 05NO */
/* JADX INFO: loaded from: classes4.dex */
public final class C19660 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44790(View view) {
        try {
            view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44788(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return C8479.m22141(i, "?");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44789() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
    }
}
