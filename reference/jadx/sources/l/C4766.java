package l;

import android.view.ContentInfo;
import android.view.View;

/* JADX INFO: renamed from: l.ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4766 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] m14703(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23433 m14702(View view, C23433 c23433) {
        ContentInfo contentInfoM52627 = c23433.m52627();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM52627);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM52627 ? c23433 : new C23433(new C16719(contentInfoPerformReceiveContent));
    }
}
