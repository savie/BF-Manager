package l;

import android.app.RemoteInput;

/* JADX INFO: renamed from: l.ۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5TS */
/* JADX INFO: loaded from: classes3.dex */
public final class C11816 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m29486(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static RemoteInput.Builder m29487(RemoteInput.Builder builder, int i) {
        return builder.setEditChoicesBeforeSending(i);
    }
}
