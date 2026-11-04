package l;

import android.widget.TextView;
import java.util.Comparator;

/* JADX INFO: renamed from: l.᩻ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: RC7A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24770 implements InterfaceC19795, InterfaceC4787, InterfaceC10523 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m55292(long j, String str) {
        return str + j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m55295(C1907 c1907, C22209 c22209, String str, String str2, String str3) {
        EnumC13093 enumC13093M6567 = c1907.m6567();
        c22209.getClass();
        return C22209.m50223(str, str2, str3, enumC13093M6567);
    }

    @Override // l.InterfaceC4787
    public boolean test(Object obj) {
        int i = C14292.f45128;
        return false;
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Comparator m55294(InterfaceC16564 interfaceC16564, Comparator comparator) {
        return comparator instanceof InterfaceC16564 ? interfaceC16564.mo28640((InterfaceC16564) comparator) : C2661.$default$thenComparing(interfaceC16564, comparator);
    }

    @Override // l.InterfaceC10523
    public void accept(TextView textView) {
        textView.setText("0");
    }
}
