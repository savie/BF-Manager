package l;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q882 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12411 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC21123 f39907;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final List f39908;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16075 f39909;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16075 f39910;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AbstractC21123 f39911;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16075 f39912;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final boolean f39913;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f39913 = z;
        if (z) {
            f39907 = new C3462();
            f39911 = new C20616();
            InterfaceC16075 interfaceC16075 = C25092.f81134;
            f39912 = interfaceC16075;
            InterfaceC16075 interfaceC16076 = C17632.f57977;
            f39909 = interfaceC16076;
            InterfaceC16075 interfaceC16077 = C23600.f76612;
            f39910 = interfaceC16077;
            f39908 = C4681.unmodifiableList(Arrays.asList(interfaceC16076, interfaceC16075, interfaceC16077));
            return;
        }
        f39907 = null;
        f39911 = null;
        f39908 = Collections.EMPTY_LIST;
    }
}
