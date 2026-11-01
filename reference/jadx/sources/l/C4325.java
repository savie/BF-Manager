package l;

import android.view.ContentInfo;
import android.view.View;

/* JADX INFO: renamed from: l.ۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4325 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12164(View view, String[] strArr, InterfaceC2580 interfaceC2580) {
        if (interfaceC2580 == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC13499(interfaceC2580));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] m12165(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18374 m12163(View view, C18374 c18374) {
        ContentInfo contentInfoM42618 = c18374.m42618();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM42618);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM42618 ? c18374 : new C18374(new C23314(contentInfoPerformReceiveContent));
    }
}
