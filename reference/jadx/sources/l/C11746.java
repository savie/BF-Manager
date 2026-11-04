package l;

import android.net.Uri;
import java.io.File;

/* JADX INFO: renamed from: l.ۧܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4XG */
/* JADX INFO: loaded from: classes3.dex */
public final class C11746 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13961 m29495(InterfaceC15475 interfaceC15475) {
        return new C13961(interfaceC15475);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13961 m29494(File file) {
        return new C13961(new C2052(file, "r"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC15475 m29497(File file, String str) {
        return new C2052(file, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC15475 m29496(Uri uri, String str) {
        return new C13238(uri, str);
    }
}
